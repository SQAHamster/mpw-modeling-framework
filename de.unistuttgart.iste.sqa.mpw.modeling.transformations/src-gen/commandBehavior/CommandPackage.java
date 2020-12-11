/**
 */
package commandBehavior;

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
 * @see commandBehavior.CommandFactory
 * @model kind="package"
 * @generated
 */
public interface CommandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commandBehavior";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/behavior/command";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commandBehavior";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandPackage eINSTANCE = commandBehavior.impl.CommandPackageImpl.init();

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ModuleImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 0;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__TRANSFORMATIONS = 0;

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
	 * The meta object id for the '{@link commandBehavior.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.TransformationImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__UNITS = 1;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MAIN_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ROLE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CONSTRAINTS = 5;

	/**
	 * The feature id for the '<em><b>Used Queries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__USED_QUERIES = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DOCUMENTATION = 7;

	/**
	 * The feature id for the '<em><b>Is Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IS_INIT = 8;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.UnitImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__MAIN_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.RuleImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARAMETERS = UNIT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MAIN_UNIT = UNIT__MAIN_UNIT;

	/**
	 * The feature id for the '<em><b>This Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__THIS_INSTANCE = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INSTANCE_CONDITIONS = UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VARIABLE_ASSIGNMENTS = UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REFERENCE_CONDITIONS = UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attribute Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ATTRIBUTE_CONDITIONS = UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__MODIFICATIONS = UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VARIABLES = UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = UNIT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.AttributeConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getAttributeCondition()
	 * @generated
	 */
	int ATTRIBUTE_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__ATTRIBUTE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Attribute Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION__IS_CREATE = 3;

	/**
	 * The number of structural features of the '<em>Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.InstanceConditionImpl <em>Instance Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.InstanceConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getInstanceCondition()
	 * @generated
	 */
	int INSTANCE_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONDITION__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONDITION__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONDITION__IS_CREATE = 2;

	/**
	 * The number of structural features of the '<em>Instance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ReferenceConditionImpl <em>Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ReferenceConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getReferenceCondition()
	 * @generated
	 */
	int REFERENCE_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION__REFERENCE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION__IS_CREATE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.SingleReferenceConditionImpl <em>Single Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.SingleReferenceConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getSingleReferenceCondition()
	 * @generated
	 */
	int SINGLE_REFERENCE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__SOURCE = REFERENCE_CONDITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__TARGET = REFERENCE_CONDITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__REFERENCE_NAME = REFERENCE_CONDITION__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__IS_CREATE = REFERENCE_CONDITION__IS_CREATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__TYPE = REFERENCE_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Is Forbid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION__IS_FORBID = REFERENCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION_FEATURE_COUNT = REFERENCE_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REFERENCE_CONDITION_OPERATION_COUNT = REFERENCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ManyReferenceConditionImpl <em>Many Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ManyReferenceConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getManyReferenceCondition()
	 * @generated
	 */
	int MANY_REFERENCE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION__SOURCE = REFERENCE_CONDITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION__TARGET = REFERENCE_CONDITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION__REFERENCE_NAME = REFERENCE_CONDITION__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION__IS_CREATE = REFERENCE_CONDITION__IS_CREATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION__TYPE = REFERENCE_CONDITION__TYPE;

	/**
	 * The number of structural features of the '<em>Many Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION_FEATURE_COUNT = REFERENCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Many Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_REFERENCE_CONDITION_OPERATION_COUNT = REFERENCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ClearReferenceConditionImpl <em>Clear Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ClearReferenceConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getClearReferenceCondition()
	 * @generated
	 */
	int CLEAR_REFERENCE_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION__SOURCE = REFERENCE_CONDITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION__TARGET = REFERENCE_CONDITION__TARGET;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION__REFERENCE_NAME = REFERENCE_CONDITION__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Is Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION__IS_CREATE = REFERENCE_CONDITION__IS_CREATE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION__TYPE = REFERENCE_CONDITION__TYPE;

	/**
	 * The number of structural features of the '<em>Clear Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION_FEATURE_COUNT = REFERENCE_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Clear Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_REFERENCE_CONDITION_OPERATION_COUNT = REFERENCE_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ModificationImpl <em>Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ModificationImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getModification()
	 * @generated
	 */
	int MODIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>New Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__NEW_ATTRIBUTE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__ACTION = 4;

	/**
	 * The number of structural features of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.VariableAssignmentImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 11;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.VariableDeclarationImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.SequentialUnitImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getSequentialUnit()
	 * @generated
	 */
	int SEQUENTIAL_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__PARAMETERS = UNIT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__MAIN_UNIT = UNIT__MAIN_UNIT;

	/**
	 * The feature id for the '<em><b>Target Invocations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__TARGET_INVOCATIONS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequential Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sequential Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.IteratedUnitImpl <em>Iterated Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.IteratedUnitImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getIteratedUnit()
	 * @generated
	 */
	int ITERATED_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT__PARAMETERS = UNIT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT__MAIN_UNIT = UNIT__MAIN_UNIT;

	/**
	 * The feature id for the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT__REPEAT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Invocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT__TARGET_INVOCATION = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iterated Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iterated Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATED_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.InvocationImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 15;

	/**
	 * The feature id for the '<em><b>Target Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__TARGET_METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Mapped Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION__MAPPED_PARAMETERS = 1;

	/**
	 * The number of structural features of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Invocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ParameterImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ConditionalUnitImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getConditionalUnit()
	 * @generated
	 */
	int CONDITIONAL_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__PARAMETERS = UNIT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Main Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__MAIN_UNIT = UNIT__MAIN_UNIT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__CONDITIONS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT_OPERATION_COUNT = UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commandBehavior.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.impl.ConditionImpl
	 * @see commandBehavior.impl.CommandPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandBehavior.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandBehavior.Action
	 * @see commandBehavior.impl.CommandPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 19;


	/**
	 * Returns the meta object for class '{@link commandBehavior.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see commandBehavior.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Module#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see commandBehavior.Module#getTransformations()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Transformations();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandBehavior.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see commandBehavior.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandBehavior.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Transformation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see commandBehavior.Transformation#getUnits()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Units();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Transformation#getMainUnit <em>Main Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Unit</em>'.
	 * @see commandBehavior.Transformation#getMainUnit()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_MainUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Transformation#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see commandBehavior.Transformation#getRoleName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_RoleName();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Transformation#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Class</em>'.
	 * @see commandBehavior.Transformation#getTargetClass()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TargetClass();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Transformation#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see commandBehavior.Transformation#getConstraints()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Transformation#getUsedQueries <em>Used Queries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Queries</em>'.
	 * @see commandBehavior.Transformation#getUsedQueries()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_UsedQueries();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Transformation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see commandBehavior.Transformation#getDocumentation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Transformation#isIsInit <em>Is Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Init</em>'.
	 * @see commandBehavior.Transformation#isIsInit()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_IsInit();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see commandBehavior.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandBehavior.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Unit#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see commandBehavior.Unit#getParameters()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Unit#isMainUnit <em>Main Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Unit</em>'.
	 * @see commandBehavior.Unit#isMainUnit()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_MainUnit();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see commandBehavior.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Rule#getThisInstance <em>This Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Instance</em>'.
	 * @see commandBehavior.Rule#getThisInstance()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ThisInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getInstanceConditions <em>Instance Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Conditions</em>'.
	 * @see commandBehavior.Rule#getInstanceConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_InstanceConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getVariableAssignments <em>Variable Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
	 * @see commandBehavior.Rule#getVariableAssignments()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_VariableAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getReferenceConditions <em>Reference Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Conditions</em>'.
	 * @see commandBehavior.Rule#getReferenceConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ReferenceConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getAttributeConditions <em>Attribute Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Conditions</em>'.
	 * @see commandBehavior.Rule#getAttributeConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_AttributeConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getModifications <em>Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifications</em>'.
	 * @see commandBehavior.Rule#getModifications()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Modifications();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.Rule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see commandBehavior.Rule#getVariables()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Variables();

	/**
	 * Returns the meta object for class '{@link commandBehavior.AttributeCondition <em>Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Condition</em>'.
	 * @see commandBehavior.AttributeCondition
	 * @generated
	 */
	EClass getAttributeCondition();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.AttributeCondition#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see commandBehavior.AttributeCondition#getInstance()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EReference getAttributeCondition_Instance();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.AttributeCondition#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see commandBehavior.AttributeCondition#getAttributeName()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.AttributeCondition#getAttributeValueLiteral <em>Attribute Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value Literal</em>'.
	 * @see commandBehavior.AttributeCondition#getAttributeValueLiteral()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_AttributeValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.AttributeCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandBehavior.AttributeCondition#isIsCreate()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_IsCreate();

	/**
	 * Returns the meta object for class '{@link commandBehavior.InstanceCondition <em>Instance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Condition</em>'.
	 * @see commandBehavior.InstanceCondition
	 * @generated
	 */
	EClass getInstanceCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.InstanceCondition#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see commandBehavior.InstanceCondition#getVariableName()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.InstanceCondition#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see commandBehavior.InstanceCondition#getTypeName()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.InstanceCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandBehavior.InstanceCondition#isIsCreate()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_IsCreate();

	/**
	 * Returns the meta object for class '{@link commandBehavior.ReferenceCondition <em>Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Condition</em>'.
	 * @see commandBehavior.ReferenceCondition
	 * @generated
	 */
	EClass getReferenceCondition();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.ReferenceCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see commandBehavior.ReferenceCondition#getSource()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EReference getReferenceCondition_Source();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.ReferenceCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see commandBehavior.ReferenceCondition#getTarget()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EReference getReferenceCondition_Target();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.ReferenceCondition#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see commandBehavior.ReferenceCondition#getReferenceName()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EAttribute getReferenceCondition_ReferenceName();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.ReferenceCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandBehavior.ReferenceCondition#isIsCreate()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EAttribute getReferenceCondition_IsCreate();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.ReferenceCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see commandBehavior.ReferenceCondition#getType()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EReference getReferenceCondition_Type();

	/**
	 * Returns the meta object for class '{@link commandBehavior.SingleReferenceCondition <em>Single Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Reference Condition</em>'.
	 * @see commandBehavior.SingleReferenceCondition
	 * @generated
	 */
	EClass getSingleReferenceCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.SingleReferenceCondition#isIsForbid <em>Is Forbid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbid</em>'.
	 * @see commandBehavior.SingleReferenceCondition#isIsForbid()
	 * @see #getSingleReferenceCondition()
	 * @generated
	 */
	EAttribute getSingleReferenceCondition_IsForbid();

	/**
	 * Returns the meta object for class '{@link commandBehavior.ManyReferenceCondition <em>Many Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Reference Condition</em>'.
	 * @see commandBehavior.ManyReferenceCondition
	 * @generated
	 */
	EClass getManyReferenceCondition();

	/**
	 * Returns the meta object for class '{@link commandBehavior.ClearReferenceCondition <em>Clear Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Reference Condition</em>'.
	 * @see commandBehavior.ClearReferenceCondition
	 * @generated
	 */
	EClass getClearReferenceCondition();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification</em>'.
	 * @see commandBehavior.Modification
	 * @generated
	 */
	EClass getModification();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Modification#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see commandBehavior.Modification#getReference()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Reference();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Modification#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see commandBehavior.Modification#getInstance()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Instance();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Modification#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see commandBehavior.Modification#getAttribute()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Modification#getNewAttributeValue <em>New Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Attribute Value</em>'.
	 * @see commandBehavior.Modification#getNewAttributeValue()
	 * @see #getModification()
	 * @generated
	 */
	EAttribute getModification_NewAttributeValue();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Modification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see commandBehavior.Modification#getAction()
	 * @see #getModification()
	 * @generated
	 */
	EAttribute getModification_Action();

	/**
	 * Returns the meta object for class '{@link commandBehavior.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see commandBehavior.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.VariableAssignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see commandBehavior.VariableAssignment#getVariableName()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.VariableAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see commandBehavior.VariableAssignment#getValue()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_Value();

	/**
	 * Returns the meta object for class '{@link commandBehavior.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see commandBehavior.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see commandBehavior.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandBehavior.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link commandBehavior.SequentialUnit <em>Sequential Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Unit</em>'.
	 * @see commandBehavior.SequentialUnit
	 * @generated
	 */
	EClass getSequentialUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.SequentialUnit#getTargetInvocations <em>Target Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Invocations</em>'.
	 * @see commandBehavior.SequentialUnit#getTargetInvocations()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EReference getSequentialUnit_TargetInvocations();

	/**
	 * Returns the meta object for class '{@link commandBehavior.IteratedUnit <em>Iterated Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterated Unit</em>'.
	 * @see commandBehavior.IteratedUnit
	 * @generated
	 */
	EClass getIteratedUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.IteratedUnit#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see commandBehavior.IteratedUnit#getRepeat()
	 * @see #getIteratedUnit()
	 * @generated
	 */
	EAttribute getIteratedUnit_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link commandBehavior.IteratedUnit#getTargetInvocation <em>Target Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Invocation</em>'.
	 * @see commandBehavior.IteratedUnit#getTargetInvocation()
	 * @see #getIteratedUnit()
	 * @generated
	 */
	EReference getIteratedUnit_TargetInvocation();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see commandBehavior.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Invocation#getTargetMethodName <em>Target Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Method Name</em>'.
	 * @see commandBehavior.Invocation#getTargetMethodName()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_TargetMethodName();

	/**
	 * Returns the meta object for the reference list '{@link commandBehavior.Invocation#getMappedParameters <em>Mapped Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped Parameters</em>'.
	 * @see commandBehavior.Invocation#getMappedParameters()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_MappedParameters();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see commandBehavior.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see commandBehavior.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandBehavior.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link commandBehavior.ConditionalUnit <em>Conditional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Unit</em>'.
	 * @see commandBehavior.ConditionalUnit
	 * @generated
	 */
	EClass getConditionalUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link commandBehavior.ConditionalUnit#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see commandBehavior.ConditionalUnit#getConditions()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_Conditions();

	/**
	 * Returns the meta object for class '{@link commandBehavior.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see commandBehavior.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandBehavior.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see commandBehavior.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for the reference '{@link commandBehavior.Condition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see commandBehavior.Condition#getUnit()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Unit();

	/**
	 * Returns the meta object for enum '{@link commandBehavior.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see commandBehavior.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandFactory getCommandFactory();

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
		 * The meta object literal for the '{@link commandBehavior.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ModuleImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__TRANSFORMATIONS = eINSTANCE.getModule_Transformations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.TransformationImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__UNITS = eINSTANCE.getTransformation_Units();

		/**
		 * The meta object literal for the '<em><b>Main Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__MAIN_UNIT = eINSTANCE.getTransformation_MainUnit();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__ROLE_NAME = eINSTANCE.getTransformation_RoleName();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET_CLASS = eINSTANCE.getTransformation_TargetClass();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__CONSTRAINTS = eINSTANCE.getTransformation_Constraints();

		/**
		 * The meta object literal for the '<em><b>Used Queries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__USED_QUERIES = eINSTANCE.getTransformation_UsedQueries();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__DOCUMENTATION = eINSTANCE.getTransformation_Documentation();

		/**
		 * The meta object literal for the '<em><b>Is Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__IS_INIT = eINSTANCE.getTransformation_IsInit();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.UnitImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__PARAMETERS = eINSTANCE.getUnit_Parameters();

		/**
		 * The meta object literal for the '<em><b>Main Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__MAIN_UNIT = eINSTANCE.getUnit_MainUnit();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.RuleImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>This Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__THIS_INSTANCE = eINSTANCE.getRule_ThisInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INSTANCE_CONDITIONS = eINSTANCE.getRule_InstanceConditions();

		/**
		 * The meta object literal for the '<em><b>Variable Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__VARIABLE_ASSIGNMENTS = eINSTANCE.getRule_VariableAssignments();

		/**
		 * The meta object literal for the '<em><b>Reference Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__REFERENCE_CONDITIONS = eINSTANCE.getRule_ReferenceConditions();

		/**
		 * The meta object literal for the '<em><b>Attribute Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ATTRIBUTE_CONDITIONS = eINSTANCE.getRule_AttributeConditions();

		/**
		 * The meta object literal for the '<em><b>Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__MODIFICATIONS = eINSTANCE.getRule_Modifications();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__VARIABLES = eINSTANCE.getRule_Variables();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.AttributeConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getAttributeCondition()
		 * @generated
		 */
		EClass ATTRIBUTE_CONDITION = eINSTANCE.getAttributeCondition();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_CONDITION__INSTANCE = eINSTANCE.getAttributeCondition_Instance();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONDITION__ATTRIBUTE_NAME = eINSTANCE.getAttributeCondition_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Attribute Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL = eINSTANCE.getAttributeCondition_AttributeValueLiteral();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_CONDITION__IS_CREATE = eINSTANCE.getAttributeCondition_IsCreate();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.InstanceConditionImpl <em>Instance Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.InstanceConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getInstanceCondition()
		 * @generated
		 */
		EClass INSTANCE_CONDITION = eINSTANCE.getInstanceCondition();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONDITION__VARIABLE_NAME = eINSTANCE.getInstanceCondition_VariableName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONDITION__TYPE_NAME = eINSTANCE.getInstanceCondition_TypeName();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_CONDITION__IS_CREATE = eINSTANCE.getInstanceCondition_IsCreate();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ReferenceConditionImpl <em>Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ReferenceConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getReferenceCondition()
		 * @generated
		 */
		EClass REFERENCE_CONDITION = eINSTANCE.getReferenceCondition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CONDITION__SOURCE = eINSTANCE.getReferenceCondition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CONDITION__TARGET = eINSTANCE.getReferenceCondition_Target();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CONDITION__REFERENCE_NAME = eINSTANCE.getReferenceCondition_ReferenceName();

		/**
		 * The meta object literal for the '<em><b>Is Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_CONDITION__IS_CREATE = eINSTANCE.getReferenceCondition_IsCreate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_CONDITION__TYPE = eINSTANCE.getReferenceCondition_Type();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.SingleReferenceConditionImpl <em>Single Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.SingleReferenceConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getSingleReferenceCondition()
		 * @generated
		 */
		EClass SINGLE_REFERENCE_CONDITION = eINSTANCE.getSingleReferenceCondition();

		/**
		 * The meta object literal for the '<em><b>Is Forbid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_REFERENCE_CONDITION__IS_FORBID = eINSTANCE.getSingleReferenceCondition_IsForbid();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ManyReferenceConditionImpl <em>Many Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ManyReferenceConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getManyReferenceCondition()
		 * @generated
		 */
		EClass MANY_REFERENCE_CONDITION = eINSTANCE.getManyReferenceCondition();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ClearReferenceConditionImpl <em>Clear Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ClearReferenceConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getClearReferenceCondition()
		 * @generated
		 */
		EClass CLEAR_REFERENCE_CONDITION = eINSTANCE.getClearReferenceCondition();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ModificationImpl <em>Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ModificationImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getModification()
		 * @generated
		 */
		EClass MODIFICATION = eINSTANCE.getModification();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFICATION__REFERENCE = eINSTANCE.getModification_Reference();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFICATION__INSTANCE = eINSTANCE.getModification_Instance();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFICATION__ATTRIBUTE = eINSTANCE.getModification_Attribute();

		/**
		 * The meta object literal for the '<em><b>New Attribute Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFICATION__NEW_ATTRIBUTE_VALUE = eINSTANCE.getModification_NewAttributeValue();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFICATION__ACTION = eINSTANCE.getModification_Action();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.VariableAssignmentImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getVariableAssignment_VariableName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__VALUE = eINSTANCE.getVariableAssignment_Value();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.VariableDeclarationImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariableDeclaration_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.SequentialUnitImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getSequentialUnit()
		 * @generated
		 */
		EClass SEQUENTIAL_UNIT = eINSTANCE.getSequentialUnit();

		/**
		 * The meta object literal for the '<em><b>Target Invocations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_UNIT__TARGET_INVOCATIONS = eINSTANCE.getSequentialUnit_TargetInvocations();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.IteratedUnitImpl <em>Iterated Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.IteratedUnitImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getIteratedUnit()
		 * @generated
		 */
		EClass ITERATED_UNIT = eINSTANCE.getIteratedUnit();

		/**
		 * The meta object literal for the '<em><b>Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATED_UNIT__REPEAT = eINSTANCE.getIteratedUnit_Repeat();

		/**
		 * The meta object literal for the '<em><b>Target Invocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATED_UNIT__TARGET_INVOCATION = eINSTANCE.getIteratedUnit_TargetInvocation();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.InvocationImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getInvocation()
		 * @generated
		 */
		EClass INVOCATION = eINSTANCE.getInvocation();

		/**
		 * The meta object literal for the '<em><b>Target Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOCATION__TARGET_METHOD_NAME = eINSTANCE.getInvocation_TargetMethodName();

		/**
		 * The meta object literal for the '<em><b>Mapped Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION__MAPPED_PARAMETERS = eINSTANCE.getInvocation_MappedParameters();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ParameterImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ConditionalUnitImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getConditionalUnit()
		 * @generated
		 */
		EClass CONDITIONAL_UNIT = eINSTANCE.getConditionalUnit();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__CONDITIONS = eINSTANCE.getConditionalUnit_Conditions();

		/**
		 * The meta object literal for the '{@link commandBehavior.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.impl.ConditionImpl
		 * @see commandBehavior.impl.CommandPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__UNIT = eINSTANCE.getCondition_Unit();

		/**
		 * The meta object literal for the '{@link commandBehavior.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandBehavior.Action
		 * @see commandBehavior.impl.CommandPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //CommandPackage
