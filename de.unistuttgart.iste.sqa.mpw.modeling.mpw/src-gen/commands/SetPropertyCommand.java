/**
 */
package commands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Property Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A primitive command which sets a generic value (Object) to a property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commands.SetPropertyCommand#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link commands.SetPropertyCommand#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see commands.CommandPackage#getSetPropertyCommand()
 * @model
 * @generated
 */
public interface SetPropertyCommand extends PrimitiveCommand {
	/**
	 * Returns the value of the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Value</em>' attribute.
	 * @see #setOldValue(Object)
	 * @see commands.CommandPackage#getSetPropertyCommand_OldValue()
	 * @model dataType="commands.Object"
	 * @generated
	 */
	Object getOldValue();

	/**
	 * Sets the value of the '{@link commands.SetPropertyCommand#getOldValue <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Value</em>' attribute.
	 * @see #getOldValue()
	 * @generated
	 */
	void setOldValue(Object value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(Object)
	 * @see commands.CommandPackage#getSetPropertyCommand_NewValue()
	 * @model dataType="commands.Object"
	 * @generated
	 */
	Object getNewValue();

	/**
	 * Sets the value of the '{@link commands.SetPropertyCommand#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(Object value);

} // SetPropertyCommand
