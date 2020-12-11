/**
 */
package hamsterviewmodel;

import org.eclipse.emf.common.util.EList;

import viewmodel.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.ViewModelCell#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCell()
 * @model
 * @generated
 */
public interface ViewModelCell extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link hamsterviewmodel.ViewModelCellLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCell_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewModelCellLayer> getLayers();

} // ViewModelCell
