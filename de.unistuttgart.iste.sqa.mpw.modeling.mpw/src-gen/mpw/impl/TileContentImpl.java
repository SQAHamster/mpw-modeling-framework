/**
 */
package mpw.impl;

import mpw.MpwPackage;
import mpw.Stage;
import mpw.Tile;
import mpw.TileContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpw.impl.TileContentImpl#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link mpw.impl.TileContentImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TileContentImpl extends MinimalEObjectImpl.Container implements TileContent {
	/**
	 * The cached value of the '{@link #getCurrentTile() <em>Current Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTile()
	 * @generated
	 * @ordered
	 */
	protected Tile currentTile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MpwPackage.Literals.TILE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getCurrentTile() {
		if (currentTile != null && currentTile.eIsProxy()) {
			InternalEObject oldCurrentTile = (InternalEObject)currentTile;
			currentTile = (Tile)eResolveProxy(oldCurrentTile);
			if (currentTile != oldCurrentTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.TILE_CONTENT__CURRENT_TILE, oldCurrentTile, currentTile));
			}
		}
		return currentTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetCurrentTile() {
		return currentTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentTile(Tile newCurrentTile, NotificationChain msgs) {
		Tile oldCurrentTile = currentTile;
		currentTile = newCurrentTile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE_CONTENT__CURRENT_TILE, oldCurrentTile, newCurrentTile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTile(Tile newCurrentTile) {
		if (newCurrentTile != currentTile) {
			NotificationChain msgs = null;
			if (currentTile != null)
				msgs = ((InternalEObject)currentTile).eInverseRemove(this, MpwPackage.TILE__CONTENTS, Tile.class, msgs);
			if (newCurrentTile != null)
				msgs = ((InternalEObject)newCurrentTile).eInverseAdd(this, MpwPackage.TILE__CONTENTS, Tile.class, msgs);
			msgs = basicSetCurrentTile(newCurrentTile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE_CONTENT__CURRENT_TILE, newCurrentTile, newCurrentTile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		if (eContainerFeatureID() != MpwPackage.TILE_CONTENT__STAGE) return null;
		return (Stage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(Stage newStage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStage, MpwPackage.TILE_CONTENT__STAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		if (newStage != eInternalContainer() || (eContainerFeatureID() != MpwPackage.TILE_CONTENT__STAGE && newStage != null)) {
			if (EcoreUtil.isAncestor(this, newStage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, MpwPackage.STAGE__TILE_CONTENTS, Stage.class, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE_CONTENT__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				if (currentTile != null)
					msgs = ((InternalEObject)currentTile).eInverseRemove(this, MpwPackage.TILE__CONTENTS, Tile.class, msgs);
				return basicSetCurrentTile((Tile)otherEnd, msgs);
			case MpwPackage.TILE_CONTENT__STAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStage((Stage)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				return basicSetCurrentTile(null, msgs);
			case MpwPackage.TILE_CONTENT__STAGE:
				return basicSetStage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MpwPackage.TILE_CONTENT__STAGE:
				return eInternalContainer().eInverseRemove(this, MpwPackage.STAGE__TILE_CONTENTS, Stage.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				if (resolve) return getCurrentTile();
				return basicGetCurrentTile();
			case MpwPackage.TILE_CONTENT__STAGE:
				return getStage();
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
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				setCurrentTile((Tile)newValue);
				return;
			case MpwPackage.TILE_CONTENT__STAGE:
				setStage((Stage)newValue);
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
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				setCurrentTile((Tile)null);
				return;
			case MpwPackage.TILE_CONTENT__STAGE:
				setStage((Stage)null);
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
			case MpwPackage.TILE_CONTENT__CURRENT_TILE:
				return currentTile != null;
			case MpwPackage.TILE_CONTENT__STAGE:
				return getStage() != null;
		}
		return super.eIsSet(featureID);
	}

} //TileContentImpl
