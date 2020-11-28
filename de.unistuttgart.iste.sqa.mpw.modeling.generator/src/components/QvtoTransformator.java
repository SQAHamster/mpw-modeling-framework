package components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import components.helpers.QvtoLogger;

public class QvtoTransformator extends WorkflowComponentWithModelSlot {
	private final static Logger log = Logger.getLogger(QvtoTransformator.class.getName());
	
	private String transformationUri;
	private SourceTargetRelationship sourceTargetRelationship = SourceTargetRelationship.EXISTING_TARGET;
	private String targetModelSlot;
	
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
		var executor = new ModelToModelTransformationExecutor(workflowContext, issues, transformationUri);

		var resultInstances = new ArrayList<EObject>();
		Object slotContent = workflowContext.get(getModelSlot());
		
		if (slotContent instanceof List<?>) {
			var modelInstances = (List<?>)slotContent;
			for (var instance : modelInstances) {
				var resultInstance = executor.transformNext((EObject)instance);
				resultInstances.add(resultInstance);
			}
		} else if (slotContent instanceof EObject) {
			var resultInstance = executor.transformNext((EObject)slotContent);
			resultInstances.add(resultInstance);
		} else {
			throw new IllegalArgumentException("can only accept list of EObjects or single EObject instances");
		}
		
		log.info("Transformed " + executor.getSuccessfulTransformationsCount() + " models successfully with " + executor.getTransformationName());
		
		workflowContext.set(getTargetModelSlot(), resultInstances);
	}
	
	private class ModelToModelTransformationExecutor {
		private final TransformationExecutor internalExecutor;
		private final URI transformationURI;
		
		private final WorkflowContext workflowContext;
		private final Issues issues;
		
		private int successfulTransformationsCount;
		
		public ModelToModelTransformationExecutor(WorkflowContext workflowContext, Issues issues, String uri) {
			this.workflowContext = workflowContext;
			this.issues = issues;
			this.transformationURI = URI.createURI(transformationUri);
			this.internalExecutor = new TransformationExecutor(transformationURI);
		}

		EObject transformNext(EObject eObject) {
			var input = new BasicModelExtent(Arrays.asList(eObject));
			
			var context = new ExecutionContextImpl();
			
			context.setLog(new QvtoLogger(getName(eObject), log));
			
			context.setConfigProperty("EntityModels", workflowContext.get("entityModels"));
			context.setConfigProperty("Queries", workflowContext.get("queries"));
			context.setConfigProperty("Commands", workflowContext.get("commands"));
			if (eObject.eResource() != null) {
				context.setConfigProperty("SourceModelUri", eObject.eResource().getURI().toString());
			}
			
			final EObject resultObject;
			
			ExecutionDiagnostic result;
			if (sourceTargetRelationship == SourceTargetRelationship.EXISTING_TARGET) {
				result = internalExecutor.execute(context, input);
				resultObject = eObject;
			} else {
				var output = new BasicModelExtent();
				result = internalExecutor.execute(context, input, output);
				List<EObject> contents = output.getContents();
				
				if (contents.size() > 0) {
					resultObject = contents.get(0);
				} else {
					resultObject = null;
					log.error("failed to transform any model for " + getTransformationName() + " on " + getName(eObject));
				}
				
				if (contents.size() > 1) {
					log.warn("created more than 1 content (" + contents.size() + ")");
				}
			}
			
			if (result.getSeverity() == Diagnostic.OK) {
				successfulTransformationsCount++;
				log.debug("Transformed QVTo " + transformationURI + " successfully for: " + getName(eObject));
			} else {
				log.error("Failed QVTo " + transformationURI + " for: " + getName(eObject));
				var status = BasicDiagnostic.toIStatus(result);
				issues.addError(status.getMessage());
				for (var child : result.getChildren()) {
					issues.addError("> " + child.getMessage());
				}
			}
			
			return resultObject;
		}

		public int getSuccessfulTransformationsCount() {
			return successfulTransformationsCount;
		}
		
		public String getTransformationName() {
			return transformationURI.lastSegment();
		}
		
	}
	
	
	private static String getName(EObject object) {
		if (object instanceof ENamedElement) {
			return ((ENamedElement) object).getName();
		}
		return object.toString();
	}
	
	public enum SourceTargetRelationship {
		NEW_TARGET, EXISTING_TARGET
	}

}
