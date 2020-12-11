/**
 */
package behaviorInputs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Henshin Command Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorInputs.HenshinCommandInputs#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see behaviorInputs.InputsPackage#getHenshinCommandInputs()
 * @model
 * @generated
 */
public interface HenshinCommandInputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.model.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see behaviorInputs.InputsPackage#getHenshinCommandInputs_Modules()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.emf.henshin.model.Module> getModules();

} // HenshinCommandInputs
