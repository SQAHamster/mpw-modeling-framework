/**
 */
package commandBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.Unit#getName <em>Name</em>}</li>
 *   <li>{@link commandBehavior.Unit#getParameters <em>Parameters</em>}</li>
 *   <li>{@link commandBehavior.Unit#isMainUnit <em>Main Unit</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getUnit()
 * @model abstract="true"
 * @generated
 */
public interface Unit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see commandBehavior.CommandPackage#getUnit_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link commandBehavior.Unit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getUnit_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Main Unit</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Unit</em>' attribute.
	 * @see #setMainUnit(boolean)
	 * @see commandBehavior.CommandPackage#getUnit_MainUnit()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isMainUnit();

	/**
	 * Sets the value of the '{@link commandBehavior.Unit#isMainUnit <em>Main Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Unit</em>' attribute.
	 * @see #isMainUnit()
	 * @generated
	 */
	void setMainUnit(boolean value);

} // Unit
