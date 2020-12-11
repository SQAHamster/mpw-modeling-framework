/**
 */
package generationAnnotations;

import commandBehavior.Transformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.CommandCallAnnotation#getCommand <em>Command</em>}</li>
 *   <li>{@link generationAnnotations.CommandCallAnnotation#getTargetRoleVariableName <em>Target Role Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.CommandCallAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCallAnnotation()
 * @model
 * @generated
 */
public interface CommandCallAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Transformation)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCallAnnotation_Command()
	 * @model required="true"
	 * @generated
	 */
	Transformation getCommand();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCallAnnotation#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Transformation value);

	/**
	 * Returns the value of the '<em><b>Target Role Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Role Variable Name</em>' attribute.
	 * @see #setTargetRoleVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCallAnnotation_TargetRoleVariableName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetRoleVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCallAnnotation#getTargetRoleVariableName <em>Target Role Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Role Variable Name</em>' attribute.
	 * @see #getTargetRoleVariableName()
	 * @generated
	 */
	void setTargetRoleVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * The default value is <code>"parameters"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #setParametersVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandCallAnnotation_ParametersVariableName()
	 * @model default="parameters" required="true"
	 * @generated
	 */
	String getParametersVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandCallAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #getParametersVariableName()
	 * @generated
	 */
	void setParametersVariableName(String value);

} // CommandCallAnnotation
