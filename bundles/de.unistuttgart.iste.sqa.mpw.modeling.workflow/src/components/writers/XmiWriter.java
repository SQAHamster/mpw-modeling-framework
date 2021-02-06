package components.writers;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.EcoreUtil2;

import components.helpers.CustomAnnotationConverter;
import components.helpers.EclipsePathHelper;

/**
 * Component used to debugging purposes. It writes EMF resources in some points of the workflow to a XMI / Ecore file.
 * This files then can be inspected to see effects of transformation steps.
 */
public class XmiWriter extends WorkflowComponentWithModelSlot {
	private final static Logger log = Logger.getLogger(XmiWriter.class.getName());
	
	private String fileExtension = "xmi";
	
	/** suffix for the folder where the files are placed */
	private String directorySuffix = "";
	
	/** the project name in which the files are written */
	private String projectName;

	private String rootPath = "..";
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
	}
	
	public String getDirectorySuffix() {
		return directorySuffix;
	}

	public void setDirectorySuffix(String directorySuffix) {
		this.directorySuffix = directorySuffix;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(String rootPath) {
		this.rootPath = rootPath;
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		var resources = (List<?>)context.get(getModelSlot());
		for (var resource : resources) {
			save(context, (EObject)resource);
		}
	}

	private void save(WorkflowContext context, EObject object) {
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
			
			var name = getName(object);
			String directoryName = object.eClass().getEPackage().getName() + directorySuffix;
			String fileUri = "platform:/resource/" + projectName + "/debugout/" + directoryName + "/" + name + "." + fileExtension;
			
			var resourceSet = new ResourceSetImpl();

			var resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
			resourceFactoryRegistry.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			resourceFactoryRegistry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			
			var resource = resourceSet.createResource(URI.createURI(fileUri));
			EObject copiedObject = EcoreUtil.copy(object);
			removeAnnotationContents(copiedObject);
			resource.getContents().add(copiedObject);
			resource.save(saveOptions);
			
			replaceEcoreLinksToGeneratedOnes(context, fileUri, directoryName);
			
			log.debug(fileUri + " created.");
		} catch (IOException e) {
			log.error("Error during creating Xmi.", e);
		}
	}

	/**
	 * Fix the references to the extended / transformed ecore files
	 * Note: the transformed ecore files are based on their package names, so regard this.  
	 * @param context 
	 */
	private void replaceEcoreLinksToGeneratedOnes(WorkflowContext context, String resourceUri, String directoryName) throws IOException {
		final String fileName = URI.createURI(resourceUri).lastSegment();
		var filePathString = EclipsePathHelper.getMappedPlatformUriForProject(projectName).toFileString() + "/debugout/" + directoryName + "/" + fileName;
		var path = Paths.get(filePathString);
		var charset = StandardCharsets.UTF_8;

		var content = new String(Files.readAllBytes(path), charset);
		content = replaceEntityModelNamesToPackageNames(context, content, directoryName);
		Files.write(path, content.getBytes(charset));
	}
	
	private String replaceEntityModelNamesToPackageNames(WorkflowContext context, String text, String directoryName) {
		String projectNameSuffix = projectName.substring(projectName.lastIndexOf('.') + 1);

		var modeledEcoreFiles = (List<?>)context.get("entityModels");
		for (var object : modeledEcoreFiles) {
			var ePackage = (EPackage)object;
			
			var originalUri = ePackage.eResource().getURI().toString();
			String fileName = new File(ePackage.eResource().getURI().toPlatformString(true)).getName();
			
			String originalUriSuffix = "mpw/model//" + fileName;
			String modifiedUriSuffix = projectNameSuffix + "/debugout/" + directoryName + "//" + ePackage.getName() + ".ecore";
			var modifiedUri = originalUri.replaceAll(originalUriSuffix, modifiedUriSuffix);
			
			text = text.replaceAll(originalUri, modifiedUri);
		}
			
		return text;
	}

	private String getName(EObject object) {
		var nameFeature = object.eClass().getEStructuralFeature("name");
		return "" + object.eGet(nameFeature);
	}
	
	/**
	 * opening XMI files with complex annotation contents comes with errors, so remove them.
	 */
	private void removeAnnotationContents(EObject eObject) {
		CustomAnnotationConverter.convert(eObject);
		
		var annotations = EcoreUtil2.getAllContentsOfType(eObject, EAnnotation.class);
		for (var annotation : annotations) {
			var contents = annotation.getContents();
			var replacedContents = replaceAllObjects(contents);
			contents.clear();
			contents.addAll(replacedContents);
		}
	}
	
	private static List<EAnnotation> replaceAllObjects(List<? extends EObject> list) {
		return list.stream()
				.map(content -> toAnnotation(content))
				.collect(Collectors.toList());
	}
	
	/**
	 * convert eobjects so simple dummy annotations 
	 */
	private static EAnnotation toAnnotation(EObject object) {
		// EAnnotations have not to be replaced
		if (object.getClass() == EAnnotationImpl.class) {
			return (EAnnotation)object;
		}
		
		var annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(object.getClass().getSimpleName());
		annotation.getDetails().put("content", object.toString());
		return annotation;
	}
	
}
