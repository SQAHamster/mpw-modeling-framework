/**
 */
package commandgt.impl;

import commandgt.CommandgtPackage;
import commandgt.InstanceCondition;
import commandgt.ReferenceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandgt.impl.ReferenceConditionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link commandgt.impl.ReferenceConditionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link commandgt.impl.ReferenceConditionImpl#getReferenceName <em>Reference Name</em>}</li>
 *   <li>{@link commandgt.impl.ReferenceConditionImpl#isIsCreate <em>Is Create</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceConditionImpl extends MinimalEObjectImpl.Container implements ReferenceCondition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected InstanceCondition source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected InstanceCondition target;

	/**
	 * The default value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceName() <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceName()
	 * @generated
	 * @ordered
	 */
	protected String referenceName = REFERENCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean isCreate = IS_CREATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandgtPackage.Literals.REFERENCE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (InstanceCondition)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandgtPackage.REFERENCE_CONDITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(InstanceCondition newSource) {
		InstanceCondition oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.REFERENCE_CONDITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (InstanceCondition)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandgtPackage.REFERENCE_CONDITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(InstanceCondition newTarget) {
		InstanceCondition oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.REFERENCE_CONDITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceName() {
		return referenceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceName(String newReferenceName) {
		String oldReferenceName = referenceName;
		referenceName = newReferenceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.REFERENCE_CONDITION__REFERENCE_NAME, oldReferenceName, referenceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCreate() {
		return isCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCreate(boolean newIsCreate) {
		boolean oldIsCreate = isCreate;
		isCreate = newIsCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandgtPackage.REFERENCE_CONDITION__IS_CREATE, oldIsCreate, isCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandgtPackage.REFERENCE_CONDITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case CommandgtPackage.REFERENCE_CONDITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case CommandgtPackage.REFERENCE_CONDITION__REFERENCE_NAME:
				return getReferenceName();
			case CommandgtPackage.REFERENCE_CONDITION__IS_CREATE:
				return isIsCreate();
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
			case CommandgtPackage.REFERENCE_CONDITION__SOURCE:
				setSource((InstanceCondition)newValue);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__TARGET:
				setTarget((InstanceCondition)newValue);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__REFERENCE_NAME:
				setReferenceName((String)newValue);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__IS_CREATE:
				setIsCreate((Boolean)newValue);
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
			case CommandgtPackage.REFERENCE_CONDITION__SOURCE:
				setSource((InstanceCondition)null);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__TARGET:
				setTarget((InstanceCondition)null);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__REFERENCE_NAME:
				setReferenceName(REFERENCE_NAME_EDEFAULT);
				return;
			case CommandgtPackage.REFERENCE_CONDITION__IS_CREATE:
				setIsCreate(IS_CREATE_EDEFAULT);
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
			case CommandgtPackage.REFERENCE_CONDITION__SOURCE:
				return source != null;
			case CommandgtPackage.REFERENCE_CONDITION__TARGET:
				return target != null;
			case CommandgtPackage.REFERENCE_CONDITION__REFERENCE_NAME:
				return REFERENCE_NAME_EDEFAULT == null ? referenceName != null : !REFERENCE_NAME_EDEFAULT.equals(referenceName);
			case CommandgtPackage.REFERENCE_CONDITION__IS_CREATE:
				return isCreate != IS_CREATE_EDEFAULT;
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
		result.append(" (referenceName: ");
		result.append(referenceName);
		result.append(", isCreate: ");
		result.append(isCreate);
		result.append(')');
		return result.toString();
	}

} //ReferenceConditionImpl
