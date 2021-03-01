package components.readers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import behaviorInputs.impl.InputsFactoryImpl;
import components.helpers.OclValidationHelper;

/**
 * MultiResourceReader Component used to read Henshin commands recursively in a given file path.
 */
public class CommandReader extends MultiResourceReader {
	public CommandReader() {
		super(".henshin", "src-commands");
	}
	
	@Override
	protected void invokeInternal(final WorkflowContext context, final ProgressMonitor monitor, final Issues issues) {
		super.invokeInternal(context, monitor, issues);
		
		final var commands = getCommandsFromSlot(context);
		final OclValidationHelper oclValidationHelper = new OclValidationHelper("CommandValidation.ocl");
		final var validComands = oclValidationHelper.validateContents(commands, issues);
		
		final var inputs = InputsFactoryImpl.eINSTANCE.createHenshinCommandInputs();
		inputs.getModules().addAll(validComands);
		context.set(String.format("%sComposition", getModelSlot()), inputs);
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

}