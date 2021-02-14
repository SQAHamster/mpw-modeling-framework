package components.readers;

import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDslStandaloneSetup;
import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.Model;
import behaviorInputs.impl.InputsFactoryImpl;

/**
 * MultiResourceReader Component used to read QueryDSL models recursively in a given file path.
 */
public class QueryReader extends MultiResourceReader {

	public QueryReader() {
		super(".query", "src-queries");
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	protected void invokeInternal(final WorkflowContext context, final ProgressMonitor monitor, final Issues issues) {
		super.invokeInternal(context, monitor, issues);

		final var inputs = InputsFactoryImpl.eINSTANCE.createQueryInputs();
		final var models = inputs.getModels();
		
		final String modelSlot = getModelSlot();
		final var objects = (List<?>)context.get(modelSlot);
		
		for (final Object object : objects) {
			final var queryModel = (Model)object;
			models.add(queryModel);
		}
		
		context.set(modelSlot + "Composition", inputs);
	}
}