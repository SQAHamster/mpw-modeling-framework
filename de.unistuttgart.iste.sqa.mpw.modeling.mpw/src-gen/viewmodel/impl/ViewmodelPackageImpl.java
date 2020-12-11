/**
 */
package viewmodel.impl;

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

import stereotypes.StereotypesPackage;

import stereotypes.impl.StereotypesPackageImpl;

import viewmodel.Presenter;
import viewmodel.ViewModel;
import viewmodel.ViewStereotype;
import viewmodel.ViewmodelFactory;
import viewmodel.ViewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewmodelPackageImpl extends EPackageImpl implements ViewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewStereotypeEClass = null;

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
	 * @see viewmodel.ViewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewmodelPackageImpl() {
		super(eNS_URI, ViewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewmodelPackage init() {
		if (isInited) return (ViewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = registeredViewmodelPackage instanceof ViewmodelPackageImpl ? (ViewmodelPackageImpl)registeredViewmodelPackage : new ViewmodelPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = (StereotypesPackageImpl)(registeredPackage instanceof StereotypesPackageImpl ? registeredPackage : StereotypesPackage.eINSTANCE);

		// Create package meta-data objects
		theViewmodelPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theHamsterPackage.createPackageContents();
		theHamsterviewmodelPackage.createPackageContents();
		theMpwPackage.createPackageContents();
		theStereotypesPackage.createPackageContents();

		// Initialize created meta-data
		theViewmodelPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theHamsterPackage.initializePackageContents();
		theHamsterviewmodelPackage.initializePackageContents();
		theMpwPackage.initializePackageContents();
		theStereotypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewmodelPackage.eNS_URI, theViewmodelPackage);
		return theViewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPresenter() {
		return presenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModel() {
		return viewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewStereotype() {
		return viewStereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewmodelFactory getViewmodelFactory() {
		return (ViewmodelFactory)getEFactoryInstance();
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
		presenterEClass = createEClass(PRESENTER);

		viewModelEClass = createEClass(VIEW_MODEL);

		viewStereotypeEClass = createEClass(VIEW_STEREOTYPE);
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
		presenterEClass.getESuperTypes().add(this.getViewStereotype());
		viewModelEClass.getESuperTypes().add(this.getViewStereotype());

		// Initialize classes, features, and operations; add parameters
		initEClass(presenterEClass, Presenter.class, "Presenter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewModelEClass, ViewModel.class, "ViewModel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewStereotypeEClass, ViewStereotype.class, "ViewStereotype", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ViewmodelPackageImpl
