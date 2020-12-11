/**
 */
package mpw;

import commands.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.TileContent#getCurrentTile <em>Current Tile</em>}</li>
 *   <li>{@link mpw.TileContent#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getTileContent()
 * @model abstract="true"
 * @generated
 */
public interface TileContent extends Entity {
	/**
	 * Returns the value of the '<em><b>Current Tile</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Tile</em>' reference.
	 * @see #setCurrentTile(Tile)
	 * @see mpw.MpwPackage#getTileContent_CurrentTile()
	 * @see mpw.Tile#getContents
	 * @model opposite="contents"
	 * @generated
	 */
	Tile getCurrentTile();

	/**
	 * Sets the value of the '{@link mpw.TileContent#getCurrentTile <em>Current Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tile</em>' reference.
	 * @see #getCurrentTile()
	 * @generated
	 */
	void setCurrentTile(Tile value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mpw.Stage#getTileContents <em>Tile Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' container reference.
	 * @see #setStage(Stage)
	 * @see mpw.MpwPackage#getTileContent_Stage()
	 * @see mpw.Stage#getTileContents
	 * @model opposite="tileContents" transient="false"
	 * @generated
	 */
	Stage getStage();

	/**
	 * Sets the value of the '{@link mpw.TileContent#getStage <em>Stage</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' container reference.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(Stage value);

} // TileContent
