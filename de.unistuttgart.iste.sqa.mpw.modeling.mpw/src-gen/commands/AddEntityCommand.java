/**
 */
package commands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Entity Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A primitive command which adds an entity to a collection property.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commands.AddEntityCommand#getEntityToAdd <em>Entity To Add</em>}</li>
 * </ul>
 *
 * @see commands.CommandPackage#getAddEntityCommand()
 * @model
 * @generated
 */
public interface AddEntityCommand extends PrimitiveCommand {
	/**
	 * Returns the value of the '<em><b>Entity To Add</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To Add</em>' reference.
	 * @see #setEntityToAdd(Entity)
	 * @see commands.CommandPackage#getAddEntityCommand_EntityToAdd()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntityToAdd();

	/**
	 * Sets the value of the '{@link commands.AddEntityCommand#getEntityToAdd <em>Entity To Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity To Add</em>' reference.
	 * @see #getEntityToAdd()
	 * @generated
	 */
	void setEntityToAdd(Entity value);

} // AddEntityCommand
