/**
 */
package commandBehavior.impl;

import commandBehavior.Action;
import commandBehavior.AttributeCondition;
import commandBehavior.CommandPackage;
import commandBehavior.InstanceCondition;
import commandBehavior.Modification;
import commandBehavior.ReferenceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commandBehavior.impl.ModificationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link commandBehavior.impl.ModificationImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link commandBehavior.impl.ModificationImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link commandBehavior.impl.ModificationImpl#getNewAttributeValue <em>New Attribute Value</em>}</li>
 *   <li>{@link commandBehavior.impl.ModificationImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModificationImpl extends MinimalEObjectImpl.Container implements Modification {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected ReferenceCondition reference;

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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeCondition attribute;

	/**
	 * The default value of the '{@link #getNewAttributeValue() <em>New Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ATTRIBUTE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewAttributeValue() <em>New Attribute Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAttributeValue()
	 * @generated
	 * @ordered
	 */
	protected String newAttributeValue = NEW_ATTRIBUTE_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.CREATE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.MODIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceCondition getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = (ReferenceCondition)eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.MODIFICATION__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceCondition basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(ReferenceCondition newReference) {
		ReferenceCondition oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.MODIFICATION__REFERENCE, oldReference, reference));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.MODIFICATION__INSTANCE, oldInstance, instance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.MODIFICATION__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCondition getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (AttributeCondition)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.MODIFICATION__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCondition basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeCondition newAttribute) {
		AttributeCondition oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.MODIFICATION__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewAttributeValue() {
		return newAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAttributeValue(String newNewAttributeValue) {
		String oldNewAttributeValue = newAttributeValue;
		newAttributeValue = newNewAttributeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.MODIFICATION__NEW_ATTRIBUTE_VALUE, oldNewAttributeValue, newAttributeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.MODIFICATION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.MODIFICATION__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case CommandPackage.MODIFICATION__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case CommandPackage.MODIFICATION__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case CommandPackage.MODIFICATION__NEW_ATTRIBUTE_VALUE:
				return getNewAttributeValue();
			case CommandPackage.MODIFICATION__ACTION:
				return getAction();
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
			case CommandPackage.MODIFICATION__REFERENCE:
				setReference((ReferenceCondition)newValue);
				return;
			case CommandPackage.MODIFICATION__INSTANCE:
				setInstance((InstanceCondition)newValue);
				return;
			case CommandPackage.MODIFICATION__ATTRIBUTE:
				setAttribute((AttributeCondition)newValue);
				return;
			case CommandPackage.MODIFICATION__NEW_ATTRIBUTE_VALUE:
				setNewAttributeValue((String)newValue);
				return;
			case CommandPackage.MODIFICATION__ACTION:
				setAction((Action)newValue);
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
			case CommandPackage.MODIFICATION__REFERENCE:
				setReference((ReferenceCondition)null);
				return;
			case CommandPackage.MODIFICATION__INSTANCE:
				setInstance((InstanceCondition)null);
				return;
			case CommandPackage.MODIFICATION__ATTRIBUTE:
				setAttribute((AttributeCondition)null);
				return;
			case CommandPackage.MODIFICATION__NEW_ATTRIBUTE_VALUE:
				setNewAttributeValue(NEW_ATTRIBUTE_VALUE_EDEFAULT);
				return;
			case CommandPackage.MODIFICATION__ACTION:
				setAction(ACTION_EDEFAULT);
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
			case CommandPackage.MODIFICATION__REFERENCE:
				return reference != null;
			case CommandPackage.MODIFICATION__INSTANCE:
				return instance != null;
			case CommandPackage.MODIFICATION__ATTRIBUTE:
				return attribute != null;
			case CommandPackage.MODIFICATION__NEW_ATTRIBUTE_VALUE:
				return NEW_ATTRIBUTE_VALUE_EDEFAULT == null ? newAttributeValue != null : !NEW_ATTRIBUTE_VALUE_EDEFAULT.equals(newAttributeValue);
			case CommandPackage.MODIFICATION__ACTION:
				return action != ACTION_EDEFAULT;
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
		result.append(" (newAttributeValue: ");
		result.append(newAttributeValue);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ModificationImpl
