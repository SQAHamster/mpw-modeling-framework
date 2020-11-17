package components;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class XmiWriter extends WorkflowComponentWithModelSlot {
	private final static Logger log = Logger.getLogger(XmiWriter.class.getName());
	
	private String fileExtension = "xmi";
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getFileExtension() {
		return fileExtension;
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
			
			var nameFeature = object.eClass().getEStructuralFeature("name");
			String fileUri = "platform:/resource/de.unistuttgart.iste.modeling.generator/out/" + object.eGet(nameFeature) + "." + fileExtension;
			
			var resourceSet = new ResourceSetImpl();

			var resourceFactoryRegistry = resourceSet.getResourceFactoryRegistry();
			resourceFactoryRegistry.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			resourceFactoryRegistry.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			
			var resource = resourceSet.createResource(URI.createURI(fileUri));
			resource.getContents().add(EcoreUtil.copy(object));
			resource.save(saveOptions);
			
			log.debug(fileUri + " created.");
		} catch (IOException e) {
			log.error("Error during creating Xmi.", e);
		}
	}
	
}
