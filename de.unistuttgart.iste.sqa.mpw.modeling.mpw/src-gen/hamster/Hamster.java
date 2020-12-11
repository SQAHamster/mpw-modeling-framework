/**
 */
package hamster;

import mpw.Actor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hamster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamster.Hamster#getGrains <em>Grains</em>}</li>
 * </ul>
 *
 * @see hamster.HamsterPackage#getHamster()
 * @model
 * @generated
 */
public interface Hamster extends Actor {
	/**
	 * Returns the value of the '<em><b>Grains</b></em>' reference list.
	 * The list contents are of type {@link hamster.Grain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grains</em>' reference list.
	 * @see hamster.HamsterPackage#getHamster_Grains()
	 * @model
	 * @generated
	 */
	EList<Grain> getGrains();

} // Hamster
