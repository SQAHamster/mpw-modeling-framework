package components.transformators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import behaviorInputs.QueryInputs;
import behaviorsbase.NamedElement;
import components.helpers.EclipsePathHelper;
import components.helpers.QvtoLogger;
import util.LambdaVisitor;

/**
 * Internal class, which processes the transformation executions for QVTo. It
 * obtains dependent models from the given {@link WorkflowContext} and bounds
 * them to the config parameters of the QVTo transformation.
 */
final class ModelToModelTransformationExecutor {
    private static final Logger log = Logger.getLogger(ModelToModelTransformationExecutor.class.getName());

    private static final String QVTO_CONFIGPARAM_ENTITY_MODELS = "EntityModels";
    private static final String QVTO_CONFIGPARAM_QUERIES = "Queries";
    private static final String QVTO_CONFIGPARAM_COMMANDS = "Commands";
    private static final String QVTO_CONFIGPARAM_SOURCE_MODEL_URI = "SourceModelUri";
    private static final String WORKFLOW_CONTEXT_SLOT_QUERIES = "queries";
    private static final String WORKFLOW_CONTEXT_SLOT_COMMANDS = "commands";
    private static final String TRANSFORMATION_MODULE = "de.unistuttgart.iste.sqa.mpw.modeling.transformations";

    private final TransformationExecutor internalExecutor;
    private final URI transformationURI;
    private final SourceTargetRelationship sourceTargetRelationship;
    private boolean errorOnTransformingNoOutput = true;

    private final WorkflowContext workflowContext;
    private final Issues issues;

    private int successfulTransformationsCount;

    private final ArrayList<EObject> resultInstances = new ArrayList<EObject>();

    public ModelToModelTransformationExecutor(final WorkflowContext workflowContext, final Issues issues,
            final String uri, final SourceTargetRelationship sourceTargetRelationship) {
        this.workflowContext = workflowContext;
        this.issues = issues;
        this.transformationURI = createTransformationUriFromString(uri);
        this.sourceTargetRelationship = sourceTargetRelationship;

        this.internalExecutor = new TransformationExecutor(transformationURI);
    }

    /**
     * Entry point to transform a model object with the underlying QVTo
     * transformation.
     */
    void transformNext(final EObject eObject) {
        final var result = executeTransformation(eObject);
        handleErrors(eObject, result);
    }

    private ExecutionDiagnostic executeTransformation(final EObject eObject) {
        if (sourceTargetRelationship == SourceTargetRelationship.EXISTING_TARGET) {
            return executeExistingTargetTransformation(eObject);
        } else {
            return executeNewTargetTransformation(eObject);
        }
    }

    private ExecutionDiagnostic executeExistingTargetTransformation(final EObject eObject) {
        final var context = createExecutionContextForObject(eObject);
        final var input = new BasicModelExtent(Arrays.asList(eObject));

        final var result = internalExecutor.execute(context, input);
        getResultInstances().add(eObject);

        return result;
    }

    private ExecutionDiagnostic executeNewTargetTransformation(final EObject eObject) {
        final var context = createExecutionContextForObject(eObject);
        final var input = new BasicModelExtent(Arrays.asList(eObject));
        final var output = new BasicModelExtent();
        final var result = internalExecutor.execute(context, input, output);
        final List<EObject> contents = output.getContents();

        if (contents.size() > 0) {
            final EObject resultObject = contents.get(0);
            getResultInstances().add(resultObject);
        } else if (errorOnTransformingNoOutput) {
            log.error("failed to transform any model for " + getTransformationName() + " on " + getName(eObject));
        }

        if (contents.size() > 1) {
            log.warn("created more than 1 content (" + contents.size() + ") for " + getTransformationName() + " on "
                    + getName(eObject));
            log.warn("  second element: " + contents.get(1));
        }

        return result;
    }

    private ExecutionContext createExecutionContextForObject(final EObject eObject) {
        final var context = new ExecutionContextImpl();

        context.setLog(new QvtoLogger(getName(eObject), log));

        context.setConfigProperty(QVTO_CONFIGPARAM_ENTITY_MODELS,
                MpwEntityModelsCollector.getAllRelevantMpwPackages(workflowContext));
        context.setConfigProperty(QVTO_CONFIGPARAM_QUERIES, workflowContext.get(WORKFLOW_CONTEXT_SLOT_QUERIES));
        context.setConfigProperty(QVTO_CONFIGPARAM_COMMANDS, workflowContext.get(WORKFLOW_CONTEXT_SLOT_COMMANDS));
        if (eObject.eResource() != null) {
            context.setConfigProperty(QVTO_CONFIGPARAM_SOURCE_MODEL_URI, eObject.eResource().getURI().toString());
        }
        return context;
    }

    private void handleErrors(final EObject eObject, final ExecutionDiagnostic result) {
        if (result.getSeverity() == Diagnostic.OK) {
            successfulTransformationsCount++;
            log.debug("Transformed QVTo " + transformationURI + " successfully for: " + getName(eObject));
        } else {
            log.error("Failed QVTo " + transformationURI + " for: " + getName(eObject));
            final var status = BasicDiagnostic.toIStatus(result);
            issues.addError(status.getMessage());
            for (final var child : result.getChildren()) {
                issues.addError("> " + child.getMessage());
            }
        }
    }

    public int getSuccessfulTransformationsCount() {
        return successfulTransformationsCount;
    }

    public String getTransformationName() {
        return transformationURI.lastSegment();
    }

    public boolean isErrorOnTransformingNoOutput() {
        return errorOnTransformingNoOutput;
    }

    /**
     * @param errorOnTransformingNoOutput if true, an ERROR log is written, if the
     *                                    transformation does not produce any
     *                                    output.
     */
    public void setErrorOnTransformingNoOutput(boolean errorOnTransformingNoOutput) {
        this.errorOnTransformingNoOutput = errorOnTransformingNoOutput;
    }

    private URI createTransformationUriFromString(final String baseUri) {
        String transformationUri = baseUri;
        if (EclipsePathHelper.isProjectInSameWorkspace(TRANSFORMATION_MODULE)) {
            // append "transforms" intermediary directory, since it is not read from archive
            transformationUri = transformationUri.replace(TRANSFORMATION_MODULE, TRANSFORMATION_MODULE + "/transforms");
        }
        return URI.createURI(transformationUri);
    }

    private static String getName(final EObject object) {
        final StringBuilder stringBuilder = new StringBuilder();
        new LambdaVisitor<Object>().on(NamedElement.class).then(namedElement -> {
            stringBuilder.append(namedElement.getName());
        }).on(QueryInputs.class).then(queryDslInputs -> {
            stringBuilder.append("QueryDsl Inputs");
        }).orElse(() -> {
            stringBuilder.append(object.toString());
        }).accept(object);
        return stringBuilder.toString();
    }

    public ArrayList<EObject> getResultInstances() {
        return resultInstances;
    }

}
