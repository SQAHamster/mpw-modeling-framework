/**
 */
package hamster;

import mpw.MiniProgrammingWorld;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamster.HamsterGame#getTerritory <em>Territory</em>}</li>
 * </ul>
 *
 * @see hamster.HamsterPackage#getHamsterGame()
 * @model
 * @generated
 */
public interface HamsterGame extends MiniProgrammingWorld {
	/**
	 * Returns the value of the '<em><b>Territory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Territory</em>' containment reference.
	 * @see hamster.HamsterPackage#getHamsterGame_Territory()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	Territory getTerritory();

} // HamsterGame
