/**
 */
package commandgt;

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
 *   <li>{@link commandgt.Rule#getThisInstance <em>This Instance</em>}</li>
 *   <li>{@link commandgt.Rule#getInstanceConditions <em>Instance Conditions</em>}</li>
 *   <li>{@link commandgt.Rule#getVariableAssignments <em>Variable Assignments</em>}</li>
 *   <li>{@link commandgt.Rule#getReferenceConditions <em>Reference Conditions</em>}</li>
 *   <li>{@link commandgt.Rule#getAttributeConditions <em>Attribute Conditions</em>}</li>
 *   <li>{@link commandgt.Rule#getModifications <em>Modifications</em>}</li>
 *   <li>{@link commandgt.Rule#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getRule()
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
	 * @see commandgt.CommandgtPackage#getRule_ThisInstance()
	 * @model required="true"
	 * @generated
	 */
	InstanceCondition getThisInstance();

	/**
	 * Sets the value of the '{@link commandgt.Rule#getThisInstance <em>This Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This Instance</em>' reference.
	 * @see #getThisInstance()
	 * @generated
	 */
	void setThisInstance(InstanceCondition value);

	/**
	 * Returns the value of the '<em><b>Instance Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.InstanceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Conditions</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_InstanceConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceCondition> getInstanceConditions();

	/**
	 * Returns the value of the '<em><b>Variable Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.AttributeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Assignments</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_VariableAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeCondition> getVariableAssignments();

	/**
	 * Returns the value of the '<em><b>Reference Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.ReferenceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Conditions</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_ReferenceConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReferenceCondition> getReferenceConditions();

	/**
	 * Returns the value of the '<em><b>Attribute Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.AttributeCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Conditions</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_AttributeConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeCondition> getAttributeConditions();

	/**
	 * Returns the value of the '<em><b>Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.Modification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifications</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_Modifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modification> getModifications();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link commandgt.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see commandgt.CommandgtPackage#getRule_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getVariables();

} // Rule
