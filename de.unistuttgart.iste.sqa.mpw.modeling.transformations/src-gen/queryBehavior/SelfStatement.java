/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.SelfStatement#getSelfAlias <em>Self Alias</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getSelfStatement()
 * @model
 * @generated
 */
public interface SelfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Self Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Alias</em>' attribute.
	 * @see #setSelfAlias(String)
	 * @see queryBehavior.QueryPackage#getSelfStatement_SelfAlias()
	 * @model required="true"
	 * @generated
	 */
	String getSelfAlias();

	/**
	 * Sets the value of the '{@link queryBehavior.SelfStatement#getSelfAlias <em>Self Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Alias</em>' attribute.
	 * @see #getSelfAlias()
	 * @generated
	 */
	void setSelfAlias(String value);

} // SelfStatement
