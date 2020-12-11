/**
 */
package hamster.impl;

import hamster.HamsterGame;
import hamster.HamsterPackage;
import hamster.Territory;

import mpw.impl.MiniProgrammingWorldImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamster.impl.HamsterGameImpl#getTerritory <em>Territory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HamsterGameImpl extends MiniProgrammingWorldImpl implements HamsterGame {
	/**
	 * The cached value of the '{@link #getTerritory() <em>Territory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerritory()
	 * @generated
	 * @ordered
	 */
	protected Territory territory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HamsterGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterPackage.Literals.HAMSTER_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Territory getTerritory() {
		return territory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerritory(Territory newTerritory, NotificationChain msgs) {
		Territory oldTerritory = territory;
		territory = newTerritory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HamsterPackage.HAMSTER_GAME__TERRITORY, oldTerritory, newTerritory);
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
			case HamsterPackage.HAMSTER_GAME__TERRITORY:
				return basicSetTerritory(null, msgs);
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
			case HamsterPackage.HAMSTER_GAME__TERRITORY:
				return getTerritory();
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
			case HamsterPackage.HAMSTER_GAME__TERRITORY:
				return territory != null;
		}
		return super.eIsSet(featureID);
	}

} //HamsterGameImpl
