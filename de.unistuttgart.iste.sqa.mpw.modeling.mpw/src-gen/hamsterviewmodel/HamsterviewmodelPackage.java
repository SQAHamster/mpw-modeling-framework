/**
 */
package hamsterviewmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import viewmodel.ViewmodelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hamsterviewmodel.HamsterviewmodelFactory
 * @model kind="package"
 * @generated
 */
public interface HamsterviewmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hamsterviewmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/hamsterviewmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hamsterviewmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HamsterviewmodelPackage eINSTANCE = hamsterviewmodel.impl.HamsterviewmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link hamsterviewmodel.impl.GameViewModelImpl <em>Game View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.impl.GameViewModelImpl
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewModel()
	 * @generated
	 */
	int GAME_VIEW_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Log Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_MODEL__LOG_ENTRIES = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_MODEL__ROWS = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_MODEL_FEATURE_COUNT = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Game View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_MODEL_OPERATION_COUNT = ViewmodelPackage.VIEW_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamsterviewmodel.GameViewInput <em>Game View Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.GameViewInput
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewInput()
	 * @generated
	 */
	int GAME_VIEW_INPUT = 1;

	/**
	 * The number of structural features of the '<em>Game View Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Play Clicked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT___PLAY_CLICKED = 0;

	/**
	 * The operation id for the '<em>Stop Clicked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT___STOP_CLICKED = 1;

	/**
	 * The operation id for the '<em>Text Typed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT___TEXT_TYPED__STRING = 2;

	/**
	 * The operation id for the '<em>Get View Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT___GET_VIEW_MODEL = 3;

	/**
	 * The number of operations of the '<em>Game View Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_INPUT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link hamsterviewmodel.impl.GameViewPresenterImpl <em>Game View Presenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.impl.GameViewPresenterImpl
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewPresenter()
	 * @generated
	 */
	int GAME_VIEW_PRESENTER = 2;

	/**
	 * The feature id for the '<em><b>View Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER__VIEW_MODEL = GAME_VIEW_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game View Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER_FEATURE_COUNT = GAME_VIEW_INPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Play Clicked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER___PLAY_CLICKED = GAME_VIEW_INPUT___PLAY_CLICKED;

	/**
	 * The operation id for the '<em>Stop Clicked</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER___STOP_CLICKED = GAME_VIEW_INPUT___STOP_CLICKED;

	/**
	 * The operation id for the '<em>Text Typed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER___TEXT_TYPED__STRING = GAME_VIEW_INPUT___TEXT_TYPED__STRING;

	/**
	 * The operation id for the '<em>Get View Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER___GET_VIEW_MODEL = GAME_VIEW_INPUT___GET_VIEW_MODEL;

	/**
	 * The number of operations of the '<em>Game View Presenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_PRESENTER_OPERATION_COUNT = GAME_VIEW_INPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamsterviewmodel.impl.ViewModelCellImpl <em>View Model Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.impl.ViewModelCellImpl
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelCell()
	 * @generated
	 */
	int VIEW_MODEL_CELL = 3;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL__LAYERS = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Model Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_FEATURE_COUNT = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Model Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_OPERATION_COUNT = ViewmodelPackage.VIEW_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamsterviewmodel.impl.ViewModelRowImpl <em>View Model Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.impl.ViewModelRowImpl
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelRow()
	 * @generated
	 */
	int VIEW_MODEL_ROW = 4;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_ROW__CELLS = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Model Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_ROW_FEATURE_COUNT = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Model Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_ROW_OPERATION_COUNT = ViewmodelPackage.VIEW_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamsterviewmodel.impl.ViewModelCellLayerImpl <em>View Model Cell Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamsterviewmodel.impl.ViewModelCellLayerImpl
	 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelCellLayer()
	 * @generated
	 */
	int VIEW_MODEL_CELL_LAYER = 5;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_LAYER__IMAGE_NAME = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_LAYER__ROTATION = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_LAYER__VISIBLE = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Model Cell Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_LAYER_FEATURE_COUNT = ViewmodelPackage.VIEW_MODEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View Model Cell Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_CELL_LAYER_OPERATION_COUNT = ViewmodelPackage.VIEW_MODEL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.GameViewModel <em>Game View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View Model</em>'.
	 * @see hamsterviewmodel.GameViewModel
	 * @generated
	 */
	EClass getGameViewModel();

	/**
	 * Returns the meta object for the attribute list '{@link hamsterviewmodel.GameViewModel#getLogEntries <em>Log Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log Entries</em>'.
	 * @see hamsterviewmodel.GameViewModel#getLogEntries()
	 * @see #getGameViewModel()
	 * @generated
	 */
	EAttribute getGameViewModel_LogEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link hamsterviewmodel.GameViewModel#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see hamsterviewmodel.GameViewModel#getRows()
	 * @see #getGameViewModel()
	 * @generated
	 */
	EReference getGameViewModel_Rows();

	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.GameViewInput <em>Game View Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View Input</em>'.
	 * @see hamsterviewmodel.GameViewInput
	 * @generated
	 */
	EClass getGameViewInput();

	/**
	 * Returns the meta object for the '{@link hamsterviewmodel.GameViewInput#playClicked() <em>Play Clicked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Play Clicked</em>' operation.
	 * @see hamsterviewmodel.GameViewInput#playClicked()
	 * @generated
	 */
	EOperation getGameViewInput__PlayClicked();

	/**
	 * Returns the meta object for the '{@link hamsterviewmodel.GameViewInput#stopClicked() <em>Stop Clicked</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Clicked</em>' operation.
	 * @see hamsterviewmodel.GameViewInput#stopClicked()
	 * @generated
	 */
	EOperation getGameViewInput__StopClicked();

	/**
	 * Returns the meta object for the '{@link hamsterviewmodel.GameViewInput#textTyped(java.lang.String) <em>Text Typed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Text Typed</em>' operation.
	 * @see hamsterviewmodel.GameViewInput#textTyped(java.lang.String)
	 * @generated
	 */
	EOperation getGameViewInput__TextTyped__String();

	/**
	 * Returns the meta object for the '{@link hamsterviewmodel.GameViewInput#getViewModel() <em>Get View Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get View Model</em>' operation.
	 * @see hamsterviewmodel.GameViewInput#getViewModel()
	 * @generated
	 */
	EOperation getGameViewInput__GetViewModel();

	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.GameViewPresenter <em>Game View Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View Presenter</em>'.
	 * @see hamsterviewmodel.GameViewPresenter
	 * @generated
	 */
	EClass getGameViewPresenter();

	/**
	 * Returns the meta object for the containment reference '{@link hamsterviewmodel.GameViewPresenter#getViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Model</em>'.
	 * @see hamsterviewmodel.GameViewPresenter#getViewModel()
	 * @see #getGameViewPresenter()
	 * @generated
	 */
	EReference getGameViewPresenter_ViewModel();

	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.ViewModelCell <em>View Model Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model Cell</em>'.
	 * @see hamsterviewmodel.ViewModelCell
	 * @generated
	 */
	EClass getViewModelCell();

	/**
	 * Returns the meta object for the containment reference list '{@link hamsterviewmodel.ViewModelCell#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see hamsterviewmodel.ViewModelCell#getLayers()
	 * @see #getViewModelCell()
	 * @generated
	 */
	EReference getViewModelCell_Layers();

	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.ViewModelRow <em>View Model Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model Row</em>'.
	 * @see hamsterviewmodel.ViewModelRow
	 * @generated
	 */
	EClass getViewModelRow();

	/**
	 * Returns the meta object for the containment reference list '{@link hamsterviewmodel.ViewModelRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see hamsterviewmodel.ViewModelRow#getCells()
	 * @see #getViewModelRow()
	 * @generated
	 */
	EReference getViewModelRow_Cells();

	/**
	 * Returns the meta object for class '{@link hamsterviewmodel.ViewModelCellLayer <em>View Model Cell Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model Cell Layer</em>'.
	 * @see hamsterviewmodel.ViewModelCellLayer
	 * @generated
	 */
	EClass getViewModelCellLayer();

	/**
	 * Returns the meta object for the attribute '{@link hamsterviewmodel.ViewModelCellLayer#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see hamsterviewmodel.ViewModelCellLayer#getImageName()
	 * @see #getViewModelCellLayer()
	 * @generated
	 */
	EAttribute getViewModelCellLayer_ImageName();

	/**
	 * Returns the meta object for the attribute '{@link hamsterviewmodel.ViewModelCellLayer#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see hamsterviewmodel.ViewModelCellLayer#getRotation()
	 * @see #getViewModelCellLayer()
	 * @generated
	 */
	EAttribute getViewModelCellLayer_Rotation();

	/**
	 * Returns the meta object for the attribute '{@link hamsterviewmodel.ViewModelCellLayer#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see hamsterviewmodel.ViewModelCellLayer#isVisible()
	 * @see #getViewModelCellLayer()
	 * @generated
	 */
	EAttribute getViewModelCellLayer_Visible();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HamsterviewmodelFactory getHamsterviewmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hamsterviewmodel.impl.GameViewModelImpl <em>Game View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.impl.GameViewModelImpl
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewModel()
		 * @generated
		 */
		EClass GAME_VIEW_MODEL = eINSTANCE.getGameViewModel();

		/**
		 * The meta object literal for the '<em><b>Log Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_VIEW_MODEL__LOG_ENTRIES = eINSTANCE.getGameViewModel_LogEntries();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW_MODEL__ROWS = eINSTANCE.getGameViewModel_Rows();

		/**
		 * The meta object literal for the '{@link hamsterviewmodel.GameViewInput <em>Game View Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.GameViewInput
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewInput()
		 * @generated
		 */
		EClass GAME_VIEW_INPUT = eINSTANCE.getGameViewInput();

		/**
		 * The meta object literal for the '<em><b>Play Clicked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_VIEW_INPUT___PLAY_CLICKED = eINSTANCE.getGameViewInput__PlayClicked();

		/**
		 * The meta object literal for the '<em><b>Stop Clicked</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_VIEW_INPUT___STOP_CLICKED = eINSTANCE.getGameViewInput__StopClicked();

		/**
		 * The meta object literal for the '<em><b>Text Typed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_VIEW_INPUT___TEXT_TYPED__STRING = eINSTANCE.getGameViewInput__TextTyped__String();

		/**
		 * The meta object literal for the '<em><b>Get View Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_VIEW_INPUT___GET_VIEW_MODEL = eINSTANCE.getGameViewInput__GetViewModel();

		/**
		 * The meta object literal for the '{@link hamsterviewmodel.impl.GameViewPresenterImpl <em>Game View Presenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.impl.GameViewPresenterImpl
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getGameViewPresenter()
		 * @generated
		 */
		EClass GAME_VIEW_PRESENTER = eINSTANCE.getGameViewPresenter();

		/**
		 * The meta object literal for the '<em><b>View Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW_PRESENTER__VIEW_MODEL = eINSTANCE.getGameViewPresenter_ViewModel();

		/**
		 * The meta object literal for the '{@link hamsterviewmodel.impl.ViewModelCellImpl <em>View Model Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.impl.ViewModelCellImpl
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelCell()
		 * @generated
		 */
		EClass VIEW_MODEL_CELL = eINSTANCE.getViewModelCell();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL_CELL__LAYERS = eINSTANCE.getViewModelCell_Layers();

		/**
		 * The meta object literal for the '{@link hamsterviewmodel.impl.ViewModelRowImpl <em>View Model Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.impl.ViewModelRowImpl
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelRow()
		 * @generated
		 */
		EClass VIEW_MODEL_ROW = eINSTANCE.getViewModelRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL_ROW__CELLS = eINSTANCE.getViewModelRow_Cells();

		/**
		 * The meta object literal for the '{@link hamsterviewmodel.impl.ViewModelCellLayerImpl <em>View Model Cell Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamsterviewmodel.impl.ViewModelCellLayerImpl
		 * @see hamsterviewmodel.impl.HamsterviewmodelPackageImpl#getViewModelCellLayer()
		 * @generated
		 */
		EClass VIEW_MODEL_CELL_LAYER = eINSTANCE.getViewModelCellLayer();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_CELL_LAYER__IMAGE_NAME = eINSTANCE.getViewModelCellLayer_ImageName();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_CELL_LAYER__ROTATION = eINSTANCE.getViewModelCellLayer_Rotation();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_CELL_LAYER__VISIBLE = eINSTANCE.getViewModelCellLayer_Visible();

	}

} //HamsterviewmodelPackage
