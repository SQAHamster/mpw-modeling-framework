/**
 */
package generationAnnotations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Simple Field Initialization Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getField <em>Field</em>}</li>
 *   <li>{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 *   <li>{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getConstructorSimpleFieldInitializationAnnotation()
 * @model
 * @generated
 */
public interface ConstructorSimpleFieldInitializationAnnotation extends FieldInitializationAnnotation {
	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(EStructuralFeature)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getConstructorSimpleFieldInitializationAnnotation_Field()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getField();

	/**
	 * Sets the value of the '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getField <em>Field</em>}' reference.
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
	 * @see generationAnnotations.GenerationAnnotationsPackage#getConstructorSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths()
	 * @model
	 * @generated
	 */
	EList<String> getParameterInputVariablePropertyPaths();

	/**
	 * Returns the value of the '<em><b>Constructor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Type Name</em>' attribute.
	 * @see #setConstructorTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getConstructorSimpleFieldInitializationAnnotation_ConstructorTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getConstructorTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Type Name</em>' attribute.
	 * @see #getConstructorTypeName()
	 * @generated
	 */
	void setConstructorTypeName(String value);

} // ConstructorSimpleFieldInitializationAnnotation
