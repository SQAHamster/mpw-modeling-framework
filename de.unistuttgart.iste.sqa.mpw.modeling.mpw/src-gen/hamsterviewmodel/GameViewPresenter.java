/**
 */
package hamsterviewmodel;

import viewmodel.Presenter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game View Presenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.GameViewPresenter#getViewModel <em>View Model</em>}</li>
 * </ul>
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewPresenter()
 * @model
 * @generated
 */
public interface GameViewPresenter extends GameViewInput, Presenter {
	/**
	 * Returns the value of the '<em><b>View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Model</em>' containment reference.
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewPresenter_ViewModel()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	GameViewModel getViewModel();

} // GameViewPresenter
