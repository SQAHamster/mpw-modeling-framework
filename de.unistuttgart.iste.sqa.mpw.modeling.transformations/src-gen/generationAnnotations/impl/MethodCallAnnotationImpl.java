/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.MethodCallAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.MethodCallAnnotationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.MethodCallAnnotationImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.MethodCallAnnotationImpl#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodCallAnnotationImpl extends GenerationAnnotationImpl implements MethodCallAnnotation {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterInputVariablePropertyPaths() <em>Parameter Input Variable Property Paths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterInputVariablePropertyPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameterInputVariablePropertyPaths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodCallAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.METHOD_CALL_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterInputVariablePropertyPaths() {
		if (parameterInputVariablePropertyPaths == null) {
			parameterInputVariablePropertyPaths = new EDataTypeUniqueEList<String>(String.class, this, GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);
		}
		return parameterInputVariablePropertyPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__VARIABLE_NAME:
				return getVariableName();
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__METHOD_NAME:
				return getMethodName();
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
				return getParameterInputVariablePropertyPaths();
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
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
				getParameterInputVariablePropertyPaths().clear();
				getParameterInputVariablePropertyPaths().addAll((Collection<? extends String>)newValue);
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
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
				getParameterInputVariablePropertyPaths().clear();
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
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
				return parameterInputVariablePropertyPaths != null && !parameterInputVariablePropertyPaths.isEmpty();
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", methodName: ");
		result.append(methodName);
		result.append(", parameterInputVariablePropertyPaths: ");
		result.append(parameterInputVariablePropertyPaths);
		result.append(')');
		return result.toString();
	}

} //MethodCallAnnotationImpl
