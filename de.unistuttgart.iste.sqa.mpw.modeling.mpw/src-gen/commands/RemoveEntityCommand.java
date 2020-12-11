/**
 */
package commands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Entity Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A primitive command which removes an entity from a collection property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commands.RemoveEntityCommand#getEntityToRemove <em>Entity To Remove</em>}</li>
 * </ul>
 *
 * @see commands.CommandPackage#getRemoveEntityCommand()
 * @model
 * @generated
 */
public interface RemoveEntityCommand extends PrimitiveCommand {
	/**
	 * Returns the value of the '<em><b>Entity To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To Remove</em>' reference.
	 * @see #setEntityToRemove(Entity)
	 * @see commands.CommandPackage#getRemoveEntityCommand_EntityToRemove()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntityToRemove();

	/**
	 * Sets the value of the '{@link commands.RemoveEntityCommand#getEntityToRemove <em>Entity To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity To Remove</em>' reference.
	 * @see #getEntityToRemove()
	 * @generated
	 */
	void setEntityToRemove(Entity value);

} // RemoveEntityCommand
