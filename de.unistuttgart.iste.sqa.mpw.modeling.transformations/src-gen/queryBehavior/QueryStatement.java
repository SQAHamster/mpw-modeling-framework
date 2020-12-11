/**
 */
package queryBehavior;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.QueryStatement#getQuery <em>Query</em>}</li>
 *   <li>{@link queryBehavior.QueryStatement#getParameterNames <em>Parameter Names</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getQueryStatement()
 * @model
 * @generated
 */
public interface QueryStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' reference.
	 * @see #setQuery(Query)
	 * @see queryBehavior.QueryPackage#getQueryStatement_Query()
	 * @model required="true"
	 * @generated
	 */
	Query getQuery();

	/**
	 * Sets the value of the '{@link queryBehavior.QueryStatement#getQuery <em>Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(Query value);

	/**
	 * Returns the value of the '<em><b>Parameter Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Names</em>' attribute list.
	 * @see queryBehavior.QueryPackage#getQueryStatement_ParameterNames()
	 * @model
	 * @generated
	 */
	EList<String> getParameterNames();

} // QueryStatement
