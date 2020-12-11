/**
 */
package hamster;

import mpw.Stage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Territory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hamster.Territory#getDefaultHamster <em>Default Hamster</em>}</li>
 * </ul>
 *
 * @see hamster.HamsterPackage#getTerritory()
 * @model
 * @generated
 */
public interface Territory extends Stage {
	/**
	 * Returns the value of the '<em><b>Default Hamster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Hamster</em>' containment reference.
	 * @see hamster.HamsterPackage#getTerritory_DefaultHamster()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	Hamster getDefaultHamster();

} // Territory
