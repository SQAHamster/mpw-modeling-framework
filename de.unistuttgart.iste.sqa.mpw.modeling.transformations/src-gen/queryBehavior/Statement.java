/**
 */
package queryBehavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.Statement#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link queryBehavior.Statement#getNext <em>Next</em>}</li>
 *   <li>{@link queryBehavior.Statement#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Name</em>' attribute.
	 * @see #setDebugName(String)
	 * @see queryBehavior.QueryPackage#getStatement_DebugName()
	 * @model
	 * @generated
	 */
	String getDebugName();

	/**
	 * Sets the value of the '{@link queryBehavior.Statement#getDebugName <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Name</em>' attribute.
	 * @see #getDebugName()
	 * @generated
	 */
	void setDebugName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link queryBehavior.Statement#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Statement)
	 * @see queryBehavior.QueryPackage#getStatement_Next()
	 * @see queryBehavior.Statement#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	Statement getNext();

	/**
	 * Sets the value of the '{@link queryBehavior.Statement#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Statement value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link queryBehavior.Statement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Statement)
	 * @see queryBehavior.QueryPackage#getStatement_Previous()
	 * @see queryBehavior.Statement#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Statement getPrevious();

	/**
	 * Sets the value of the '{@link queryBehavior.Statement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Statement value);

} // Statement
