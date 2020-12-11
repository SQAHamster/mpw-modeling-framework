/**
 */
package generationAnnotations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Variable To Collection Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.AddVariableToCollectionAnnotation#getCollectionPropertyPath <em>Collection Property Path</em>}</li>
 *   <li>{@link generationAnnotations.AddVariableToCollectionAnnotation#getParameterPropertyPath <em>Parameter Property Path</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getAddVariableToCollectionAnnotation()
 * @model
 * @generated
 */
public interface AddVariableToCollectionAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Collection Property Path</b></em>' attribute.
	 * The default value is <code>"parameters"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Property Path</em>' attribute.
	 * @see #setCollectionPropertyPath(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getAddVariableToCollectionAnnotation_CollectionPropertyPath()
	 * @model default="parameters" required="true"
	 * @generated
	 */
	String getCollectionPropertyPath();

	/**
	 * Sets the value of the '{@link generationAnnotations.AddVariableToCollectionAnnotation#getCollectionPropertyPath <em>Collection Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Property Path</em>' attribute.
	 * @see #getCollectionPropertyPath()
	 * @generated
	 */
	void setCollectionPropertyPath(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Property Path</b></em>' attribute.
	 * The default value is <code>"parameters"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Property Path</em>' attribute.
	 * @see #setParameterPropertyPath(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getAddVariableToCollectionAnnotation_ParameterPropertyPath()
	 * @model default="parameters" required="true"
	 * @generated
	 */
	String getParameterPropertyPath();

	/**
	 * Sets the value of the '{@link generationAnnotations.AddVariableToCollectionAnnotation#getParameterPropertyPath <em>Parameter Property Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Property Path</em>' attribute.
	 * @see #getParameterPropertyPath()
	 * @generated
	 */
	void setParameterPropertyPath(String value);

} // AddVariableToCollectionAnnotation
