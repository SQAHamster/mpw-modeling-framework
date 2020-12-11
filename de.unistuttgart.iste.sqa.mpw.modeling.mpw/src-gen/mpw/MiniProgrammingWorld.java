/**
 */
package mpw;

import commands.CommandStack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mini Programming World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.MiniProgrammingWorld#getStage <em>Stage</em>}</li>
 *   <li>{@link mpw.MiniProgrammingWorld#getCommandStack <em>Command Stack</em>}</li>
 *   <li>{@link mpw.MiniProgrammingWorld#getGameLog <em>Game Log</em>}</li>
 *   <li>{@link mpw.MiniProgrammingWorld#getUserInputInterface <em>User Input Interface</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getMiniProgrammingWorld()
 * @model abstract="true"
 * @generated
 */
public interface MiniProgrammingWorld extends EObject {
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' reference.
	 * @see #setStage(Stage)
	 * @see mpw.MpwPackage#getMiniProgrammingWorld_Stage()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link mpw.MiniProgrammingWorld#getStage <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

	/**
	 * Returns the value of the '<em><b>Command Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Stack</em>' containment reference.
	 * @see mpw.MpwPackage#getMiniProgrammingWorld_CommandStack()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	CommandStack getCommandStack();

	/**
	 * Returns the value of the '<em><b>Game Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Log</em>' containment reference.
	 * @see mpw.MpwPackage#getMiniProgrammingWorld_GameLog()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	GameLog getGameLog();

	/**
	 * Returns the value of the '<em><b>User Input Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Input Interface</em>' reference.
	 * @see #setUserInputInterface(UserInputInterface)
	 * @see mpw.MpwPackage#getMiniProgrammingWorld_UserInputInterface()
	 * @model required="true"
	 * @generated
	 */
	UserInputInterface getUserInputInterface();

	/**
	 * Sets the value of the '{@link mpw.MiniProgrammingWorld#getUserInputInterface <em>User Input Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Input Interface</em>' reference.
	 * @see #getUserInputInterface()
	 * @generated
	 */
	void setUserInputInterface(UserInputInterface value);

} // MiniProgrammingWorld
