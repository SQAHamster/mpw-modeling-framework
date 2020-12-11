/**
 */
package hamsterviewmodel;

import viewmodel.ViewModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model Cell Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.ViewModelCellLayer#getImageName <em>Image Name</em>}</li>
 *   <li>{@link hamsterviewmodel.ViewModelCellLayer#getRotation <em>Rotation</em>}</li>
 *   <li>{@link hamsterviewmodel.ViewModelCellLayer#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCellLayer()
 * @model
 * @generated
 */
public interface ViewModelCellLayer extends ViewModel {
	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCellLayer_ImageName()
	 * @model
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link hamsterviewmodel.ViewModelCellLayer#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(int)
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCellLayer_Rotation()
	 * @model
	 * @generated
	 */
	int getRotation();

	/**
	 * Sets the value of the '{@link hamsterviewmodel.ViewModelCellLayer#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(int value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see hamsterviewmodel.HamsterviewmodelPackage#getViewModelCellLayer_Visible()
	 * @model
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link hamsterviewmodel.ViewModelCellLayer#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // ViewModelCellLayer
