/**
 */
package commandBehavior.impl;

import commandBehavior.CommandPackage;
import commandBehavior.SingleReferenceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Reference Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.SingleReferenceConditionImpl#isIsForbid <em>Is Forbid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleReferenceConditionImpl extends ReferenceConditionImpl implements SingleReferenceCondition {
	/**
	 * The default value of the '{@link #isIsForbid() <em>Is Forbid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FORBID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsForbid() <em>Is Forbid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsForbid()
	 * @generated
	 * @ordered
	 */
	protected boolean isForbid = IS_FORBID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleReferenceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.SINGLE_REFERENCE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsForbid() {
		return isForbid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForbid(boolean newIsForbid) {
		boolean oldIsForbid = isForbid;
		isForbid = newIsForbid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.SINGLE_REFERENCE_CONDITION__IS_FORBID, oldIsForbid, isForbid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.SINGLE_REFERENCE_CONDITION__IS_FORBID:
				return isIsForbid();
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
			case CommandPackage.SINGLE_REFERENCE_CONDITION__IS_FORBID:
				setIsForbid((Boolean)newValue);
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
			case CommandPackage.SINGLE_REFERENCE_CONDITION__IS_FORBID:
				setIsForbid(IS_FORBID_EDEFAULT);
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
			case CommandPackage.SINGLE_REFERENCE_CONDITION__IS_FORBID:
				return isForbid != IS_FORBID_EDEFAULT;
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
		result.append(" (isForbid: ");
		result.append(isForbid);
		result.append(')');
		return result.toString();
	}

} //SingleReferenceConditionImpl
