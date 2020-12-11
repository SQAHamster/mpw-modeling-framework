/**
 */
package generationAnnotations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Object Construction Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.VariableObjectConstructionAnnotation#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.VariableObjectConstructionAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}</li>
 *   <li>{@link generationAnnotations.VariableObjectConstructionAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableObjectConstructionAnnotation()
 * @model
 * @generated
 */
public interface VariableObjectConstructionAnnotation extends FieldInitializationAnnotation {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableObjectConstructionAnnotation_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.VariableObjectConstructionAnnotation#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Constructor Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor Type Name</em>' attribute.
	 * @see #setConstructorTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableObjectConstructionAnnotation_ConstructorTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getConstructorTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.VariableObjectConstructionAnnotation#getConstructorTypeName <em>Constructor Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor Type Name</em>' attribute.
	 * @see #getConstructorTypeName()
	 * @generated
	 */
	void setConstructorTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Input Variable Property Paths</em>' attribute list.
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableObjectConstructionAnnotation_ParameterInputVariablePropertyPaths()
	 * @model
	 * @generated
	 */
	EList<String> getParameterInputVariablePropertyPaths();

} // VariableObjectConstructionAnnotation
