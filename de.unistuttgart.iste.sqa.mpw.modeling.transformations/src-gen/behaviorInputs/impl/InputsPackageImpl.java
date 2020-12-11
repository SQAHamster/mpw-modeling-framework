/**
 */
package behaviorInputs.impl;

import behaviorInputs.HenshinCommandInputs;
import behaviorInputs.InputsFactory;
import behaviorInputs.InputsPackage;
import behaviorInputs.QueryInputs;

import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.QuerydslPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.henshin.model.HenshinPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputsPackageImpl extends EPackageImpl implements InputsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass henshinCommandInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryInputsEClass = null;

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
	 * @see behaviorInputs.InputsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InputsPackageImpl() {
		super(eNS_URI, InputsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InputsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InputsPackage init() {
		if (isInited) return (InputsPackage)EPackage.Registry.INSTANCE.getEPackage(InputsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInputsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InputsPackageImpl theInputsPackage = registeredInputsPackage instanceof InputsPackageImpl ? (InputsPackageImpl)registeredInputsPackage : new InputsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HenshinPackage.eINSTANCE.eClass();
		QuerydslPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInputsPackage.createPackageContents();

		// Initialize created meta-data
		theInputsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInputsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InputsPackage.eNS_URI, theInputsPackage);
		return theInputsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHenshinCommandInputs() {
		return henshinCommandInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHenshinCommandInputs_Modules() {
		return (EReference)henshinCommandInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryInputs() {
		return queryInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryInputs_Models() {
		return (EReference)queryInputsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsFactory getInputsFactory() {
		return (InputsFactory)getEFactoryInstance();
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
		henshinCommandInputsEClass = createEClass(HENSHIN_COMMAND_INPUTS);
		createEReference(henshinCommandInputsEClass, HENSHIN_COMMAND_INPUTS__MODULES);

		queryInputsEClass = createEClass(QUERY_INPUTS);
		createEReference(queryInputsEClass, QUERY_INPUTS__MODELS);
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
		HenshinPackage theHenshinPackage = (HenshinPackage)EPackage.Registry.INSTANCE.getEPackage(HenshinPackage.eNS_URI);
		QuerydslPackage theQuerydslPackage = (QuerydslPackage)EPackage.Registry.INSTANCE.getEPackage(QuerydslPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(henshinCommandInputsEClass, HenshinCommandInputs.class, "HenshinCommandInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHenshinCommandInputs_Modules(), theHenshinPackage.getModule(), null, "modules", null, 0, -1, HenshinCommandInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryInputsEClass, QueryInputs.class, "QueryInputs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryInputs_Models(), theQuerydslPackage.getModel(), null, "models", null, 0, -1, QueryInputs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InputsPackageImpl
