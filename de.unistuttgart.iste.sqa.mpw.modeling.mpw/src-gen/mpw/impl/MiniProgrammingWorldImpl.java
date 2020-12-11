/**
 */
package mpw.impl;

import commands.CommandStack;

import mpw.GameLog;
import mpw.MiniProgrammingWorld;
import mpw.MpwPackage;
import mpw.Stage;
import mpw.UserInputInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mini Programming World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mpw.impl.MiniProgrammingWorldImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link mpw.impl.MiniProgrammingWorldImpl#getCommandStack <em>Command Stack</em>}</li>
 *   <li>{@link mpw.impl.MiniProgrammingWorldImpl#getGameLog <em>Game Log</em>}</li>
 *   <li>{@link mpw.impl.MiniProgrammingWorldImpl#getUserInputInterface <em>User Input Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MiniProgrammingWorldImpl extends MinimalEObjectImpl.Container implements MiniProgrammingWorld {
	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected Stage stage;

	/**
	 * The cached value of the '{@link #getCommandStack() <em>Command Stack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandStack()
	 * @generated
	 * @ordered
	 */
	protected CommandStack commandStack;

	/**
	 * The cached value of the '{@link #getGameLog() <em>Game Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameLog()
	 * @generated
	 * @ordered
	 */
	protected GameLog gameLog;

	/**
	 * The cached value of the '{@link #getUserInputInterface() <em>User Input Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInputInterface()
	 * @generated
	 * @ordered
	 */
	protected UserInputInterface userInputInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiniProgrammingWorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MpwPackage.Literals.MINI_PROGRAMMING_WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getStage() {
		if (stage != null && stage.eIsProxy()) {
			InternalEObject oldStage = (InternalEObject)stage;
			stage = (Stage)eResolveProxy(oldStage);
			if (stage != oldStage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.MINI_PROGRAMMING_WORLD__STAGE, oldStage, stage));
			}
		}
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetStage() {
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(Stage newStage) {
		Stage oldStage = stage;
		stage = newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.MINI_PROGRAMMING_WORLD__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStack getCommandStack() {
		return commandStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandStack(CommandStack newCommandStack, NotificationChain msgs) {
		CommandStack oldCommandStack = commandStack;
		commandStack = newCommandStack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.MINI_PROGRAMMING_WORLD__COMMAND_STACK, oldCommandStack, newCommandStack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameLog getGameLog() {
		return gameLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameLog(GameLog newGameLog, NotificationChain msgs) {
		GameLog oldGameLog = gameLog;
		gameLog = newGameLog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MpwPackage.MINI_PROGRAMMING_WORLD__GAME_LOG, oldGameLog, newGameLog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInputInterface getUserInputInterface() {
		if (userInputInterface != null && userInputInterface.eIsProxy()) {
			InternalEObject oldUserInputInterface = (InternalEObject)userInputInterface;
			userInputInterface = (UserInputInterface)eResolveProxy(oldUserInputInterface);
			if (userInputInterface != oldUserInputInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE, oldUserInputInterface, userInputInterface));
			}
		}
		return userInputInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInputInterface basicGetUserInputInterface() {
		return userInputInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserInputInterface(UserInputInterface newUserInputInterface) {
		UserInputInterface oldUserInputInterface = userInputInterface;
		userInputInterface = newUserInputInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE, oldUserInputInterface, userInputInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MpwPackage.MINI_PROGRAMMING_WORLD__COMMAND_STACK:
				return basicSetCommandStack(null, msgs);
			case MpwPackage.MINI_PROGRAMMING_WORLD__GAME_LOG:
				return basicSetGameLog(null, msgs);
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
			case MpwPackage.MINI_PROGRAMMING_WORLD__STAGE:
				if (resolve) return getStage();
				return basicGetStage();
			case MpwPackage.MINI_PROGRAMMING_WORLD__COMMAND_STACK:
				return getCommandStack();
			case MpwPackage.MINI_PROGRAMMING_WORLD__GAME_LOG:
				return getGameLog();
			case MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE:
				if (resolve) return getUserInputInterface();
				return basicGetUserInputInterface();
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
			case MpwPackage.MINI_PROGRAMMING_WORLD__STAGE:
				setStage((Stage)newValue);
				return;
			case MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE:
				setUserInputInterface((UserInputInterface)newValue);
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
			case MpwPackage.MINI_PROGRAMMING_WORLD__STAGE:
				setStage((Stage)null);
				return;
			case MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE:
				setUserInputInterface((UserInputInterface)null);
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
			case MpwPackage.MINI_PROGRAMMING_WORLD__STAGE:
				return stage != null;
			case MpwPackage.MINI_PROGRAMMING_WORLD__COMMAND_STACK:
				return commandStack != null;
			case MpwPackage.MINI_PROGRAMMING_WORLD__GAME_LOG:
				return gameLog != null;
			case MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE:
				return userInputInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //MiniProgrammingWorldImpl
