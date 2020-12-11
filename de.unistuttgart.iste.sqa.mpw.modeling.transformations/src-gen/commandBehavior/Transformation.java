/**
 */
package commandBehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import queryBehavior.Constraint;
import queryBehavior.Query;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getUnits <em>Units</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getMainUnit <em>Main Unit</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getTargetClass <em>Target Class</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getUsedQueries <em>Used Queries</em>}</li>
 *   <li>{@link commandBehavior.Transformation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link commandBehavior.Transformation#isIsInit <em>Is Init</em>}</li>
 * </ul>
 *
 * @see commandBehavior.CommandPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see commandBehavior.CommandPackage#getTransformation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link commandBehavior.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getTransformation_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

	/**
	 * Returns the value of the '<em><b>Main Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Unit</em>' reference.
	 * @see #setMainUnit(Unit)
	 * @see commandBehavior.CommandPackage#getTransformation_MainUnit()
	 * @model required="true"
	 * @generated
	 */
	Unit getMainUnit();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#getMainUnit <em>Main Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Unit</em>' reference.
	 * @see #getMainUnit()
	 * @generated
	 */
	void setMainUnit(Unit value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see commandBehavior.CommandPackage#getTransformation_RoleName()
	 * @model required="true"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

	/**
	 * Returns the value of the '<em><b>Target Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Class</em>' reference.
	 * @see #setTargetClass(EClass)
	 * @see commandBehavior.CommandPackage#getTransformation_TargetClass()
	 * @model
	 * @generated
	 */
	EClass getTargetClass();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#getTargetClass <em>Target Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Class</em>' reference.
	 * @see #getTargetClass()
	 * @generated
	 */
	void setTargetClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link queryBehavior.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getTransformation_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Used Queries</b></em>' containment reference list.
	 * The list contents are of type {@link queryBehavior.Query}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Queries</em>' containment reference list.
	 * @see commandBehavior.CommandPackage#getTransformation_UsedQueries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getUsedQueries();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see commandBehavior.CommandPackage#getTransformation_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Returns the value of the '<em><b>Is Init</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Init</em>' attribute.
	 * @see #setIsInit(boolean)
	 * @see commandBehavior.CommandPackage#getTransformation_IsInit()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsInit();

	/**
	 * Sets the value of the '{@link commandBehavior.Transformation#isIsInit <em>Is Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Init</em>' attribute.
	 * @see #isIsInit()
	 * @generated
	 */
	void setIsInit(boolean value);

} // Transformation
