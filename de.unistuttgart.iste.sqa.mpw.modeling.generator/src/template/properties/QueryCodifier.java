package template.properties;

import query.Statement;

public class QueryCodifier {
	
	private QueryCodifier() {}
	
	public static String convertForQueryStatement(Statement s) {
		throw new IllegalArgumentException("both target and collectionTarget are not allowed to be null");
	}
	
}
