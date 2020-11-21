package components;

import de.unistuttgart.iste.modeling.queries.QueryDslStandaloneSetup;

public class QueryReader extends MultiResourceReader {

	public QueryReader() {
		super(".query", "src/queries");
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}