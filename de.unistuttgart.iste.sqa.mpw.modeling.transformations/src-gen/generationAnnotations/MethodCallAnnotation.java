/**
 */
package generationAnnotations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Call Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link generationAnnotations.MethodCallAnnotation#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link generationAnnotations.MethodCallAnnotation#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link generationAnnotations.MethodCallAnnotation#getParameterInputVariablePropertyPaths <em>Parameter Input Variable Property Paths</em>}</li>
 * </ul>
 *
 * @see generationAnnotations.GenerationAnnotationsPackage#getMethodCallAnnotation()
 * @model
 * @generated
 */
public interface MethodCallAnnotation extends GenerationAnnotation {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getMethodCallAnnotation_VariableName()
	 * @model required="true"
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link generationAnnotations.MethodCallAnnotation#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see generationAnnotations.GenerationAnnotationsPackage#getMethodCallAnnotation_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link generationAnnotations.MethodCallAnnotation#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Input Variable Property Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Input Variable Property Paths</em>' attribute list.
	 * @see generationAnnotations.GenerationAnnotationsPackage#getMethodCallAnnotation_ParameterInputVariablePropertyPaths()
	 * @model
	 * @generated
	 */
	EList<String> getParameterInputVariablePropertyPaths();

} // MethodCallAnnotation
