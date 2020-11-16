/**
 */
package commandgt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandgt.Invocation#getTargetMethodName <em>Target Method Name</em>}</li>
 *   <li>{@link commandgt.Invocation#getMappedParameters <em>Mapped Parameters</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getInvocation()
 * @model
 * @generated
 */
public interface Invocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Method Name</em>' attribute.
	 * @see #setTargetMethodName(String)
	 * @see commandgt.CommandgtPackage#getInvocation_TargetMethodName()
	 * @model required="true"
	 * @generated
	 */
	String getTargetMethodName();

	/**
	 * Sets the value of the '{@link commandgt.Invocation#getTargetMethodName <em>Target Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Method Name</em>' attribute.
	 * @see #getTargetMethodName()
	 * @generated
	 */
	void setTargetMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Mapped Parameters</b></em>' reference list.
	 * The list contents are of type {@link commandgt.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Parameters</em>' reference list.
	 * @see commandgt.CommandgtPackage#getInvocation_MappedParameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getMappedParameters();

} // Invocation
