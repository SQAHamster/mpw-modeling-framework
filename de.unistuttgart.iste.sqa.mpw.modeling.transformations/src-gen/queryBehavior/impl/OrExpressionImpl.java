/**
 */
package queryBehavior.impl;

import org.eclipse.emf.ecore.EClass;

import queryBehavior.OrExpression;
import queryBehavior.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OrExpressionImpl extends BinaryExpressionImpl implements OrExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.OR_EXPRESSION;
	}

} //OrExpressionImpl
