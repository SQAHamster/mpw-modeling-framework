/**
 */
package mpw.impl;

import java.util.Collection;

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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpw.impl.StageImpl#getTiles <em>Tiles</em>}</li>
 *   <li>{@link mpw.impl.StageImpl#getTileContents <em>Tile Contents</em>}</li>
 *   <li>{@link mpw.impl.StageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link mpw.impl.StageImpl#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tiles;

	/**
	 * The cached value of the '{@link #getTileContents() <em>Tile Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileContents()
	 * @generated
	 * @ordered
	 */
	protected EList<TileContent> tileContents;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MpwPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tile> getTiles() {
		if (tiles == null) {
			tiles = new EObjectContainmentWithInverseEList<Tile>(Tile.class, this, MpwPackage.STAGE__TILES, MpwPackage.TILE__STAGE);
		}
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TileContent> getTileContents() {
		if (tileContents == null) {
			tileContents = new EObjectContainmentWithInverseEList<TileContent>(TileContent.class, this, MpwPackage.STAGE__TILE_CONTENTS, MpwPackage.TILE_CONTENT__STAGE);
		}
		return tileContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.STAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.STAGE__HEIGHT, oldHeight, height));
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
			case MpwPackage.STAGE__TILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTiles()).basicAdd(otherEnd, msgs);
			case MpwPackage.STAGE__TILE_CONTENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTileContents()).basicAdd(otherEnd, msgs);
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
			case MpwPackage.STAGE__TILES:
				return ((InternalEList<?>)getTiles()).basicRemove(otherEnd, msgs);
			case MpwPackage.STAGE__TILE_CONTENTS:
				return ((InternalEList<?>)getTileContents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MpwPackage.STAGE__TILES:
				return getTiles();
			case MpwPackage.STAGE__TILE_CONTENTS:
				return getTileContents();
			case MpwPackage.STAGE__WIDTH:
				return getWidth();
			case MpwPackage.STAGE__HEIGHT:
				return getHeight();
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
			case MpwPackage.STAGE__TILES:
				getTiles().clear();
				getTiles().addAll((Collection<? extends Tile>)newValue);
				return;
			case MpwPackage.STAGE__TILE_CONTENTS:
				getTileContents().clear();
				getTileContents().addAll((Collection<? extends TileContent>)newValue);
				return;
			case MpwPackage.STAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case MpwPackage.STAGE__HEIGHT:
				setHeight((Integer)newValue);
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
			case MpwPackage.STAGE__TILES:
				getTiles().clear();
				return;
			case MpwPackage.STAGE__TILE_CONTENTS:
				getTileContents().clear();
				return;
			case MpwPackage.STAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case MpwPackage.STAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
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
			case MpwPackage.STAGE__TILES:
				return tiles != null && !tiles.isEmpty();
			case MpwPackage.STAGE__TILE_CONTENTS:
				return tileContents != null && !tileContents.isEmpty();
			case MpwPackage.STAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case MpwPackage.STAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //StageImpl
