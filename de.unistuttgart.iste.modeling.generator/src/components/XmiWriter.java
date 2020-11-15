package components;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class XmiWriter extends WorkflowComponentWithModelSlot {

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
			var nameFeature = object.eClass().getEStructuralFeature("name");
			String fileUri = "out/" + object.eGet(nameFeature) + ".xmi";
			Resource xmiResource = new XMIResourceImpl(URI.createFileURI(fileUri));
			xmiResource.getContents().add(object);
			saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
			xmiResource.save(saveOptions);
			System.out.println("Xmi file created.");
		} catch (IOException e) {
			System.out.println("Error during creating Xmi.");
			e.printStackTrace();
		}
	}

}
