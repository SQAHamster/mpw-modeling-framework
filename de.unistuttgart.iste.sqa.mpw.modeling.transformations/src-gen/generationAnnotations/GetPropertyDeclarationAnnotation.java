/**
 */
package generationAnnotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Property Declaration Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.GetPropertyDeclarationAnnotation#getFieldTypeName <em>Field Type Name</em>}</li>
 *   <li>{@link generationAnnotations.GetPropertyDeclarationAnnotation#getGetterName <em>Getter Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyDeclarationAnnotation()
 * @model
 * @generated
 */
public interface GetPropertyDeclarationAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Field Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Type Name</em>' attribute.
	 * @see #setFieldTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyDeclarationAnnotation_FieldTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getFieldTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.GetPropertyDeclarationAnnotation#getFieldTypeName <em>Field Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Type Name</em>' attribute.
	 * @see #getFieldTypeName()
	 * @generated
	 */
	void setFieldTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Getter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Name</em>' attribute.
	 * @see #setGetterName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getGetPropertyDeclarationAnnotation_GetterName()
	 * @model required="true"
	 * @generated
	 */
	String getGetterName();

	/**
	 * Sets the value of the '{@link generationAnnotations.GetPropertyDeclarationAnnotation#getGetterName <em>Getter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Name</em>' attribute.
	 * @see #getGetterName()
	 * @generated
	 */
	void setGetterName(String value);

} // GetPropertyDeclarationAnnotation
