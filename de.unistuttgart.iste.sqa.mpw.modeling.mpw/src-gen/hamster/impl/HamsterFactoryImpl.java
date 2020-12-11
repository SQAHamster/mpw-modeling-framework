/**
 */
package hamster.impl;

import hamster.*;

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
public class HamsterFactoryImpl extends EFactoryImpl implements HamsterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HamsterFactory init() {
		try {
			HamsterFactory theHamsterFactory = (HamsterFactory)EPackage.Registry.INSTANCE.getEFactory(HamsterPackage.eNS_URI);
			if (theHamsterFactory != null) {
				return theHamsterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HamsterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterFactoryImpl() {
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
			case HamsterPackage.HAMSTER: return createHamster();
			case HamsterPackage.TERRITORY: return createTerritory();
			case HamsterPackage.GRAIN: return createGrain();
			case HamsterPackage.WALL: return createWall();
			case HamsterPackage.HAMSTER_GAME: return createHamsterGame();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hamster createHamster() {
		HamsterImpl hamster = new HamsterImpl();
		return hamster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Territory createTerritory() {
		TerritoryImpl territory = new TerritoryImpl();
		return territory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grain createGrain() {
		GrainImpl grain = new GrainImpl();
		return grain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wall createWall() {
		WallImpl wall = new WallImpl();
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterGame createHamsterGame() {
		HamsterGameImpl hamsterGame = new HamsterGameImpl();
		return hamsterGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HamsterPackage getHamsterPackage() {
		return (HamsterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HamsterPackage getPackage() {
		return HamsterPackage.eINSTANCE;
	}

} //HamsterFactoryImpl
