/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Property Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.GetPropertyAnnotation#getField <em>Field</em>}</li>
 *   <li>{@link generationAnnotations.GetPropertyAnnotation#getGetterTypeName <em>Getter Type Name</em>}</li>
 *   <li>{@link generationAnnotations.GetPropertyAnnotation#getGetterOperationName <em>Getter Operation Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyAnnotation()
 * @model
 * @generated
 */
public interface GetPropertyAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(EStructuralFeature)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyAnnotation_Field()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getField();

	/**
	 * Sets the value of the '{@link generationAnnotations.GetPropertyAnnotation#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Getter Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Type Name</em>' attribute.
	 * @see #setGetterTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyAnnotation_GetterTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getGetterTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.GetPropertyAnnotation#getGetterTypeName <em>Getter Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Type Name</em>' attribute.
	 * @see #getGetterTypeName()
	 * @generated
	 */
	void setGetterTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Getter Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Operation Name</em>' attribute.
	 * @see #setGetterOperationName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyAnnotation_GetterOperationName()
	 * @model required="true"
	 * @generated
	 */
	String getGetterOperationName();

	/**
	 * Sets the value of the '{@link generationAnnotations.GetPropertyAnnotation#getGetterOperationName <em>Getter Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Operation Name</em>' attribute.
	 * @see #getGetterOperationName()
	 * @generated
	 */
	void setGetterOperationName(String value);

} // GetPropertyAnnotation
