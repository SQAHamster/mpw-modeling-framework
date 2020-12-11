/**
 */
package hamsterviewmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game View Input</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see hamsterviewmodel.HamsterviewmodelPackage#getGameViewInput()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GameViewInput extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void playClicked();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void stopClicked();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void textTyped(String text);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	GameViewModel getViewModel();

} // GameViewInput
