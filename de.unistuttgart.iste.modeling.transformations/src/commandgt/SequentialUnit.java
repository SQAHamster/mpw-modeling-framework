/**
 */
package commandgt;

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
 *   <li>{@link commandgt.SequentialUnit#getTargetInvocations <em>Target Invocations</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getSequentialUnit()
 * @model
 * @generated
 */
public interface SequentialUnit extends Unit {
	/**
	 * Returns the value of the '<em><b>Target Invocations</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.Invocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Invocations</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getSequentialUnit_TargetInvocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invocation> getTargetInvocations();

} // SequentialUnit
