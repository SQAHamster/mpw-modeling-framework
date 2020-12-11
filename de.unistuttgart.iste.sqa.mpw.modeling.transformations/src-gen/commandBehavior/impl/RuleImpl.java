/**
 */
package commandBehavior.impl;

import commandBehavior.AttributeCondition;
import commandBehavior.CommandPackage;
import commandBehavior.InstanceCondition;
import commandBehavior.Modification;
import commandBehavior.ReferenceCondition;
import commandBehavior.Rule;
import commandBehavior.VariableAssignment;
import commandBehavior.VariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.RuleImpl#getThisInstance <em>This Instance</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getInstanceConditions <em>Instance Conditions</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getReferenceConditions <em>Reference Conditions</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getAttributeConditions <em>Attribute Conditions</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getModifications <em>Modifications</em>}</li>
 *   <li>{@link commandBehavior.impl.RuleImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends UnitImpl implements Rule {
	/**
	 * The cached value of the '{@link #getThisInstance() <em>This Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThisInstance()
	 * @generated
	 * @ordered
	 */
	protected InstanceCondition thisInstance;

	/**
	 * The cached value of the '{@link #getInstanceConditions() <em>Instance Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceCondition> instanceConditions;

	/**
	 * The cached value of the '{@link #getVariableAssignments() <em>Variable Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAssignment> variableAssignments;

	/**
	 * The cached value of the '{@link #getReferenceConditions() <em>Reference Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceCondition> referenceConditions;

	/**
	 * The cached value of the '{@link #getAttributeConditions() <em>Attribute Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeCondition> attributeConditions;

	/**
	 * The cached value of the '{@link #getModifications() <em>Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Modification> modifications;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition getThisInstance() {
		if (thisInstance != null && thisInstance.eIsProxy()) {
			InternalEObject oldThisInstance = (InternalEObject)thisInstance;
			thisInstance = (InstanceCondition)eResolveProxy(oldThisInstance);
			if (thisInstance != oldThisInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.RULE__THIS_INSTANCE, oldThisInstance, thisInstance));
			}
		}
		return thisInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition basicGetThisInstance() {
		return thisInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThisInstance(InstanceCondition newThisInstance) {
		InstanceCondition oldThisInstance = thisInstance;
		thisInstance = newThisInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.RULE__THIS_INSTANCE, oldThisInstance, thisInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceCondition> getInstanceConditions() {
		if (instanceConditions == null) {
			instanceConditions = new EObjectContainmentEList<InstanceCondition>(InstanceCondition.class, this, CommandPackage.RULE__INSTANCE_CONDITIONS);
		}
		return instanceConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableAssignment> getVariableAssignments() {
		if (variableAssignments == null) {
			variableAssignments = new EObjectContainmentEList<VariableAssignment>(VariableAssignment.class, this, CommandPackage.RULE__VARIABLE_ASSIGNMENTS);
		}
		return variableAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceCondition> getReferenceConditions() {
		if (referenceConditions == null) {
			referenceConditions = new EObjectContainmentEList<ReferenceCondition>(ReferenceCondition.class, this, CommandPackage.RULE__REFERENCE_CONDITIONS);
		}
		return referenceConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeCondition> getAttributeConditions() {
		if (attributeConditions == null) {
			attributeConditions = new EObjectContainmentEList<AttributeCondition>(AttributeCondition.class, this, CommandPackage.RULE__ATTRIBUTE_CONDITIONS);
		}
		return attributeConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Modification> getModifications() {
		if (modifications == null) {
			modifications = new EObjectContainmentEList<Modification>(Modification.class, this, CommandPackage.RULE__MODIFICATIONS);
		}
		return modifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, CommandPackage.RULE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommandPackage.RULE__INSTANCE_CONDITIONS:
				return ((InternalEList<?>)getInstanceConditions()).basicRemove(otherEnd, msgs);
			case CommandPackage.RULE__VARIABLE_ASSIGNMENTS:
				return ((InternalEList<?>)getVariableAssignments()).basicRemove(otherEnd, msgs);
			case CommandPackage.RULE__REFERENCE_CONDITIONS:
				return ((InternalEList<?>)getReferenceConditions()).basicRemove(otherEnd, msgs);
			case CommandPackage.RULE__ATTRIBUTE_CONDITIONS:
				return ((InternalEList<?>)getAttributeConditions()).basicRemove(otherEnd, msgs);
			case CommandPackage.RULE__MODIFICATIONS:
				return ((InternalEList<?>)getModifications()).basicRemove(otherEnd, msgs);
			case CommandPackage.RULE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.RULE__THIS_INSTANCE:
				if (resolve) return getThisInstance();
				return basicGetThisInstance();
			case CommandPackage.RULE__INSTANCE_CONDITIONS:
				return getInstanceConditions();
			case CommandPackage.RULE__VARIABLE_ASSIGNMENTS:
				return getVariableAssignments();
			case CommandPackage.RULE__REFERENCE_CONDITIONS:
				return getReferenceConditions();
			case CommandPackage.RULE__ATTRIBUTE_CONDITIONS:
				return getAttributeConditions();
			case CommandPackage.RULE__MODIFICATIONS:
				return getModifications();
			case CommandPackage.RULE__VARIABLES:
				return getVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommandPackage.RULE__THIS_INSTANCE:
				setThisInstance((InstanceCondition)newValue);
				return;
			case CommandPackage.RULE__INSTANCE_CONDITIONS:
				getInstanceConditions().clear();
				getInstanceConditions().addAll((Collection<? extends InstanceCondition>)newValue);
				return;
			case CommandPackage.RULE__VARIABLE_ASSIGNMENTS:
				getVariableAssignments().clear();
				getVariableAssignments().addAll((Collection<? extends VariableAssignment>)newValue);
				return;
			case CommandPackage.RULE__REFERENCE_CONDITIONS:
				getReferenceConditions().clear();
				getReferenceConditions().addAll((Collection<? extends ReferenceCondition>)newValue);
				return;
			case CommandPackage.RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				getAttributeConditions().addAll((Collection<? extends AttributeCondition>)newValue);
				return;
			case CommandPackage.RULE__MODIFICATIONS:
				getModifications().clear();
				getModifications().addAll((Collection<? extends Modification>)newValue);
				return;
			case CommandPackage.RULE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommandPackage.RULE__THIS_INSTANCE:
				setThisInstance((InstanceCondition)null);
				return;
			case CommandPackage.RULE__INSTANCE_CONDITIONS:
				getInstanceConditions().clear();
				return;
			case CommandPackage.RULE__VARIABLE_ASSIGNMENTS:
				getVariableAssignments().clear();
				return;
			case CommandPackage.RULE__REFERENCE_CONDITIONS:
				getReferenceConditions().clear();
				return;
			case CommandPackage.RULE__ATTRIBUTE_CONDITIONS:
				getAttributeConditions().clear();
				return;
			case CommandPackage.RULE__MODIFICATIONS:
				getModifications().clear();
				return;
			case CommandPackage.RULE__VARIABLES:
				getVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommandPackage.RULE__THIS_INSTANCE:
				return thisInstance != null;
			case CommandPackage.RULE__INSTANCE_CONDITIONS:
				return instanceConditions != null && !instanceConditions.isEmpty();
			case CommandPackage.RULE__VARIABLE_ASSIGNMENTS:
				return variableAssignments != null && !variableAssignments.isEmpty();
			case CommandPackage.RULE__REFERENCE_CONDITIONS:
				return referenceConditions != null && !referenceConditions.isEmpty();
			case CommandPackage.RULE__ATTRIBUTE_CONDITIONS:
				return attributeConditions != null && !attributeConditions.isEmpty();
			case CommandPackage.RULE__MODIFICATIONS:
				return modifications != null && !modifications.isEmpty();
			case CommandPackage.RULE__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RuleImpl
