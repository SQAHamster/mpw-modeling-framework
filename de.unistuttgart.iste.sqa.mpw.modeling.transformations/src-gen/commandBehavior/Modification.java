/**
 */
package commandBehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.Modification#getReference <em>Reference</em>}</li>
 *   <li>{@link commandBehavior.Modification#getInstance <em>Instance</em>}</li>
 *   <li>{@link commandBehavior.Modification#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link commandBehavior.Modification#getNewAttributeValue <em>New Attribute Value</em>}</li>
 *   <li>{@link commandBehavior.Modification#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getModification()
 * @model
 * @generated
 */
public interface Modification extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ReferenceCondition)
	 * @see commandBehavior.CommandPackage#getModification_Reference()
	 * @model
	 * @generated
	 */
	ReferenceCondition getReference();

	/**
	 * Sets the value of the '{@link commandBehavior.Modification#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceCondition value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(InstanceCondition)
	 * @see commandBehavior.CommandPackage#getModification_Instance()
	 * @model
	 * @generated
	 */
	InstanceCondition getInstance();

	/**
	 * Sets the value of the '{@link commandBehavior.Modification#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceCondition value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeCondition)
	 * @see commandBehavior.CommandPackage#getModification_Attribute()
	 * @model
	 * @generated
	 */
	AttributeCondition getAttribute();

	/**
	 * Sets the value of the '{@link commandBehavior.Modification#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeCondition value);

	/**
	 * Returns the value of the '<em><b>New Attribute Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Attribute Value</em>' attribute.
	 * @see #setNewAttributeValue(String)
	 * @see commandBehavior.CommandPackage#getModification_NewAttributeValue()
	 * @model
	 * @generated
	 */
	String getNewAttributeValue();

	/**
	 * Sets the value of the '{@link commandBehavior.Modification#getNewAttributeValue <em>New Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Attribute Value</em>' attribute.
	 * @see #getNewAttributeValue()
	 * @generated
	 */
	void setNewAttributeValue(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"CREATE"</code>.
	 * The literals are from the enumeration {@link commandBehavior.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see commandBehavior.Action
	 * @see #setAction(Action)
	 * @see commandBehavior.CommandPackage#getModification_Action()
	 * @model default="CREATE" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link commandBehavior.Modification#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see commandBehavior.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Modification
