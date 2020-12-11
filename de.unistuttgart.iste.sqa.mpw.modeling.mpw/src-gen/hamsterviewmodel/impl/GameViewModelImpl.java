/**
 */
package hamsterviewmodel.impl;

import hamsterviewmodel.GameViewModel;
import hamsterviewmodel.HamsterviewmodelPackage;
import hamsterviewmodel.ViewModelRow;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamsterviewmodel.impl.GameViewModelImpl#getLogEntries <em>Log Entries</em>}</li>
 *   <li>{@link hamsterviewmodel.impl.GameViewModelImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameViewModelImpl extends MinimalEObjectImpl.Container implements GameViewModel {
	/**
	 * The cached value of the '{@link #getLogEntries() <em>Log Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<String> logEntries;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewModelRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterviewmodelPackage.Literals.GAME_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLogEntries() {
		if (logEntries == null) {
			logEntries = new EDataTypeEList<String>(String.class, this, HamsterviewmodelPackage.GAME_VIEW_MODEL__LOG_ENTRIES);
		}
		return logEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewModelRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<ViewModelRow>(ViewModelRow.class, this, HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__LOG_ENTRIES:
				return getLogEntries();
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS:
				return getRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__LOG_ENTRIES:
				getLogEntries().clear();
				getLogEntries().addAll((Collection<? extends String>)newValue);
				return;
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends ViewModelRow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__LOG_ENTRIES:
				getLogEntries().clear();
				return;
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS:
				getRows().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__LOG_ENTRIES:
				return logEntries != null && !logEntries.isEmpty();
			case HamsterviewmodelPackage.GAME_VIEW_MODEL__ROWS:
				return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (logEntries: ");
		result.append(logEntries);
		result.append(')');
		return result.toString();
	}

} //GameViewModelImpl
