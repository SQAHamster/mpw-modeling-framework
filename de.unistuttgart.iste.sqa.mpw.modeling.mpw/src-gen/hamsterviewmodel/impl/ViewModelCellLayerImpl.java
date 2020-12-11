/**
 */
package hamsterviewmodel.impl;

import hamsterviewmodel.HamsterviewmodelPackage;
import hamsterviewmodel.ViewModelCellLayer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Model Cell Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.impl.ViewModelCellLayerImpl#getImageName <em>Image Name</em>}</li>
 *   <li>{@link hamsterviewmodel.impl.ViewModelCellLayerImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link hamsterviewmodel.impl.ViewModelCellLayerImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewModelCellLayerImpl extends MinimalEObjectImpl.Container implements ViewModelCellLayer {
	/**
	 * The default value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageName() <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageName()
	 * @generated
	 * @ordered
	 */
	protected String imageName = IMAGE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final int ROTATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected int rotation = ROTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelCellLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterviewmodelPackage.Literals.VIEW_MODEL_CELL_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageName() {
		return imageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageName(String newImageName) {
		String oldImageName = imageName;
		imageName = newImageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__IMAGE_NAME, oldImageName, imageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(int newRotation) {
		int oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__IMAGE_NAME:
				return getImageName();
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__ROTATION:
				return getRotation();
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__VISIBLE:
				return isVisible();
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
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__IMAGE_NAME:
				setImageName((String)newValue);
				return;
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__ROTATION:
				setRotation((Integer)newValue);
				return;
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__VISIBLE:
				setVisible((Boolean)newValue);
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
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__IMAGE_NAME:
				setImageName(IMAGE_NAME_EDEFAULT);
				return;
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__IMAGE_NAME:
				return IMAGE_NAME_EDEFAULT == null ? imageName != null : !IMAGE_NAME_EDEFAULT.equals(imageName);
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__ROTATION:
				return rotation != ROTATION_EDEFAULT;
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
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
		result.append(" (imageName: ");
		result.append(imageName);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //ViewModelCellLayerImpl
