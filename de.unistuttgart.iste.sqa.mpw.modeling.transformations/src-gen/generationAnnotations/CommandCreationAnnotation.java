/**
 */
package generationAnnotations;

import commandBehavior.Transformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Creation Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.CommandCreationAnnotation#getCommand <em>Command</em>}</li>
 *   <li>{@link generationAnnotations.CommandCreationAnnotation#getCommandVariableName <em>Command Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.CommandCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCreationAnnotation()
 * @model
 * @generated
 */
public interface CommandCreationAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Transformation)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCreationAnnotation_Command()
	 * @model required="true"
	 * @generated
	 */
	Transformation getCommand();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCreationAnnotation#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Transformation value);

	/**
	 * Returns the value of the '<em><b>Command Variable Name</b></em>' attribute.
	 * The default value is <code>"command"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Variable Name</em>' attribute.
	 * @see #setCommandVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCreationAnnotation_CommandVariableName()
	 * @model default="command" required="true"
	 * @generated
	 */
	String getCommandVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCreationAnnotation#getCommandVariableName <em>Command Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Variable Name</em>' attribute.
	 * @see #getCommandVariableName()
	 * @generated
	 */
	void setCommandVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * The default value is <code>"parameters"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #setParametersVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCreationAnnotation_ParametersVariableName()
	 * @model default="parameters" required="true"
	 * @generated
	 */
	String getParametersVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #getParametersVariableName()
	 * @generated
	 */
	void setParametersVariableName(String value);

} // CommandCreationAnnotation
