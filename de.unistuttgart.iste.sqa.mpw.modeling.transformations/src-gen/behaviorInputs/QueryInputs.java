/**
 */
package behaviorInputs;

import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Inputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviorInputs.QueryInputs#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see behaviorInputs.InputsPackage#getQueryInputs()
 * @model
 * @generated
 */
public interface QueryInputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' reference list.
	 * @see behaviorInputs.InputsPackage#getQueryInputs_Models()
	 * @model
	 * @generated
	 */
	EList<Model> getModels();

} // QueryInputs
