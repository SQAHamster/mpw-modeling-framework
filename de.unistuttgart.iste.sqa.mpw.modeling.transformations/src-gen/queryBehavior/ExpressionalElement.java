/**
 */
package queryBehavior;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressional Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.ExpressionalElement#getName <em>Name</em>}</li>
 *   <li>{@link queryBehavior.ExpressionalElement#getMainExpression <em>Main Expression</em>}</li>
 *   <li>{@link queryBehavior.ExpressionalElement#getContextClass <em>Context Class</em>}</li>
 *   <li>{@link queryBehavior.ExpressionalElement#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getExpressionalElement()
 * @model
 * @generated
 */
public interface ExpressionalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see queryBehavior.QueryPackage#getExpressionalElement_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link queryBehavior.ExpressionalElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Expression</em>' containment reference.
	 * @see #setMainExpression(Expression)
	 * @see queryBehavior.QueryPackage#getExpressionalElement_MainExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMainExpression();

	/**
	 * Sets the value of the '{@link queryBehavior.ExpressionalElement#getMainExpression <em>Main Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Expression</em>' containment reference.
	 * @see #getMainExpression()
	 * @generated
	 */
	void setMainExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Class</em>' reference.
	 * @see #setContextClass(EClass)
	 * @see queryBehavior.QueryPackage#getExpressionalElement_ContextClass()
	 * @model required="true"
	 * @generated
	 */
	EClass getContextClass();

	/**
	 * Sets the value of the '{@link queryBehavior.ExpressionalElement#getContextClass <em>Context Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Class</em>' reference.
	 * @see #getContextClass()
	 * @generated
	 */
	void setContextClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see queryBehavior.QueryPackage#getExpressionalElement_Documentation()
	 * @model
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link queryBehavior.ExpressionalElement#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // ExpressionalElement
