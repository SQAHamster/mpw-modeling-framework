/**
 */
package hamsterviewmodel.impl;

import hamsterviewmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HamsterviewmodelFactoryImpl extends EFactoryImpl implements HamsterviewmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HamsterviewmodelFactory init() {
		try {
			HamsterviewmodelFactory theHamsterviewmodelFactory = (HamsterviewmodelFactory)EPackage.Registry.INSTANCE.getEFactory(HamsterviewmodelPackage.eNS_URI);
			if (theHamsterviewmodelFactory != null) {
				return theHamsterviewmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HamsterviewmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterviewmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL: return createGameViewModel();
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER: return createGameViewPresenter();
			case HamsterviewmodelPackage.VIEW_MODEL_CELL: return createViewModelCell();
			case HamsterviewmodelPackage.VIEW_MODEL_ROW: return createViewModelRow();
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER: return createViewModelCellLayer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameViewModel createGameViewModel() {
		GameViewModelImpl gameViewModel = new GameViewModelImpl();
		return gameViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameViewPresenter createGameViewPresenter() {
		GameViewPresenterImpl gameViewPresenter = new GameViewPresenterImpl();
		return gameViewPresenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelCell createViewModelCell() {
		ViewModelCellImpl viewModelCell = new ViewModelCellImpl();
		return viewModelCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelRow createViewModelRow() {
		ViewModelRowImpl viewModelRow = new ViewModelRowImpl();
		return viewModelRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelCellLayer createViewModelCellLayer() {
		ViewModelCellLayerImpl viewModelCellLayer = new ViewModelCellLayerImpl();
		return viewModelCellLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterviewmodelPackage getHamsterviewmodelPackage() {
		return (HamsterviewmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HamsterviewmodelPackage getPackage() {
		return HamsterviewmodelPackage.eINSTANCE;
	}

} //HamsterviewmodelFactoryImpl
