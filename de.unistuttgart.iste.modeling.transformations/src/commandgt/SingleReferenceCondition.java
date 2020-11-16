/**
 */
package commandgt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Reference Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandgt.SingleReferenceCondition#isIsForbid <em>Is Forbid</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getSingleReferenceCondition()
 * @model
 * @generated
 */
public interface SingleReferenceCondition extends ReferenceCondition {
	/**
	 * Returns the value of the '<em><b>Is Forbid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Forbid</em>' attribute.
	 * @see #setIsForbid(boolean)
	 * @see commandgt.CommandgtPackage#getSingleReferenceCondition_IsForbid()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsForbid();

	/**
	 * Sets the value of the '{@link commandgt.SingleReferenceCondition#isIsForbid <em>Is Forbid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Forbid</em>' attribute.
	 * @see #isIsForbid()
	 * @generated
	 */
	void setIsForbid(boolean value);

} // SingleReferenceCondition
