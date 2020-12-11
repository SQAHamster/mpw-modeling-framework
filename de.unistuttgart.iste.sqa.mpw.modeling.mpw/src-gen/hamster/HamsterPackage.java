/**
 */
package hamster;

import mpw.MpwPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see hamster.HamsterFactory
 * @model kind="package"
 * @generated
 */
public interface HamsterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hamster";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/hamster";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hamster";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HamsterPackage eINSTANCE = hamster.impl.HamsterPackageImpl.init();

	/**
	 * The meta object id for the '{@link hamster.impl.HamsterImpl <em>Hamster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamster.impl.HamsterImpl
	 * @see hamster.impl.HamsterPackageImpl#getHamster()
	 * @generated
	 */
	int HAMSTER = 0;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER__CURRENT_TILE = MpwPackage.ACTOR__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER__STAGE = MpwPackage.ACTOR__STAGE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER__DIRECTION = MpwPackage.ACTOR__DIRECTION;

	/**
	 * The feature id for the '<em><b>Grains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER__GRAINS = MpwPackage.ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hamster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_FEATURE_COUNT = MpwPackage.ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hamster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_OPERATION_COUNT = MpwPackage.ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamster.impl.TerritoryImpl <em>Territory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamster.impl.TerritoryImpl
	 * @see hamster.impl.HamsterPackageImpl#getTerritory()
	 * @generated
	 */
	int TERRITORY = 1;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__TILES = MpwPackage.STAGE__TILES;

	/**
	 * The feature id for the '<em><b>Tile Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__TILE_CONTENTS = MpwPackage.STAGE__TILE_CONTENTS;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__WIDTH = MpwPackage.STAGE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__HEIGHT = MpwPackage.STAGE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Default Hamster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY__DEFAULT_HAMSTER = MpwPackage.STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Territory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY_FEATURE_COUNT = MpwPackage.STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Territory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERRITORY_OPERATION_COUNT = MpwPackage.STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamster.impl.GrainImpl <em>Grain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamster.impl.GrainImpl
	 * @see hamster.impl.HamsterPackageImpl#getGrain()
	 * @generated
	 */
	int GRAIN = 2;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN__CURRENT_TILE = MpwPackage.PROP__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN__STAGE = MpwPackage.PROP__STAGE;

	/**
	 * The number of structural features of the '<em>Grain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_FEATURE_COUNT = MpwPackage.PROP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAIN_OPERATION_COUNT = MpwPackage.PROP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamster.impl.WallImpl <em>Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamster.impl.WallImpl
	 * @see hamster.impl.HamsterPackageImpl#getWall()
	 * @generated
	 */
	int WALL = 3;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__CURRENT_TILE = MpwPackage.PROP__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL__STAGE = MpwPackage.PROP__STAGE;

	/**
	 * The number of structural features of the '<em>Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_FEATURE_COUNT = MpwPackage.PROP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WALL_OPERATION_COUNT = MpwPackage.PROP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hamster.impl.HamsterGameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hamster.impl.HamsterGameImpl
	 * @see hamster.impl.HamsterPackageImpl#getHamsterGame()
	 * @generated
	 */
	int HAMSTER_GAME = 4;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME__STAGE = MpwPackage.MINI_PROGRAMMING_WORLD__STAGE;

	/**
	 * The feature id for the '<em><b>Command Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME__COMMAND_STACK = MpwPackage.MINI_PROGRAMMING_WORLD__COMMAND_STACK;

	/**
	 * The feature id for the '<em><b>Game Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME__GAME_LOG = MpwPackage.MINI_PROGRAMMING_WORLD__GAME_LOG;

	/**
	 * The feature id for the '<em><b>User Input Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME__USER_INPUT_INTERFACE = MpwPackage.MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE;

	/**
	 * The feature id for the '<em><b>Territory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME__TERRITORY = MpwPackage.MINI_PROGRAMMING_WORLD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME_FEATURE_COUNT = MpwPackage.MINI_PROGRAMMING_WORLD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMSTER_GAME_OPERATION_COUNT = MpwPackage.MINI_PROGRAMMING_WORLD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hamster.Hamster <em>Hamster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hamster</em>'.
	 * @see hamster.Hamster
	 * @generated
	 */
	EClass getHamster();

	/**
	 * Returns the meta object for the reference list '{@link hamster.Hamster#getGrains <em>Grains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grains</em>'.
	 * @see hamster.Hamster#getGrains()
	 * @see #getHamster()
	 * @generated
	 */
	EReference getHamster_Grains();

	/**
	 * Returns the meta object for class '{@link hamster.Territory <em>Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Territory</em>'.
	 * @see hamster.Territory
	 * @generated
	 */
	EClass getTerritory();

	/**
	 * Returns the meta object for the containment reference '{@link hamster.Territory#getDefaultHamster <em>Default Hamster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Hamster</em>'.
	 * @see hamster.Territory#getDefaultHamster()
	 * @see #getTerritory()
	 * @generated
	 */
	EReference getTerritory_DefaultHamster();

	/**
	 * Returns the meta object for class '{@link hamster.Grain <em>Grain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grain</em>'.
	 * @see hamster.Grain
	 * @generated
	 */
	EClass getGrain();

	/**
	 * Returns the meta object for class '{@link hamster.Wall <em>Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wall</em>'.
	 * @see hamster.Wall
	 * @generated
	 */
	EClass getWall();

	/**
	 * Returns the meta object for class '{@link hamster.HamsterGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see hamster.HamsterGame
	 * @generated
	 */
	EClass getHamsterGame();

	/**
	 * Returns the meta object for the containment reference '{@link hamster.HamsterGame#getTerritory <em>Territory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Territory</em>'.
	 * @see hamster.HamsterGame#getTerritory()
	 * @see #getHamsterGame()
	 * @generated
	 */
	EReference getHamsterGame_Territory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HamsterFactory getHamsterFactory();

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
		 * The meta object literal for the '{@link hamster.impl.HamsterImpl <em>Hamster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamster.impl.HamsterImpl
		 * @see hamster.impl.HamsterPackageImpl#getHamster()
		 * @generated
		 */
		EClass HAMSTER = eINSTANCE.getHamster();

		/**
		 * The meta object literal for the '<em><b>Grains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAMSTER__GRAINS = eINSTANCE.getHamster_Grains();

		/**
		 * The meta object literal for the '{@link hamster.impl.TerritoryImpl <em>Territory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamster.impl.TerritoryImpl
		 * @see hamster.impl.HamsterPackageImpl#getTerritory()
		 * @generated
		 */
		EClass TERRITORY = eINSTANCE.getTerritory();

		/**
		 * The meta object literal for the '<em><b>Default Hamster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERRITORY__DEFAULT_HAMSTER = eINSTANCE.getTerritory_DefaultHamster();

		/**
		 * The meta object literal for the '{@link hamster.impl.GrainImpl <em>Grain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamster.impl.GrainImpl
		 * @see hamster.impl.HamsterPackageImpl#getGrain()
		 * @generated
		 */
		EClass GRAIN = eINSTANCE.getGrain();

		/**
		 * The meta object literal for the '{@link hamster.impl.WallImpl <em>Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamster.impl.WallImpl
		 * @see hamster.impl.HamsterPackageImpl#getWall()
		 * @generated
		 */
		EClass WALL = eINSTANCE.getWall();

		/**
		 * The meta object literal for the '{@link hamster.impl.HamsterGameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hamster.impl.HamsterGameImpl
		 * @see hamster.impl.HamsterPackageImpl#getHamsterGame()
		 * @generated
		 */
		EClass HAMSTER_GAME = eINSTANCE.getHamsterGame();

		/**
		 * The meta object literal for the '<em><b>Territory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAMSTER_GAME__TERRITORY = eINSTANCE.getHamsterGame_Territory();

	}

} //HamsterPackage
