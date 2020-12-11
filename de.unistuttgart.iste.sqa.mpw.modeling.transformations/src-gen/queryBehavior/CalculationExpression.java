/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.CalculationExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getCalculationExpression()
 * @model
 * @generated
 */
public interface CalculationExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link queryBehavior.CalculationOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see queryBehavior.CalculationOperator
	 * @see #setOperator(CalculationOperator)
	 * @see queryBehavior.QueryPackage#getCalculationExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	CalculationOperator getOperator();

	/**
	 * Sets the value of the '{@link queryBehavior.CalculationExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see queryBehavior.CalculationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(CalculationOperator value);

} // CalculationExpression
