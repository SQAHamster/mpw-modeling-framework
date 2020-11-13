package components;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

public class MultiEcoreReader extends WorkflowComponentWithModelSlot {
	protected final static Logger log = Logger.getLogger(MultiEcoreReader.class.getName());
	
	private String projectName;
	private String projectSubPath = "model";
	private Set<String> excludeModels = new HashSet<>();

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
	
	public void addExcludeModel(String modelName) {
		if (!modelName.endsWith(".ecore")) {
			modelName += ".ecore";
		}
		excludeModels.add(modelName);
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		log.info("searching Ecore models for base URI: " + getBaseUri());
		
		String targetDirectory = "../" + projectName + "/" + projectSubPath;
		try (var files = listFiles(targetDirectory)) {
			
			var ecoreNames = files.map(f -> f.toFile().getName())
			     .filter(f -> f.endsWith(".ecore"))
			     .filter(f -> !excludeModels.contains(f))
			     .collect(Collectors.toList());
			
			ecoreNames.forEach(fileName -> {
				log.info("found: " + fileName);
			});
			
			addEcoresToModel(context, ecoreNames);
		} catch (IOException e) {
			log.error("Failed to locate Ecore files under: " + targetDirectory, e);
		}
	}

	private void addEcoresToModel(WorkflowContext context, List<String> ecoreNames) {
		String baseUri = getBaseUri();
		ResourceSet resourceSet = new ResourceSetImpl();
		var models = new ArrayList<Object>();
		
		for (var ecoreName : ecoreNames) {
			var uri = baseUri + ecoreName;
			boolean firstElementOnly = true;
			var object = Reader.load(resourceSet, uri, firstElementOnly);
			models.add(object);
		}

		context.set(getModelSlot(), models);
	}
	
	private static Stream<Path> listFiles(String directory) throws IOException {
		return Files.list(Path.of(directory));
	}
	
	private String getBaseUri() {
		return "platform:/resource/" + projectName + "/" + projectSubPath + "/";
	}
	
}