package components;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

public class QvtoTransformator extends WorkflowComponentWithModelSlot {
	private String uri;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	@Override
	protected void invokeInternal(WorkflowContext workflowContext, ProgressMonitor monitor, Issues issues) {
		var transformationURI = URI.createURI(uri);
		var executor = new TransformationExecutor(transformationURI);
		
		var ecoreModels = (List<?>)workflowContext.get(getModelSlot());
		for (var object : ecoreModels) {
			var ePackage = (EPackage)object;
			// var ecoreModel = ePackage.eResource();

			var input = new BasicModelExtent(Arrays.asList(ePackage));
			
			var context = new ExecutionContextImpl();
			context.setConfigProperty("Queries", Arrays.asList("frontIsClear", "mouthEmpty"));
			context.setConfigProperty("EditorCommands", Arrays.asList("initHamster"));
			context.setConfigProperty("GameCommands", Arrays.asList("move", "turnLeft"));
			
			var result = executor.execute(context, input);
			if (result.getSeverity() == Diagnostic.OK) {
				issues.addInfo("Transformed QVTo successfully for: " + ePackage.getName());
			} else {
				var status = BasicDiagnostic.toIStatus(result);
				issues.addError(status.getMessage());
			}
		}

	}

}
