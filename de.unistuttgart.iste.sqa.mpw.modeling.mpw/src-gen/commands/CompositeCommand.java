/**
 */
package commands;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A more complex type of commands which makes use of multiple sub-commands. Usually the sub-commands are PrimitiveCommands.
 * 
 * Example Hamster-Simulation: Game commands: Move, PickGrain, PutGrain or TurnLeft. Editor commands: InitTerritory or InitHamster.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commands.CompositeCommand#getSubCommands <em>Sub Commands</em>}</li>
 * </ul>
 *
 * @see commands.CommandPackage#getCompositeCommand()
 * @model abstract="true"
 * @generated
 */
public interface CompositeCommand extends Command {
	/**
	 * Returns the value of the '<em><b>Sub Commands</b></em>' containment reference list.
	 * The list contents are of type {@link commands.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Commands</em>' containment reference list.
	 * @see commands.CommandPackage#getCompositeCommand_SubCommands()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<Command> getSubCommands();

} // CompositeCommand
