/**
 */
package hamster.impl;

import commands.CommandPackage;

import commands.impl.CommandPackageImpl;

import hamster.Grain;
import hamster.Hamster;
import hamster.HamsterFactory;
import hamster.HamsterGame;
import hamster.HamsterPackage;
import hamster.Territory;
import hamster.Wall;

import hamsterviewmodel.HamsterviewmodelPackage;

import hamsterviewmodel.impl.HamsterviewmodelPackageImpl;

import mpw.MpwPackage;

import mpw.impl.MpwPackageImpl;

import org.eclipse.emf.ecore.EClass;
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
public class HamsterPackageImpl extends EPackageImpl implements HamsterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hamsterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass territoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hamsterGameEClass = null;

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
	 * @see hamster.HamsterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HamsterPackageImpl() {
		super(eNS_URI, HamsterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HamsterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HamsterPackage init() {
		if (isInited) return (HamsterPackage)EPackage.Registry.INSTANCE.getEPackage(HamsterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHamsterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HamsterPackageImpl theHamsterPackage = registeredHamsterPackage instanceof HamsterPackageImpl ? (HamsterPackageImpl)registeredHamsterPackage : new HamsterPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl)(registeredPackage instanceof CommandPackageImpl ? registeredPackage : CommandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterviewmodelPackage.eNS_URI);
		HamsterviewmodelPackageImpl theHamsterviewmodelPackage = (HamsterviewmodelPackageImpl)(registeredPackage instanceof HamsterviewmodelPackageImpl ? registeredPackage : HamsterviewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);
		MpwPackageImpl theMpwPackage = (MpwPackageImpl)(registeredPackage instanceof MpwPackageImpl ? registeredPackage : MpwPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = (ViewmodelPackageImpl)(registeredPackage instanceof ViewmodelPackageImpl ? registeredPackage : ViewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = (StereotypesPackageImpl)(registeredPackage instanceof StereotypesPackageImpl ? registeredPackage : StereotypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHamsterPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theHamsterviewmodelPackage.createPackageContents();
		theMpwPackage.createPackageContents();
		theViewmodelPackage.createPackageContents();
		theStereotypesPackage.createPackageContents();

		// Initialize created meta-data
		theHamsterPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theHamsterviewmodelPackage.initializePackageContents();
		theMpwPackage.initializePackageContents();
		theViewmodelPackage.initializePackageContents();
		theStereotypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHamsterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HamsterPackage.eNS_URI, theHamsterPackage);
		return theHamsterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHamster() {
		return hamsterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHamster_Grains() {
		return (EReference)hamsterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerritory() {
		return territoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerritory_DefaultHamster() {
		return (EReference)territoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrain() {
		return grainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWall() {
		return wallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHamsterGame() {
		return hamsterGameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHamsterGame_Territory() {
		return (EReference)hamsterGameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterFactory getHamsterFactory() {
		return (HamsterFactory)getEFactoryInstance();
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
		hamsterEClass = createEClass(HAMSTER);
		createEReference(hamsterEClass, HAMSTER__GRAINS);

		territoryEClass = createEClass(TERRITORY);
		createEReference(territoryEClass, TERRITORY__DEFAULT_HAMSTER);

		grainEClass = createEClass(GRAIN);

		wallEClass = createEClass(WALL);

		hamsterGameEClass = createEClass(HAMSTER_GAME);
		createEReference(hamsterGameEClass, HAMSTER_GAME__TERRITORY);
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
		MpwPackage theMpwPackage = (MpwPackage)EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hamsterEClass.getESuperTypes().add(theMpwPackage.getActor());
		territoryEClass.getESuperTypes().add(theMpwPackage.getStage());
		grainEClass.getESuperTypes().add(theMpwPackage.getProp());
		wallEClass.getESuperTypes().add(theMpwPackage.getProp());
		hamsterGameEClass.getESuperTypes().add(theMpwPackage.getMiniProgrammingWorld());

		// Initialize classes, features, and operations; add parameters
		initEClass(hamsterEClass, Hamster.class, "Hamster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHamster_Grains(), this.getGrain(), null, "grains", null, 0, -1, Hamster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(territoryEClass, Territory.class, "Territory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerritory_DefaultHamster(), this.getHamster(), null, "defaultHamster", null, 1, 1, Territory.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grainEClass, Grain.class, "Grain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wallEClass, Wall.class, "Wall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hamsterGameEClass, HamsterGame.class, "HamsterGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHamsterGame_Territory(), this.getTerritory(), null, "territory", null, 1, 1, HamsterGame.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HamsterPackageImpl
