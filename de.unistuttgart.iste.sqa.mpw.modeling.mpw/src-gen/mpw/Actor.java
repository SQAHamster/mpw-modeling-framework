/**
 */
package mpw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mpw.Actor#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see mpw.MpwPackage#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends TileContent {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpw.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see mpw.Direction
	 * @see #setDirection(Direction)
	 * @see mpw.MpwPackage#getActor_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link mpw.Actor#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see mpw.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Actor
