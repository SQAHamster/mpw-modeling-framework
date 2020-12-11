/**
 */
package mpw;

import commands.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.Tile#getContents <em>Contents</em>}</li>
 *   <li>{@link mpw.Tile#getLocation <em>Location</em>}</li>
 *   <li>{@link mpw.Tile#getSouth <em>South</em>}</li>
 *   <li>{@link mpw.Tile#getNorth <em>North</em>}</li>
 *   <li>{@link mpw.Tile#getEast <em>East</em>}</li>
 *   <li>{@link mpw.Tile#getWest <em>West</em>}</li>
 *   <li>{@link mpw.Tile#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getTile()
 * @model
 * @generated
 */
public interface Tile extends Entity {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link mpw.TileContent}.
	 * It is bidirectional and its opposite is '{@link mpw.TileContent#getCurrentTile <em>Current Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see mpw.MpwPackage#getTile_Contents()
	 * @see mpw.TileContent#getCurrentTile
	 * @model opposite="currentTile"
	 * @generated
	 */
	EList<TileContent> getContents();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see mpw.MpwPackage#getTile_Location()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link mpw.Tile#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>South</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' reference.
	 * @see #setSouth(Tile)
	 * @see mpw.MpwPackage#getTile_South()
	 * @see mpw.Tile#getNorth
	 * @model opposite="north"
	 * @generated
	 */
	Tile getSouth();

	/**
	 * Sets the value of the '{@link mpw.Tile#getSouth <em>South</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' reference.
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(Tile value);

	/**
	 * Returns the value of the '<em><b>North</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' reference.
	 * @see #setNorth(Tile)
	 * @see mpw.MpwPackage#getTile_North()
	 * @see mpw.Tile#getSouth
	 * @model opposite="south"
	 * @generated
	 */
	Tile getNorth();

	/**
	 * Sets the value of the '{@link mpw.Tile#getNorth <em>North</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' reference.
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(Tile value);

	/**
	 * Returns the value of the '<em><b>East</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' reference.
	 * @see #setEast(Tile)
	 * @see mpw.MpwPackage#getTile_East()
	 * @see mpw.Tile#getWest
	 * @model opposite="west"
	 * @generated
	 */
	Tile getEast();

	/**
	 * Sets the value of the '{@link mpw.Tile#getEast <em>East</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' reference.
	 * @see #getEast()
	 * @generated
	 */
	void setEast(Tile value);

	/**
	 * Returns the value of the '<em><b>West</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' reference.
	 * @see #setWest(Tile)
	 * @see mpw.MpwPackage#getTile_West()
	 * @see mpw.Tile#getEast
	 * @model opposite="east"
	 * @generated
	 */
	Tile getWest();

	/**
	 * Sets the value of the '{@link mpw.Tile#getWest <em>West</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' reference.
	 * @see #getWest()
	 * @generated
	 */
	void setWest(Tile value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mpw.Stage#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' container reference.
	 * @see #setStage(Stage)
	 * @see mpw.MpwPackage#getTile_Stage()
	 * @see mpw.Stage#getTiles
	 * @model opposite="tiles" transient="false" derived="true"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link mpw.Tile#getStage <em>Stage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' container reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

} // Tile
