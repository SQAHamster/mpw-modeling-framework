/**
 */
package commandBehavior.impl;

import commandBehavior.CommandPackage;
import commandBehavior.Transformation;
import commandBehavior.Unit;

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

import queryBehavior.Constraint;
import queryBehavior.Query;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getMainUnit <em>Main Unit</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getUsedQueries <em>Used Queries</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link commandBehavior.impl.TransformationImpl#isIsInit <em>Is Init</em>}</li>
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
	 * The cached value of the '{@link #getTargetClass() <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetClass()
	 * @generated
	 * @ordered
	 */
	protected EClass targetClass;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getUsedQueries() <em>Used Queries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedQueries()
	 * @generated
	 * @ordered
	 */
	protected EList<Query> usedQueries;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInit() <em>Is Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInit() <em>Is Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInit()
	 * @generated
	 * @ordered
	 */
	protected boolean isInit = IS_INIT_EDEFAULT;

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
		return CommandPackage.Literals.TRANSFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, CommandPackage.TRANSFORMATION__UNITS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.TRANSFORMATION__MAIN_UNIT, oldMainUnit, mainUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__MAIN_UNIT, oldMainUnit, mainUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetClass() {
		if (targetClass != null && targetClass.eIsProxy()) {
			InternalEObject oldTargetClass = (InternalEObject)targetClass;
			targetClass = (EClass)eResolveProxy(oldTargetClass);
			if (targetClass != oldTargetClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.TRANSFORMATION__TARGET_CLASS, oldTargetClass, targetClass));
			}
		}
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetTargetClass() {
		return targetClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetClass(EClass newTargetClass) {
		EClass oldTargetClass = targetClass;
		targetClass = newTargetClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__TARGET_CLASS, oldTargetClass, targetClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, CommandPackage.TRANSFORMATION__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Query> getUsedQueries() {
		if (usedQueries == null) {
			usedQueries = new EObjectContainmentEList<Query>(Query.class, this, CommandPackage.TRANSFORMATION__USED_QUERIES);
		}
		return usedQueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInit() {
		return isInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInit(boolean newIsInit) {
		boolean oldIsInit = isInit;
		isInit = newIsInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.TRANSFORMATION__IS_INIT, oldIsInit, isInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommandPackage.TRANSFORMATION__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
			case CommandPackage.TRANSFORMATION__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case CommandPackage.TRANSFORMATION__USED_QUERIES:
				return ((InternalEList<?>)getUsedQueries()).basicRemove(otherEnd, msgs);
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
			case CommandPackage.TRANSFORMATION__NAME:
				return getName();
			case CommandPackage.TRANSFORMATION__UNITS:
				return getUnits();
			case CommandPackage.TRANSFORMATION__MAIN_UNIT:
				if (resolve) return getMainUnit();
				return basicGetMainUnit();
			case CommandPackage.TRANSFORMATION__ROLE_NAME:
				return getRoleName();
			case CommandPackage.TRANSFORMATION__TARGET_CLASS:
				if (resolve) return getTargetClass();
				return basicGetTargetClass();
			case CommandPackage.TRANSFORMATION__CONSTRAINTS:
				return getConstraints();
			case CommandPackage.TRANSFORMATION__USED_QUERIES:
				return getUsedQueries();
			case CommandPackage.TRANSFORMATION__DOCUMENTATION:
				return getDocumentation();
			case CommandPackage.TRANSFORMATION__IS_INIT:
				return isIsInit();
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
			case CommandPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case CommandPackage.TRANSFORMATION__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case CommandPackage.TRANSFORMATION__MAIN_UNIT:
				setMainUnit((Unit)newValue);
				return;
			case CommandPackage.TRANSFORMATION__ROLE_NAME:
				setRoleName((String)newValue);
				return;
			case CommandPackage.TRANSFORMATION__TARGET_CLASS:
				setTargetClass((EClass)newValue);
				return;
			case CommandPackage.TRANSFORMATION__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CommandPackage.TRANSFORMATION__USED_QUERIES:
				getUsedQueries().clear();
				getUsedQueries().addAll((Collection<? extends Query>)newValue);
				return;
			case CommandPackage.TRANSFORMATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CommandPackage.TRANSFORMATION__IS_INIT:
				setIsInit((Boolean)newValue);
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
			case CommandPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommandPackage.TRANSFORMATION__UNITS:
				getUnits().clear();
				return;
			case CommandPackage.TRANSFORMATION__MAIN_UNIT:
				setMainUnit((Unit)null);
				return;
			case CommandPackage.TRANSFORMATION__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
				return;
			case CommandPackage.TRANSFORMATION__TARGET_CLASS:
				setTargetClass((EClass)null);
				return;
			case CommandPackage.TRANSFORMATION__CONSTRAINTS:
				getConstraints().clear();
				return;
			case CommandPackage.TRANSFORMATION__USED_QUERIES:
				getUsedQueries().clear();
				return;
			case CommandPackage.TRANSFORMATION__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CommandPackage.TRANSFORMATION__IS_INIT:
				setIsInit(IS_INIT_EDEFAULT);
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
			case CommandPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommandPackage.TRANSFORMATION__UNITS:
				return units != null && !units.isEmpty();
			case CommandPackage.TRANSFORMATION__MAIN_UNIT:
				return mainUnit != null;
			case CommandPackage.TRANSFORMATION__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
			case CommandPackage.TRANSFORMATION__TARGET_CLASS:
				return targetClass != null;
			case CommandPackage.TRANSFORMATION__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case CommandPackage.TRANSFORMATION__USED_QUERIES:
				return usedQueries != null && !usedQueries.isEmpty();
			case CommandPackage.TRANSFORMATION__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case CommandPackage.TRANSFORMATION__IS_INIT:
				return isInit != IS_INIT_EDEFAULT;
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
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", isInit: ");
		result.append(isInit);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
