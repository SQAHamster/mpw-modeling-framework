/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.ImportTypeAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Type Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.impl.ImportTypeAnnotationImpl#getRelativeQualifiedTypeName <em>Relative Qualified Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportTypeAnnotationImpl extends GenerationAnnotationImpl implements ImportTypeAnnotation {
	/**
	 * The default value of the '{@link #getRelativeQualifiedTypeName() <em>Relative Qualified Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeQualifiedTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_QUALIFIED_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeQualifiedTypeName() <em>Relative Qualified Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeQualifiedTypeName()
	 * @generated
	 * @ordered
	 */
	protected String relativeQualifiedTypeName = RELATIVE_QUALIFIED_TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportTypeAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.IMPORT_TYPE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelativeQualifiedTypeName() {
		return relativeQualifiedTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeQualifiedTypeName(String newRelativeQualifiedTypeName) {
		String oldRelativeQualifiedTypeName = relativeQualifiedTypeName;
		relativeQualifiedTypeName = newRelativeQualifiedTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME, oldRelativeQualifiedTypeName, relativeQualifiedTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME:
				return getRelativeQualifiedTypeName();
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
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME:
				setRelativeQualifiedTypeName((String)newValue);
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
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME:
				setRelativeQualifiedTypeName(RELATIVE_QUALIFIED_TYPE_NAME_EDEFAULT);
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
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME:
				return RELATIVE_QUALIFIED_TYPE_NAME_EDEFAULT == null ? relativeQualifiedTypeName != null : !RELATIVE_QUALIFIED_TYPE_NAME_EDEFAULT.equals(relativeQualifiedTypeName);
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
		result.append(" (relativeQualifiedTypeName: ");
		result.append(relativeQualifiedTypeName);
		result.append(')');
		return result.toString();
	}

} //ImportTypeAnnotationImpl
