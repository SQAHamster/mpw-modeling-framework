/**
 */
package hamsterviewmodel.impl;

import hamsterviewmodel.GameViewModel;
import hamsterviewmodel.GameViewPresenter;
import hamsterviewmodel.HamsterviewmodelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game View Presenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.impl.GameViewPresenterImpl#getViewModel <em>View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameViewPresenterImpl extends MinimalEObjectImpl.Container implements GameViewPresenter {
	/**
	 * The cached value of the '{@link #getViewModel() <em>View Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewModel()
	 * @generated
	 * @ordered
	 */
	protected GameViewModel viewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameViewPresenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterviewmodelPackage.Literals.GAME_VIEW_PRESENTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameViewModel getViewModel() {
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewModel(GameViewModel newViewModel, NotificationChain msgs) {
		GameViewModel oldViewModel = viewModel;
		viewModel = newViewModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HamsterviewmodelPackage.GAME_VIEW_PRESENTER__VIEW_MODEL, oldViewModel, newViewModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void playClicked() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stopClicked() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void textTyped(String text) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER__VIEW_MODEL:
				return basicSetViewModel(null, msgs);
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
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER__VIEW_MODEL:
				return getViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER__VIEW_MODEL:
				return viewModel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER___PLAY_CLICKED:
				playClicked();
				return null;
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER___STOP_CLICKED:
				stopClicked();
				return null;
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER___TEXT_TYPED__STRING:
				textTyped((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GameViewPresenterImpl
