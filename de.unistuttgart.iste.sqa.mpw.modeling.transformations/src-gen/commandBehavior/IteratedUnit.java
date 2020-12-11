/**
 */
package commandBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterated Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.IteratedUnit#getRepeat <em>Repeat</em>}</li>
 *   <li>{@link commandBehavior.IteratedUnit#getTargetInvocation <em>Target Invocation</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getIteratedUnit()
 * @model
 * @generated
 */
public interface IteratedUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat</em>' attribute.
	 * @see #setRepeat(String)
	 * @see commandBehavior.CommandPackage#getIteratedUnit_Repeat()
	 * @model
	 * @generated
	 */
	String getRepeat();

	/**
	 * Sets the value of the '{@link commandBehavior.IteratedUnit#getRepeat <em>Repeat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat</em>' attribute.
	 * @see #getRepeat()
	 * @generated
	 */
	void setRepeat(String value);

	/**
	 * Returns the value of the '<em><b>Target Invocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Invocation</em>' containment reference.
	 * @see #setTargetInvocation(Invocation)
	 * @see commandBehavior.CommandPackage#getIteratedUnit_TargetInvocation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Invocation getTargetInvocation();

	/**
	 * Sets the value of the '{@link commandBehavior.IteratedUnit#getTargetInvocation <em>Target Invocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Invocation</em>' containment reference.
	 * @see #getTargetInvocation()
	 * @generated
	 */
	void setTargetInvocation(Invocation value);

} // IteratedUnit
