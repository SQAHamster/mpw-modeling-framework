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
import org.eclipse.emf.ecore.resource.Resource;
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
	private static final String WORKFLOW_CONTEXT_SLOT_ENTITY_MODELS = "entityModels";
	private static final String FEATURE_NAMEDELEMENT_NAME = "name";
	private static final String FILE_EXTENSION_ECORE = "ecore";
	private static final String FILE_EXTENSION_XMI = "xmi";

	private final static Logger log = Logger.getLogger(XmiWriter.class.getName());
	
	private String fileExtension = "xmi";
	
	/** suffix for the folder where the files are placed */
	private String directorySuffix = "";
	
	/** the project name in which the files are written */
	private String projectName;

	private String rootPath = "..";
	
	public void setFileExtension(final String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
	}
	
	public String getDirectorySuffix() {
		return directorySuffix;
	}

	public void setDirectorySuffix(final String directorySuffix) {
		this.directorySuffix = directorySuffix;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}
	
	public String getRootPath() {
		return rootPath;
	}

	public void setRootPath(final String rootPath) {
		this.rootPath = rootPath;
	}

	@Override
	protected void invokeInternal(final WorkflowContext context, final ProgressMonitor monitor, final Issues issues) {
		final var resources = (List<?>)context.get(getModelSlot());
		for (final var resource : resources) {
			save(context, (EObject)resource);
		}
	}

	private void save(final WorkflowContext context, final EObject object) {
		final String name = getName(object);
		final String directoryName = object.eClass().getEPackage().getName() + directorySuffix;
		final String fileUri = "platform:/resource/" + projectName + "/debugout/" + directoryName + "/" + name + "." + fileExtension;
		
		try {
			final EObject copiedObject = EcoreUtil.copy(object);
			removeAnnotationContents(copiedObject);
			saveObjectToFileUri(copiedObject, fileUri);
			
			replaceEcoreLinksToGeneratedOnes(context, fileUri, directoryName);
			
			log.debug(fileUri + " created.");
		} catch (final IOException e) {
			log.error("Error during creating Xmi.", e);
		}
	}

	private void saveObjectToFileUri(final EObject copiedObject, final String fileUri) throws IOException {
		final var resource = createResourceSetForFileUri(fileUri);
		resource.getContents().add(copiedObject);
		resource.save(createUtf8SaveOptions());
	}

	private static Resource createResourceSetForFileUri(final String fileUri) {
		final var resourceSet = new ResourceSetImpl();

		final var resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
		resourceFactoryRegistry.getExtensionToFactoryMap().put(FILE_EXTENSION_ECORE, new EcoreResourceFactoryImpl());
		resourceFactoryRegistry.getExtensionToFactoryMap().put(FILE_EXTENSION_XMI, new XMIResourceFactoryImpl());
		
		return resourceSet.createResource(URI.createURI(fileUri));
	}

	private static Map<String, String> createUtf8SaveOptions() {
		final Map<String, String> saveOptions = new HashMap<String, String>();
		saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, StandardCharsets.UTF_8.name());
		return saveOptions;
	}

	/**
	 * Fix the references to the extended / transformed ecore files
	 * Note: the transformed ecore files are based on their package names, so regard this.  
	 * @param context 
	 */
	private void replaceEcoreLinksToGeneratedOnes(final WorkflowContext context, final String resourceUri, final String directoryName) throws IOException {
		final String fileName = URI.createURI(resourceUri).lastSegment();
		final var filePathString = EclipsePathHelper.getMappedPlatformUriForProject(projectName).toFileString() + "/debugout/" + directoryName + "/" + fileName;
		final var path = Paths.get(filePathString);
		final var charset = StandardCharsets.UTF_8;

		var content = new String(Files.readAllBytes(path), charset);
		content = replaceEntityModelNamesToPackageNames(context, content, directoryName);
		Files.write(path, content.getBytes(charset));
	}
	
	private String replaceEntityModelNamesToPackageNames(final WorkflowContext context, String text, final String directoryName) {
		final String projectNameSuffix = projectName.substring(projectName.lastIndexOf('.') + 1);

		final var modeledEcoreFiles = (List<?>)context.get(WORKFLOW_CONTEXT_SLOT_ENTITY_MODELS);
		for (final var object : modeledEcoreFiles) {
			final var ePackage = (EPackage)object;
			
			final Resource eResource = ePackage.eResource();
			final boolean isLoadedFromWorkspaceFile = eResource.getURI().toPlatformString(true) != null;
			if (isLoadedFromWorkspaceFile) {
				text = replaceReferences(text, directoryName, projectNameSuffix, ePackage);
			}
		}
			
		return text;
	}

	private String replaceReferences(String text, final String directoryName, final String projectNameSuffix,
			final EPackage ePackage) {
		final Resource eResource = ePackage.eResource();
		final var originalUri = eResource.getURI().toString();
		final String fileName = new File(eResource.getURI().toPlatformString(true)).getName();
		
		final String originalUriSuffix = "mpw/model//" + fileName;
		final String modifiedUriSuffix = projectNameSuffix + "/debugout/" + directoryName + "//" + ePackage.getName() + ".ecore";
		final var modifiedUri = originalUri.replaceAll(originalUriSuffix, modifiedUriSuffix);
		
		text = text.replaceAll(originalUri, modifiedUri);
		return text;
	}

	private String getName(final EObject object) {
		final var nameFeature = object.eClass().getEStructuralFeature(FEATURE_NAMEDELEMENT_NAME);
		return "" + object.eGet(nameFeature);
	}
	
	/**
	 * opening XMI files with complex annotation contents comes with errors, so remove them.
	 */
	private void removeAnnotationContents(final EObject eObject) {
		CustomAnnotationConverter.convert(eObject);
		
		final var annotations = EcoreUtil2.getAllContentsOfType(eObject, EAnnotation.class);
		for (final var annotation : annotations) {
			final var contents = annotation.getContents();
			final var replacedContents = replaceAllObjects(contents);
			contents.clear();
			contents.addAll(replacedContents);
		}
	}
	
	private static List<EAnnotation> replaceAllObjects(final List<? extends EObject> list) {
		return list.stream()
				.map(content -> toAnnotation(content))
				.collect(Collectors.toList());
	}
	
	/**
	 * convert eobjects so simple dummy annotations 
	 */
	private static EAnnotation toAnnotation(final EObject object) {
		// EAnnotations have not to be replaced
		if (object.getClass() == EAnnotationImpl.class) {
			return (EAnnotation)object;
		}
		
		final var annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(object.getClass().getSimpleName());
		annotation.getDetails().put("content", object.toString());
		return annotation;
	}
	
}
