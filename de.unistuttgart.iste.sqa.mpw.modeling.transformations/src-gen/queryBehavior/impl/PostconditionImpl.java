/**
 */
package queryBehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import queryBehavior.Postcondition;
import queryBehavior.QueryPackage;
import queryBehavior.VariableExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.impl.PostconditionImpl#getOldValueVariableExpressions <em>Old Value Variable Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostconditionImpl extends CommandConstraintImpl implements Postcondition {
	/**
	 * The cached value of the '{@link #getOldValueVariableExpressions() <em>Old Value Variable Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValueVariableExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableExpression> oldValueVariableExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.POSTCONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableExpression> getOldValueVariableExpressions() {
		if (oldValueVariableExpressions == null) {
			oldValueVariableExpressions = new EObjectContainmentEList<VariableExpression>(VariableExpression.class, this, QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS);
		}
		return oldValueVariableExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS:
				return ((InternalEList<?>)getOldValueVariableExpressions()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS:
				return getOldValueVariableExpressions();
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
			case QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS:
				getOldValueVariableExpressions().clear();
				getOldValueVariableExpressions().addAll((Collection<? extends VariableExpression>)newValue);
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
			case QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS:
				getOldValueVariableExpressions().clear();
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
			case QueryPackage.POSTCONDITION__OLD_VALUE_VARIABLE_EXPRESSIONS:
				return oldValueVariableExpressions != null && !oldValueVariableExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostconditionImpl
