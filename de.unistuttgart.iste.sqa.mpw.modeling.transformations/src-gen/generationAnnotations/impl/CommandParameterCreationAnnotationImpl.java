/**
 */
package generationAnnotations.impl;

import commandBehavior.Transformation;

import generationAnnotations.CommandParameterCreationAnnotation;
import generationAnnotations.GenerationAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Parameter Creation Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.CommandParameterCreationAnnotationImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link generationAnnotations.impl.CommandParameterCreationAnnotationImpl#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link generationAnnotations.impl.CommandParameterCreationAnnotationImpl#getParametersVariableName <em>Parameters Variable Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandParameterCreationAnnotationImpl extends GenerationAnnotationImpl implements CommandParameterCreationAnnotation {
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
	 * The cached value of the '{@link #getParameterMappings() <em>Parameter Mappings</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterMappings()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> parameterMappings;

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
	protected CommandParameterCreationAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.COMMAND_PARAMETER_CREATION_ANNOTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND, oldCommand, command));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getParameterMappings() {
		if (parameterMappings == null) {
			parameterMappings = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS);
		}
		return parameterMappings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME, oldParametersVariableName, parametersVariableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS:
				return ((InternalEList<?>)getParameterMappings()).basicRemove(otherEnd, msgs);
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
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND:
				if (resolve) return getCommand();
				return basicGetCommand();
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS:
				if (coreType) return getParameterMappings();
				else return getParameterMappings().map();
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME:
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
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND:
				setCommand((Transformation)newValue);
				return;
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS:
				((EStructuralFeature.Setting)getParameterMappings()).set(newValue);
				return;
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME:
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
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND:
				setCommand((Transformation)null);
				return;
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS:
				getParameterMappings().clear();
				return;
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME:
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
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND:
				return command != null;
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS:
				return parameterMappings != null && !parameterMappings.isEmpty();
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME:
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
		result.append(" (parametersVariableName: ");
		result.append(parametersVariableName);
		result.append(')');
		return result.toString();
	}

} //CommandParameterCreationAnnotationImpl
