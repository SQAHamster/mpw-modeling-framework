/**
 */
package commands.impl;

import commands.AddEntityCommand;
import commands.CommandPackage;
import commands.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Entity Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link commands.impl.AddEntityCommandImpl#getEntityToAdd <em>Entity To Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddEntityCommandImpl extends PrimitiveCommandImpl implements AddEntityCommand {
	/**
	 * The cached value of the '{@link #getEntityToAdd() <em>Entity To Add</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityToAdd()
	 * @generated
	 * @ordered
	 */
	protected Entity entityToAdd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddEntityCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandPackage.Literals.ADD_ENTITY_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntityToAdd() {
		if (entityToAdd != null && entityToAdd.eIsProxy()) {
			InternalEObject oldEntityToAdd = (InternalEObject)entityToAdd;
			entityToAdd = (Entity)eResolveProxy(oldEntityToAdd);
			if (entityToAdd != oldEntityToAdd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD, oldEntityToAdd, entityToAdd));
			}
		}
		return entityToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityToAdd() {
		return entityToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityToAdd(Entity newEntityToAdd) {
		Entity oldEntityToAdd = entityToAdd;
		entityToAdd = newEntityToAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD, oldEntityToAdd, entityToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD:
				if (resolve) return getEntityToAdd();
				return basicGetEntityToAdd();
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
			case CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD:
				setEntityToAdd((Entity)newValue);
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
			case CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD:
				setEntityToAdd((Entity)null);
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
			case CommandPackage.ADD_ENTITY_COMMAND__ENTITY_TO_ADD:
				return entityToAdd != null;
		}
		return super.eIsSet(featureID);
	}

} //AddEntityCommandImpl
