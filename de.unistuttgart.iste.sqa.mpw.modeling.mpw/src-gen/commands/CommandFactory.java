/**
 */
package commands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see commands.CommandPackage
 * @generated
 */
public interface CommandFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandFactory eINSTANCE = commands.impl.CommandFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Set Property Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Property Command</em>'.
	 * @generated
	 */
	SetPropertyCommand createSetPropertyCommand();

	/**
	 * Returns a new object of class '<em>Add Entity Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Entity Command</em>'.
	 * @generated
	 */
	AddEntityCommand createAddEntityCommand();

	/**
	 * Returns a new object of class '<em>Remove Entity Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Entity Command</em>'.
	 * @generated
	 */
	RemoveEntityCommand createRemoveEntityCommand();

	/**
	 * Returns a new object of class '<em>Stack</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack</em>'.
	 * @generated
	 */
	CommandStack createCommandStack();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommandPackage getCommandPackage();

} //CommandFactory
