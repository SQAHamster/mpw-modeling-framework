/**
 */
package commandgt;

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
 * @see commandgt.CommandgtFactory
 * @model kind="package"
 * @generated
 */
public interface CommandgtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commandgt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/commandgt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commandgt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandgtPackage eINSTANCE = commandgt.impl.CommandgtPackageImpl.init();

	/**
	 * The meta object id for the '{@link commandgt.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.TransformationImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

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
	 * The feature id for the '<em><b>Target Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_CLASS_NAME = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandgt.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.UnitImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

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
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandgt.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.RuleImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

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
	 * The meta object id for the '{@link commandgt.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.AttributeConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getAttributeCondition()
	 * @generated
	 */
	int ATTRIBUTE_CONDITION = 3;

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
	 * The meta object id for the '{@link commandgt.impl.InstanceConditionImpl <em>Instance Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.InstanceConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getInstanceCondition()
	 * @generated
	 */
	int INSTANCE_CONDITION = 4;

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
	 * The meta object id for the '{@link commandgt.impl.ReferenceConditionImpl <em>Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ReferenceConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getReferenceCondition()
	 * @generated
	 */
	int REFERENCE_CONDITION = 5;

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
	 * The number of structural features of the '<em>Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reference Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandgt.impl.SingleReferenceConditionImpl <em>Single Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.SingleReferenceConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getSingleReferenceCondition()
	 * @generated
	 */
	int SINGLE_REFERENCE_CONDITION = 6;

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
	 * The meta object id for the '{@link commandgt.impl.ManyReferenceConditionImpl <em>Many Reference Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ManyReferenceConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getManyReferenceCondition()
	 * @generated
	 */
	int MANY_REFERENCE_CONDITION = 7;

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
	 * The meta object id for the '{@link commandgt.impl.ModificationImpl <em>Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ModificationImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getModification()
	 * @generated
	 */
	int MODIFICATION = 8;

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
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__ACTION = 2;

	/**
	 * The number of structural features of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link commandgt.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.VariableAssignmentImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 9;

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
	 * The meta object id for the '{@link commandgt.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.VariableDeclarationImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 10;

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
	 * The meta object id for the '{@link commandgt.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.SequentialUnitImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getSequentialUnit()
	 * @generated
	 */
	int SEQUENTIAL_UNIT = 11;

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
	 * The meta object id for the '{@link commandgt.impl.IteratedUnitImpl <em>Iterated Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.IteratedUnitImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getIteratedUnit()
	 * @generated
	 */
	int ITERATED_UNIT = 12;

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
	 * The meta object id for the '{@link commandgt.impl.InvocationImpl <em>Invocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.InvocationImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getInvocation()
	 * @generated
	 */
	int INVOCATION = 13;

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
	 * The meta object id for the '{@link commandgt.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ParameterImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

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
	 * The meta object id for the '{@link commandgt.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ConditionalUnitImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getConditionalUnit()
	 * @generated
	 */
	int CONDITIONAL_UNIT = 15;

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
	 * The meta object id for the '{@link commandgt.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.impl.ConditionImpl
	 * @see commandgt.impl.CommandgtPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

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
	 * The meta object id for the '{@link commandgt.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commandgt.Action
	 * @see commandgt.impl.CommandgtPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 17;


	/**
	 * Returns the meta object for class '{@link commandgt.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see commandgt.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandgt.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Transformation#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see commandgt.Transformation#getUnits()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Units();

	/**
	 * Returns the meta object for the reference '{@link commandgt.Transformation#getMainUnit <em>Main Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Unit</em>'.
	 * @see commandgt.Transformation#getMainUnit()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_MainUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Transformation#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see commandgt.Transformation#getRoleName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_RoleName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Transformation#getTargetClassName <em>Target Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class Name</em>'.
	 * @see commandgt.Transformation#getTargetClassName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_TargetClassName();

	/**
	 * Returns the meta object for class '{@link commandgt.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see commandgt.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandgt.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Unit#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see commandgt.Unit#getParameters()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Parameters();

	/**
	 * Returns the meta object for class '{@link commandgt.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see commandgt.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link commandgt.Rule#getThisInstance <em>This Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>This Instance</em>'.
	 * @see commandgt.Rule#getThisInstance()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ThisInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getInstanceConditions <em>Instance Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance Conditions</em>'.
	 * @see commandgt.Rule#getInstanceConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_InstanceConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getVariableAssignments <em>Variable Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Assignments</em>'.
	 * @see commandgt.Rule#getVariableAssignments()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_VariableAssignments();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getReferenceConditions <em>Reference Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference Conditions</em>'.
	 * @see commandgt.Rule#getReferenceConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ReferenceConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getAttributeConditions <em>Attribute Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute Conditions</em>'.
	 * @see commandgt.Rule#getAttributeConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_AttributeConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getModifications <em>Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifications</em>'.
	 * @see commandgt.Rule#getModifications()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Modifications();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.Rule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see commandgt.Rule#getVariables()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Variables();

	/**
	 * Returns the meta object for class '{@link commandgt.AttributeCondition <em>Attribute Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Condition</em>'.
	 * @see commandgt.AttributeCondition
	 * @generated
	 */
	EClass getAttributeCondition();

	/**
	 * Returns the meta object for the reference '{@link commandgt.AttributeCondition#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see commandgt.AttributeCondition#getInstance()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EReference getAttributeCondition_Instance();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.AttributeCondition#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see commandgt.AttributeCondition#getAttributeName()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.AttributeCondition#getAttributeValueLiteral <em>Attribute Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Value Literal</em>'.
	 * @see commandgt.AttributeCondition#getAttributeValueLiteral()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_AttributeValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.AttributeCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandgt.AttributeCondition#isIsCreate()
	 * @see #getAttributeCondition()
	 * @generated
	 */
	EAttribute getAttributeCondition_IsCreate();

	/**
	 * Returns the meta object for class '{@link commandgt.InstanceCondition <em>Instance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Condition</em>'.
	 * @see commandgt.InstanceCondition
	 * @generated
	 */
	EClass getInstanceCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.InstanceCondition#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see commandgt.InstanceCondition#getVariableName()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.InstanceCondition#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see commandgt.InstanceCondition#getTypeName()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.InstanceCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandgt.InstanceCondition#isIsCreate()
	 * @see #getInstanceCondition()
	 * @generated
	 */
	EAttribute getInstanceCondition_IsCreate();

	/**
	 * Returns the meta object for class '{@link commandgt.ReferenceCondition <em>Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Condition</em>'.
	 * @see commandgt.ReferenceCondition
	 * @generated
	 */
	EClass getReferenceCondition();

	/**
	 * Returns the meta object for the reference '{@link commandgt.ReferenceCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see commandgt.ReferenceCondition#getSource()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EReference getReferenceCondition_Source();

	/**
	 * Returns the meta object for the reference '{@link commandgt.ReferenceCondition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see commandgt.ReferenceCondition#getTarget()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EReference getReferenceCondition_Target();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.ReferenceCondition#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see commandgt.ReferenceCondition#getReferenceName()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EAttribute getReferenceCondition_ReferenceName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.ReferenceCondition#isIsCreate <em>Is Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Create</em>'.
	 * @see commandgt.ReferenceCondition#isIsCreate()
	 * @see #getReferenceCondition()
	 * @generated
	 */
	EAttribute getReferenceCondition_IsCreate();

	/**
	 * Returns the meta object for class '{@link commandgt.SingleReferenceCondition <em>Single Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Reference Condition</em>'.
	 * @see commandgt.SingleReferenceCondition
	 * @generated
	 */
	EClass getSingleReferenceCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.SingleReferenceCondition#isIsForbid <em>Is Forbid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Forbid</em>'.
	 * @see commandgt.SingleReferenceCondition#isIsForbid()
	 * @see #getSingleReferenceCondition()
	 * @generated
	 */
	EAttribute getSingleReferenceCondition_IsForbid();

	/**
	 * Returns the meta object for class '{@link commandgt.ManyReferenceCondition <em>Many Reference Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Reference Condition</em>'.
	 * @see commandgt.ManyReferenceCondition
	 * @generated
	 */
	EClass getManyReferenceCondition();

	/**
	 * Returns the meta object for class '{@link commandgt.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification</em>'.
	 * @see commandgt.Modification
	 * @generated
	 */
	EClass getModification();

	/**
	 * Returns the meta object for the reference '{@link commandgt.Modification#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see commandgt.Modification#getReference()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Reference();

	/**
	 * Returns the meta object for the reference '{@link commandgt.Modification#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see commandgt.Modification#getInstance()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Instance();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Modification#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see commandgt.Modification#getAction()
	 * @see #getModification()
	 * @generated
	 */
	EAttribute getModification_Action();

	/**
	 * Returns the meta object for class '{@link commandgt.VariableAssignment <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see commandgt.VariableAssignment
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.VariableAssignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see commandgt.VariableAssignment#getVariableName()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.VariableAssignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see commandgt.VariableAssignment#getValue()
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_Value();

	/**
	 * Returns the meta object for class '{@link commandgt.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see commandgt.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.VariableDeclaration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see commandgt.VariableDeclaration#getType()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Type();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandgt.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link commandgt.SequentialUnit <em>Sequential Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Unit</em>'.
	 * @see commandgt.SequentialUnit
	 * @generated
	 */
	EClass getSequentialUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.SequentialUnit#getTargetInvocations <em>Target Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Invocations</em>'.
	 * @see commandgt.SequentialUnit#getTargetInvocations()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EReference getSequentialUnit_TargetInvocations();

	/**
	 * Returns the meta object for class '{@link commandgt.IteratedUnit <em>Iterated Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterated Unit</em>'.
	 * @see commandgt.IteratedUnit
	 * @generated
	 */
	EClass getIteratedUnit();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.IteratedUnit#getRepeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat</em>'.
	 * @see commandgt.IteratedUnit#getRepeat()
	 * @see #getIteratedUnit()
	 * @generated
	 */
	EAttribute getIteratedUnit_Repeat();

	/**
	 * Returns the meta object for the containment reference '{@link commandgt.IteratedUnit#getTargetInvocation <em>Target Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Invocation</em>'.
	 * @see commandgt.IteratedUnit#getTargetInvocation()
	 * @see #getIteratedUnit()
	 * @generated
	 */
	EReference getIteratedUnit_TargetInvocation();

	/**
	 * Returns the meta object for class '{@link commandgt.Invocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation</em>'.
	 * @see commandgt.Invocation
	 * @generated
	 */
	EClass getInvocation();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Invocation#getTargetMethodName <em>Target Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Method Name</em>'.
	 * @see commandgt.Invocation#getTargetMethodName()
	 * @see #getInvocation()
	 * @generated
	 */
	EAttribute getInvocation_TargetMethodName();

	/**
	 * Returns the meta object for the reference list '{@link commandgt.Invocation#getMappedParameters <em>Mapped Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapped Parameters</em>'.
	 * @see commandgt.Invocation#getMappedParameters()
	 * @see #getInvocation()
	 * @generated
	 */
	EReference getInvocation_MappedParameters();

	/**
	 * Returns the meta object for class '{@link commandgt.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see commandgt.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see commandgt.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see commandgt.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link commandgt.ConditionalUnit <em>Conditional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Unit</em>'.
	 * @see commandgt.ConditionalUnit
	 * @generated
	 */
	EClass getConditionalUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link commandgt.ConditionalUnit#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see commandgt.ConditionalUnit#getConditions()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_Conditions();

	/**
	 * Returns the meta object for class '{@link commandgt.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see commandgt.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link commandgt.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see commandgt.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Condition();

	/**
	 * Returns the meta object for the reference '{@link commandgt.Condition#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see commandgt.Condition#getUnit()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Unit();

	/**
	 * Returns the meta object for enum '{@link commandgt.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see commandgt.Action
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
	CommandgtFactory getCommandgtFactory();

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
		 * The meta object literal for the '{@link commandgt.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.TransformationImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getTransformation()
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
		 * The meta object literal for the '<em><b>Target Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TARGET_CLASS_NAME = eINSTANCE.getTransformation_TargetClassName();

		/**
		 * The meta object literal for the '{@link commandgt.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.UnitImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getUnit()
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
		 * The meta object literal for the '{@link commandgt.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.RuleImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getRule()
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
		 * The meta object literal for the '{@link commandgt.impl.AttributeConditionImpl <em>Attribute Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.AttributeConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getAttributeCondition()
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
		 * The meta object literal for the '{@link commandgt.impl.InstanceConditionImpl <em>Instance Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.InstanceConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getInstanceCondition()
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
		 * The meta object literal for the '{@link commandgt.impl.ReferenceConditionImpl <em>Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ReferenceConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getReferenceCondition()
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
		 * The meta object literal for the '{@link commandgt.impl.SingleReferenceConditionImpl <em>Single Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.SingleReferenceConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getSingleReferenceCondition()
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
		 * The meta object literal for the '{@link commandgt.impl.ManyReferenceConditionImpl <em>Many Reference Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ManyReferenceConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getManyReferenceCondition()
		 * @generated
		 */
		EClass MANY_REFERENCE_CONDITION = eINSTANCE.getManyReferenceCondition();

		/**
		 * The meta object literal for the '{@link commandgt.impl.ModificationImpl <em>Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ModificationImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getModification()
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
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFICATION__ACTION = eINSTANCE.getModification_Action();

		/**
		 * The meta object literal for the '{@link commandgt.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.VariableAssignmentImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getVariableAssignment()
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
		 * The meta object literal for the '{@link commandgt.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.VariableDeclarationImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getVariableDeclaration()
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
		 * The meta object literal for the '{@link commandgt.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.SequentialUnitImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getSequentialUnit()
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
		 * The meta object literal for the '{@link commandgt.impl.IteratedUnitImpl <em>Iterated Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.IteratedUnitImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getIteratedUnit()
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
		 * The meta object literal for the '{@link commandgt.impl.InvocationImpl <em>Invocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.InvocationImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getInvocation()
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
		 * The meta object literal for the '{@link commandgt.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ParameterImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getParameter()
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
		 * The meta object literal for the '{@link commandgt.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ConditionalUnitImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getConditionalUnit()
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
		 * The meta object literal for the '{@link commandgt.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.impl.ConditionImpl
		 * @see commandgt.impl.CommandgtPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link commandgt.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commandgt.Action
		 * @see commandgt.impl.CommandgtPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //CommandgtPackage
