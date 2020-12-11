/**
 */
package mpw.impl;

import commands.CommandPackage;

import commands.impl.CommandPackageImpl;

import hamster.HamsterPackage;

import hamster.impl.HamsterPackageImpl;

import hamsterviewmodel.HamsterviewmodelPackage;

import hamsterviewmodel.impl.HamsterviewmodelPackageImpl;

import mpw.Actor;
import mpw.Direction;
import mpw.GameLog;
import mpw.Location;
import mpw.MiniProgrammingWorld;
import mpw.MpwFactory;
import mpw.MpwPackage;
import mpw.Prop;
import mpw.Stage;
import mpw.Tile;
import mpw.TileContent;
import mpw.UserInputInterface;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stereotypes.StereotypesPackage;

import stereotypes.impl.StereotypesPackageImpl;

import viewmodel.ViewmodelPackage;

import viewmodel.impl.ViewmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MpwPackageImpl extends EPackageImpl implements MpwPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miniProgrammingWorldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInputInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throwableEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mpw.MpwPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MpwPackageImpl() {
		super(eNS_URI, MpwFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MpwPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MpwPackage init() {
		if (isInited) return (MpwPackage)EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMpwPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MpwPackageImpl theMpwPackage = registeredMpwPackage instanceof MpwPackageImpl ? (MpwPackageImpl)registeredMpwPackage : new MpwPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl)(registeredPackage instanceof CommandPackageImpl ? registeredPackage : CommandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterPackage.eNS_URI);
		HamsterPackageImpl theHamsterPackage = (HamsterPackageImpl)(registeredPackage instanceof HamsterPackageImpl ? registeredPackage : HamsterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterviewmodelPackage.eNS_URI);
		HamsterviewmodelPackageImpl theHamsterviewmodelPackage = (HamsterviewmodelPackageImpl)(registeredPackage instanceof HamsterviewmodelPackageImpl ? registeredPackage : HamsterviewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = (ViewmodelPackageImpl)(registeredPackage instanceof ViewmodelPackageImpl ? registeredPackage : ViewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = (StereotypesPackageImpl)(registeredPackage instanceof StereotypesPackageImpl ? registeredPackage : StereotypesPackage.eINSTANCE);

		// Create package meta-data objects
		theMpwPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theHamsterPackage.createPackageContents();
		theHamsterviewmodelPackage.createPackageContents();
		theViewmodelPackage.createPackageContents();
		theStereotypesPackage.createPackageContents();

		// Initialize created meta-data
		theMpwPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theHamsterPackage.initializePackageContents();
		theHamsterviewmodelPackage.initializePackageContents();
		theViewmodelPackage.initializePackageContents();
		theStereotypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMpwPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MpwPackage.eNS_URI, theMpwPackage);
		return theMpwPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_Direction() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProp() {
		return propEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Contents() {
		return (EReference)tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Location() {
		return (EReference)tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_South() {
		return (EReference)tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_North() {
		return (EReference)tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_East() {
		return (EReference)tileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_West() {
		return (EReference)tileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTile_Stage() {
		return (EReference)tileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTileContent() {
		return tileContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTileContent_CurrentTile() {
		return (EReference)tileContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTileContent_Stage() {
		return (EReference)tileContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStage() {
		return stageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_Tiles() {
		return (EReference)stageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStage_TileContents() {
		return (EReference)stageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_Width() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStage_Height() {
		return (EAttribute)stageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMiniProgrammingWorld() {
		return miniProgrammingWorldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiniProgrammingWorld_Stage() {
		return (EReference)miniProgrammingWorldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiniProgrammingWorld_CommandStack() {
		return (EReference)miniProgrammingWorldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiniProgrammingWorld_GameLog() {
		return (EReference)miniProgrammingWorldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMiniProgrammingWorld_UserInputInterface() {
		return (EReference)miniProgrammingWorldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Column() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Row() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserInputInterface() {
		return userInputInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserInputInterface__ReadInteger__String() {
		return userInputInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserInputInterface__ReadString__String() {
		return userInputInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserInputInterface__ConfirmAlert__Throwable() {
		return userInputInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserInputInterface__Abort() {
		return userInputInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameLog() {
		return gameLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameLog_LogEntries() {
		return (EAttribute)gameLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameLog__Write__String() {
		return gameLogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThrowable() {
		return throwableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MpwFactory getMpwFactory() {
		return (MpwFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__DIRECTION);

		propEClass = createEClass(PROP);

		tileEClass = createEClass(TILE);
		createEReference(tileEClass, TILE__CONTENTS);
		createEReference(tileEClass, TILE__LOCATION);
		createEReference(tileEClass, TILE__SOUTH);
		createEReference(tileEClass, TILE__NORTH);
		createEReference(tileEClass, TILE__EAST);
		createEReference(tileEClass, TILE__WEST);
		createEReference(tileEClass, TILE__STAGE);

		tileContentEClass = createEClass(TILE_CONTENT);
		createEReference(tileContentEClass, TILE_CONTENT__CURRENT_TILE);
		createEReference(tileContentEClass, TILE_CONTENT__STAGE);

		stageEClass = createEClass(STAGE);
		createEReference(stageEClass, STAGE__TILES);
		createEReference(stageEClass, STAGE__TILE_CONTENTS);
		createEAttribute(stageEClass, STAGE__WIDTH);
		createEAttribute(stageEClass, STAGE__HEIGHT);

		miniProgrammingWorldEClass = createEClass(MINI_PROGRAMMING_WORLD);
		createEReference(miniProgrammingWorldEClass, MINI_PROGRAMMING_WORLD__STAGE);
		createEReference(miniProgrammingWorldEClass, MINI_PROGRAMMING_WORLD__COMMAND_STACK);
		createEReference(miniProgrammingWorldEClass, MINI_PROGRAMMING_WORLD__GAME_LOG);
		createEReference(miniProgrammingWorldEClass, MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__COLUMN);
		createEAttribute(locationEClass, LOCATION__ROW);

		userInputInterfaceEClass = createEClass(USER_INPUT_INTERFACE);
		createEOperation(userInputInterfaceEClass, USER_INPUT_INTERFACE___READ_INTEGER__STRING);
		createEOperation(userInputInterfaceEClass, USER_INPUT_INTERFACE___READ_STRING__STRING);
		createEOperation(userInputInterfaceEClass, USER_INPUT_INTERFACE___CONFIRM_ALERT__THROWABLE);
		createEOperation(userInputInterfaceEClass, USER_INPUT_INTERFACE___ABORT);

		gameLogEClass = createEClass(GAME_LOG);
		createEAttribute(gameLogEClass, GAME_LOG__LOG_ENTRIES);
		createEOperation(gameLogEClass, GAME_LOG___WRITE__STRING);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommandPackage theCommandPackage = (CommandPackage)EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		StereotypesPackage theStereotypesPackage = (StereotypesPackage)EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actorEClass.getESuperTypes().add(this.getTileContent());
		propEClass.getESuperTypes().add(this.getTileContent());
		tileEClass.getESuperTypes().add(theCommandPackage.getEntity());
		tileContentEClass.getESuperTypes().add(theCommandPackage.getEntity());
		stageEClass.getESuperTypes().add(theCommandPackage.getEntity());
		locationEClass.getESuperTypes().add(theStereotypesPackage.getValueType());
		userInputInterfaceEClass.getESuperTypes().add(theStereotypesPackage.getDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(actorEClass, Actor.class, "Actor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_Direction(), this.getDirection(), "direction", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propEClass, Prop.class, "Prop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTile_Contents(), this.getTileContent(), this.getTileContent_CurrentTile(), "contents", null, 0, -1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Location(), this.getLocation(), null, "location", null, 1, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_South(), this.getTile(), this.getTile_North(), "south", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_North(), this.getTile(), this.getTile_South(), "north", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_East(), this.getTile(), this.getTile_West(), "east", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_West(), this.getTile(), this.getTile_East(), "west", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Stage(), this.getStage(), this.getStage_Tiles(), "stage", null, 0, 1, Tile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tileContentEClass, TileContent.class, "TileContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTileContent_CurrentTile(), this.getTile(), this.getTile_Contents(), "currentTile", null, 0, 1, TileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTileContent_Stage(), this.getStage(), this.getStage_TileContents(), "stage", null, 0, 1, TileContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stageEClass, Stage.class, "Stage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStage_Tiles(), this.getTile(), this.getTile_Stage(), "tiles", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStage_TileContents(), this.getTileContent(), this.getTileContent_Stage(), "tileContents", null, 0, -1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStage_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Stage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(miniProgrammingWorldEClass, MiniProgrammingWorld.class, "MiniProgrammingWorld", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMiniProgrammingWorld_Stage(), this.getStage(), null, "stage", null, 1, 1, MiniProgrammingWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMiniProgrammingWorld_CommandStack(), theCommandPackage.getCommandStack(), null, "commandStack", null, 1, 1, MiniProgrammingWorld.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiniProgrammingWorld_GameLog(), this.getGameLog(), null, "gameLog", null, 1, 1, MiniProgrammingWorld.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMiniProgrammingWorld_UserInputInterface(), this.getUserInputInterface(), null, "userInputInterface", null, 1, 1, MiniProgrammingWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Column(), ecorePackage.getEInt(), "column", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Row(), ecorePackage.getEInt(), "row", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInputInterfaceEClass, UserInputInterface.class, "UserInputInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getUserInputInterface__ReadInteger__String(), ecorePackage.getEInt(), "readInteger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserInputInterface__ReadString__String(), ecorePackage.getEString(), "readString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserInputInterface__ConfirmAlert__Throwable(), null, "confirmAlert", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThrowable(), "t", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUserInputInterface__Abort(), null, "abort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameLogEClass, GameLog.class, "GameLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameLog_LogEntries(), ecorePackage.getEString(), "logEntries", null, 0, -1, GameLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGameLog__Write__String(), null, "write", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.NORTH);
		addEEnumLiteral(directionEEnum, Direction.SOUTH);
		addEEnumLiteral(directionEEnum, Direction.WEST);
		addEEnumLiteral(directionEEnum, Direction.EAST);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MpwPackageImpl
