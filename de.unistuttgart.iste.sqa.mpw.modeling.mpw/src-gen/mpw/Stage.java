/**
 */
package mpw;

import commands.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.Stage#getTiles <em>Tiles</em>}</li>
 *   <li>{@link mpw.Stage#getTileContents <em>Tile Contents</em>}</li>
 *   <li>{@link mpw.Stage#getWidth <em>Width</em>}</li>
 *   <li>{@link mpw.Stage#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getStage()
 * @model abstract="true"
 * @generated
 */
public interface Stage extends Entity {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link mpw.Tile}.
	 * It is bidirectional and its opposite is '{@link mpw.Tile#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see mpw.MpwPackage#getStage_Tiles()
	 * @see mpw.Tile#getStage
	 * @model opposite="stage" containment="true"
	 * @generated
	 */
	EList<Tile> getTiles();

	/**
	 * Returns the value of the '<em><b>Tile Contents</b></em>' containment reference list.
	 * The list contents are of type {@link mpw.TileContent}.
	 * It is bidirectional and its opposite is '{@link mpw.TileContent#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Contents</em>' containment reference list.
	 * @see mpw.MpwPackage#getStage_TileContents()
	 * @see mpw.TileContent#getStage
	 * @model opposite="stage" containment="true"
	 * @generated
	 */
	EList<TileContent> getTileContents();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see mpw.MpwPackage#getStage_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link mpw.Stage#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see mpw.MpwPackage#getStage_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link mpw.Stage#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // Stage
