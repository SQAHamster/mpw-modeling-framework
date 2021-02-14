package components.transformators;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import util.LambdaVisitor;

/**
 * Component used to call QVTo transformations.
 * 
 * It uses modelslots to obtain the input models. Optionally a target slot can be specified where the result will be written to.
 */
public class QvtoTransformator extends WorkflowComponentWithModelSlot {
	private static final Logger log = Logger.getLogger(QvtoTransformator.class.getName());
	
	private String transformationUri;
	private SourceTargetRelationship sourceTargetRelationship = SourceTargetRelationship.EXISTING_TARGET;
	private String targetModelSlot;
	
	private ModelToModelTransformationExecutor executor;
	
	public String getTransformationUri() {
		return transformationUri;
	}

	public void setTransformationUri(String uri) {
		this.transformationUri = uri;
	}
	
	public SourceTargetRelationship getSourceTargetRelationship() {
		return sourceTargetRelationship;
	}

	public void setSourceTargetRelationship(String sourceTargetRelationship) {
		this.sourceTargetRelationship = SourceTargetRelationship.valueOf(sourceTargetRelationship);
	}
	
	public String getTargetModelSlot() {
		if (targetModelSlot == null) {
			return getModelSlot();
		}
		return targetModelSlot;
	}

	public void setTargetModelSlot(String targetModelSlot) {
		this.targetModelSlot = targetModelSlot;
	}

	@Override
	protected void invokeInternal(WorkflowContext workflowContext, ProgressMonitor monitor, Issues issues) {
		executor = new ModelToModelTransformationExecutor(workflowContext, issues, transformationUri, sourceTargetRelationship);

		Object slotContent = workflowContext.get(getModelSlot());
		
		new LambdaVisitor<Object>()
		    .on(List.class).then(modelInstances -> { transformList(modelInstances); })
		    .on(EObject.class).then(eObject -> { transformSingleObject(eObject); })
		    .orElse(() -> { throw new IllegalArgumentException("can only accept list of EObjects or single EObject instances"); 		    })
		.accept(slotContent);
		
		log.info("Transformed " + executor.getSuccessfulTransformationsCount() + " models successfully with " + executor.getTransformationName());
		
		workflowContext.set(getTargetModelSlot(), executor.getResultInstances());
	}

	private void transformList(List<?> modelInstances) {
		for (var instance : modelInstances) {
			executor.transformNext((EObject)instance);
		}
	}

	private void transformSingleObject(EObject eObject) {
		executor.transformNext(eObject);
	}

}
