/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.GetPropertyDeclarationAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Property Declaration Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl#getFieldTypeName <em>Field Type Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.GetPropertyDeclarationAnnotationImpl#getGetterName <em>Getter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPropertyDeclarationAnnotationImpl extends GenerationAnnotationImpl implements GetPropertyDeclarationAnnotation {
	/**
	 * The default value of the '{@link #getFieldTypeName() <em>Field Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldTypeName() <em>Field Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldTypeName()
	 * @generated
	 * @ordered
	 */
	protected String fieldTypeName = FIELD_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterName() <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterName()
	 * @generated
	 * @ordered
	 */
	protected String getterName = GETTER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPropertyDeclarationAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.GET_PROPERTY_DECLARATION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldTypeName() {
		return fieldTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldTypeName(String newFieldTypeName) {
		String oldFieldTypeName = fieldTypeName;
		fieldTypeName = newFieldTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME, oldFieldTypeName, fieldTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterName() {
		return getterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterName(String newGetterName) {
		String oldGetterName = getterName;
		getterName = newGetterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME, oldGetterName, getterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME:
				return getFieldTypeName();
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME:
				return getGetterName();
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
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME:
				setFieldTypeName((String)newValue);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME:
				setGetterName((String)newValue);
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
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME:
				setFieldTypeName(FIELD_TYPE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME:
				setGetterName(GETTER_NAME_EDEFAULT);
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
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME:
				return FIELD_TYPE_NAME_EDEFAULT == null ? fieldTypeName != null : !FIELD_TYPE_NAME_EDEFAULT.equals(fieldTypeName);
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME:
				return GETTER_NAME_EDEFAULT == null ? getterName != null : !GETTER_NAME_EDEFAULT.equals(getterName);
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
		result.append(" (fieldTypeName: ");
		result.append(fieldTypeName);
		result.append(", getterName: ");
		result.append(getterName);
		result.append(')');
		return result.toString();
	}

} //GetPropertyDeclarationAnnotationImpl
