/**
 */
package commandBehavior.impl;

import commandBehavior.AttributeCondition;
import commandBehavior.CommandPackage;
import commandBehavior.InstanceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.AttributeConditionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link commandBehavior.impl.AttributeConditionImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link commandBehavior.impl.AttributeConditionImpl#getAttributeValueLiteral <em>Attribute Value Literal</em>}</li>
 *   <li>{@link commandBehavior.impl.AttributeConditionImpl#isIsCreate <em>Is Create</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeConditionImpl extends MinimalEObjectImpl.Container implements AttributeCondition {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected InstanceCondition instance;

	/**
	 * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeValueLiteral() <em>Attribute Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeValueLiteral() <em>Attribute Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String attributeValueLiteral = ATTRIBUTE_VALUE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCreate() <em>Is Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean isCreate = IS_CREATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.ATTRIBUTE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (InstanceCondition)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.ATTRIBUTE_CONDITION__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceCondition basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(InstanceCondition newInstance) {
		InstanceCondition oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.ATTRIBUTE_CONDITION__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeName() {
		return attributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeName(String newAttributeName) {
		String oldAttributeName = attributeName;
		attributeName = newAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_NAME, oldAttributeName, attributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeValueLiteral() {
		return attributeValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValueLiteral(String newAttributeValueLiteral) {
		String oldAttributeValueLiteral = attributeValueLiteral;
		attributeValueLiteral = newAttributeValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL, oldAttributeValueLiteral, attributeValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCreate() {
		return isCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCreate(boolean newIsCreate) {
		boolean oldIsCreate = isCreate;
		isCreate = newIsCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.ATTRIBUTE_CONDITION__IS_CREATE, oldIsCreate, isCreate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.ATTRIBUTE_CONDITION__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_NAME:
				return getAttributeName();
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL:
				return getAttributeValueLiteral();
			case CommandPackage.ATTRIBUTE_CONDITION__IS_CREATE:
				return isIsCreate();
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
			case CommandPackage.ATTRIBUTE_CONDITION__INSTANCE:
				setInstance((InstanceCondition)newValue);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_NAME:
				setAttributeName((String)newValue);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL:
				setAttributeValueLiteral((String)newValue);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__IS_CREATE:
				setIsCreate((Boolean)newValue);
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
			case CommandPackage.ATTRIBUTE_CONDITION__INSTANCE:
				setInstance((InstanceCondition)null);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_NAME:
				setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL:
				setAttributeValueLiteral(ATTRIBUTE_VALUE_LITERAL_EDEFAULT);
				return;
			case CommandPackage.ATTRIBUTE_CONDITION__IS_CREATE:
				setIsCreate(IS_CREATE_EDEFAULT);
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
			case CommandPackage.ATTRIBUTE_CONDITION__INSTANCE:
				return instance != null;
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_NAME:
				return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
			case CommandPackage.ATTRIBUTE_CONDITION__ATTRIBUTE_VALUE_LITERAL:
				return ATTRIBUTE_VALUE_LITERAL_EDEFAULT == null ? attributeValueLiteral != null : !ATTRIBUTE_VALUE_LITERAL_EDEFAULT.equals(attributeValueLiteral);
			case CommandPackage.ATTRIBUTE_CONDITION__IS_CREATE:
				return isCreate != IS_CREATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attributeName: ");
		result.append(attributeName);
		result.append(", attributeValueLiteral: ");
		result.append(attributeValueLiteral);
		result.append(", isCreate: ");
		result.append(isCreate);
		result.append(')');
		return result.toString();
	}

} //AttributeConditionImpl
