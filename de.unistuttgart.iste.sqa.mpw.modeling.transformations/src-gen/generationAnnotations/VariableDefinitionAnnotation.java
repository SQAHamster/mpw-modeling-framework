/**
 */
package generationAnnotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Definition Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.VariableDefinitionAnnotation#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.VariableDefinitionAnnotation#getVariableTypeName <em>Variable Type Name</em>}</li>
 *   <li>{@link generationAnnotations.VariableDefinitionAnnotation#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableDefinitionAnnotation()
 * @model
 * @generated
 */
public interface VariableDefinitionAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableDefinitionAnnotation_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.VariableDefinitionAnnotation#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type Name</em>' attribute.
	 * @see #setVariableTypeName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableDefinitionAnnotation_VariableTypeName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableTypeName();

	/**
	 * Sets the value of the '{@link generationAnnotations.VariableDefinitionAnnotation#getVariableTypeName <em>Variable Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type Name</em>' attribute.
	 * @see #getVariableTypeName()
	 * @generated
	 */
	void setVariableTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(GenerationAnnotation)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getVariableDefinitionAnnotation_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GenerationAnnotation getRhs();

	/**
	 * Sets the value of the '{@link generationAnnotations.VariableDefinitionAnnotation#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(GenerationAnnotation value);

} // VariableDefinitionAnnotation
