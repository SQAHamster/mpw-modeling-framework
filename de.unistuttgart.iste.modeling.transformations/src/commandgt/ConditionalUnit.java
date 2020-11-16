/**
 */
package commandgt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandgt.ConditionalUnit#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getConditionalUnit()
 * @model
 * @generated
 */
public interface ConditionalUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getConditionalUnit_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

} // ConditionalUnit
