package components;

import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import de.unistuttgart.iste.sqa.mpw.modeling.queries.QueryDslStandaloneSetup;
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.Model;
import inputs.impl.InputsFactoryImpl;

public class QueryReader extends MultiResourceReader {

	public QueryReader() {
		super(".query", "src/queries");
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		super.invokeInternal(context, monitor, issues);

		var inputs = InputsFactoryImpl.eINSTANCE.createQueryInputs();
		var models = inputs.getModels();
		
		String modelSlot = getModelSlot();
		var objects = (List<?>)context.get(modelSlot);
		
		for (Object object : objects) {
			var queryModel = (Model)object;
			models.add(queryModel);
		}
		
		context.set(modelSlot + "Composition", inputs);
	}
}