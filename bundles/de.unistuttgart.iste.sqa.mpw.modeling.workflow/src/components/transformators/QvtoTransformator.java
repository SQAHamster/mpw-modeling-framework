package components.transformators;

import java.util.ArrayList;
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
	private boolean errorOnTransformingNoOutput = true;
	private boolean mergeToExistingSlotContent = false;
	
	private ModelToModelTransformationExecutor executor;
	
	public String getTransformationUri() {
		return transformationUri;
	}

	public void setTransformationUri(final String uri) {
		this.transformationUri = uri;
	}
	
	public SourceTargetRelationship getSourceTargetRelationship() {
		return sourceTargetRelationship;
	}

	public void setSourceTargetRelationship(final String sourceTargetRelationship) {
		this.sourceTargetRelationship = SourceTargetRelationship.valueOf(sourceTargetRelationship);
	}
	
	public String getTargetModelSlot() {
		if (targetModelSlot == null) {
			return getModelSlot();
		}
		return targetModelSlot;
	}

	public void setTargetModelSlot(final String targetModelSlot) {
		this.targetModelSlot = targetModelSlot;
	}
	
	public boolean isErrorOnTransformingNoOutput() {
		return errorOnTransformingNoOutput;
	}

	/**
	 * @param errorOnTransformingNoOutput if true, an ERROR log is written, if the transformation does not 
	 * produce any output.
	 */
	public void setErrorOnTransformingNoOutput(boolean errorOnTransformingNoOutput) {
		this.errorOnTransformingNoOutput = errorOnTransformingNoOutput;
	}

	public boolean isMergeToExistingSlotContent() {
		return mergeToExistingSlotContent;
	}

	public void setMergeToExistingSlotContent(boolean mergeToExistingSlotContent) {
		this.mergeToExistingSlotContent = mergeToExistingSlotContent;
	}


	@Override
	protected void invokeInternal(final WorkflowContext workflowContext, final ProgressMonitor monitor, final Issues issues) {
		executor = new ModelToModelTransformationExecutor(workflowContext, issues, transformationUri, sourceTargetRelationship);
		executor.setErrorOnTransformingNoOutput(errorOnTransformingNoOutput);

		final Object slotContent = workflowContext.get(getModelSlot());
		
		new LambdaVisitor<Object>()
		    .on(List.class).then(modelInstances -> { transformList(modelInstances); })
		    .on(EObject.class).then(eObject -> { transformSingleObject(eObject); })
		    .orElse(() -> { throw new IllegalArgumentException("can only accept list of EObjects or single EObject instances"); 		    })
		.accept(slotContent);
		
		log.info("Transformed " + executor.getSuccessfulTransformationsCount() + " models successfully with " + executor.getTransformationName());
		
		addResultInstancesToSlot(workflowContext);
	}

	@SuppressWarnings("unchecked")
	private void addResultInstancesToSlot(final WorkflowContext workflowContext) {
		final Object previousSlotContent = workflowContext.get(getTargetModelSlot());
		final ArrayList<EObject> resultInstances = executor.getResultInstances();
		if (previousSlotContent != null && mergeToExistingSlotContent) {
			new LambdaVisitor<Object>()
			    .on(List.class).then(modelInstances -> { modelInstances.addAll(resultInstances); })
			    .orElse(() -> { workflowContext.set(getTargetModelSlot(), resultInstances); })
			.accept(previousSlotContent);
		} else {
			workflowContext.set(getTargetModelSlot(), resultInstances);
		}
	}

	private void transformList(final List<?> modelInstances) {
		for (final var instance : modelInstances) {
			executor.transformNext((EObject)instance);
		}
	}

	private void transformSingleObject(final EObject eObject) {
		executor.transformNext(eObject);
	}

}
