/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.VariableObjectConstructionAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Object Construction Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.VariableObjectConstructionAnnotationImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.VariableObjectConstructionAnnotationImpl#getConstructorTypeName <em>Constructor Type Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.VariableObjectConstructionAnnotationImpl#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableObjectConstructionAnnotationImpl extends FieldInitializationAnnotationImpl implements VariableObjectConstructionAnnotation {
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
	 * The default value of the '{@link #getConstructorTypeName() <em>Constructor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstructorTypeName() <em>Constructor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructorTypeName()
	 * @generated
	 * @ordered
	 */
	protected String constructorTypeName = CONSTRUCTOR_TYPE_NAME_EDEFAULT;

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
	protected VariableObjectConstructionAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstructorTypeName() {
		return constructorTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructorTypeName(String newConstructorTypeName) {
		String oldConstructorTypeName = constructorTypeName;
		constructorTypeName = newConstructorTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME, oldConstructorTypeName, constructorTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterInputVariablePropertyPaths() {
		if (parameterInputVariablePropertyPaths == null) {
			parameterInputVariablePropertyPaths = new EDataTypeUniqueEList<String>(String.class, this, GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);
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
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME:
				return getVariableName();
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME:
				return getConstructorTypeName();
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME:
				setConstructorTypeName((String)newValue);
				return;
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME:
				setConstructorTypeName(CONSTRUCTOR_TYPE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME:
				return CONSTRUCTOR_TYPE_NAME_EDEFAULT == null ? constructorTypeName != null : !CONSTRUCTOR_TYPE_NAME_EDEFAULT.equals(constructorTypeName);
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
		result.append(", constructorTypeName: ");
		result.append(constructorTypeName);
		result.append(", parameterInputVariablePropertyPaths: ");
		result.append(parameterInputVariablePropertyPaths);
		result.append(')');
		return result.toString();
	}

} //VariableObjectConstructionAnnotationImpl
