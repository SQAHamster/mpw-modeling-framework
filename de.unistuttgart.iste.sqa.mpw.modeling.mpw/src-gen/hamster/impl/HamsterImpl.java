/**
 */
package hamster.impl;

import hamster.Grain;
import hamster.Hamster;
import hamster.HamsterPackage;

import java.util.Collection;

import mpw.impl.ActorImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hamster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hamster.impl.HamsterImpl#getGrains <em>Grains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HamsterImpl extends ActorImpl implements Hamster {
	/**
	 * The cached value of the '{@link #getGrains() <em>Grains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrains()
	 * @generated
	 * @ordered
	 */
	protected EList<Grain> grains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HamsterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HamsterPackage.Literals.HAMSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grain> getGrains() {
		if (grains == null) {
			grains = new EObjectResolvingEList<Grain>(Grain.class, this, HamsterPackage.HAMSTER__GRAINS);
		}
		return grains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HamsterPackage.HAMSTER__GRAINS:
				return getGrains();
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
			case HamsterPackage.HAMSTER__GRAINS:
				getGrains().clear();
				getGrains().addAll((Collection<? extends Grain>)newValue);
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
			case HamsterPackage.HAMSTER__GRAINS:
				getGrains().clear();
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
			case HamsterPackage.HAMSTER__GRAINS:
				return grains != null && !grains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HamsterImpl
