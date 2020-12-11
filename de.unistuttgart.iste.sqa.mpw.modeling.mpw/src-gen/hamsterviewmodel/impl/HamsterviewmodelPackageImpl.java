/**
 */
package hamsterviewmodel.impl;

import commands.CommandPackage;

import commands.impl.CommandPackageImpl;

import hamster.HamsterPackage;

import hamster.impl.HamsterPackageImpl;

import hamsterviewmodel.GameViewInput;
import hamsterviewmodel.GameViewModel;
import hamsterviewmodel.GameViewPresenter;
import hamsterviewmodel.HamsterviewmodelFactory;
import hamsterviewmodel.HamsterviewmodelPackage;
import hamsterviewmodel.ViewModelCell;
import hamsterviewmodel.ViewModelCellLayer;
import hamsterviewmodel.ViewModelRow;

import mpw.MpwPackage;

import mpw.impl.MpwPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class HamsterviewmodelPackageImpl extends EPackageImpl implements HamsterviewmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameViewModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameViewInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameViewPresenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelCellLayerEClass = null;

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
	 * @see hamsterviewmodel.HamsterviewmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HamsterviewmodelPackageImpl() {
		super(eNS_URI, HamsterviewmodelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HamsterviewmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HamsterviewmodelPackage init() {
		if (isInited) return (HamsterviewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(HamsterviewmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHamsterviewmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HamsterviewmodelPackageImpl theHamsterviewmodelPackage = registeredHamsterviewmodelPackage instanceof HamsterviewmodelPackageImpl ? (HamsterviewmodelPackageImpl)registeredHamsterviewmodelPackage : new HamsterviewmodelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl)(registeredPackage instanceof CommandPackageImpl ? registeredPackage : CommandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterPackage.eNS_URI);
		HamsterPackageImpl theHamsterPackage = (HamsterPackageImpl)(registeredPackage instanceof HamsterPackageImpl ? registeredPackage : HamsterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);
		MpwPackageImpl theMpwPackage = (MpwPackageImpl)(registeredPackage instanceof MpwPackageImpl ? registeredPackage : MpwPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = (ViewmodelPackageImpl)(registeredPackage instanceof ViewmodelPackageImpl ? registeredPackage : ViewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = (StereotypesPackageImpl)(registeredPackage instanceof StereotypesPackageImpl ? registeredPackage : StereotypesPackage.eINSTANCE);

		// Create package meta-data objects
		theHamsterviewmodelPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theHamsterPackage.createPackageContents();
		theMpwPackage.createPackageContents();
		theViewmodelPackage.createPackageContents();
		theStereotypesPackage.createPackageContents();

		// Initialize created meta-data
		theHamsterviewmodelPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theHamsterPackage.initializePackageContents();
		theMpwPackage.initializePackageContents();
		theViewmodelPackage.initializePackageContents();
		theStereotypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHamsterviewmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HamsterviewmodelPackage.eNS_URI, theHamsterviewmodelPackage);
		return theHamsterviewmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameViewModel() {
		return gameViewModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGameViewModel_LogEntries() {
		return (EAttribute)gameViewModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameViewModel_Rows() {
		return (EReference)gameViewModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameViewInput() {
		return gameViewInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameViewInput__PlayClicked() {
		return gameViewInputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameViewInput__StopClicked() {
		return gameViewInputEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameViewInput__TextTyped__String() {
		return gameViewInputEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameViewInput__GetViewModel() {
		return gameViewInputEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameViewPresenter() {
		return gameViewPresenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameViewPresenter_ViewModel() {
		return (EReference)gameViewPresenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModelCell() {
		return viewModelCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModelCell_Layers() {
		return (EReference)viewModelCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModelRow() {
		return viewModelRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModelRow_Cells() {
		return (EReference)viewModelRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModelCellLayer() {
		return viewModelCellLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelCellLayer_ImageName() {
		return (EAttribute)viewModelCellLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelCellLayer_Rotation() {
		return (EAttribute)viewModelCellLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelCellLayer_Visible() {
		return (EAttribute)viewModelCellLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterviewmodelFactory getHamsterviewmodelFactory() {
		return (HamsterviewmodelFactory)getEFactoryInstance();
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
		gameViewModelEClass = createEClass(GAME_VIEW_MODEL);
		createEAttribute(gameViewModelEClass, GAME_VIEW_MODEL__LOG_ENTRIES);
		createEReference(gameViewModelEClass, GAME_VIEW_MODEL__ROWS);

		gameViewInputEClass = createEClass(GAME_VIEW_INPUT);
		createEOperation(gameViewInputEClass, GAME_VIEW_INPUT___PLAY_CLICKED);
		createEOperation(gameViewInputEClass, GAME_VIEW_INPUT___STOP_CLICKED);
		createEOperation(gameViewInputEClass, GAME_VIEW_INPUT___TEXT_TYPED__STRING);
		createEOperation(gameViewInputEClass, GAME_VIEW_INPUT___GET_VIEW_MODEL);

		gameViewPresenterEClass = createEClass(GAME_VIEW_PRESENTER);
		createEReference(gameViewPresenterEClass, GAME_VIEW_PRESENTER__VIEW_MODEL);

		viewModelCellEClass = createEClass(VIEW_MODEL_CELL);
		createEReference(viewModelCellEClass, VIEW_MODEL_CELL__LAYERS);

		viewModelRowEClass = createEClass(VIEW_MODEL_ROW);
		createEReference(viewModelRowEClass, VIEW_MODEL_ROW__CELLS);

		viewModelCellLayerEClass = createEClass(VIEW_MODEL_CELL_LAYER);
		createEAttribute(viewModelCellLayerEClass, VIEW_MODEL_CELL_LAYER__IMAGE_NAME);
		createEAttribute(viewModelCellLayerEClass, VIEW_MODEL_CELL_LAYER__ROTATION);
		createEAttribute(viewModelCellLayerEClass, VIEW_MODEL_CELL_LAYER__VISIBLE);
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
		ViewmodelPackage theViewmodelPackage = (ViewmodelPackage)EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gameViewModelEClass.getESuperTypes().add(theViewmodelPackage.getViewModel());
		gameViewPresenterEClass.getESuperTypes().add(this.getGameViewInput());
		gameViewPresenterEClass.getESuperTypes().add(theViewmodelPackage.getPresenter());
		viewModelCellEClass.getESuperTypes().add(theViewmodelPackage.getViewModel());
		viewModelRowEClass.getESuperTypes().add(theViewmodelPackage.getViewModel());
		viewModelCellLayerEClass.getESuperTypes().add(theViewmodelPackage.getViewModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(gameViewModelEClass, GameViewModel.class, "GameViewModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameViewModel_LogEntries(), ecorePackage.getEString(), "logEntries", null, 0, -1, GameViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameViewModel_Rows(), this.getViewModelRow(), null, "rows", null, 0, -1, GameViewModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameViewInputEClass, GameViewInput.class, "GameViewInput", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGameViewInput__PlayClicked(), null, "playClicked", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameViewInput__StopClicked(), null, "stopClicked", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGameViewInput__TextTyped__String(), null, "textTyped", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "text", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGameViewInput__GetViewModel(), this.getGameViewModel(), "getViewModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gameViewPresenterEClass, GameViewPresenter.class, "GameViewPresenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameViewPresenter_ViewModel(), this.getGameViewModel(), null, "viewModel", null, 1, 1, GameViewPresenter.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelCellEClass, ViewModelCell.class, "ViewModelCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModelCell_Layers(), this.getViewModelCellLayer(), null, "layers", null, 0, -1, ViewModelCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelRowEClass, ViewModelRow.class, "ViewModelRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewModelRow_Cells(), this.getViewModelCell(), null, "cells", null, 0, -1, ViewModelRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewModelCellLayerEClass, ViewModelCellLayer.class, "ViewModelCellLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewModelCellLayer_ImageName(), ecorePackage.getEString(), "imageName", null, 0, 1, ViewModelCellLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewModelCellLayer_Rotation(), ecorePackage.getEInt(), "rotation", null, 0, 1, ViewModelCellLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewModelCellLayer_Visible(), ecorePackage.getEBoolean(), "visible", null, 0, 1, ViewModelCellLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HamsterviewmodelPackageImpl
