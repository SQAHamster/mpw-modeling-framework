/**
 */
package queryBehavior.impl;

import org.eclipse.emf.ecore.EClass;

import queryBehavior.AndExpression;
import queryBehavior.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AndExpressionImpl extends BinaryExpressionImpl implements AndExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.AND_EXPRESSION;
	}

} //AndExpressionImpl
