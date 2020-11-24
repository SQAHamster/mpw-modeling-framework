package template.properties;

import java.beans.Introspector;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.EList;

import de.unistuttgart.iste.sqa.mpw.modeling.queries.querydsl.*;
import template.types.MpwTypesUtils;

public class QueryResultTypeDeterminer {
	private final Model model;
	
	private QueryResultTypeDeterminer(Model model) {
		super();
		this.model = model;
	}

	public static String determineQueryType(Model model) throws Exception {
		return new QueryResultTypeDeterminer(model).determineTypeForQueryModel();
	}
	
	private String determineTypeForQueryModel() throws Exception {
		EList<Expression> expressions = model.getExpressions();
		Expression firstExpression = expressions.get(0);
		return determineExpressionType(firstExpression);
	}
	
	private String determineExpressionType(Expression expression) throws Exception {
		if (expression instanceof OrExpression ||
				expression instanceof AndExpression ||
				expression instanceof EqualityExpression ||
				expression instanceof ImpliesExpression) {
			return "boolean";
		}
		
		Class<?> currentType = Object.class;
		
		for (var statement : expression.getStatements()) {
			String target = statement.getTarget();
			CollectionMethod collectionTarget = statement.getCollectionTarget();
			assert(target != null || collectionTarget != null);
			
			if (target != null) {
				currentType = handleSimpleTarget(currentType, target);
			}
			if (collectionTarget != null) {
				currentType = handleCollectionTarget(currentType, collectionTarget);
			}
		}
		
		return currentType.getSimpleName();
	}

	private Class<?> handleSimpleTarget(Class<?> currentType, String target) throws Exception {
		if (target.equals("self")) {
			currentType = MpwTypesUtils.getGenModelClassByName(model.getContext().getClassName());;
			return currentType;
		}
		if (target.endsWith("()")) {
			return boolean.class;
		}
		if (target.startsWith("is")) {
			return boolean.class;
		}
		
		return getMethodType(currentType, target);
	}
	
	private Class<?> handleCollectionTarget(Class<?> currentType, CollectionMethod target) throws Exception {
		// 		mpw.MpwPackage.Literals.TILE__CONTENTS.getEGenericType()
		return boolean.class;
	}
	
	private Class<?> getMethodType(Class<?> cls, String name) throws Exception {
		var result = getMethodTypeRecursively(cls, name);
		if (result == null) {
			throw new IllegalArgumentException("query " + model.getContext().getName() + ": method with name " + name + " not found in class: " + cls.getSimpleName());
		}
		return result;
	}
	
	private static Class<?> getMethodTypeRecursively(Class<?> cls, String name) throws Exception {
		var propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
		for (var pd : propertyDescriptors) {
		    Method readMethod = pd.getReadMethod();
			if (readMethod != null && pd.getName().equals(name)) {
				return pd.getPropertyType();
			}
		}
		for (var inheritedInterface : cls.getInterfaces()) {
			var result = getMethodTypeRecursively(inheritedInterface, name);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

}
