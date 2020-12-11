/**
 */
package commandBehavior.impl;

import commandBehavior.Action;
import commandBehavior.AttributeCondition;
import commandBehavior.ClearReferenceCondition;
import commandBehavior.CommandFactory;
import commandBehavior.CommandPackage;
import commandBehavior.Condition;
import commandBehavior.ConditionalUnit;
import commandBehavior.InstanceCondition;
import commandBehavior.Invocation;
import commandBehavior.IteratedUnit;
import commandBehavior.ManyReferenceCondition;
import commandBehavior.Modification;
import commandBehavior.Parameter;
import commandBehavior.Rule;
import commandBehavior.SequentialUnit;
import commandBehavior.SingleReferenceCondition;
import commandBehavior.Transformation;
import commandBehavior.VariableAssignment;
import commandBehavior.VariableDeclaration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandFactoryImpl extends EFactoryImpl implements CommandFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandFactory init() {
		try {
			CommandFactory theCommandFactory = (CommandFactory)EPackage.Registry.INSTANCE.getEFactory(CommandPackage.eNS_URI);
			if (theCommandFactory != null) {
				return theCommandFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandFactoryImpl() {
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
			case CommandPackage.MODULE: return createModule();
			case CommandPackage.TRANSFORMATION: return createTransformation();
			case CommandPackage.RULE: return createRule();
			case CommandPackage.ATTRIBUTE_CONDITION: return createAttributeCondition();
			case CommandPackage.INSTANCE_CONDITION: return createInstanceCondition();
			case CommandPackage.SINGLE_REFERENCE_CONDITION: return createSingleReferenceCondition();
			case CommandPackage.MANY_REFERENCE_CONDITION: return createManyReferenceCondition();
			case CommandPackage.CLEAR_REFERENCE_CONDITION: return createClearReferenceCondition();
			case CommandPackage.MODIFICATION: return createModification();
			case CommandPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
			case CommandPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case CommandPackage.SEQUENTIAL_UNIT: return createSequentialUnit();
			case CommandPackage.ITERATED_UNIT: return createIteratedUnit();
			case CommandPackage.INVOCATION: return createInvocation();
			case CommandPackage.PARAMETER: return createParameter();
			case CommandPackage.CONDITIONAL_UNIT: return createConditionalUnit();
			case CommandPackage.CONDITION: return createCondition();
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
			case CommandPackage.ACTION:
				return createActionFromString(eDataType, initialValue);
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
			case CommandPackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public commandBehavior.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCondition createAttributeCondition() {
		AttributeConditionImpl attributeCondition = new AttributeConditionImpl();
		return attributeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition createInstanceCondition() {
		InstanceConditionImpl instanceCondition = new InstanceConditionImpl();
		return instanceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleReferenceCondition createSingleReferenceCondition() {
		SingleReferenceConditionImpl singleReferenceCondition = new SingleReferenceConditionImpl();
		return singleReferenceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyReferenceCondition createManyReferenceCondition() {
		ManyReferenceConditionImpl manyReferenceCondition = new ManyReferenceConditionImpl();
		return manyReferenceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearReferenceCondition createClearReferenceCondition() {
		ClearReferenceConditionImpl clearReferenceCondition = new ClearReferenceConditionImpl();
		return clearReferenceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modification createModification() {
		ModificationImpl modification = new ModificationImpl();
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAssignment createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialUnit createSequentialUnit() {
		SequentialUnitImpl sequentialUnit = new SequentialUnitImpl();
		return sequentialUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratedUnit createIteratedUnit() {
		IteratedUnitImpl iteratedUnit = new IteratedUnitImpl();
		return iteratedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invocation createInvocation() {
		InvocationImpl invocation = new InvocationImpl();
		return invocation;
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
	public ConditionalUnit createConditionalUnit() {
		ConditionalUnitImpl conditionalUnit = new ConditionalUnitImpl();
		return conditionalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandPackage getCommandPackage() {
		return (CommandPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandPackage getPackage() {
		return CommandPackage.eINSTANCE;
	}

} //CommandFactoryImpl
