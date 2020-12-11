/**
 */
package commands;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class of an entity which defines property modifications used by commands. It makes use of the generic type Object to provide a reflection-like possibility to set values by property-names.
 * 
 * Note: In Java it can be simply realized by reflection, but in languages like C++ a reflection-like modification access-layer will be generated.
 * <!-- end-model-doc -->
 *
 *
 * @see commands.CommandPackage#getEntity()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Entity extends EObject {
} // Entity
