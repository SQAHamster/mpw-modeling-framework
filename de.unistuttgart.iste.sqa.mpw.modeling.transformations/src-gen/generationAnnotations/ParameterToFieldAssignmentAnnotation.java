/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter To Field Assignment Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.ParameterToFieldAssignmentAnnotation#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getParameterToFieldAssignmentAnnotation()
 * @model
 * @generated
 */
public interface ParameterToFieldAssignmentAnnotation extends FieldAssignmentAnnotation {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(EParameter)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getParameterToFieldAssignmentAnnotation_Parameter()
	 * @model required="true"
	 * @generated
	 */
	EParameter getParameter();

	/**
	 * Sets the value of the '{@link generationAnnotations.ParameterToFieldAssignmentAnnotation#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(EParameter value);

} // ParameterToFieldAssignmentAnnotation
