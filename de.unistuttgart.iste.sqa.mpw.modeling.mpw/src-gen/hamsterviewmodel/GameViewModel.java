/**
 */
package hamsterviewmodel;

import org.eclipse.emf.common.util.EList;

import viewmodel.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datastructure with Databinding capabilities which contains all relevant information to be displayed on the screen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.GameViewModel#getLogEntries <em>Log Entries</em>}</li>
 *   <li>{@link hamsterviewmodel.GameViewModel#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewModel()
 * @model
 * @generated
 */
public interface GameViewModel extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Log Entries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Entries</em>' attribute list.
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewModel_LogEntries()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLogEntries();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link hamsterviewmodel.ViewModelRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewModel_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewModelRow> getRows();

} // GameViewModel
