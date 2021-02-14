package components.transformators;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;

import basetypes.BasetypesPackage;
import mpw.MpwPackage;
import viewmodel.ViewmodelPackage;

/**
 * Helper class to collect all relevant MPW models for the current workflow.
 * Note: While in the workspace of the MPW framework, the MPW models are already in the workflow's
 *       model slot, in external workspaces they have to be added explicitly.
 */
final class MpwEntityModelsCollector {
	private static final String WORKFLOW_CONTEXT_SLOT_ENTITY_MODELS = "entityModels";
	
	private MpwEntityModelsCollector() {}
	
	public static List<EPackage> getAllRelevantMpwPackages(final WorkflowContext workflowContext) {
		final ArrayList<EPackage> result = new ArrayList<EPackage>();
		result.addAll(getWorkspaceModels(workflowContext));
		
		addIfNotExists(result, MpwPackage.eINSTANCE);
		addIfNotExists(result, ViewmodelPackage.eINSTANCE);
		addIfNotExists(result, BasetypesPackage.eINSTANCE);
		
		return result;
	}

	private static List<EPackage> getWorkspaceModels(final WorkflowContext workflowContext) {
		@SuppressWarnings("unchecked")
		final var workspaceModels = (List<EPackage>)workflowContext.get(WORKFLOW_CONTEXT_SLOT_ENTITY_MODELS);
		return workspaceModels;
	}
	
	private static void addIfNotExists(final List<EPackage> result, final EPackage modelPackage) {
		if (!modelWithUriExists(result, modelPackage.getNsURI())) {
			result.add(modelPackage);
		}
	}
	
	private static boolean modelWithUriExists(final List<EPackage> result, final String modelUri) {
		return result.stream().anyMatch(ePackage -> ePackage.getNsURI().equals(modelUri));
	}
}
