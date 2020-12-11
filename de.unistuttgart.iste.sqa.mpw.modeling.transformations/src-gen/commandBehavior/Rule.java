/**
 */
package commandBehavior;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.Rule#getThisInstance <em>This Instance</em>}</li>
 *   <li>{@link commandBehavior.Rule#getInstanceConditions <em>Instance Conditions</em>}</li>
 *   <li>{@link commandBehavior.Rule#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link commandBehavior.Rule#getReferenceConditions <em>Reference Conditions</em>}</li>
 *   <li>{@link commandBehavior.Rule#getAttributeConditions <em>Attribute Conditions</em>}</li>
 *   <li>{@link commandBehavior.Rule#getModifications <em>Modifications</em>}</li>
 *   <li>{@link commandBehavior.Rule#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Unit {
	/**
	 * Returns the value of the '<em><b>This Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This Instance</em>' reference.
	 * @see #setThisInstance(InstanceCondition)
	 * @see commandBehavior.CommandPackage#getRule_ThisInstance()
	 * @model required="true"
	 * @generated
	 */
	InstanceCondition getThisInstance();

	/**
	 * Sets the value of the '{@link commandBehavior.Rule#getThisInstance <em>This Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Instance</em>' reference.
	 * @see #getThisInstance()
	 * @generated
	 */
	void setThisInstance(InstanceCondition value);

	/**
	 * Returns the value of the '<em><b>Instance Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.InstanceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Conditions</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_InstanceConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceCondition> getInstanceConditions();

	/**
	 * Returns the value of the '<em><b>Variable Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignments</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_VariableAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getVariableAssignments();

	/**
	 * Returns the value of the '<em><b>Reference Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.ReferenceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Conditions</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_ReferenceConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceCondition> getReferenceConditions();

	/**
	 * Returns the value of the '<em><b>Attribute Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.AttributeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Conditions</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_AttributeConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeCondition> getAttributeConditions();

	/**
	 * Returns the value of the '<em><b>Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.Modification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifications</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_Modifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modification> getModifications();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getRule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariables();

} // Rule
