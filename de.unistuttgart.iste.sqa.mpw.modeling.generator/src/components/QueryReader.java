package components;

import de.unistuttgart.iste.sqa.mpw.modeling.queries.QueryDslStandaloneSetup;

public class QueryReader extends MultiResourceReader {

	public QueryReader() {
		super(".query", "src/queries");
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}