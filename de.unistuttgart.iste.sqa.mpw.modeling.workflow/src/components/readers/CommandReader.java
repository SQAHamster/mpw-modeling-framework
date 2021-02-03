package components.readers;

import java.util.HashMap;
import java.util.List;

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

/**
 * MultiResourceReader Component used to read henshin commands recursively in a given file path.
 */
public class CommandReader extends MultiResourceReader {
	
	public CommandReader() {
		super(".henshin", "src-commands");
	}
	
	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		super.invokeInternal(context, monitor, issues);

		OCL ocl = OCL.newInstance();

		var validator = createOclValidator(ocl);
		var inputs = InputsFactoryImpl.eINSTANCE.createHenshinCommandInputs();
		var modules = inputs.getModules();
		
		String modelSlot = getModelSlot();
		var objects = (List<?>)context.get(modelSlot);
		
		for (Object object : objects) {
			var commandModel = (org.eclipse.emf.henshin.model.Module)object;
			
			var diagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(commandModel);
			validator.validate(commandModel, diagnostics, new HashMap<Object, Object>());
			
			if (diagnostics.getSeverity() == Diagnostic.OK) {
				modules.add(commandModel);
			} else {
				issues.addError(diagnostics.getMessage());
				for (var child : diagnostics.getChildren()) {
					issues.addError("> " + child.getMessage());
				}
			}
		}
		
		context.set(modelSlot + "Composition", inputs);
	}
	
	private static EValidator createOclValidator(OCL ocl) {
		CompleteOCLStandaloneSetup.doSetup();
		var uri = "platform:/resource/de.unistuttgart.iste.sqa.mpw.modeling.workflow/validation/CommandValidation.ocl";
		return new CompleteOCLEObjectValidator(HenshinPackage.eINSTANCE, URI.createURI(uri), ocl.getEnvironmentFactory());
	}

}