/**
 */
package mpw;

import stereotypes.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Input Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see mpw.MpwPackage#getUserInputInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UserInputInterface extends Dependency {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int readInteger(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String readString(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tDataType="mpw.Throwable"
	 * @generated
	 */
	void confirmAlert(Throwable t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void abort();

} // UserInputInterface
