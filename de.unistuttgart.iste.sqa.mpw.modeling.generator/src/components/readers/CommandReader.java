package components.readers;

import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import behaviorInputs.impl.InputsFactoryImpl;

public class CommandReader extends MultiResourceReader {
	
	public CommandReader() {
		super(".henshin", "src");
	}
	
	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		super.invokeInternal(context, monitor, issues);
		
		var inputs = InputsFactoryImpl.eINSTANCE.createHenshinCommandInputs();
		var modules = inputs.getModules();
		
		String modelSlot = getModelSlot();
		var objects = (List<?>)context.get(modelSlot);
		
		for (Object object : objects) {
			var commandModel = (org.eclipse.emf.henshin.model.Module)object;
			modules.add(commandModel);
		}
		
		context.set(modelSlot + "Composition", inputs);
	}

}