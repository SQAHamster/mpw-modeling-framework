/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.InlineSimpleFieldInitializationAnnotation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Simple Field Initialization Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl#getField <em>Field</em>}</li>
 *   <li>{@link generationAnnotations.impl.InlineSimpleFieldInitializationAnnotationImpl#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineSimpleFieldInitializationAnnotationImpl extends FieldInitializationAnnotationImpl implements InlineSimpleFieldInitializationAnnotation {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature field;

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
	protected InlineSimpleFieldInitializationAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (EStructuralFeature)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(EStructuralFeature newField) {
		EStructuralFeature oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameterInputVariablePropertyPaths() {
		if (parameterInputVariablePropertyPaths == null) {
			parameterInputVariablePropertyPaths = new EDataTypeUniqueEList<String>(String.class, this, GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);
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
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD:
				setField((EStructuralFeature)newValue);
				return;
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD:
				setField((EStructuralFeature)null);
				return;
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD:
				return field != null;
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS:
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
		result.append(" (parameterInputVariablePropertyPaths: ");
		result.append(parameterInputVariablePropertyPaths);
		result.append(')');
		return result.toString();
	}

} //InlineSimpleFieldInitializationAnnotationImpl
