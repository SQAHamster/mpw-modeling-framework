/**
 */
package hamster;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hamster.HamsterPackage
 * @generated
 */
public interface HamsterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HamsterFactory eINSTANCE = hamster.impl.HamsterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hamster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hamster</em>'.
	 * @generated
	 */
	Hamster createHamster();

	/**
	 * Returns a new object of class '<em>Territory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Territory</em>'.
	 * @generated
	 */
	Territory createTerritory();

	/**
	 * Returns a new object of class '<em>Grain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grain</em>'.
	 * @generated
	 */
	Grain createGrain();

	/**
	 * Returns a new object of class '<em>Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall</em>'.
	 * @generated
	 */
	Wall createWall();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	HamsterGame createHamsterGame();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HamsterPackage getHamsterPackage();

} //HamsterFactory
