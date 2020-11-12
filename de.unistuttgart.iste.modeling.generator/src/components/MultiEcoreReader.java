package components;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

public class MultiEcoreReader extends WorkflowComponentWithModelSlot {
	private String baseUri;
	private List<String> ecoreNames = new ArrayList<>();

	public String getBaseUri() {
		return baseUri;
	}

	public void setBaseUri(String baseUri) {
		this.baseUri = baseUri;
	}
	
	public void addEcoreName(String name) {
		ecoreNames.add(name);
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
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
}