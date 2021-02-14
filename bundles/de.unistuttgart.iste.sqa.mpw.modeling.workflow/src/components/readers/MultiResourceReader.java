package components.readers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

import com.google.common.base.CaseFormat;

import components.helpers.EclipsePathHelper;
import util.LambdaVisitor;

/**
 * Base reader class which loads multiple EMF resources of a project in the workspace.
 * 
 * It recursively traverses a file tree and loads each model found with the given file-extension.
 */
public abstract class MultiResourceReader extends WorkflowComponentWithModelSlot {
	protected final static Logger log = Logger.getLogger(MultiResourceReader.class.getName());
	
	private final ResourceSet resourceSet = new ResourceSetImpl();
	
	private final String fileExtension;
	
	private String projectName;
	private String projectSubPath;
	private Set<String> excludeModels = new HashSet<>();
	private String rootPath = "..";
	
	protected MultiResourceReader(String fileExtension, String defaultSubPath) {
		if (!fileExtension.matches("\\.\\w+")) {
			throw new IllegalArgumentException("invalid fileExtension: " + fileExtension);
		}
		this.fileExtension = fileExtension;
		this.projectSubPath = defaultSubPath;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String baseUri) {
		this.projectName = baseUri;
	}
	
	public String getProjectSubPath() {
		return projectSubPath;
	}

	public void setProjectSubPath(String projectSubPath) {
		this.projectSubPath = projectSubPath;
	}
	
	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}

	public void addExcludeModel(String modelName) {
		if (!modelName.endsWith(fileExtension)) {
			modelName += fileExtension;
		}
		excludeModels.add(modelName);
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		log.info("searching " + getModelNameFromExtension() + " models for base URI: " + getBaseUri());
		
		final String projectDirectory = getProjectPath();
		final String targetDirectory = EclipsePathHelper.toJavaCompatibleAbsoluteFilePath(projectDirectory) + "/" + projectSubPath;
		try (var files = listFiles(targetDirectory)) {
			var modelNames = toRelevantModelNames(targetDirectory, files);
			logFoundModelNames(modelNames);
			addModelsToSlot(context, modelNames);
			
			log.info("found " + modelNames.size() + " " + fileExtension + " files");
			
		} catch (IOException e) {
			log.error("Failed to locate " + getModelNameFromExtension() + " files under: " + targetDirectory, e);
		}
	}
	
	private List<String> toRelevantModelNames(final String targetDirectory, Stream<Path> files) {
		var modelNames = files.map(f -> f.toFile().getPath())
			 .map(f -> substringAfter(f, targetDirectory))
			 .filter(f -> f.endsWith(fileExtension))
		     .filter(f -> !isExcluded(f))
		     .collect(Collectors.toList());
		return modelNames;
	}

	private void logFoundModelNames(List<String> modelNames) {
		modelNames.forEach(fileName -> {
			log.debug("found: " + fileName);
		});
	}

	/*
	 * Note: the project-name might be different to the sub-directory, where the project is placed.
	 * Hence, the project-name will be resolved to the URI (which has to be a file-URI).
	 */
	private String getProjectPath() {
		final String projectPath = EcorePlugin.getPlatformResourceMap().get(projectName).toFileString();
		assert projectPath != null;
		return projectPath;
	}
	
	private static String substringAfter(String string, String match) {
		string = string.replaceAll("\\\\", "/");
		match = match.replaceAll("\\\\", "/");
		int index = string.indexOf(match);
		return string.substring(index + match.length());
	}

	private void addModelsToSlot(WorkflowContext context, List<String> modelNames) {
		String baseUri = getBaseUri();
		var models = obtainTargetListForSlot(context);
		
		for (var modelName : modelNames) {
			var object = loadModel(baseUri, modelName);
			models.add(object);
		}

		context.set(getModelSlot(), models);
	}

	private Object loadModel(String baseUri, String modelName) {
		var uri = baseUri + modelName;
		boolean firstElementOnly = true;
		var object = Reader.load(resourceSet, uri, firstElementOnly);
		checkNoErrorsFromLoading(modelName, object);
		return object;
	}

	private void checkNoErrorsFromLoading(String modelName, Object object) {
		new LambdaVisitor<Object>()
			.on(EObject.class).then(eObject -> {
				throwExceptionIfResourceHasErrors(modelName, eObject.eResource());
			}).accept(object);
	}

	private void throwExceptionIfResourceHasErrors(String modelName, Resource resource) {
		if (resource != null && resource.getErrors().size() > 0) {
			throw new RuntimeException("error loading " + modelName + ": " + resource.getErrors().get(0));
		}
	}
	
	@SuppressWarnings("unchecked")
	private List<Object> obtainTargetListForSlot(WorkflowContext context) {
		Object slotContent = context.get(getModelSlot());
		if (slotContent != null) {
			return (List<Object>)slotContent;
		}
		return new ArrayList<Object>();
	}
	
	private Stream<Path> listFiles(String directory) throws IOException {
		final Path path = Path.of(directory);
		if (Files.exists(path)) {
			return findFilesSortedByPath(path);
		}
		final List<Path> emptyList = Collections.emptyList();
		return emptyList.stream();
	}

	private Stream<Path> findFilesSortedByPath(final Path path) throws IOException {
		return Files.find(path, 
				Integer.MAX_VALUE, (filePath, fileAttr) -> fileAttr.isRegularFile())
				.sorted(Comparator.comparing(Path::toAbsolutePath));
	}
	
	private boolean isExcluded(String filePath) {
		String fileName = new File(filePath).getName();
		for (var pattern : excludeModels) {
			var resolvedWildcards = pattern.replaceAll("\\*" + fileExtension, fileName); // allow "*.<fileextension>" pattern
			if (filePath.endsWith(resolvedWildcards)) {
				return true;
			}
		}
		return excludeModels.contains(fileName);
	}
	
	private String getBaseUri() {
		return "platform:/resource/" + projectName + "/" + projectSubPath + "/";
	}
	
	private String getModelNameFromExtension() {
		return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, fileExtension.substring(1));
	}
	
}