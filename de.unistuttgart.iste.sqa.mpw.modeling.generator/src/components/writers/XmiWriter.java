package components.writers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
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

public class XmiWriter extends WorkflowComponentWithModelSlot {
	private final static Logger log = Logger.getLogger(XmiWriter.class.getName());
	
	private String fileExtension = "xmi";
	
	/** suffix for the folder where the files are placed */
	private String directorySuffix = "";
	
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

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		var resources = (List<?>)context.get(getModelSlot());
		for (var resource : resources) {
			save((EObject)resource);
		}
	}

	private void save(EObject object) {
		try {
			Map<String, String> saveOptions = new HashMap<String, String>();
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
			
			var name = getName(object);
			String directoryName = object.eClass().getEPackage().getName() + directorySuffix;
			String fileUri = "platform:/resource/de.unistuttgart.iste.sqa.mpw.modeling.generator/out/" + directoryName + "/" + name + "." + fileExtension;
			
			var resourceSet = new ResourceSetImpl();

			var resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
			resourceFactoryRegistry.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			resourceFactoryRegistry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			
			var resource = resourceSet.createResource(URI.createURI(fileUri));
			EObject copiedObject = EcoreUtil.copy(object);
			removeAnnotationContents(copiedObject);
			resource.getContents().add(copiedObject);
			resource.save(saveOptions);
			
			log.debug(fileUri + " created.");
		} catch (IOException e) {
			log.error("Error during creating Xmi.", e);
		}
	}

	private String getName(EObject object) {
		var nameFeature = object.eClass().getEStructuralFeature("name");
		return "" + object.eGet(nameFeature);
	}
	
	/**
	 * opening XMI files with complex annotation contents comes with errors, so remove them.
	 */
	private void removeAnnotationContents(EObject eObject) {
		var modelElements = EcoreUtil2.getAllContentsOfType(eObject, EModelElement.class);
		for (var modelElement : modelElements) {
			var eAnnotations = modelElement.getEAnnotations();
			var replacedAnnotations = replaceAllObjects(eAnnotations);
			eAnnotations.clear();
			eAnnotations.addAll(replacedAnnotations);
		}
		
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
