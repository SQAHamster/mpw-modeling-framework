/**
 */
package hamsterviewmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hamsterviewmodel.HamsterviewmodelPackage
 * @generated
 */
public interface HamsterviewmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HamsterviewmodelFactory eINSTANCE = hamsterviewmodel.impl.HamsterviewmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game View Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game View Model</em>'.
	 * @generated
	 */
	GameViewModel createGameViewModel();

	/**
	 * Returns a new object of class '<em>Game View Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game View Presenter</em>'.
	 * @generated
	 */
	GameViewPresenter createGameViewPresenter();

	/**
	 * Returns a new object of class '<em>View Model Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model Cell</em>'.
	 * @generated
	 */
	ViewModelCell createViewModelCell();

	/**
	 * Returns a new object of class '<em>View Model Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model Row</em>'.
	 * @generated
	 */
	ViewModelRow createViewModelRow();

	/**
	 * Returns a new object of class '<em>View Model Cell Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model Cell Layer</em>'.
	 * @generated
	 */
	ViewModelCellLayer createViewModelCellLayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HamsterviewmodelPackage getHamsterviewmodelPackage();

} //HamsterviewmodelFactory
