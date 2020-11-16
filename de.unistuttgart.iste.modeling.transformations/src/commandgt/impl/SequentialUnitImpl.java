/**
 */
package commandgt.impl;

import commandgt.CommandgtPackage;
import commandgt.Invocation;
import commandgt.SequentialUnit;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandgt.impl.SequentialUnitImpl#getTargetInvocations <em>Target Invocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequentialUnitImpl extends UnitImpl implements SequentialUnit {
	/**
	 * The cached value of the '{@link #getTargetInvocations() <em>Target Invocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInvocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Invocation> targetInvocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandgtPackage.Literals.SEQUENTIAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invocation> getTargetInvocations() {
		if (targetInvocations == null) {
			targetInvocations = new EObjectContainmentEList<Invocation>(Invocation.class, this, CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS);
		}
		return targetInvocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS:
				return ((InternalEList<?>)getTargetInvocations()).basicRemove(otherEnd, msgs);
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
			case CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS:
				return getTargetInvocations();
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
			case CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS:
				getTargetInvocations().clear();
				getTargetInvocations().addAll((Collection<? extends Invocation>)newValue);
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
			case CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS:
				getTargetInvocations().clear();
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
			case CommandgtPackage.SEQUENTIAL_UNIT__TARGET_INVOCATIONS:
				return targetInvocations != null && !targetInvocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequentialUnitImpl
