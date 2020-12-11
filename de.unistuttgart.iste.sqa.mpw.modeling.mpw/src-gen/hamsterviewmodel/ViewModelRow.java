/**
 */
package hamsterviewmodel;

import org.eclipse.emf.common.util.EList;

import viewmodel.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.ViewModelRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelRow()
 * @model
 * @generated
 */
public interface ViewModelRow extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link hamsterviewmodel.ViewModelCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewModelCell> getCells();

} // ViewModelRow
