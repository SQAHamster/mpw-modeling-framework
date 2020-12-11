/**
 */
package queryBehavior;

import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.EnumLiteralStatement#getEnumLiteral <em>Enum Literal</em>}</li>
 * </ul>
 *
 * @see queryBehavior.QueryPackage#getEnumLiteralStatement()
 * @model
 * @generated
 */
public interface EnumLiteralStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literal</em>' reference.
	 * @see #setEnumLiteral(EEnumLiteral)
	 * @see queryBehavior.QueryPackage#getEnumLiteralStatement_EnumLiteral()
	 * @model required="true"
	 * @generated
	 */
	EEnumLiteral getEnumLiteral();

	/**
	 * Sets the value of the '{@link queryBehavior.EnumLiteralStatement#getEnumLiteral <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Literal</em>' reference.
	 * @see #getEnumLiteral()
	 * @generated
	 */
	void setEnumLiteral(EEnumLiteral value);

} // EnumLiteralStatement
