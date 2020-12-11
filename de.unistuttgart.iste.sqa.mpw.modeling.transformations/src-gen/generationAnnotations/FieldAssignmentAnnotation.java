/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Assignment Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.FieldAssignmentAnnotation#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getFieldAssignmentAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface FieldAssignmentAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(EStructuralFeature)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getFieldAssignmentAnnotation_Field()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getField();

	/**
	 * Sets the value of the '{@link generationAnnotations.FieldAssignmentAnnotation#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(EStructuralFeature value);

} // FieldAssignmentAnnotation
