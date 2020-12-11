/**
 */
package commands;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tracks the executed Commands which allow to undo and redo their behavior.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commands.CommandStack#getStack <em>Stack</em>}</li>
 * </ul>
 *
 * @see commands.CommandPackage#getCommandStack()
 * @model
 * @generated
 */
public interface CommandStack extends EObject {
	/**
	 * Returns the value of the '<em><b>Stack</b></em>' containment reference list.
	 * The list contents are of type {@link commands.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' containment reference list.
	 * @see commands.CommandPackage#getCommandStack_Stack()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getStack();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute(Command command);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undoAll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redoAll();

} // CommandStack
