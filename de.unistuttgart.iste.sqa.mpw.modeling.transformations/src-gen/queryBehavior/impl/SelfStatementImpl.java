/**
 */
package queryBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import queryBehavior.QueryPackage;
import queryBehavior.SelfStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.impl.SelfStatementImpl#getSelfAlias <em>Self Alias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelfStatementImpl extends StatementImpl implements SelfStatement {
	/**
	 * The default value of the '{@link #getSelfAlias() <em>Self Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfAlias() <em>Self Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfAlias()
	 * @generated
	 * @ordered
	 */
	protected String selfAlias = SELF_ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SELF_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelfAlias() {
		return selfAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfAlias(String newSelfAlias) {
		String oldSelfAlias = selfAlias;
		selfAlias = newSelfAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELF_STATEMENT__SELF_ALIAS, oldSelfAlias, selfAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.SELF_STATEMENT__SELF_ALIAS:
				return getSelfAlias();
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
			case QueryPackage.SELF_STATEMENT__SELF_ALIAS:
				setSelfAlias((String)newValue);
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
			case QueryPackage.SELF_STATEMENT__SELF_ALIAS:
				setSelfAlias(SELF_ALIAS_EDEFAULT);
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
			case QueryPackage.SELF_STATEMENT__SELF_ALIAS:
				return SELF_ALIAS_EDEFAULT == null ? selfAlias != null : !SELF_ALIAS_EDEFAULT.equals(selfAlias);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (selfAlias: ");
		result.append(selfAlias);
		result.append(')');
		return result.toString();
	}

} //SelfStatementImpl
