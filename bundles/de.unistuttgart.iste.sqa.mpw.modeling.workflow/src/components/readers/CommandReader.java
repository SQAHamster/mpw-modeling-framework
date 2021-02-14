package components.readers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;

import behaviorInputs.impl.InputsFactoryImpl;
import components.helpers.EclipsePathHelper;

/**
 * MultiResourceReader Component used to read Henshin commands recursively in a given file path.
 */
public class CommandReader extends MultiResourceReader {
	private BasicDiagnostic currentDiagnostics;
	private EValidator currentValidator;

	public CommandReader() {
		super(".henshin", "src-commands");
	}
	
	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		super.invokeInternal(context, monitor, issues);
		
		var commands = getCommandsFromSlot(context);
		var validComands = validateCommands(commands, issues);
		
		var inputs = InputsFactoryImpl.eINSTANCE.createHenshinCommandInputs();
		inputs.getModules().addAll(validComands);
		
		context.set(getModelSlot() + "Composition", inputs);
	}

	private List<org.eclipse.emf.henshin.model.Module> getCommandsFromSlot(WorkflowContext context) {
		final ArrayList<org.eclipse.emf.henshin.model.Module> commands = new ArrayList<>();
		String modelSlot = getModelSlot();
		var objects = (List<?>)context.get(modelSlot);
		
		for (Object object : objects) {
			var commandModel = (org.eclipse.emf.henshin.model.Module)object;
			commands.add(commandModel);
		}
		
		return commands;
	}
	
	private List<org.eclipse.emf.henshin.model.Module> validateCommands(List<org.eclipse.emf.henshin.model.Module> commands, Issues issues) {
		final ArrayList<org.eclipse.emf.henshin.model.Module> validCommands = new ArrayList<>();
		
		// Note: ocl instance has to be kept in this variable, since it must not be garbage collected until this method ends
		OCL ocl = OCL.newInstance();

		createOclValidator(ocl);
		
		for (var commandModel : commands) {
			if (isValid(commandModel)) {
				validCommands.add(commandModel);
			} else {
				addDiagnosticsError(issues);
			}
		}
		
		return validCommands;
	}
	
	private void createOclValidator(OCL ocl) {
		CompleteOCLStandaloneSetup.doSetup();
		final String uri = getWorkflowProjectResourcePathPrefix() + "/validation/CommandValidation.ocl";
		currentValidator = new CompleteOCLEObjectValidator(HenshinPackage.eINSTANCE, URI.createURI(uri), ocl.getEnvironmentFactory());
	}

	/**
	 * Validates the given commandModel and stores the diagnostic result in the {@link #currentDiagnostics} field.
	 * @return true, if the commandModel is valid.
	 */
	private boolean isValid(org.eclipse.emf.henshin.model.Module commandModel) {
		currentDiagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(commandModel);
		currentValidator.validate(commandModel, currentDiagnostics, new HashMap<Object, Object>());
		return currentDiagnostics.getSeverity() == Diagnostic.OK;
	}
	
	private void addDiagnosticsError(Issues issues) {
		issues.addError(currentDiagnostics.getMessage());
		for (var child : currentDiagnostics.getChildren()) {
			issues.addError("> " + child.getMessage());
		}
	}
	
	private static String getWorkflowProjectResourcePathPrefix() {
		final String workflowProjectName = "de.unistuttgart.iste.sqa.mpw.modeling.workflow";
		String uri = "platform:/resource/" + workflowProjectName;
		if (EclipsePathHelper.isProjectInSameWorkspace(workflowProjectName)) {
			uri += "/src";
		}
		return uri;
	}

}