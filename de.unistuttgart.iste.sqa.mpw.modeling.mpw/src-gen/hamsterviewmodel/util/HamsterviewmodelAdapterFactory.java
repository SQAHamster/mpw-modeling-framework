/**
 */
package hamsterviewmodel.util;

import hamsterviewmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import viewmodel.Presenter;
import viewmodel.ViewModel;
import viewmodel.ViewStereotype;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hamsterviewmodel.HamsterviewmodelPackage
 * @generated
 */
public class HamsterviewmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HamsterviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterviewmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HamsterviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HamsterviewmodelSwitch<Adapter> modelSwitch =
		new HamsterviewmodelSwitch<Adapter>() {
			@Override
			public Adapter caseGameViewModel(GameViewModel object) {
				return createGameViewModelAdapter();
			}
			@Override
			public Adapter caseGameViewInput(GameViewInput object) {
				return createGameViewInputAdapter();
			}
			@Override
			public Adapter caseGameViewPresenter(GameViewPresenter object) {
				return createGameViewPresenterAdapter();
			}
			@Override
			public Adapter caseViewModelCell(ViewModelCell object) {
				return createViewModelCellAdapter();
			}
			@Override
			public Adapter caseViewModelRow(ViewModelRow object) {
				return createViewModelRowAdapter();
			}
			@Override
			public Adapter caseViewModelCellLayer(ViewModelCellLayer object) {
				return createViewModelCellLayerAdapter();
			}
			@Override
			public Adapter caseViewStereotype(ViewStereotype object) {
				return createViewStereotypeAdapter();
			}
			@Override
			public Adapter caseViewModel(ViewModel object) {
				return createViewModelAdapter();
			}
			@Override
			public Adapter casePresenter(Presenter object) {
				return createPresenterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.GameViewModel <em>Game View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.GameViewModel
	 * @generated
	 */
	public Adapter createGameViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.GameViewInput <em>Game View Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.GameViewInput
	 * @generated
	 */
	public Adapter createGameViewInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.GameViewPresenter <em>Game View Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.GameViewPresenter
	 * @generated
	 */
	public Adapter createGameViewPresenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.ViewModelCell <em>View Model Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.ViewModelCell
	 * @generated
	 */
	public Adapter createViewModelCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.ViewModelRow <em>View Model Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.ViewModelRow
	 * @generated
	 */
	public Adapter createViewModelRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hamsterviewmodel.ViewModelCellLayer <em>View Model Cell Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hamsterviewmodel.ViewModelCellLayer
	 * @generated
	 */
	public Adapter createViewModelCellLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link viewmodel.ViewStereotype <em>View Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see viewmodel.ViewStereotype
	 * @generated
	 */
	public Adapter createViewStereotypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link viewmodel.ViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see viewmodel.ViewModel
	 * @generated
	 */
	public Adapter createViewModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link viewmodel.Presenter <em>Presenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see viewmodel.Presenter
	 * @generated
	 */
	public Adapter createPresenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HamsterviewmodelAdapterFactory
