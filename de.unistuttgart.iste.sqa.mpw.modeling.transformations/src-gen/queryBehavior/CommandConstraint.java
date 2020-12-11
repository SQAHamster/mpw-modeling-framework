/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.CommandConstraint#getCommandName <em>Command Name</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getCommandConstraint()
 * @model
 * @generated
 */
public interface CommandConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Command Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Name</em>' attribute.
	 * @see #setCommandName(String)
	 * @see queryBehavior.QueryPackage#getCommandConstraint_CommandName()
	 * @model required="true"
	 * @generated
	 */
	String getCommandName();

	/**
	 * Sets the value of the '{@link queryBehavior.CommandConstraint#getCommandName <em>Command Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Name</em>' attribute.
	 * @see #getCommandName()
	 * @generated
	 */
	void setCommandName(String value);

} // CommandConstraint
