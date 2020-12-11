/**
 */
package generationAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Simple Field Initialization Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation#getField <em>Field</em>}</li>
 *   <li>{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getInlineSimpleFieldInitializationAnnotation()
 * @model
 * @generated
 */
public interface InlineSimpleFieldInitializationAnnotation extends FieldInitializationAnnotation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(EStructuralFeature)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getInlineSimpleFieldInitializationAnnotation_Field()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getField();

	/**
	 * Sets the value of the '{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Input Variable Property Paths</em>' attribute list.
	 * @see generationAnnotations.GenerationAnnotationsPackage#getInlineSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths()
	 * @model
	 * @generated
	 */
	EList<String> getParameterInputVariablePropertyPaths();

} // InlineSimpleFieldInitializationAnnotation
