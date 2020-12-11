/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.GetPropertyAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Property Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.GetPropertyAnnotationImpl#getField <em>Field</em>}</li>
 *   <li>{@link generationAnnotations.impl.GetPropertyAnnotationImpl#getGetterTypeName <em>Getter Type Name</em>}</li>
 *   <li>{@link generationAnnotations.impl.GetPropertyAnnotationImpl#getGetterOperationName <em>Getter Operation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPropertyAnnotationImpl extends GenerationAnnotationImpl implements GetPropertyAnnotation {
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
	 * The default value of the '{@link #getGetterTypeName() <em>Getter Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterTypeName() <em>Getter Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterTypeName()
	 * @generated
	 * @ordered
	 */
	protected String getterTypeName = GETTER_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGetterOperationName() <em>Getter Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String GETTER_OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGetterOperationName() <em>Getter Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetterOperationName()
	 * @generated
	 * @ordered
	 */
	protected String getterOperationName = GETTER_OPERATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetPropertyAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.GET_PROPERTY_ANNOTATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD, oldField, field));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterTypeName() {
		return getterTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterTypeName(String newGetterTypeName) {
		String oldGetterTypeName = getterTypeName;
		getterTypeName = newGetterTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME, oldGetterTypeName, getterTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGetterOperationName() {
		return getterOperationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetterOperationName(String newGetterOperationName) {
		String oldGetterOperationName = getterOperationName;
		getterOperationName = newGetterOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME, oldGetterOperationName, getterOperationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME:
				return getGetterTypeName();
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME:
				return getGetterOperationName();
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
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD:
				setField((EStructuralFeature)newValue);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME:
				setGetterTypeName((String)newValue);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME:
				setGetterOperationName((String)newValue);
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
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD:
				setField((EStructuralFeature)null);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME:
				setGetterTypeName(GETTER_TYPE_NAME_EDEFAULT);
				return;
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME:
				setGetterOperationName(GETTER_OPERATION_NAME_EDEFAULT);
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
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__FIELD:
				return field != null;
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME:
				return GETTER_TYPE_NAME_EDEFAULT == null ? getterTypeName != null : !GETTER_TYPE_NAME_EDEFAULT.equals(getterTypeName);
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME:
				return GETTER_OPERATION_NAME_EDEFAULT == null ? getterOperationName != null : !GETTER_OPERATION_NAME_EDEFAULT.equals(getterOperationName);
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
		result.append(" (getterTypeName: ");
		result.append(getterTypeName);
		result.append(", getterOperationName: ");
		result.append(getterOperationName);
		result.append(')');
		return result.toString();
	}

} //GetPropertyAnnotationImpl
