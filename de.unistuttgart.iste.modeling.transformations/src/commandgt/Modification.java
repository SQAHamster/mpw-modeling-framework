/**
 */
package commandgt;

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
 *   <li>{@link commandgt.Modification#getReference <em>Reference</em>}</li>
 *   <li>{@link commandgt.Modification#getInstance <em>Instance</em>}</li>
 *   <li>{@link commandgt.Modification#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see commandgt.CommandgtPackage#getModification()
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
	 * @see commandgt.CommandgtPackage#getModification_Reference()
	 * @model
	 * @generated
	 */
	ReferenceCondition getReference();

	/**
	 * Sets the value of the '{@link commandgt.Modification#getReference <em>Reference</em>}' reference.
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
	 * @see commandgt.CommandgtPackage#getModification_Instance()
	 * @model
	 * @generated
	 */
	InstanceCondition getInstance();

	/**
	 * Sets the value of the '{@link commandgt.Modification#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(InstanceCondition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The default value is <code>"CREATE"</code>.
	 * The literals are from the enumeration {@link commandgt.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see commandgt.Action
	 * @see #setAction(Action)
	 * @see commandgt.CommandgtPackage#getModification_Action()
	 * @model default="CREATE" required="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link commandgt.Modification#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see commandgt.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Modification
