/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Usage Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.VariableUsageStatement#getVariableReference <em>Variable Reference</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getVariableUsageStatement()
 * @model
 * @generated
 */
public interface VariableUsageStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Reference</em>' reference.
	 * @see #setVariableReference(VariableExpression)
	 * @see queryBehavior.QueryPackage#getVariableUsageStatement_VariableReference()
	 * @model required="true"
	 * @generated
	 */
	VariableExpression getVariableReference();

	/**
	 * Sets the value of the '{@link queryBehavior.VariableUsageStatement#getVariableReference <em>Variable Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Reference</em>' reference.
	 * @see #getVariableReference()
	 * @generated
	 */
	void setVariableReference(VariableExpression value);

} // VariableUsageStatement
