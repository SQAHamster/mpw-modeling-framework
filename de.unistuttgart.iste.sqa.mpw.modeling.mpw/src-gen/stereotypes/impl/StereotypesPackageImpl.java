/**
 */
package stereotypes.impl;

import commands.CommandPackage;

import commands.impl.CommandPackageImpl;

import hamster.HamsterPackage;

import hamster.impl.HamsterPackageImpl;

import hamsterviewmodel.HamsterviewmodelPackage;

import hamsterviewmodel.impl.HamsterviewmodelPackageImpl;

import mpw.MpwPackage;

import mpw.impl.MpwPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stereotypes.Dependency;
import stereotypes.StereotypesFactory;
import stereotypes.StereotypesPackage;
import stereotypes.ValueType;

import viewmodel.ViewmodelPackage;

import viewmodel.impl.ViewmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StereotypesPackageImpl extends EPackageImpl implements StereotypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

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
	 * @see stereotypes.StereotypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StereotypesPackageImpl() {
		super(eNS_URI, StereotypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StereotypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StereotypesPackage init() {
		if (isInited) return (StereotypesPackage)EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStereotypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = registeredStereotypesPackage instanceof StereotypesPackageImpl ? (StereotypesPackageImpl)registeredStereotypesPackage : new StereotypesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl)(registeredPackage instanceof CommandPackageImpl ? registeredPackage : CommandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterPackage.eNS_URI);
		HamsterPackageImpl theHamsterPackage = (HamsterPackageImpl)(registeredPackage instanceof HamsterPackageImpl ? registeredPackage : HamsterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterviewmodelPackage.eNS_URI);
		HamsterviewmodelPackageImpl theHamsterviewmodelPackage = (HamsterviewmodelPackageImpl)(registeredPackage instanceof HamsterviewmodelPackageImpl ? registeredPackage : HamsterviewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);
		MpwPackageImpl theMpwPackage = (MpwPackageImpl)(registeredPackage instanceof MpwPackageImpl ? registeredPackage : MpwPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = (ViewmodelPackageImpl)(registeredPackage instanceof ViewmodelPackageImpl ? registeredPackage : ViewmodelPackage.eINSTANCE);

		// Create package meta-data objects
		theStereotypesPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theHamsterPackage.createPackageContents();
		theHamsterviewmodelPackage.createPackageContents();
		theMpwPackage.createPackageContents();
		theViewmodelPackage.createPackageContents();

		// Initialize created meta-data
		theStereotypesPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theHamsterPackage.initializePackageContents();
		theHamsterviewmodelPackage.initializePackageContents();
		theMpwPackage.initializePackageContents();
		theViewmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStereotypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StereotypesPackage.eNS_URI, theStereotypesPackage);
		return theStereotypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypesFactory getStereotypesFactory() {
		return (StereotypesFactory)getEFactoryInstance();
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
		valueTypeEClass = createEClass(VALUE_TYPE);

		dependencyEClass = createEClass(DEPENDENCY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(valueTypeEClass, ValueType.class, "ValueType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //StereotypesPackageImpl
