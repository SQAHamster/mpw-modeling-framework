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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

import com.google.common.base.CaseFormat;

import components.helpers.EclipsePathHelper;

/**
 * Base reader class which loads multiple EMF resources of a project in the workspace.
 * 
 * It recursively traverses a file tree and loads each model found with the given file-extension.
 */
public abstract class MultiResourceReader extends WorkflowComponentWithModelSlot {
	protected final static Logger log = Logger.getLogger(MultiResourceReader.class.getName());
	
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
		
		String targetDirectory = EclipsePathHelper.toJavaCompatibleAbsoluteFilePath(rootPath) + "/" + projectName + "/" + projectSubPath;
		try (var files = listFiles(targetDirectory)) {
			
			var modelNames = files.map(f -> f.toFile().getPath())
				 .map(f -> substringAfter(f, targetDirectory))
				 .filter(f -> f.endsWith(fileExtension))
			     .filter(f -> !isExcluded(f))
			     .collect(Collectors.toList());
			
			modelNames.forEach(fileName -> {
				log.debug("found: " + fileName);
			});
			
			log.info("found " + modelNames.size() + " " + fileExtension + " files");
			
			addModelsToSlot(context, modelNames);
		} catch (IOException e) {
			log.error("Failed to locate " + getModelNameFromExtension() + " files under: " + targetDirectory, e);
		}
	}
	
	private static String substringAfter(String string, String match) {
		string = string.replaceAll("\\\\", "/");
		match = match.replaceAll("\\\\", "/");
		int index = string.indexOf(match);
		return string.substring(index + match.length());
	}

	private void addModelsToSlot(WorkflowContext context, List<String> modelNames) {
		String baseUri = getBaseUri();
		ResourceSet resourceSet = new ResourceSetImpl();
		var models = obtainTargetListForSlot(context);
		
		for (var modelName : modelNames) {
			var uri = baseUri + modelName;
			boolean firstElementOnly = true;
			var object = Reader.load(resourceSet, uri, firstElementOnly);
			if (object instanceof EObject) {
				var eObject = (EObject)object;
				if (eObject.eResource() != null && eObject.eResource().getErrors().size() > 0) {
					throw new RuntimeException("error loading " + modelName + ": " + eObject.eResource().getErrors().get(0));
				}
			}
			models.add(object);
		}

		context.set(getModelSlot(), models);
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
			return Files.find(path, 
					Integer.MAX_VALUE,
			        (filePath, fileAttr) 
			        -> fileAttr.isRegularFile()).sorted(new Comparator<Path>() {
						@Override
						public int compare(Path lhs, Path rhs) {
							return lhs.toAbsolutePath().compareTo(rhs.toAbsolutePath());
						}
					});
		}
		final List<Path> emptyList = Collections.emptyList();
		return emptyList.stream();
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