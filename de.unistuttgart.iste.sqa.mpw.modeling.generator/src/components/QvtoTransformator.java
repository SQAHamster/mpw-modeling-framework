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
		var transformationURI = URI.createURI(transformationUri);
		var executor = new TransformationExecutor(transformationURI);
		
		int successfulTransformationsCount = 0;
		
		var modelInstances = (List<?>)workflowContext.get(getModelSlot());
		var resultInstances = new ArrayList<EObject>();
		for (var instance : modelInstances) {
			var eObject = (EObject)instance;
			var input = new BasicModelExtent(Arrays.asList(eObject));
			
			var context = new ExecutionContextImpl();
			context.setLog(new QvtoLogger(getName(eObject), log));
			
			context.setConfigProperty("EntityModels", workflowContext.get("entityModels"));
			context.setConfigProperty("Queries", workflowContext.get("queries"));
			context.setConfigProperty("Commands", workflowContext.get("commands"));
			context.setConfigProperty("SourceModelUri", eObject.eResource().getURI().toString());
			
			ExecutionDiagnostic result;
			if (sourceTargetRelationship == SourceTargetRelationship.EXISTING_TARGET) {
				result = executor.execute(context, input);
				resultInstances.add(eObject);
			} else {
				var output = new BasicModelExtent();
				result = executor.execute(context, input, output);
				List<EObject> contents = output.getContents();
				resultInstances.addAll(contents);
				
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
			}
		}
		
		log.info("Transformed " + successfulTransformationsCount + " models successfully with " + transformationURI.lastSegment());
		
		workflowContext.set(getTargetModelSlot(), resultInstances);

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
