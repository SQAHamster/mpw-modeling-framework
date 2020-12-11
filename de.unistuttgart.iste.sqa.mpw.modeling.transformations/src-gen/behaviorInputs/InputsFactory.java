/**
 */
package behaviorInputs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see behaviorInputs.InputsPackage
 * @generated
 */
public interface InputsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputsFactory eINSTANCE = behaviorInputs.impl.InputsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Henshin Command Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Henshin Command Inputs</em>'.
	 * @generated
	 */
	HenshinCommandInputs createHenshinCommandInputs();

	/**
	 * Returns a new object of class '<em>Query Inputs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Inputs</em>'.
	 * @generated
	 */
	QueryInputs createQueryInputs();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InputsPackage getInputsPackage();

} //InputsFactory
