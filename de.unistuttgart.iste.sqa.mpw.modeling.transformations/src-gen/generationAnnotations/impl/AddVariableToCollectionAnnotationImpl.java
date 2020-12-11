/**
 */
package generationAnnotations.impl;

import generationAnnotations.AddVariableToCollectionAnnotation;
import generationAnnotations.GenerationAnnotationsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Variable To Collection Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.AddVariableToCollectionAnnotationImpl#getCollectionPropertyPath <em>Collection Property Path</em>}</li>
 *   <li>{@link generationAnnotations.impl.AddVariableToCollectionAnnotationImpl#getParameterPropertyPath <em>Parameter Property Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddVariableToCollectionAnnotationImpl extends GenerationAnnotationImpl implements AddVariableToCollectionAnnotation {
	/**
	 * The default value of the '{@link #getCollectionPropertyPath() <em>Collection Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLECTION_PROPERTY_PATH_EDEFAULT = "parameters";

	/**
	 * The cached value of the '{@link #getCollectionPropertyPath() <em>Collection Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String collectionPropertyPath = COLLECTION_PROPERTY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterPropertyPath() <em>Parameter Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_PROPERTY_PATH_EDEFAULT = "parameters";

	/**
	 * The cached value of the '{@link #getParameterPropertyPath() <em>Parameter Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPropertyPath()
	 * @generated
	 * @ordered
	 */
	protected String parameterPropertyPath = PARAMETER_PROPERTY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddVariableToCollectionAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.ADD_VARIABLE_TO_COLLECTION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollectionPropertyPath() {
		return collectionPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionPropertyPath(String newCollectionPropertyPath) {
		String oldCollectionPropertyPath = collectionPropertyPath;
		collectionPropertyPath = newCollectionPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH, oldCollectionPropertyPath, collectionPropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterPropertyPath() {
		return parameterPropertyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterPropertyPath(String newParameterPropertyPath) {
		String oldParameterPropertyPath = parameterPropertyPath;
		parameterPropertyPath = newParameterPropertyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH, oldParameterPropertyPath, parameterPropertyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH:
				return getCollectionPropertyPath();
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH:
				return getParameterPropertyPath();
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
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH:
				setCollectionPropertyPath((String)newValue);
				return;
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH:
				setParameterPropertyPath((String)newValue);
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
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH:
				setCollectionPropertyPath(COLLECTION_PROPERTY_PATH_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH:
				setParameterPropertyPath(PARAMETER_PROPERTY_PATH_EDEFAULT);
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
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH:
				return COLLECTION_PROPERTY_PATH_EDEFAULT == null ? collectionPropertyPath != null : !COLLECTION_PROPERTY_PATH_EDEFAULT.equals(collectionPropertyPath);
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH:
				return PARAMETER_PROPERTY_PATH_EDEFAULT == null ? parameterPropertyPath != null : !PARAMETER_PROPERTY_PATH_EDEFAULT.equals(parameterPropertyPath);
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
		result.append(" (collectionPropertyPath: ");
		result.append(collectionPropertyPath);
		result.append(", parameterPropertyPath: ");
		result.append(parameterPropertyPath);
		result.append(')');
		return result.toString();
	}

} //AddVariableToCollectionAnnotationImpl
