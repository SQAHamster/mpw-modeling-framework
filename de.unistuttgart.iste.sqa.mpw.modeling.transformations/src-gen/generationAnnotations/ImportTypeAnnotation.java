/**
 */
package generationAnnotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Type Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.ImportTypeAnnotation#getRelativeQualifiedTypeName <em>Relative Qualified Type Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getImportTypeAnnotation()
 * @model
 * @generated
 */
public interface ImportTypeAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Relative Qualified Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Qualified Type Name</em>' attribute.
	 * @see #setRelativeQualifiedTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getImportTypeAnnotation_RelativeQualifiedTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getRelativeQualifiedTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.ImportTypeAnnotation#getRelativeQualifiedTypeName <em>Relative Qualified Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Qualified Type Name</em>' attribute.
	 * @see #getRelativeQualifiedTypeName()
	 * @generated
	 */
	void setRelativeQualifiedTypeName(String value);

} // ImportTypeAnnotation
