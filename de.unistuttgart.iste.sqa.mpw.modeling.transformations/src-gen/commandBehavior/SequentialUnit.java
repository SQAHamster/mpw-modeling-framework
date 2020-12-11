/**
 */
package commandBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequential Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.SequentialUnit#getTargetInvocations <em>Target Invocations</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getSequentialUnit()
 * @model
 * @generated
 */
public interface SequentialUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Target Invocations</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.Invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Invocations</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getSequentialUnit_TargetInvocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invocation> getTargetInvocations();

} // SequentialUnit
