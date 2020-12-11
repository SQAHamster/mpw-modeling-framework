/**
 */
package mpw;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.GameLog#getLogEntries <em>Log Entries</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getGameLog()
 * @model
 * @generated
 */
public interface GameLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Entries</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Entries</em>' attribute list.
	 * @see mpw.MpwPackage#getGameLog_LogEntries()
	 * @model
	 * @generated
	 */
	EList<String> getLogEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void write(String message);

} // GameLog
