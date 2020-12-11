/**
 */
package generationAnnotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Path Field Assignment Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.PropertyPathFieldAssignmentAnnotation#getPropertyPath <em>Property Path</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getPropertyPathFieldAssignmentAnnotation()
 * @model
 * @generated
 */
public interface PropertyPathFieldAssignmentAnnotation extends FieldAssignmentAnnotation {
	/**
	 * Returns the value of the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Path</em>' attribute.
	 * @see #setPropertyPath(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getPropertyPathFieldAssignmentAnnotation_PropertyPath()
	 * @model required="true"
	 * @generated
	 */
	String getPropertyPath();

	/**
	 * Sets the value of the '{@link generationAnnotations.PropertyPathFieldAssignmentAnnotation#getPropertyPath <em>Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Path</em>' attribute.
	 * @see #getPropertyPath()
	 * @generated
	 */
	void setPropertyPath(String value);

} // PropertyPathFieldAssignmentAnnotation
