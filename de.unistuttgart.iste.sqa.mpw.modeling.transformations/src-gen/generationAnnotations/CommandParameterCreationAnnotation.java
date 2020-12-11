/**
 */
package generationAnnotations;

import commandBehavior.Transformation;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Parameter Creation Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.CommandParameterCreationAnnotation#getCommand <em>Command</em>}</li>
 *   <li>{@link generationAnnotations.CommandParameterCreationAnnotation#getParameterMappings <em>Parameter Mappings</em>}</li>
 *   <li>{@link generationAnnotations.CommandParameterCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandParameterCreationAnnotation()
 * @model
 * @generated
 */
public interface CommandParameterCreationAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(Transformation)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandParameterCreationAnnotation_Command()
	 * @model required="true"
	 * @generated
	 */
	Transformation getCommand();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandParameterCreationAnnotation#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Transformation value);

	/**
	 * Returns the value of the '<em><b>Parameter Mappings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Mappings</em>' map.
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandParameterCreationAnnotation_ParameterMappings()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getParameterMappings();

	/**
	 * Returns the value of the '<em><b>Parameters Variable Name</b></em>' attribute.
	 * The default value is <code>"parameters"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #setParametersVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getCommandParameterCreationAnnotation_ParametersVariableName()
	 * @model default="parameters" required="true"
	 * @generated
	 */
	String getParametersVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.CommandParameterCreationAnnotation#getParametersVariableName <em>Parameters Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters Variable Name</em>' attribute.
	 * @see #getParametersVariableName()
	 * @generated
	 */
	void setParametersVariableName(String value);

} // CommandParameterCreationAnnotation
