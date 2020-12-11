/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.CompareExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getCompareExpression()
 * @model
 * @generated
 */
public interface CompareExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link queryBehavior.CompareOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see queryBehavior.CompareOperator
	 * @see #setOperator(CompareOperator)
	 * @see queryBehavior.QueryPackage#getCompareExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	CompareOperator getOperator();

	/**
	 * Sets the value of the '{@link queryBehavior.CompareExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see queryBehavior.CompareOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CompareOperator value);

} // CompareExpression
