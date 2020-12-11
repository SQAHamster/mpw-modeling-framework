/**
 */
package queryBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import queryBehavior.QueryPackage;
import queryBehavior.VariableExpression;
import queryBehavior.VariableUsageStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Usage Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.impl.VariableUsageStatementImpl#getVariableReference <em>Variable Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableUsageStatementImpl extends StatementImpl implements VariableUsageStatement {
	/**
	 * The cached value of the '{@link #getVariableReference() <em>Variable Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableReference()
	 * @generated
	 * @ordered
	 */
	protected VariableExpression variableReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableUsageStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.VARIABLE_USAGE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpression getVariableReference() {
		if (variableReference != null && variableReference.eIsProxy()) {
			InternalEObject oldVariableReference = (InternalEObject)variableReference;
			variableReference = (VariableExpression)eResolveProxy(oldVariableReference);
			if (variableReference != oldVariableReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE, oldVariableReference, variableReference));
			}
		}
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableExpression basicGetVariableReference() {
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableReference(VariableExpression newVariableReference) {
		VariableExpression oldVariableReference = variableReference;
		variableReference = newVariableReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE, oldVariableReference, variableReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE:
				if (resolve) return getVariableReference();
				return basicGetVariableReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE:
				setVariableReference((VariableExpression)newValue);
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
			case QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE:
				setVariableReference((VariableExpression)null);
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
			case QueryPackage.VARIABLE_USAGE_STATEMENT__VARIABLE_REFERENCE:
				return variableReference != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableUsageStatementImpl
