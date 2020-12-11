/**
 */
package mpw;

import commands.CommandPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import stereotypes.StereotypesPackage;

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
 * @see mpw.MpwFactory
 * @model kind="package"
 * @generated
 */
public interface MpwPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mpw";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/mpw";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mpw";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MpwPackage eINSTANCE = mpw.impl.MpwPackageImpl.init();

	/**
	 * The meta object id for the '{@link mpw.impl.TileContentImpl <em>Tile Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.TileContentImpl
	 * @see mpw.impl.MpwPackageImpl#getTileContent()
	 * @generated
	 */
	int TILE_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_CONTENT__CURRENT_TILE = CommandPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_CONTENT__STAGE = CommandPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tile Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_CONTENT_FEATURE_COUNT = CommandPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tile Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_CONTENT_OPERATION_COUNT = CommandPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.ActorImpl
	 * @see mpw.impl.MpwPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CURRENT_TILE = TILE_CONTENT__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STAGE = TILE_CONTENT__STAGE;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DIRECTION = TILE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = TILE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = TILE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.impl.PropImpl <em>Prop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.PropImpl
	 * @see mpw.impl.MpwPackageImpl#getProp()
	 * @generated
	 */
	int PROP = 1;

	/**
	 * The feature id for the '<em><b>Current Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__CURRENT_TILE = TILE_CONTENT__CURRENT_TILE;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP__STAGE = TILE_CONTENT__STAGE;

	/**
	 * The number of structural features of the '<em>Prop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_FEATURE_COUNT = TILE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Prop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROP_OPERATION_COUNT = TILE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.TileImpl
	 * @see mpw.impl.MpwPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__CONTENTS = CommandPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__LOCATION = CommandPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>South</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__SOUTH = CommandPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>North</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NORTH = CommandPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>East</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__EAST = CommandPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>West</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__WEST = CommandPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__STAGE = CommandPackage.ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = CommandPackage.ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = CommandPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.StageImpl
	 * @see mpw.impl.MpwPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 4;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TILES = CommandPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tile Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__TILE_CONTENTS = CommandPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__WIDTH = CommandPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HEIGHT = CommandPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = CommandPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = CommandPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.impl.MiniProgrammingWorldImpl <em>Mini Programming World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.MiniProgrammingWorldImpl
	 * @see mpw.impl.MpwPackageImpl#getMiniProgrammingWorld()
	 * @generated
	 */
	int MINI_PROGRAMMING_WORLD = 5;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD__STAGE = 0;

	/**
	 * The feature id for the '<em><b>Command Stack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD__COMMAND_STACK = 1;

	/**
	 * The feature id for the '<em><b>Game Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD__GAME_LOG = 2;

	/**
	 * The feature id for the '<em><b>User Input Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Mini Programming World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mini Programming World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINI_PROGRAMMING_WORLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mpw.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.LocationImpl
	 * @see mpw.impl.MpwPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COLUMN = StereotypesPackage.VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ROW = StereotypesPackage.VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = StereotypesPackage.VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = StereotypesPackage.VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mpw.UserInputInterface <em>User Input Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.UserInputInterface
	 * @see mpw.impl.MpwPackageImpl#getUserInputInterface()
	 * @generated
	 */
	int USER_INPUT_INTERFACE = 7;

	/**
	 * The number of structural features of the '<em>User Input Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE_FEATURE_COUNT = StereotypesPackage.DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Read Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE___READ_INTEGER__STRING = StereotypesPackage.DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Read String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE___READ_STRING__STRING = StereotypesPackage.DEPENDENCY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Confirm Alert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE___CONFIRM_ALERT__THROWABLE = StereotypesPackage.DEPENDENCY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Abort</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE___ABORT = StereotypesPackage.DEPENDENCY_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>User Input Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INPUT_INTERFACE_OPERATION_COUNT = StereotypesPackage.DEPENDENCY_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link mpw.impl.GameLogImpl <em>Game Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.impl.GameLogImpl
	 * @see mpw.impl.MpwPackageImpl#getGameLog()
	 * @generated
	 */
	int GAME_LOG = 8;

	/**
	 * The feature id for the '<em><b>Log Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOG__LOG_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Game Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOG_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Write</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOG___WRITE__STRING = 0;

	/**
	 * The number of operations of the '<em>Game Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_LOG_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link mpw.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mpw.Direction
	 * @see mpw.impl.MpwPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 9;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see mpw.impl.MpwPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 10;


	/**
	 * Returns the meta object for class '{@link mpw.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see mpw.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link mpw.Actor#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see mpw.Actor#getDirection()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Direction();

	/**
	 * Returns the meta object for class '{@link mpw.Prop <em>Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prop</em>'.
	 * @see mpw.Prop
	 * @generated
	 */
	EClass getProp();

	/**
	 * Returns the meta object for class '{@link mpw.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see mpw.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the reference list '{@link mpw.Tile#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see mpw.Tile#getContents()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Contents();

	/**
	 * Returns the meta object for the containment reference '{@link mpw.Tile#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see mpw.Tile#getLocation()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Location();

	/**
	 * Returns the meta object for the reference '{@link mpw.Tile#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>South</em>'.
	 * @see mpw.Tile#getSouth()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_South();

	/**
	 * Returns the meta object for the reference '{@link mpw.Tile#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>North</em>'.
	 * @see mpw.Tile#getNorth()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_North();

	/**
	 * Returns the meta object for the reference '{@link mpw.Tile#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>East</em>'.
	 * @see mpw.Tile#getEast()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_East();

	/**
	 * Returns the meta object for the reference '{@link mpw.Tile#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>West</em>'.
	 * @see mpw.Tile#getWest()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_West();

	/**
	 * Returns the meta object for the container reference '{@link mpw.Tile#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stage</em>'.
	 * @see mpw.Tile#getStage()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Stage();

	/**
	 * Returns the meta object for class '{@link mpw.TileContent <em>Tile Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Content</em>'.
	 * @see mpw.TileContent
	 * @generated
	 */
	EClass getTileContent();

	/**
	 * Returns the meta object for the reference '{@link mpw.TileContent#getCurrentTile <em>Current Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Tile</em>'.
	 * @see mpw.TileContent#getCurrentTile()
	 * @see #getTileContent()
	 * @generated
	 */
	EReference getTileContent_CurrentTile();

	/**
	 * Returns the meta object for the container reference '{@link mpw.TileContent#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Stage</em>'.
	 * @see mpw.TileContent#getStage()
	 * @see #getTileContent()
	 * @generated
	 */
	EReference getTileContent_Stage();

	/**
	 * Returns the meta object for class '{@link mpw.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see mpw.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link mpw.Stage#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see mpw.Stage#getTiles()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link mpw.Stage#getTileContents <em>Tile Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tile Contents</em>'.
	 * @see mpw.Stage#getTileContents()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_TileContents();

	/**
	 * Returns the meta object for the attribute '{@link mpw.Stage#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see mpw.Stage#getWidth()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Width();

	/**
	 * Returns the meta object for the attribute '{@link mpw.Stage#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see mpw.Stage#getHeight()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Height();

	/**
	 * Returns the meta object for class '{@link mpw.MiniProgrammingWorld <em>Mini Programming World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mini Programming World</em>'.
	 * @see mpw.MiniProgrammingWorld
	 * @generated
	 */
	EClass getMiniProgrammingWorld();

	/**
	 * Returns the meta object for the reference '{@link mpw.MiniProgrammingWorld#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stage</em>'.
	 * @see mpw.MiniProgrammingWorld#getStage()
	 * @see #getMiniProgrammingWorld()
	 * @generated
	 */
	EReference getMiniProgrammingWorld_Stage();

	/**
	 * Returns the meta object for the containment reference '{@link mpw.MiniProgrammingWorld#getCommandStack <em>Command Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command Stack</em>'.
	 * @see mpw.MiniProgrammingWorld#getCommandStack()
	 * @see #getMiniProgrammingWorld()
	 * @generated
	 */
	EReference getMiniProgrammingWorld_CommandStack();

	/**
	 * Returns the meta object for the containment reference '{@link mpw.MiniProgrammingWorld#getGameLog <em>Game Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Game Log</em>'.
	 * @see mpw.MiniProgrammingWorld#getGameLog()
	 * @see #getMiniProgrammingWorld()
	 * @generated
	 */
	EReference getMiniProgrammingWorld_GameLog();

	/**
	 * Returns the meta object for the reference '{@link mpw.MiniProgrammingWorld#getUserInputInterface <em>User Input Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User Input Interface</em>'.
	 * @see mpw.MiniProgrammingWorld#getUserInputInterface()
	 * @see #getMiniProgrammingWorld()
	 * @generated
	 */
	EReference getMiniProgrammingWorld_UserInputInterface();

	/**
	 * Returns the meta object for class '{@link mpw.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see mpw.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link mpw.Location#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see mpw.Location#getColumn()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Column();

	/**
	 * Returns the meta object for the attribute '{@link mpw.Location#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see mpw.Location#getRow()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Row();

	/**
	 * Returns the meta object for class '{@link mpw.UserInputInterface <em>User Input Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Input Interface</em>'.
	 * @see mpw.UserInputInterface
	 * @generated
	 */
	EClass getUserInputInterface();

	/**
	 * Returns the meta object for the '{@link mpw.UserInputInterface#readInteger(java.lang.String) <em>Read Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Integer</em>' operation.
	 * @see mpw.UserInputInterface#readInteger(java.lang.String)
	 * @generated
	 */
	EOperation getUserInputInterface__ReadInteger__String();

	/**
	 * Returns the meta object for the '{@link mpw.UserInputInterface#readString(java.lang.String) <em>Read String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read String</em>' operation.
	 * @see mpw.UserInputInterface#readString(java.lang.String)
	 * @generated
	 */
	EOperation getUserInputInterface__ReadString__String();

	/**
	 * Returns the meta object for the '{@link mpw.UserInputInterface#confirmAlert(java.lang.Throwable) <em>Confirm Alert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Confirm Alert</em>' operation.
	 * @see mpw.UserInputInterface#confirmAlert(java.lang.Throwable)
	 * @generated
	 */
	EOperation getUserInputInterface__ConfirmAlert__Throwable();

	/**
	 * Returns the meta object for the '{@link mpw.UserInputInterface#abort() <em>Abort</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Abort</em>' operation.
	 * @see mpw.UserInputInterface#abort()
	 * @generated
	 */
	EOperation getUserInputInterface__Abort();

	/**
	 * Returns the meta object for class '{@link mpw.GameLog <em>Game Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Log</em>'.
	 * @see mpw.GameLog
	 * @generated
	 */
	EClass getGameLog();

	/**
	 * Returns the meta object for the attribute list '{@link mpw.GameLog#getLogEntries <em>Log Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Log Entries</em>'.
	 * @see mpw.GameLog#getLogEntries()
	 * @see #getGameLog()
	 * @generated
	 */
	EAttribute getGameLog_LogEntries();

	/**
	 * Returns the meta object for the '{@link mpw.GameLog#write(java.lang.String) <em>Write</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write</em>' operation.
	 * @see mpw.GameLog#write(java.lang.String)
	 * @generated
	 */
	EOperation getGameLog__Write__String();

	/**
	 * Returns the meta object for enum '{@link mpw.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see mpw.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MpwFactory getMpwFactory();

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
		 * The meta object literal for the '{@link mpw.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.ActorImpl
		 * @see mpw.impl.MpwPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__DIRECTION = eINSTANCE.getActor_Direction();

		/**
		 * The meta object literal for the '{@link mpw.impl.PropImpl <em>Prop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.PropImpl
		 * @see mpw.impl.MpwPackageImpl#getProp()
		 * @generated
		 */
		EClass PROP = eINSTANCE.getProp();

		/**
		 * The meta object literal for the '{@link mpw.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.TileImpl
		 * @see mpw.impl.MpwPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__CONTENTS = eINSTANCE.getTile_Contents();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__LOCATION = eINSTANCE.getTile_Location();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__SOUTH = eINSTANCE.getTile_South();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__NORTH = eINSTANCE.getTile_North();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__EAST = eINSTANCE.getTile_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__WEST = eINSTANCE.getTile_West();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__STAGE = eINSTANCE.getTile_Stage();

		/**
		 * The meta object literal for the '{@link mpw.impl.TileContentImpl <em>Tile Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.TileContentImpl
		 * @see mpw.impl.MpwPackageImpl#getTileContent()
		 * @generated
		 */
		EClass TILE_CONTENT = eINSTANCE.getTileContent();

		/**
		 * The meta object literal for the '<em><b>Current Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_CONTENT__CURRENT_TILE = eINSTANCE.getTileContent_CurrentTile();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_CONTENT__STAGE = eINSTANCE.getTileContent_Stage();

		/**
		 * The meta object literal for the '{@link mpw.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.StageImpl
		 * @see mpw.impl.MpwPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TILES = eINSTANCE.getStage_Tiles();

		/**
		 * The meta object literal for the '<em><b>Tile Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__TILE_CONTENTS = eINSTANCE.getStage_TileContents();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__WIDTH = eINSTANCE.getStage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__HEIGHT = eINSTANCE.getStage_Height();

		/**
		 * The meta object literal for the '{@link mpw.impl.MiniProgrammingWorldImpl <em>Mini Programming World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.MiniProgrammingWorldImpl
		 * @see mpw.impl.MpwPackageImpl#getMiniProgrammingWorld()
		 * @generated
		 */
		EClass MINI_PROGRAMMING_WORLD = eINSTANCE.getMiniProgrammingWorld();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_PROGRAMMING_WORLD__STAGE = eINSTANCE.getMiniProgrammingWorld_Stage();

		/**
		 * The meta object literal for the '<em><b>Command Stack</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_PROGRAMMING_WORLD__COMMAND_STACK = eINSTANCE.getMiniProgrammingWorld_CommandStack();

		/**
		 * The meta object literal for the '<em><b>Game Log</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_PROGRAMMING_WORLD__GAME_LOG = eINSTANCE.getMiniProgrammingWorld_GameLog();

		/**
		 * The meta object literal for the '<em><b>User Input Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MINI_PROGRAMMING_WORLD__USER_INPUT_INTERFACE = eINSTANCE.getMiniProgrammingWorld_UserInputInterface();

		/**
		 * The meta object literal for the '{@link mpw.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.LocationImpl
		 * @see mpw.impl.MpwPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COLUMN = eINSTANCE.getLocation_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ROW = eINSTANCE.getLocation_Row();

		/**
		 * The meta object literal for the '{@link mpw.UserInputInterface <em>User Input Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.UserInputInterface
		 * @see mpw.impl.MpwPackageImpl#getUserInputInterface()
		 * @generated
		 */
		EClass USER_INPUT_INTERFACE = eINSTANCE.getUserInputInterface();

		/**
		 * The meta object literal for the '<em><b>Read Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_INPUT_INTERFACE___READ_INTEGER__STRING = eINSTANCE.getUserInputInterface__ReadInteger__String();

		/**
		 * The meta object literal for the '<em><b>Read String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_INPUT_INTERFACE___READ_STRING__STRING = eINSTANCE.getUserInputInterface__ReadString__String();

		/**
		 * The meta object literal for the '<em><b>Confirm Alert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_INPUT_INTERFACE___CONFIRM_ALERT__THROWABLE = eINSTANCE.getUserInputInterface__ConfirmAlert__Throwable();

		/**
		 * The meta object literal for the '<em><b>Abort</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_INPUT_INTERFACE___ABORT = eINSTANCE.getUserInputInterface__Abort();

		/**
		 * The meta object literal for the '{@link mpw.impl.GameLogImpl <em>Game Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.impl.GameLogImpl
		 * @see mpw.impl.MpwPackageImpl#getGameLog()
		 * @generated
		 */
		EClass GAME_LOG = eINSTANCE.getGameLog();

		/**
		 * The meta object literal for the '<em><b>Log Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_LOG__LOG_ENTRIES = eINSTANCE.getGameLog_LogEntries();

		/**
		 * The meta object literal for the '<em><b>Write</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_LOG___WRITE__STRING = eINSTANCE.getGameLog__Write__String();

		/**
		 * The meta object literal for the '{@link mpw.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mpw.Direction
		 * @see mpw.impl.MpwPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see mpw.impl.MpwPackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

	}

} //MpwPackage
