/**
 */
package queryBehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import queryBehavior.EnumLiteralStatement;
import queryBehavior.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link queryBehavior.impl.EnumLiteralStatementImpl#getEnumLiteral <em>Enum Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumLiteralStatementImpl extends StatementImpl implements EnumLiteralStatement {
	/**
	 * The cached value of the '{@link #getEnumLiteral() <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EEnumLiteral enumLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ENUM_LITERAL_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral getEnumLiteral() {
		if (enumLiteral != null && enumLiteral.eIsProxy()) {
			InternalEObject oldEnumLiteral = (InternalEObject)enumLiteral;
			enumLiteral = (EEnumLiteral)eResolveProxy(oldEnumLiteral);
			if (enumLiteral != oldEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
			}
		}
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnumLiteral basicGetEnumLiteral() {
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumLiteral(EEnumLiteral newEnumLiteral) {
		EEnumLiteral oldEnumLiteral = enumLiteral;
		enumLiteral = newEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL:
				if (resolve) return getEnumLiteral();
				return basicGetEnumLiteral();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL:
				setEnumLiteral((EEnumLiteral)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL:
				setEnumLiteral((EEnumLiteral)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QueryPackage.ENUM_LITERAL_STATEMENT__ENUM_LITERAL:
				return enumLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumLiteralStatementImpl
