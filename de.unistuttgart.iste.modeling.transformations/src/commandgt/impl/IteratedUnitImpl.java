/**
 */
package commandgt.impl;

import commandgt.CommandgtPackage;
import commandgt.Invocation;
import commandgt.IteratedUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterated Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandgt.impl.IteratedUnitImpl#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link commandgt.impl.IteratedUnitImpl#getTargetInvocation <em>Target Invocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IteratedUnitImpl extends UnitImpl implements IteratedUnit {
	/**
	 * The default value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected static final String REPEAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeat()
	 * @generated
	 * @ordered
	 */
	protected String repeat = REPEAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetInvocation() <em>Target Invocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInvocation()
	 * @generated
	 * @ordered
	 */
	protected Invocation targetInvocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IteratedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandgtPackage.Literals.ITERATED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepeat() {
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeat(String newRepeat) {
		String oldRepeat = repeat;
		repeat = newRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.ITERATED_UNIT__REPEAT, oldRepeat, repeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invocation getTargetInvocation() {
		return targetInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetInvocation(Invocation newTargetInvocation, NotificationChain msgs) {
		Invocation oldTargetInvocation = targetInvocation;
		targetInvocation = newTargetInvocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION, oldTargetInvocation, newTargetInvocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInvocation(Invocation newTargetInvocation) {
		if (newTargetInvocation != targetInvocation) {
			NotificationChain msgs = null;
			if (targetInvocation != null)
				msgs = ((InternalEObject)targetInvocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION, null, msgs);
			if (newTargetInvocation != null)
				msgs = ((InternalEObject)newTargetInvocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION, null, msgs);
			msgs = basicSetTargetInvocation(newTargetInvocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION, newTargetInvocation, newTargetInvocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION:
				return basicSetTargetInvocation(null, msgs);
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
			case CommandgtPackage.ITERATED_UNIT__REPEAT:
				return getRepeat();
			case CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION:
				return getTargetInvocation();
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
			case CommandgtPackage.ITERATED_UNIT__REPEAT:
				setRepeat((String)newValue);
				return;
			case CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION:
				setTargetInvocation((Invocation)newValue);
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
			case CommandgtPackage.ITERATED_UNIT__REPEAT:
				setRepeat(REPEAT_EDEFAULT);
				return;
			case CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION:
				setTargetInvocation((Invocation)null);
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
			case CommandgtPackage.ITERATED_UNIT__REPEAT:
				return REPEAT_EDEFAULT == null ? repeat != null : !REPEAT_EDEFAULT.equals(repeat);
			case CommandgtPackage.ITERATED_UNIT__TARGET_INVOCATION:
				return targetInvocation != null;
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
		result.append(" (repeat: ");
		result.append(repeat);
		result.append(')');
		return result.toString();
	}

} //IteratedUnitImpl
