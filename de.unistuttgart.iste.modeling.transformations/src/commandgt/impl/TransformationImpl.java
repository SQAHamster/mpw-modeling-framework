/**
 */
package commandgt.impl;

import commandgt.CommandgtPackage;
import commandgt.Transformation;
import commandgt.Unit;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandgt.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link commandgt.impl.TransformationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link commandgt.impl.TransformationImpl#getMainUnit <em>Main Unit</em>}</li>
 *   <li>{@link commandgt.impl.TransformationImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link commandgt.impl.TransformationImpl#getTargetClassName <em>Target Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends MinimalEObjectImpl.Container implements Transformation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * The cached value of the '{@link #getMainUnit() <em>Main Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit mainUnit;

	/**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected String roleName = ROLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetClassName() <em>Target Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClassName()
	 * @generated
	 * @ordered
	 */
	protected String targetClassName = TARGET_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandgtPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, CommandgtPackage.TRANSFORMATION__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit getMainUnit() {
		if (mainUnit != null && mainUnit.eIsProxy()) {
			InternalEObject oldMainUnit = (InternalEObject)mainUnit;
			mainUnit = (Unit)eResolveProxy(oldMainUnit);
			if (mainUnit != oldMainUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandgtPackage.TRANSFORMATION__MAIN_UNIT, oldMainUnit, mainUnit));
			}
		}
		return mainUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetMainUnit() {
		return mainUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainUnit(Unit newMainUnit) {
		Unit oldMainUnit = mainUnit;
		mainUnit = newMainUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.TRANSFORMATION__MAIN_UNIT, oldMainUnit, mainUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(String newRoleName) {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.TRANSFORMATION__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetClassName() {
		return targetClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClassName(String newTargetClassName) {
		String oldTargetClassName = targetClassName;
		targetClassName = newTargetClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.TRANSFORMATION__TARGET_CLASS_NAME, oldTargetClassName, targetClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommandgtPackage.TRANSFORMATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
			case CommandgtPackage.TRANSFORMATION__NAME:
				return getName();
			case CommandgtPackage.TRANSFORMATION__UNITS:
				return getUnits();
			case CommandgtPackage.TRANSFORMATION__MAIN_UNIT:
				if (resolve) return getMainUnit();
				return basicGetMainUnit();
			case CommandgtPackage.TRANSFORMATION__ROLE_NAME:
				return getRoleName();
			case CommandgtPackage.TRANSFORMATION__TARGET_CLASS_NAME:
				return getTargetClassName();
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
			case CommandgtPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case CommandgtPackage.TRANSFORMATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case CommandgtPackage.TRANSFORMATION__MAIN_UNIT:
				setMainUnit((Unit)newValue);
				return;
			case CommandgtPackage.TRANSFORMATION__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case CommandgtPackage.TRANSFORMATION__TARGET_CLASS_NAME:
				setTargetClassName((String)newValue);
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
			case CommandgtPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommandgtPackage.TRANSFORMATION__UNITS:
				getUnits().clear();
				return;
			case CommandgtPackage.TRANSFORMATION__MAIN_UNIT:
				setMainUnit((Unit)null);
				return;
			case CommandgtPackage.TRANSFORMATION__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case CommandgtPackage.TRANSFORMATION__TARGET_CLASS_NAME:
				setTargetClassName(TARGET_CLASS_NAME_EDEFAULT);
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
			case CommandgtPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommandgtPackage.TRANSFORMATION__UNITS:
				return units != null && !units.isEmpty();
			case CommandgtPackage.TRANSFORMATION__MAIN_UNIT:
				return mainUnit != null;
			case CommandgtPackage.TRANSFORMATION__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case CommandgtPackage.TRANSFORMATION__TARGET_CLASS_NAME:
				return TARGET_CLASS_NAME_EDEFAULT == null ? targetClassName != null : !TARGET_CLASS_NAME_EDEFAULT.equals(targetClassName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", roleName: ");
		result.append(roleName);
		result.append(", targetClassName: ");
		result.append(targetClassName);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
