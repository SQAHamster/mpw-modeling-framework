/**
 */
package queryBehavior;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see queryBehavior.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "queryBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/behavior/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "queryBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = queryBehavior.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link queryBehavior.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.TypedElementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__IS_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__ETYPE = 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ModuleImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ExpressionalElementImpl <em>Expressional Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ExpressionalElementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getExpressionalElement()
	 * @generated
	 */
	int EXPRESSIONAL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT__MAIN_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT__CONTEXT_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT__DOCUMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Expressional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Expressional Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSIONAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.QueryImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__NAME = EXPRESSIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__MAIN_EXPRESSION = EXPRESSIONAL_ELEMENT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONTEXT_CLASS = EXPRESSIONAL_ELEMENT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DOCUMENTATION = EXPRESSIONAL_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__IS_COLLECTION = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ETYPE = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DEFAULT_VALUE_LITERAL = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__PARAMETERS = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__INTERNAL = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = EXPRESSIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ParameterImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__IS_COLLECTION = TYPED_ELEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ETYPE = TYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ConstraintImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = EXPRESSIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__MAIN_EXPRESSION = EXPRESSIONAL_ELEMENT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__CONTEXT_CLASS = EXPRESSIONAL_ELEMENT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DOCUMENTATION = EXPRESSIONAL_ELEMENT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = EXPRESSIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = EXPRESSIONAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.CommandConstraintImpl <em>Command Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.CommandConstraintImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getCommandConstraint()
	 * @generated
	 */
	int COMMAND_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT__MAIN_EXPRESSION = CONSTRAINT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT__CONTEXT_CLASS = CONSTRAINT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT__DOCUMENTATION = CONSTRAINT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT__COMMAND_NAME = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_CONSTRAINT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.PreconditionImpl <em>Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.PreconditionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getPrecondition()
	 * @generated
	 */
	int PRECONDITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__NAME = COMMAND_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__MAIN_EXPRESSION = COMMAND_CONSTRAINT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__CONTEXT_CLASS = COMMAND_CONSTRAINT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__DOCUMENTATION = COMMAND_CONSTRAINT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION__COMMAND_NAME = COMMAND_CONSTRAINT__COMMAND_NAME;

	/**
	 * The number of structural features of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_FEATURE_COUNT = COMMAND_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECONDITION_OPERATION_COUNT = COMMAND_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.PostconditionImpl <em>Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.PostconditionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getPostcondition()
	 * @generated
	 */
	int POSTCONDITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__NAME = COMMAND_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__MAIN_EXPRESSION = COMMAND_CONSTRAINT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__CONTEXT_CLASS = COMMAND_CONSTRAINT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__DOCUMENTATION = COMMAND_CONSTRAINT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__COMMAND_NAME = COMMAND_CONSTRAINT__COMMAND_NAME;

	/**
	 * The feature id for the '<em><b>Old Value Variable Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS = COMMAND_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_FEATURE_COUNT = COMMAND_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTCONDITION_OPERATION_COUNT = COMMAND_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ClassInvariantImpl <em>Class Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ClassInvariantImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getClassInvariant()
	 * @generated
	 */
	int CLASS_INVARIANT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__MAIN_EXPRESSION = CONSTRAINT__MAIN_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__CONTEXT_CLASS = CONSTRAINT__CONTEXT_CLASS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT__DOCUMENTATION = CONSTRAINT__DOCUMENTATION;

	/**
	 * The number of structural features of the '<em>Class Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_INVARIANT_OPERATION_COUNT = CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__IS_COLLECTION = TYPED_ELEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ETYPE = TYPED_ELEMENT__ETYPE;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.NotExpressionImpl <em>Not Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.NotExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getNotExpression()
	 * @generated
	 */
	int NOT_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION__INNER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.OldExpressionImpl <em>Old Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.OldExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getOldExpression()
	 * @generated
	 */
	int OLD_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLD_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLD_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLD_EXPRESSION__INNER = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Old Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Old Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLD_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.BinaryExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.AndExpressionImpl <em>And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.AndExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getAndExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__IS_COLLECTION = BINARY_EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__ETYPE = BINARY_EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.OrExpressionImpl <em>Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.OrExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getOrExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__IS_COLLECTION = BINARY_EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__ETYPE = BINARY_EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.CalculationExpressionImpl <em>Calculation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.CalculationExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getCalculationExpression()
	 * @generated
	 */
	int CALCULATION_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION__IS_COLLECTION = BINARY_EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION__ETYPE = BINARY_EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Calculation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATION_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ImpliesExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getImpliesExpression()
	 * @generated
	 */
	int IMPLIES_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__IS_COLLECTION = BINARY_EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__ETYPE = BINARY_EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implies Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ConstantExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getConstantExpression()
	 * @generated
	 */
	int CONSTANT_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION__LITERAL = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.CompareExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getCompareExpression()
	 * @generated
	 */
	int COMPARE_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION__IS_COLLECTION = BINARY_EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION__ETYPE = BINARY_EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION__LHS = BINARY_EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION__RHS = BINARY_EXPRESSION__RHS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Compare Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.VariableExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getVariableExpression()
	 * @generated
	 */
	int VARIABLE_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__VARIABLE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION__VALUE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.StatementsExpressionImpl <em>Statements Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.StatementsExpressionImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getStatementsExpression()
	 * @generated
	 */
	int STATEMENTS_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_EXPRESSION__IS_COLLECTION = EXPRESSION__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_EXPRESSION__ETYPE = EXPRESSION__ETYPE;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_EXPRESSION__STATEMENTS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Statements Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Statements Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENTS_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.StatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 22;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__IS_COLLECTION = TYPED_ELEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ETYPE = TYPED_ELEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__DEBUG_NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NEXT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__PREVIOUS = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.SelfStatementImpl <em>Self Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.SelfStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getSelfStatement()
	 * @generated
	 */
	int SELF_STATEMENT = 23;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Self Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT__SELF_ALIAS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Self Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Self Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.ParameterUsageStatementImpl <em>Parameter Usage Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.ParameterUsageStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getParameterUsageStatement()
	 * @generated
	 */
	int PARAMETER_USAGE_STATEMENT = 24;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT__PARAMETER_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Usage Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Usage Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_USAGE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.FeatureStatementImpl <em>Feature Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.FeatureStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getFeatureStatement()
	 * @generated
	 */
	int FEATURE_STATEMENT = 25;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT__FEATURE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.QueryStatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.QueryStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getQueryStatement()
	 * @generated
	 */
	int QUERY_STATEMENT = 26;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__QUERY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT__PARAMETER_NAMES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.CollectionMethodStatementImpl <em>Collection Method Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.CollectionMethodStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getCollectionMethodStatement()
	 * @generated
	 */
	int COLLECTION_METHOD_STATEMENT = 27;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__PARAMETERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__METHOD_TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT__CONTENTS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collection Method Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Collection Method Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.EnumLiteralStatementImpl <em>Enum Literal Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.EnumLiteralStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getEnumLiteralStatement()
	 * @generated
	 */
	int ENUM_LITERAL_STATEMENT = 28;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT__ENUM_LITERAL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Literal Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Literal Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.impl.VariableUsageStatementImpl <em>Variable Usage Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.impl.VariableUsageStatementImpl
	 * @see queryBehavior.impl.QueryPackageImpl#getVariableUsageStatement()
	 * @generated
	 */
	int VARIABLE_USAGE_STATEMENT = 29;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__IS_COLLECTION = STATEMENT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__ETYPE = STATEMENT__ETYPE;

	/**
	 * The feature id for the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__DEBUG_NAME = STATEMENT__DEBUG_NAME;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__PREVIOUS = STATEMENT__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Variable Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Usage Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Usage Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_USAGE_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link queryBehavior.CalculationOperator <em>Calculation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.CalculationOperator
	 * @see queryBehavior.impl.QueryPackageImpl#getCalculationOperator()
	 * @generated
	 */
	int CALCULATION_OPERATOR = 30;

	/**
	 * The meta object id for the '{@link queryBehavior.CompareOperator <em>Compare Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.CompareOperator
	 * @see queryBehavior.impl.QueryPackageImpl#getCompareOperator()
	 * @generated
	 */
	int COMPARE_OPERATOR = 31;

	/**
	 * The meta object id for the '{@link queryBehavior.CollectionMethodType <em>Collection Method Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see queryBehavior.CollectionMethodType
	 * @see queryBehavior.impl.QueryPackageImpl#getCollectionMethodType()
	 * @generated
	 */
	int COLLECTION_METHOD_TYPE = 32;


	/**
	 * Returns the meta object for class '{@link queryBehavior.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see queryBehavior.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.TypedElement#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see queryBehavior.TypedElement#isIsCollection()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_IsCollection();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.TypedElement#getEType <em>EType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EType</em>'.
	 * @see queryBehavior.TypedElement#getEType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_EType();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see queryBehavior.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link queryBehavior.Module#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see queryBehavior.Module#getElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Elements();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see queryBehavior.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link queryBehavior.ExpressionalElement <em>Expressional Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expressional Element</em>'.
	 * @see queryBehavior.ExpressionalElement
	 * @generated
	 */
	EClass getExpressionalElement();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.ExpressionalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see queryBehavior.ExpressionalElement#getName()
	 * @see #getExpressionalElement()
	 * @generated
	 */
	EAttribute getExpressionalElement_Name();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.ExpressionalElement#getMainExpression <em>Main Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Expression</em>'.
	 * @see queryBehavior.ExpressionalElement#getMainExpression()
	 * @see #getExpressionalElement()
	 * @generated
	 */
	EReference getExpressionalElement_MainExpression();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.ExpressionalElement#getContextClass <em>Context Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Class</em>'.
	 * @see queryBehavior.ExpressionalElement#getContextClass()
	 * @see #getExpressionalElement()
	 * @generated
	 */
	EReference getExpressionalElement_ContextClass();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.ExpressionalElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see queryBehavior.ExpressionalElement#getDocumentation()
	 * @see #getExpressionalElement()
	 * @generated
	 */
	EAttribute getExpressionalElement_Documentation();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see queryBehavior.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.Query#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see queryBehavior.Query#getDefaultValueLiteral()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_DefaultValueLiteral();

	/**
	 * Returns the meta object for the containment reference list '{@link queryBehavior.Query#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see queryBehavior.Query#getParameters()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.Query#isInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see queryBehavior.Query#isInternal()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Internal();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see queryBehavior.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see queryBehavior.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see queryBehavior.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link queryBehavior.CommandConstraint <em>Command Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Constraint</em>'.
	 * @see queryBehavior.CommandConstraint
	 * @generated
	 */
	EClass getCommandConstraint();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.CommandConstraint#getCommandName <em>Command Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command Name</em>'.
	 * @see queryBehavior.CommandConstraint#getCommandName()
	 * @see #getCommandConstraint()
	 * @generated
	 */
	EAttribute getCommandConstraint_CommandName();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precondition</em>'.
	 * @see queryBehavior.Precondition
	 * @generated
	 */
	EClass getPrecondition();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postcondition</em>'.
	 * @see queryBehavior.Postcondition
	 * @generated
	 */
	EClass getPostcondition();

	/**
	 * Returns the meta object for the containment reference list '{@link queryBehavior.Postcondition#getOldValueVariableExpressions <em>Old Value Variable Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Old Value Variable Expressions</em>'.
	 * @see queryBehavior.Postcondition#getOldValueVariableExpressions()
	 * @see #getPostcondition()
	 * @generated
	 */
	EReference getPostcondition_OldValueVariableExpressions();

	/**
	 * Returns the meta object for class '{@link queryBehavior.ClassInvariant <em>Class Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Invariant</em>'.
	 * @see queryBehavior.ClassInvariant
	 * @generated
	 */
	EClass getClassInvariant();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see queryBehavior.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link queryBehavior.NotExpression <em>Not Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Expression</em>'.
	 * @see queryBehavior.NotExpression
	 * @generated
	 */
	EClass getNotExpression();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.NotExpression#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see queryBehavior.NotExpression#getInner()
	 * @see #getNotExpression()
	 * @generated
	 */
	EReference getNotExpression_Inner();

	/**
	 * Returns the meta object for class '{@link queryBehavior.OldExpression <em>Old Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Old Expression</em>'.
	 * @see queryBehavior.OldExpression
	 * @generated
	 */
	EClass getOldExpression();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.OldExpression#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner</em>'.
	 * @see queryBehavior.OldExpression#getInner()
	 * @see #getOldExpression()
	 * @generated
	 */
	EReference getOldExpression_Inner();

	/**
	 * Returns the meta object for class '{@link queryBehavior.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see queryBehavior.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.BinaryExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see queryBehavior.BinaryExpression#getLhs()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.BinaryExpression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see queryBehavior.BinaryExpression#getRhs()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link queryBehavior.AndExpression <em>And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Expression</em>'.
	 * @see queryBehavior.AndExpression
	 * @generated
	 */
	EClass getAndExpression();

	/**
	 * Returns the meta object for class '{@link queryBehavior.OrExpression <em>Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Expression</em>'.
	 * @see queryBehavior.OrExpression
	 * @generated
	 */
	EClass getOrExpression();

	/**
	 * Returns the meta object for class '{@link queryBehavior.CalculationExpression <em>Calculation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculation Expression</em>'.
	 * @see queryBehavior.CalculationExpression
	 * @generated
	 */
	EClass getCalculationExpression();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.CalculationExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see queryBehavior.CalculationExpression#getOperator()
	 * @see #getCalculationExpression()
	 * @generated
	 */
	EAttribute getCalculationExpression_Operator();

	/**
	 * Returns the meta object for class '{@link queryBehavior.ImpliesExpression <em>Implies Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies Expression</em>'.
	 * @see queryBehavior.ImpliesExpression
	 * @generated
	 */
	EClass getImpliesExpression();

	/**
	 * Returns the meta object for class '{@link queryBehavior.ConstantExpression <em>Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Expression</em>'.
	 * @see queryBehavior.ConstantExpression
	 * @generated
	 */
	EClass getConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.ConstantExpression#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see queryBehavior.ConstantExpression#getLiteral()
	 * @see #getConstantExpression()
	 * @generated
	 */
	EAttribute getConstantExpression_Literal();

	/**
	 * Returns the meta object for class '{@link queryBehavior.CompareExpression <em>Compare Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare Expression</em>'.
	 * @see queryBehavior.CompareExpression
	 * @generated
	 */
	EClass getCompareExpression();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.CompareExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see queryBehavior.CompareExpression#getOperator()
	 * @see #getCompareExpression()
	 * @generated
	 */
	EAttribute getCompareExpression_Operator();

	/**
	 * Returns the meta object for class '{@link queryBehavior.VariableExpression <em>Variable Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Expression</em>'.
	 * @see queryBehavior.VariableExpression
	 * @generated
	 */
	EClass getVariableExpression();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.VariableExpression#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see queryBehavior.VariableExpression#getVariableName()
	 * @see #getVariableExpression()
	 * @generated
	 */
	EAttribute getVariableExpression_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link queryBehavior.VariableExpression#getValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value Expression</em>'.
	 * @see queryBehavior.VariableExpression#getValueExpression()
	 * @see #getVariableExpression()
	 * @generated
	 */
	EReference getVariableExpression_ValueExpression();

	/**
	 * Returns the meta object for class '{@link queryBehavior.StatementsExpression <em>Statements Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statements Expression</em>'.
	 * @see queryBehavior.StatementsExpression
	 * @generated
	 */
	EClass getStatementsExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link queryBehavior.StatementsExpression#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see queryBehavior.StatementsExpression#getStatements()
	 * @see #getStatementsExpression()
	 * @generated
	 */
	EReference getStatementsExpression_Statements();

	/**
	 * Returns the meta object for class '{@link queryBehavior.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see queryBehavior.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.Statement#getDebugName <em>Debug Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Name</em>'.
	 * @see queryBehavior.Statement#getDebugName()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_DebugName();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.Statement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see queryBehavior.Statement#getNext()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Next();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.Statement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see queryBehavior.Statement#getPrevious()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Previous();

	/**
	 * Returns the meta object for class '{@link queryBehavior.SelfStatement <em>Self Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Statement</em>'.
	 * @see queryBehavior.SelfStatement
	 * @generated
	 */
	EClass getSelfStatement();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.SelfStatement#getSelfAlias <em>Self Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Self Alias</em>'.
	 * @see queryBehavior.SelfStatement#getSelfAlias()
	 * @see #getSelfStatement()
	 * @generated
	 */
	EAttribute getSelfStatement_SelfAlias();

	/**
	 * Returns the meta object for class '{@link queryBehavior.ParameterUsageStatement <em>Parameter Usage Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Usage Statement</em>'.
	 * @see queryBehavior.ParameterUsageStatement
	 * @generated
	 */
	EClass getParameterUsageStatement();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.ParameterUsageStatement#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see queryBehavior.ParameterUsageStatement#getParameterName()
	 * @see #getParameterUsageStatement()
	 * @generated
	 */
	EAttribute getParameterUsageStatement_ParameterName();

	/**
	 * Returns the meta object for class '{@link queryBehavior.FeatureStatement <em>Feature Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Statement</em>'.
	 * @see queryBehavior.FeatureStatement
	 * @generated
	 */
	EClass getFeatureStatement();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.FeatureStatement#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see queryBehavior.FeatureStatement#getFeature()
	 * @see #getFeatureStatement()
	 * @generated
	 */
	EReference getFeatureStatement_Feature();

	/**
	 * Returns the meta object for class '{@link queryBehavior.QueryStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see queryBehavior.QueryStatement
	 * @generated
	 */
	EClass getQueryStatement();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.QueryStatement#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Query</em>'.
	 * @see queryBehavior.QueryStatement#getQuery()
	 * @see #getQueryStatement()
	 * @generated
	 */
	EReference getQueryStatement_Query();

	/**
	 * Returns the meta object for the attribute list '{@link queryBehavior.QueryStatement#getParameterNames <em>Parameter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter Names</em>'.
	 * @see queryBehavior.QueryStatement#getParameterNames()
	 * @see #getQueryStatement()
	 * @generated
	 */
	EAttribute getQueryStatement_ParameterNames();

	/**
	 * Returns the meta object for class '{@link queryBehavior.CollectionMethodStatement <em>Collection Method Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Method Statement</em>'.
	 * @see queryBehavior.CollectionMethodStatement
	 * @generated
	 */
	EClass getCollectionMethodStatement();

	/**
	 * Returns the meta object for the reference list '{@link queryBehavior.CollectionMethodStatement#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see queryBehavior.CollectionMethodStatement#getParameters()
	 * @see #getCollectionMethodStatement()
	 * @generated
	 */
	EReference getCollectionMethodStatement_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link queryBehavior.CollectionMethodStatement#getMethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Type</em>'.
	 * @see queryBehavior.CollectionMethodStatement#getMethodType()
	 * @see #getCollectionMethodStatement()
	 * @generated
	 */
	EAttribute getCollectionMethodStatement_MethodType();

	/**
	 * Returns the meta object for the containment reference list '{@link queryBehavior.CollectionMethodStatement#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see queryBehavior.CollectionMethodStatement#getContents()
	 * @see #getCollectionMethodStatement()
	 * @generated
	 */
	EReference getCollectionMethodStatement_Contents();

	/**
	 * Returns the meta object for class '{@link queryBehavior.EnumLiteralStatement <em>Enum Literal Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Statement</em>'.
	 * @see queryBehavior.EnumLiteralStatement
	 * @generated
	 */
	EClass getEnumLiteralStatement();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.EnumLiteralStatement#getEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enum Literal</em>'.
	 * @see queryBehavior.EnumLiteralStatement#getEnumLiteral()
	 * @see #getEnumLiteralStatement()
	 * @generated
	 */
	EReference getEnumLiteralStatement_EnumLiteral();

	/**
	 * Returns the meta object for class '{@link queryBehavior.VariableUsageStatement <em>Variable Usage Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Usage Statement</em>'.
	 * @see queryBehavior.VariableUsageStatement
	 * @generated
	 */
	EClass getVariableUsageStatement();

	/**
	 * Returns the meta object for the reference '{@link queryBehavior.VariableUsageStatement#getVariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Reference</em>'.
	 * @see queryBehavior.VariableUsageStatement#getVariableReference()
	 * @see #getVariableUsageStatement()
	 * @generated
	 */
	EReference getVariableUsageStatement_VariableReference();

	/**
	 * Returns the meta object for enum '{@link queryBehavior.CalculationOperator <em>Calculation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Calculation Operator</em>'.
	 * @see queryBehavior.CalculationOperator
	 * @generated
	 */
	EEnum getCalculationOperator();

	/**
	 * Returns the meta object for enum '{@link queryBehavior.CompareOperator <em>Compare Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compare Operator</em>'.
	 * @see queryBehavior.CompareOperator
	 * @generated
	 */
	EEnum getCompareOperator();

	/**
	 * Returns the meta object for enum '{@link queryBehavior.CollectionMethodType <em>Collection Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Method Type</em>'.
	 * @see queryBehavior.CollectionMethodType
	 * @generated
	 */
	EEnum getCollectionMethodType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link queryBehavior.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.TypedElementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__IS_COLLECTION = eINSTANCE.getTypedElement_IsCollection();

		/**
		 * The meta object literal for the '<em><b>EType</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__ETYPE = eINSTANCE.getTypedElement_EType();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ModuleImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__ELEMENTS = eINSTANCE.getModule_Elements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ExpressionalElementImpl <em>Expressional Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ExpressionalElementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getExpressionalElement()
		 * @generated
		 */
		EClass EXPRESSIONAL_ELEMENT = eINSTANCE.getExpressionalElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSIONAL_ELEMENT__NAME = eINSTANCE.getExpressionalElement_Name();

		/**
		 * The meta object literal for the '<em><b>Main Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONAL_ELEMENT__MAIN_EXPRESSION = eINSTANCE.getExpressionalElement_MainExpression();

		/**
		 * The meta object literal for the '<em><b>Context Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSIONAL_ELEMENT__CONTEXT_CLASS = eINSTANCE.getExpressionalElement_ContextClass();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSIONAL_ELEMENT__DOCUMENTATION = eINSTANCE.getExpressionalElement_Documentation();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.QueryImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Default Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__DEFAULT_VALUE_LITERAL = eINSTANCE.getQuery_DefaultValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__PARAMETERS = eINSTANCE.getQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__INTERNAL = eINSTANCE.getQuery_Internal();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ParameterImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ConstraintImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.CommandConstraintImpl <em>Command Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.CommandConstraintImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getCommandConstraint()
		 * @generated
		 */
		EClass COMMAND_CONSTRAINT = eINSTANCE.getCommandConstraint();

		/**
		 * The meta object literal for the '<em><b>Command Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_CONSTRAINT__COMMAND_NAME = eINSTANCE.getCommandConstraint_CommandName();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.PreconditionImpl <em>Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.PreconditionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getPrecondition()
		 * @generated
		 */
		EClass PRECONDITION = eINSTANCE.getPrecondition();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.PostconditionImpl <em>Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.PostconditionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getPostcondition()
		 * @generated
		 */
		EClass POSTCONDITION = eINSTANCE.getPostcondition();

		/**
		 * The meta object literal for the '<em><b>Old Value Variable Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS = eINSTANCE.getPostcondition_OldValueVariableExpressions();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ClassInvariantImpl <em>Class Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ClassInvariantImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getClassInvariant()
		 * @generated
		 */
		EClass CLASS_INVARIANT = eINSTANCE.getClassInvariant();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.NotExpressionImpl <em>Not Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.NotExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getNotExpression()
		 * @generated
		 */
		EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_EXPRESSION__INNER = eINSTANCE.getNotExpression_Inner();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.OldExpressionImpl <em>Old Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.OldExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getOldExpression()
		 * @generated
		 */
		EClass OLD_EXPRESSION = eINSTANCE.getOldExpression();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLD_EXPRESSION__INNER = eINSTANCE.getOldExpression_Inner();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.BinaryExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LHS = eINSTANCE.getBinaryExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RHS = eINSTANCE.getBinaryExpression_Rhs();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.AndExpressionImpl <em>And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.AndExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getAndExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.OrExpressionImpl <em>Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.OrExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getOrExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.CalculationExpressionImpl <em>Calculation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.CalculationExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getCalculationExpression()
		 * @generated
		 */
		EClass CALCULATION_EXPRESSION = eINSTANCE.getCalculationExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALCULATION_EXPRESSION__OPERATOR = eINSTANCE.getCalculationExpression_Operator();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ImpliesExpressionImpl <em>Implies Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ImpliesExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getImpliesExpression()
		 * @generated
		 */
		EClass IMPLIES_EXPRESSION = eINSTANCE.getImpliesExpression();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ConstantExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getConstantExpression()
		 * @generated
		 */
		EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_EXPRESSION__LITERAL = eINSTANCE.getConstantExpression_Literal();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.CompareExpressionImpl <em>Compare Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.CompareExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getCompareExpression()
		 * @generated
		 */
		EClass COMPARE_EXPRESSION = eINSTANCE.getCompareExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE_EXPRESSION__OPERATOR = eINSTANCE.getCompareExpression_Operator();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.VariableExpressionImpl <em>Variable Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.VariableExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getVariableExpression()
		 * @generated
		 */
		EClass VARIABLE_EXPRESSION = eINSTANCE.getVariableExpression();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_EXPRESSION__VARIABLE_NAME = eINSTANCE.getVariableExpression_VariableName();

		/**
		 * The meta object literal for the '<em><b>Value Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXPRESSION__VALUE_EXPRESSION = eINSTANCE.getVariableExpression_ValueExpression();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.StatementsExpressionImpl <em>Statements Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.StatementsExpressionImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getStatementsExpression()
		 * @generated
		 */
		EClass STATEMENTS_EXPRESSION = eINSTANCE.getStatementsExpression();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENTS_EXPRESSION__STATEMENTS = eINSTANCE.getStatementsExpression_Statements();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.StatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Debug Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__DEBUG_NAME = eINSTANCE.getStatement_DebugName();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__NEXT = eINSTANCE.getStatement_Next();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__PREVIOUS = eINSTANCE.getStatement_Previous();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.SelfStatementImpl <em>Self Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.SelfStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getSelfStatement()
		 * @generated
		 */
		EClass SELF_STATEMENT = eINSTANCE.getSelfStatement();

		/**
		 * The meta object literal for the '<em><b>Self Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_STATEMENT__SELF_ALIAS = eINSTANCE.getSelfStatement_SelfAlias();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.ParameterUsageStatementImpl <em>Parameter Usage Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.ParameterUsageStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getParameterUsageStatement()
		 * @generated
		 */
		EClass PARAMETER_USAGE_STATEMENT = eINSTANCE.getParameterUsageStatement();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_USAGE_STATEMENT__PARAMETER_NAME = eINSTANCE.getParameterUsageStatement_ParameterName();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.FeatureStatementImpl <em>Feature Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.FeatureStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getFeatureStatement()
		 * @generated
		 */
		EClass FEATURE_STATEMENT = eINSTANCE.getFeatureStatement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_STATEMENT__FEATURE = eINSTANCE.getFeatureStatement_Feature();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.QueryStatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.QueryStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getQueryStatement()
		 * @generated
		 */
		EClass QUERY_STATEMENT = eINSTANCE.getQueryStatement();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_STATEMENT__QUERY = eINSTANCE.getQueryStatement_Query();

		/**
		 * The meta object literal for the '<em><b>Parameter Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_STATEMENT__PARAMETER_NAMES = eINSTANCE.getQueryStatement_ParameterNames();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.CollectionMethodStatementImpl <em>Collection Method Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.CollectionMethodStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getCollectionMethodStatement()
		 * @generated
		 */
		EClass COLLECTION_METHOD_STATEMENT = eINSTANCE.getCollectionMethodStatement();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_METHOD_STATEMENT__PARAMETERS = eINSTANCE.getCollectionMethodStatement_Parameters();

		/**
		 * The meta object literal for the '<em><b>Method Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_METHOD_STATEMENT__METHOD_TYPE = eINSTANCE.getCollectionMethodStatement_MethodType();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_METHOD_STATEMENT__CONTENTS = eINSTANCE.getCollectionMethodStatement_Contents();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.EnumLiteralStatementImpl <em>Enum Literal Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.EnumLiteralStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getEnumLiteralStatement()
		 * @generated
		 */
		EClass ENUM_LITERAL_STATEMENT = eINSTANCE.getEnumLiteralStatement();

		/**
		 * The meta object literal for the '<em><b>Enum Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_STATEMENT__ENUM_LITERAL = eINSTANCE.getEnumLiteralStatement_EnumLiteral();

		/**
		 * The meta object literal for the '{@link queryBehavior.impl.VariableUsageStatementImpl <em>Variable Usage Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.impl.VariableUsageStatementImpl
		 * @see queryBehavior.impl.QueryPackageImpl#getVariableUsageStatement()
		 * @generated
		 */
		EClass VARIABLE_USAGE_STATEMENT = eINSTANCE.getVariableUsageStatement();

		/**
		 * The meta object literal for the '<em><b>Variable Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE = eINSTANCE.getVariableUsageStatement_VariableReference();

		/**
		 * The meta object literal for the '{@link queryBehavior.CalculationOperator <em>Calculation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.CalculationOperator
		 * @see queryBehavior.impl.QueryPackageImpl#getCalculationOperator()
		 * @generated
		 */
		EEnum CALCULATION_OPERATOR = eINSTANCE.getCalculationOperator();

		/**
		 * The meta object literal for the '{@link queryBehavior.CompareOperator <em>Compare Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.CompareOperator
		 * @see queryBehavior.impl.QueryPackageImpl#getCompareOperator()
		 * @generated
		 */
		EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

		/**
		 * The meta object literal for the '{@link queryBehavior.CollectionMethodType <em>Collection Method Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see queryBehavior.CollectionMethodType
		 * @see queryBehavior.impl.QueryPackageImpl#getCollectionMethodType()
		 * @generated
		 */
		EEnum COLLECTION_METHOD_TYPE = eINSTANCE.getCollectionMethodType();

	}

} //QueryPackage
