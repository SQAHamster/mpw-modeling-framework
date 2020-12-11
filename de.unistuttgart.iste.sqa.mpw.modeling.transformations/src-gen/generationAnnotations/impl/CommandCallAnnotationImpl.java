/**
 */
package generationAnnotations.impl;

import commandBehavior.Transformation;

import generationAnnotations.CommandCallAnnotation;
import generationAnnotations.GenerationAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.CommandCallAnnotationImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link generationAnnotations.impl.CommandCallAnnotationImpl#getTargetRoleVariableName <em>Target Role Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.CommandCallAnnotationImpl#getParametersVariableName <em>Parameters Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandCallAnnotationImpl extends GenerationAnnotationImpl implements CommandCallAnnotation {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Transformation command;

	/**
	 * The default value of the '{@link #getTargetRoleVariableName() <em>Target Role Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ROLE_VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRoleVariableName() <em>Target Role Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoleVariableName()
	 * @generated
	 * @ordered
	 */
	protected String targetRoleVariableName = TARGET_ROLE_VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParametersVariableName() <em>Parameters Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETERS_VARIABLE_NAME_EDEFAULT = "parameters";

	/**
	 * The cached value of the '{@link #getParametersVariableName() <em>Parameters Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametersVariableName()
	 * @generated
	 * @ordered
	 */
	protected String parametersVariableName = PARAMETERS_VARIABLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandCallAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.COMMAND_CALL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getCommand() {
		if (command != null && command.eIsProxy()) {
			InternalEObject oldCommand = (InternalEObject)command;
			command = (Transformation)eResolveProxy(oldCommand);
			if (command != oldCommand) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND, oldCommand, command));
			}
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(Transformation newCommand) {
		Transformation oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetRoleVariableName() {
		return targetRoleVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRoleVariableName(String newTargetRoleVariableName) {
		String oldTargetRoleVariableName = targetRoleVariableName;
		targetRoleVariableName = newTargetRoleVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME, oldTargetRoleVariableName, targetRoleVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParametersVariableName() {
		return parametersVariableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParametersVariableName(String newParametersVariableName) {
		String oldParametersVariableName = parametersVariableName;
		parametersVariableName = newParametersVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME, oldParametersVariableName, parametersVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME:
				return getTargetRoleVariableName();
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME:
				return getParametersVariableName();
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
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND:
				setCommand((Transformation)newValue);
				return;
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME:
				setTargetRoleVariableName((String)newValue);
				return;
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME:
				setParametersVariableName((String)newValue);
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
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND:
				setCommand((Transformation)null);
				return;
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME:
				setTargetRoleVariableName(TARGET_ROLE_VARIABLE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME:
				setParametersVariableName(PARAMETERS_VARIABLE_NAME_EDEFAULT);
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
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__COMMAND:
				return command != null;
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME:
				return TARGET_ROLE_VARIABLE_NAME_EDEFAULT == null ? targetRoleVariableName != null : !TARGET_ROLE_VARIABLE_NAME_EDEFAULT.equals(targetRoleVariableName);
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME:
				return PARAMETERS_VARIABLE_NAME_EDEFAULT == null ? parametersVariableName != null : !PARAMETERS_VARIABLE_NAME_EDEFAULT.equals(parametersVariableName);
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
		result.append(" (targetRoleVariableName: ");
		result.append(targetRoleVariableName);
		result.append(", parametersVariableName: ");
		result.append(parametersVariableName);
		result.append(')');
		return result.toString();
	}

} //CommandCallAnnotationImpl
