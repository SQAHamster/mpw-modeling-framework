/**
 */
package commandBehavior.impl;

import commandBehavior.CommandPackage;
import commandBehavior.Invocation;
import commandBehavior.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.InvocationImpl#getTargetMethodName <em>Target Method Name</em>}</li>
 *   <li>{@link commandBehavior.impl.InvocationImpl#getMappedParameters <em>Mapped Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocationImpl extends MinimalEObjectImpl.Container implements Invocation {
	/**
	 * The default value of the '{@link #getTargetMethodName() <em>Target Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMethodName() <em>Target Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMethodName()
	 * @generated
	 * @ordered
	 */
	protected String targetMethodName = TARGET_METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappedParameters() <em>Mapped Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> mappedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.INVOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMethodName() {
		return targetMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMethodName(String newTargetMethodName) {
		String oldTargetMethodName = targetMethodName;
		targetMethodName = newTargetMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.INVOCATION__TARGET_METHOD_NAME, oldTargetMethodName, targetMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getMappedParameters() {
		if (mappedParameters == null) {
			mappedParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, CommandPackage.INVOCATION__MAPPED_PARAMETERS);
		}
		return mappedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.INVOCATION__TARGET_METHOD_NAME:
				return getTargetMethodName();
			case CommandPackage.INVOCATION__MAPPED_PARAMETERS:
				return getMappedParameters();
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
			case CommandPackage.INVOCATION__TARGET_METHOD_NAME:
				setTargetMethodName((String)newValue);
				return;
			case CommandPackage.INVOCATION__MAPPED_PARAMETERS:
				getMappedParameters().clear();
				getMappedParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case CommandPackage.INVOCATION__TARGET_METHOD_NAME:
				setTargetMethodName(TARGET_METHOD_NAME_EDEFAULT);
				return;
			case CommandPackage.INVOCATION__MAPPED_PARAMETERS:
				getMappedParameters().clear();
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
			case CommandPackage.INVOCATION__TARGET_METHOD_NAME:
				return TARGET_METHOD_NAME_EDEFAULT == null ? targetMethodName != null : !TARGET_METHOD_NAME_EDEFAULT.equals(targetMethodName);
			case CommandPackage.INVOCATION__MAPPED_PARAMETERS:
				return mappedParameters != null && !mappedParameters.isEmpty();
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
		result.append(" (targetMethodName: ");
		result.append(targetMethodName);
		result.append(')');
		return result.toString();
	}

} //InvocationImpl
