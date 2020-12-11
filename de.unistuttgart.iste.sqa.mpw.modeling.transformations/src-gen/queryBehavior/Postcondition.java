/**
 */
package queryBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.Postcondition#getOldValueVariableExpressions <em>Old Value Variable Expressions</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getPostcondition()
 * @model
 * @generated
 */
public interface Postcondition extends CommandConstraint {
	/**
	 * Returns the value of the '<em><b>Old Value Variable Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link queryBehavior.VariableExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value Variable Expressions</em>' containment reference list.
	 * @see queryBehavior.QueryPackage#getPostcondition_OldValueVariableExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableExpression> getOldValueVariableExpressions();

} // Postcondition
