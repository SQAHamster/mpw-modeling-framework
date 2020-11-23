package template.properties;

import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.CollectionMethod;
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.Expression;
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.ParametrizedCollectionMethod;
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.SimpleCollectionMethod;
import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.Statement;

public class QueryCodifier {
	
	private QueryCodifier() {}
	
	public static String convertForQueryStatement(Statement s) {
		String target = s.getTarget();
		if (target != null) {
			if (target.equals("self")) {
				return "this";
			}
			return target;
		}
		CollectionMethod collectionTarget = s.getCollectionTarget();
		if (collectionTarget != null) {
			if (collectionTarget instanceof ParametrizedCollectionMethod) {
				var parametrizedCollectionMethod = (ParametrizedCollectionMethod)collectionTarget;
				String typeSelect = parametrizedCollectionMethod.getTypeSelect();
				return "stream().filter(" + typeSelect + ".class::isInstance).map(" + typeSelect + ".class::cast).collect(Collectors.toList())";
			} else {
				var simpleCollectionMethod = (SimpleCollectionMethod)collectionTarget;
				String method = simpleCollectionMethod.getMethod();
				if (method.equals("notEmpty")) {
					return "size() > 0";
				}
				return method + "()";
			}
		}
		throw new IllegalArgumentException("both target and collectionTarget are not allowed to be null");
	}
	
	private Statement findPredecessor(Statement statement) {
		var expression = (Expression) statement.eContainer();
		Statement previousStatement = null;
		for (var s : expression.getStatements()) {
			if (s == statement) {
				break;
			}
			previousStatement = s;
		}
		if (previousStatement == null) {
			throw new IllegalArgumentException("cannot find any predecessor for statement: " + statement);
		}
		return previousStatement;
	}
	
}
