/**
 */
package hamsterviewmodel.util;

import hamsterviewmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import viewmodel.Presenter;
import viewmodel.ViewModel;
import viewmodel.ViewStereotype;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hamsterviewmodel.HamsterviewmodelPackage
 * @generated
 */
public class HamsterviewmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HamsterviewmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterviewmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = HamsterviewmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL: {
				GameViewModel gameViewModel = (GameViewModel)theEObject;
				T result = caseGameViewModel(gameViewModel);
				if (result == null) result = caseViewModel(gameViewModel);
				if (result == null) result = caseViewStereotype(gameViewModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HamsterviewmodelPackage.GAME_VIEW_INPUT: {
				GameViewInput gameViewInput = (GameViewInput)theEObject;
				T result = caseGameViewInput(gameViewInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HamsterviewmodelPackage.GAME_VIEW_PRESENTER: {
				GameViewPresenter gameViewPresenter = (GameViewPresenter)theEObject;
				T result = caseGameViewPresenter(gameViewPresenter);
				if (result == null) result = caseGameViewInput(gameViewPresenter);
				if (result == null) result = casePresenter(gameViewPresenter);
				if (result == null) result = caseViewStereotype(gameViewPresenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HamsterviewmodelPackage.VIEW_MODEL_CELL: {
				ViewModelCell viewModelCell = (ViewModelCell)theEObject;
				T result = caseViewModelCell(viewModelCell);
				if (result == null) result = caseViewModel(viewModelCell);
				if (result == null) result = caseViewStereotype(viewModelCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HamsterviewmodelPackage.VIEW_MODEL_ROW: {
				ViewModelRow viewModelRow = (ViewModelRow)theEObject;
				T result = caseViewModelRow(viewModelRow);
				if (result == null) result = caseViewModel(viewModelRow);
				if (result == null) result = caseViewStereotype(viewModelRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HamsterviewmodelPackage.VIEW_MODEL_CELL_LAYER: {
				ViewModelCellLayer viewModelCellLayer = (ViewModelCellLayer)theEObject;
				T result = caseViewModelCellLayer(viewModelCellLayer);
				if (result == null) result = caseViewModel(viewModelCellLayer);
				if (result == null) result = caseViewStereotype(viewModelCellLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameViewModel(GameViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameViewInput(GameViewInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View Presenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameViewPresenter(GameViewPresenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModelCell(ViewModelCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModelRow(ViewModelRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model Cell Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model Cell Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModelCellLayer(ViewModelCellLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewStereotype(ViewStereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModel(ViewModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresenter(Presenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HamsterviewmodelSwitch
