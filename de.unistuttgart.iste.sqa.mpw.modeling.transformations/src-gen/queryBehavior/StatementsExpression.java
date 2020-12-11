/**
 */
package queryBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statements Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.StatementsExpression#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getStatementsExpression()
 * @model
 * @generated
 */
public interface StatementsExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link queryBehavior.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see queryBehavior.QueryPackage#getStatementsExpression_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // StatementsExpression
