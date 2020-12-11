/**
 */
package queryBehavior.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import queryBehavior.AndExpression;
import queryBehavior.BinaryExpression;
import queryBehavior.CalculationExpression;
import queryBehavior.CalculationOperator;
import queryBehavior.ClassInvariant;
import queryBehavior.CollectionMethodStatement;
import queryBehavior.CollectionMethodType;
import queryBehavior.CommandConstraint;
import queryBehavior.CompareExpression;
import queryBehavior.CompareOperator;
import queryBehavior.ConstantExpression;
import queryBehavior.Constraint;
import queryBehavior.EnumLiteralStatement;
import queryBehavior.ExpressionalElement;
import queryBehavior.FeatureStatement;
import queryBehavior.ImpliesExpression;
import queryBehavior.NotExpression;
import queryBehavior.OldExpression;
import queryBehavior.OrExpression;
import queryBehavior.Parameter;
import queryBehavior.ParameterUsageStatement;
import queryBehavior.Postcondition;
import queryBehavior.Precondition;
import queryBehavior.Query;
import queryBehavior.QueryFactory;
import queryBehavior.QueryPackage;
import queryBehavior.QueryStatement;
import queryBehavior.SelfStatement;
import queryBehavior.StatementsExpression;
import queryBehavior.VariableExpression;
import queryBehavior.VariableUsageStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QueryFactoryImpl extends EFactoryImpl implements QueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QueryFactory init() {
		try {
			QueryFactory theQueryFactory = (QueryFactory)EPackage.Registry.INSTANCE.getEFactory(QueryPackage.eNS_URI);
			if (theQueryFactory != null) {
				return theQueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QueryPackage.MODULE: return createModule();
			case QueryPackage.EXPRESSIONAL_ELEMENT: return createExpressionalElement();
			case QueryPackage.QUERY: return createQuery();
			case QueryPackage.PARAMETER: return createParameter();
			case QueryPackage.CONSTRAINT: return createConstraint();
			case QueryPackage.COMMAND_CONSTRAINT: return createCommandConstraint();
			case QueryPackage.PRECONDITION: return createPrecondition();
			case QueryPackage.POSTCONDITION: return createPostcondition();
			case QueryPackage.CLASS_INVARIANT: return createClassInvariant();
			case QueryPackage.NOT_EXPRESSION: return createNotExpression();
			case QueryPackage.OLD_EXPRESSION: return createOldExpression();
			case QueryPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case QueryPackage.AND_EXPRESSION: return createAndExpression();
			case QueryPackage.OR_EXPRESSION: return createOrExpression();
			case QueryPackage.CALCULATION_EXPRESSION: return createCalculationExpression();
			case QueryPackage.IMPLIES_EXPRESSION: return createImpliesExpression();
			case QueryPackage.CONSTANT_EXPRESSION: return createConstantExpression();
			case QueryPackage.COMPARE_EXPRESSION: return createCompareExpression();
			case QueryPackage.VARIABLE_EXPRESSION: return createVariableExpression();
			case QueryPackage.STATEMENTS_EXPRESSION: return createStatementsExpression();
			case QueryPackage.SELF_STATEMENT: return createSelfStatement();
			case QueryPackage.PARAMETER_USAGE_STATEMENT: return createParameterUsageStatement();
			case QueryPackage.FEATURE_STATEMENT: return createFeatureStatement();
			case QueryPackage.QUERY_STATEMENT: return createQueryStatement();
			case QueryPackage.COLLECTION_METHOD_STATEMENT: return createCollectionMethodStatement();
			case QueryPackage.ENUM_LITERAL_STATEMENT: return createEnumLiteralStatement();
			case QueryPackage.VARIABLE_USAGE_STATEMENT: return createVariableUsageStatement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.CALCULATION_OPERATOR:
				return createCalculationOperatorFromString(eDataType, initialValue);
			case QueryPackage.COMPARE_OPERATOR:
				return createCompareOperatorFromString(eDataType, initialValue);
			case QueryPackage.COLLECTION_METHOD_TYPE:
				return createCollectionMethodTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QueryPackage.CALCULATION_OPERATOR:
				return convertCalculationOperatorToString(eDataType, instanceValue);
			case QueryPackage.COMPARE_OPERATOR:
				return convertCompareOperatorToString(eDataType, instanceValue);
			case QueryPackage.COLLECTION_METHOD_TYPE:
				return convertCollectionMethodTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public queryBehavior.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionalElement createExpressionalElement() {
		ExpressionalElementImpl expressionalElement = new ExpressionalElementImpl();
		return expressionalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandConstraint createCommandConstraint() {
		CommandConstraintImpl commandConstraint = new CommandConstraintImpl();
		return commandConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precondition createPrecondition() {
		PreconditionImpl precondition = new PreconditionImpl();
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Postcondition createPostcondition() {
		PostconditionImpl postcondition = new PostconditionImpl();
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassInvariant createClassInvariant() {
		ClassInvariantImpl classInvariant = new ClassInvariantImpl();
		return classInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotExpression createNotExpression() {
		NotExpressionImpl notExpression = new NotExpressionImpl();
		return notExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OldExpression createOldExpression() {
		OldExpressionImpl oldExpression = new OldExpressionImpl();
		return oldExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndExpression createAndExpression() {
		AndExpressionImpl andExpression = new AndExpressionImpl();
		return andExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrExpression createOrExpression() {
		OrExpressionImpl orExpression = new OrExpressionImpl();
		return orExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationExpression createCalculationExpression() {
		CalculationExpressionImpl calculationExpression = new CalculationExpressionImpl();
		return calculationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliesExpression createImpliesExpression() {
		ImpliesExpressionImpl impliesExpression = new ImpliesExpressionImpl();
		return impliesExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantExpression createConstantExpression() {
		ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
		return constantExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareExpression createCompareExpression() {
		CompareExpressionImpl compareExpression = new CompareExpressionImpl();
		return compareExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpression createVariableExpression() {
		VariableExpressionImpl variableExpression = new VariableExpressionImpl();
		return variableExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsExpression createStatementsExpression() {
		StatementsExpressionImpl statementsExpression = new StatementsExpressionImpl();
		return statementsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfStatement createSelfStatement() {
		SelfStatementImpl selfStatement = new SelfStatementImpl();
		return selfStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUsageStatement createParameterUsageStatement() {
		ParameterUsageStatementImpl parameterUsageStatement = new ParameterUsageStatementImpl();
		return parameterUsageStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureStatement createFeatureStatement() {
		FeatureStatementImpl featureStatement = new FeatureStatementImpl();
		return featureStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryStatement createQueryStatement() {
		QueryStatementImpl queryStatement = new QueryStatementImpl();
		return queryStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionMethodStatement createCollectionMethodStatement() {
		CollectionMethodStatementImpl collectionMethodStatement = new CollectionMethodStatementImpl();
		return collectionMethodStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralStatement createEnumLiteralStatement() {
		EnumLiteralStatementImpl enumLiteralStatement = new EnumLiteralStatementImpl();
		return enumLiteralStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableUsageStatement createVariableUsageStatement() {
		VariableUsageStatementImpl variableUsageStatement = new VariableUsageStatementImpl();
		return variableUsageStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationOperator createCalculationOperatorFromString(EDataType eDataType, String initialValue) {
		CalculationOperator result = CalculationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareOperator createCompareOperatorFromString(EDataType eDataType, String initialValue) {
		CompareOperator result = CompareOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompareOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionMethodType createCollectionMethodTypeFromString(EDataType eDataType, String initialValue) {
		CollectionMethodType result = CollectionMethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPackage getQueryPackage() {
		return (QueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QueryPackage getPackage() {
		return QueryPackage.eINSTANCE;
	}

} //QueryFactoryImpl
