/**
 */
package mpw.impl;

import java.util.Collection;

import mpw.Location;
import mpw.MpwPackage;
import mpw.Stage;
import mpw.Tile;
import mpw.TileContent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpw.impl.TileImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getSouth <em>South</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getNorth <em>North</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getEast <em>East</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getWest <em>West</em>}</li>
 *   <li>{@link mpw.impl.TileImpl#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<TileContent> contents;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected Tile south;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected Tile north;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected Tile east;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected Tile west;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MpwPackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TileContent> getContents() {
		if (contents == null) {
			contents = new EObjectWithInverseResolvingEList<TileContent>(TileContent.class, this, MpwPackage.TILE__CONTENTS, MpwPackage.TILE_CONTENT__CURRENT_TILE);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MpwPackage.TILE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MpwPackage.TILE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getSouth() {
		if (south != null && south.eIsProxy()) {
			InternalEObject oldSouth = (InternalEObject)south;
			south = (Tile)eResolveProxy(oldSouth);
			if (south != oldSouth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.TILE__SOUTH, oldSouth, south));
			}
		}
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSouth(Tile newSouth, NotificationChain msgs) {
		Tile oldSouth = south;
		south = newSouth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__SOUTH, oldSouth, newSouth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouth(Tile newSouth) {
		if (newSouth != south) {
			NotificationChain msgs = null;
			if (south != null)
				msgs = ((InternalEObject)south).eInverseRemove(this, MpwPackage.TILE__NORTH, Tile.class, msgs);
			if (newSouth != null)
				msgs = ((InternalEObject)newSouth).eInverseAdd(this, MpwPackage.TILE__NORTH, Tile.class, msgs);
			msgs = basicSetSouth(newSouth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__SOUTH, newSouth, newSouth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getNorth() {
		if (north != null && north.eIsProxy()) {
			InternalEObject oldNorth = (InternalEObject)north;
			north = (Tile)eResolveProxy(oldNorth);
			if (north != oldNorth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.TILE__NORTH, oldNorth, north));
			}
		}
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNorth(Tile newNorth, NotificationChain msgs) {
		Tile oldNorth = north;
		north = newNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__NORTH, oldNorth, newNorth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorth(Tile newNorth) {
		if (newNorth != north) {
			NotificationChain msgs = null;
			if (north != null)
				msgs = ((InternalEObject)north).eInverseRemove(this, MpwPackage.TILE__SOUTH, Tile.class, msgs);
			if (newNorth != null)
				msgs = ((InternalEObject)newNorth).eInverseAdd(this, MpwPackage.TILE__SOUTH, Tile.class, msgs);
			msgs = basicSetNorth(newNorth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__NORTH, newNorth, newNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getEast() {
		if (east != null && east.eIsProxy()) {
			InternalEObject oldEast = (InternalEObject)east;
			east = (Tile)eResolveProxy(oldEast);
			if (east != oldEast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.TILE__EAST, oldEast, east));
			}
		}
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEast(Tile newEast, NotificationChain msgs) {
		Tile oldEast = east;
		east = newEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__EAST, oldEast, newEast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEast(Tile newEast) {
		if (newEast != east) {
			NotificationChain msgs = null;
			if (east != null)
				msgs = ((InternalEObject)east).eInverseRemove(this, MpwPackage.TILE__WEST, Tile.class, msgs);
			if (newEast != null)
				msgs = ((InternalEObject)newEast).eInverseAdd(this, MpwPackage.TILE__WEST, Tile.class, msgs);
			msgs = basicSetEast(newEast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__EAST, newEast, newEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile getWest() {
		if (west != null && west.eIsProxy()) {
			InternalEObject oldWest = (InternalEObject)west;
			west = (Tile)eResolveProxy(oldWest);
			if (west != oldWest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.TILE__WEST, oldWest, west));
			}
		}
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWest(Tile newWest, NotificationChain msgs) {
		Tile oldWest = west;
		west = newWest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__WEST, oldWest, newWest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWest(Tile newWest) {
		if (newWest != west) {
			NotificationChain msgs = null;
			if (west != null)
				msgs = ((InternalEObject)west).eInverseRemove(this, MpwPackage.TILE__EAST, Tile.class, msgs);
			if (newWest != null)
				msgs = ((InternalEObject)newWest).eInverseAdd(this, MpwPackage.TILE__EAST, Tile.class, msgs);
			msgs = basicSetWest(newWest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__WEST, newWest, newWest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		if (eContainerFeatureID() != MpwPackage.TILE__STAGE) return null;
		return (Stage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(Stage newStage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStage, MpwPackage.TILE__STAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		if (newStage != eInternalContainer() || (eContainerFeatureID() != MpwPackage.TILE__STAGE && newStage != null)) {
			if (EcoreUtil.isAncestor(this, newStage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, MpwPackage.STAGE__TILES, Stage.class, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.TILE__STAGE, newStage, newStage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpwPackage.TILE__CONTENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContents()).basicAdd(otherEnd, msgs);
			case MpwPackage.TILE__SOUTH:
				if (south != null)
					msgs = ((InternalEObject)south).eInverseRemove(this, MpwPackage.TILE__NORTH, Tile.class, msgs);
				return basicSetSouth((Tile)otherEnd, msgs);
			case MpwPackage.TILE__NORTH:
				if (north != null)
					msgs = ((InternalEObject)north).eInverseRemove(this, MpwPackage.TILE__SOUTH, Tile.class, msgs);
				return basicSetNorth((Tile)otherEnd, msgs);
			case MpwPackage.TILE__EAST:
				if (east != null)
					msgs = ((InternalEObject)east).eInverseRemove(this, MpwPackage.TILE__WEST, Tile.class, msgs);
				return basicSetEast((Tile)otherEnd, msgs);
			case MpwPackage.TILE__WEST:
				if (west != null)
					msgs = ((InternalEObject)west).eInverseRemove(this, MpwPackage.TILE__EAST, Tile.class, msgs);
				return basicSetWest((Tile)otherEnd, msgs);
			case MpwPackage.TILE__STAGE:
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
			case MpwPackage.TILE__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case MpwPackage.TILE__LOCATION:
				return basicSetLocation(null, msgs);
			case MpwPackage.TILE__SOUTH:
				return basicSetSouth(null, msgs);
			case MpwPackage.TILE__NORTH:
				return basicSetNorth(null, msgs);
			case MpwPackage.TILE__EAST:
				return basicSetEast(null, msgs);
			case MpwPackage.TILE__WEST:
				return basicSetWest(null, msgs);
			case MpwPackage.TILE__STAGE:
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
			case MpwPackage.TILE__STAGE:
				return eInternalContainer().eInverseRemove(this, MpwPackage.STAGE__TILES, Stage.class, msgs);
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
			case MpwPackage.TILE__CONTENTS:
				return getContents();
			case MpwPackage.TILE__LOCATION:
				return getLocation();
			case MpwPackage.TILE__SOUTH:
				if (resolve) return getSouth();
				return basicGetSouth();
			case MpwPackage.TILE__NORTH:
				if (resolve) return getNorth();
				return basicGetNorth();
			case MpwPackage.TILE__EAST:
				if (resolve) return getEast();
				return basicGetEast();
			case MpwPackage.TILE__WEST:
				if (resolve) return getWest();
				return basicGetWest();
			case MpwPackage.TILE__STAGE:
				return getStage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MpwPackage.TILE__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends TileContent>)newValue);
				return;
			case MpwPackage.TILE__LOCATION:
				setLocation((Location)newValue);
				return;
			case MpwPackage.TILE__SOUTH:
				setSouth((Tile)newValue);
				return;
			case MpwPackage.TILE__NORTH:
				setNorth((Tile)newValue);
				return;
			case MpwPackage.TILE__EAST:
				setEast((Tile)newValue);
				return;
			case MpwPackage.TILE__WEST:
				setWest((Tile)newValue);
				return;
			case MpwPackage.TILE__STAGE:
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
			case MpwPackage.TILE__CONTENTS:
				getContents().clear();
				return;
			case MpwPackage.TILE__LOCATION:
				setLocation((Location)null);
				return;
			case MpwPackage.TILE__SOUTH:
				setSouth((Tile)null);
				return;
			case MpwPackage.TILE__NORTH:
				setNorth((Tile)null);
				return;
			case MpwPackage.TILE__EAST:
				setEast((Tile)null);
				return;
			case MpwPackage.TILE__WEST:
				setWest((Tile)null);
				return;
			case MpwPackage.TILE__STAGE:
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
			case MpwPackage.TILE__CONTENTS:
				return contents != null && !contents.isEmpty();
			case MpwPackage.TILE__LOCATION:
				return location != null;
			case MpwPackage.TILE__SOUTH:
				return south != null;
			case MpwPackage.TILE__NORTH:
				return north != null;
			case MpwPackage.TILE__EAST:
				return east != null;
			case MpwPackage.TILE__WEST:
				return west != null;
			case MpwPackage.TILE__STAGE:
				return getStage() != null;
		}
		return super.eIsSet(featureID);
	}

} //TileImpl
