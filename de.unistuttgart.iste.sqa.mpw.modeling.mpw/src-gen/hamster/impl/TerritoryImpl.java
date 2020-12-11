/**
 */
package hamster.impl;

import hamster.Hamster;
import hamster.HamsterPackage;
import hamster.Territory;

import mpw.impl.StageImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Territory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamster.impl.TerritoryImpl#getDefaultHamster <em>Default Hamster</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerritoryImpl extends StageImpl implements Territory {
	/**
	 * The cached value of the '{@link #getDefaultHamster() <em>Default Hamster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHamster()
	 * @generated
	 * @ordered
	 */
	protected Hamster defaultHamster;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerritoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterPackage.Literals.TERRITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hamster getDefaultHamster() {
		return defaultHamster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultHamster(Hamster newDefaultHamster, NotificationChain msgs) {
		Hamster oldDefaultHamster = defaultHamster;
		defaultHamster = newDefaultHamster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HamsterPackage.TERRITORY__DEFAULT_HAMSTER, oldDefaultHamster, newDefaultHamster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HamsterPackage.TERRITORY__DEFAULT_HAMSTER:
				return basicSetDefaultHamster(null, msgs);
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
			case HamsterPackage.TERRITORY__DEFAULT_HAMSTER:
				return getDefaultHamster();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HamsterPackage.TERRITORY__DEFAULT_HAMSTER:
				return defaultHamster != null;
		}
		return super.eIsSet(featureID);
	}

} //TerritoryImpl
