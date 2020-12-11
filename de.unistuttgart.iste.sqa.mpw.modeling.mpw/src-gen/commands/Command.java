/**
 */
package commands;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the basic type for PrimitiveCommand or CompositeCommand which represent behavior which can be executed. It provides the ability to: execute, undo or redo.
 * 
 * Commands are processed in context of an Actor or the Stage.
 * <!-- end-model-doc -->
 *
 *
 * @see commands.CommandPackage#getCommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Command extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

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

} // Command
