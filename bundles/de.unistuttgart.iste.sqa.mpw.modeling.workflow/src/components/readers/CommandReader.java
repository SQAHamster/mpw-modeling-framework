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
	protected void invokeInternal(final WorkflowContext context, final ProgressMonitor monitor, final Issues issues) {
		super.invokeInternal(context, monitor, issues);
		
		final var commands = getCommandsFromSlot(context);
		final var validComands = validateCommands(commands, issues);
		
		final var inputs = InputsFactoryImpl.eINSTANCE.createHenshinCommandInputs();
		inputs.getModules().addAll(validComands);
		
		context.set(getModelSlot() + "Composition", inputs);
	}

	private List<org.eclipse.emf.henshin.model.Module> getCommandsFromSlot(final WorkflowContext context) {
		final ArrayList<org.eclipse.emf.henshin.model.Module> commands = new ArrayList<>();
		final String modelSlot = getModelSlot();
		final var objects = (List<?>)context.get(modelSlot);
		
		for (final Object object : objects) {
			final var commandModel = (org.eclipse.emf.henshin.model.Module)object;
			commands.add(commandModel);
		}
		
		return commands;
	}
	
	private List<org.eclipse.emf.henshin.model.Module> validateCommands(final List<org.eclipse.emf.henshin.model.Module> commands, final Issues issues) {
		final ArrayList<org.eclipse.emf.henshin.model.Module> validCommands = new ArrayList<>();
		
		// Note: ocl instance has to be kept in this variable, since it must not be garbage collected until this method ends
		final OCL ocl = OCL.newInstance();

		createOclValidator(ocl);
		
		for (final var commandModel : commands) {
			if (isValid(commandModel)) {
				validCommands.add(commandModel);
			} else {
				addDiagnosticsError(issues);
			}
		}
		
		return validCommands;
	}
	
	private void createOclValidator(final OCL ocl) {
		CompleteOCLStandaloneSetup.doSetup();
		final String uri = getWorkflowProjectResourcePathPrefix() + "/validation/CommandValidation.ocl";
		currentValidator = new CompleteOCLEObjectValidator(HenshinPackage.eINSTANCE, URI.createURI(uri), ocl.getEnvironmentFactory());
	}

	/**
	 * Validates the given commandModel and stores the diagnostic result in the {@link #currentDiagnostics} field.
	 * @return true, if the commandModel is valid.
	 */
	private boolean isValid(final org.eclipse.emf.henshin.model.Module commandModel) {
		currentDiagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(commandModel);
		currentValidator.validate(commandModel, currentDiagnostics, new HashMap<Object, Object>());
		return currentDiagnostics.getSeverity() == Diagnostic.OK;
	}
	
	private void addDiagnosticsError(final Issues issues) {
		issues.addError(currentDiagnostics.getMessage());
		for (final var child : currentDiagnostics.getChildren()) {
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