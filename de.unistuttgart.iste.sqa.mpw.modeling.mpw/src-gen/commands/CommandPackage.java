/**
 */
package commands;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * <!-- begin-model-doc -->
 * In this package the metamodel for commands and its related roles like Entity or CommandStack are defined. Commands are the meta-type for behavior in a MPW.
 * <!-- end-model-doc -->
 * @see commands.CommandFactory
 * @model kind="package"
 * @generated
 */
public interface CommandPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mpw.uni-stuttgart.de/commands";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandPackage eINSTANCE = commands.impl.CommandPackageImpl.init();

	/**
	 * The meta object id for the '{@link commands.Command <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.Command
	 * @see commands.impl.CommandPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 5;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___EXECUTE = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND___REDO = 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link commands.impl.PrimitiveCommandImpl <em>Primitive Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.PrimitiveCommandImpl
	 * @see commands.impl.CommandPackageImpl#getPrimitiveCommand()
	 * @generated
	 */
	int PRIMITIVE_COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND__ENTITY = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND__PROPERTY_NAME = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND___EXECUTE = COMMAND___EXECUTE;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND___UNDO = COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND___REDO = COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Primitive Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commands.impl.SetPropertyCommandImpl <em>Set Property Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.SetPropertyCommandImpl
	 * @see commands.impl.CommandPackageImpl#getSetPropertyCommand()
	 * @generated
	 */
	int SET_PROPERTY_COMMAND = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND__ENTITY = PRIMITIVE_COMMAND__ENTITY;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND__PROPERTY_NAME = PRIMITIVE_COMMAND__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Old Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND__OLD_VALUE = PRIMITIVE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND__NEW_VALUE = PRIMITIVE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Property Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND_FEATURE_COUNT = PRIMITIVE_COMMAND_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND___EXECUTE = PRIMITIVE_COMMAND___EXECUTE;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND___UNDO = PRIMITIVE_COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND___REDO = PRIMITIVE_COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Set Property Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_PROPERTY_COMMAND_OPERATION_COUNT = PRIMITIVE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commands.impl.AddEntityCommandImpl <em>Add Entity Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.AddEntityCommandImpl
	 * @see commands.impl.CommandPackageImpl#getAddEntityCommand()
	 * @generated
	 */
	int ADD_ENTITY_COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND__ENTITY = PRIMITIVE_COMMAND__ENTITY;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND__PROPERTY_NAME = PRIMITIVE_COMMAND__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Entity To Add</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND__ENTITY_TO_ADD = PRIMITIVE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Entity Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND_FEATURE_COUNT = PRIMITIVE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND___EXECUTE = PRIMITIVE_COMMAND___EXECUTE;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND___UNDO = PRIMITIVE_COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND___REDO = PRIMITIVE_COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Add Entity Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ENTITY_COMMAND_OPERATION_COUNT = PRIMITIVE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commands.impl.RemoveEntityCommandImpl <em>Remove Entity Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.RemoveEntityCommandImpl
	 * @see commands.impl.CommandPackageImpl#getRemoveEntityCommand()
	 * @generated
	 */
	int REMOVE_ENTITY_COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND__ENTITY = PRIMITIVE_COMMAND__ENTITY;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND__PROPERTY_NAME = PRIMITIVE_COMMAND__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Entity To Remove</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND__ENTITY_TO_REMOVE = PRIMITIVE_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Entity Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND_FEATURE_COUNT = PRIMITIVE_COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND___EXECUTE = PRIMITIVE_COMMAND___EXECUTE;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND___UNDO = PRIMITIVE_COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND___REDO = PRIMITIVE_COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Remove Entity Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ENTITY_COMMAND_OPERATION_COUNT = PRIMITIVE_COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commands.impl.CommandStackImpl <em>Stack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.CommandStackImpl
	 * @see commands.impl.CommandPackageImpl#getCommandStack()
	 * @generated
	 */
	int COMMAND_STACK = 4;

	/**
	 * The feature id for the '<em><b>Stack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK__STACK = 0;

	/**
	 * The number of structural features of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK___EXECUTE__COMMAND = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK___REDO = 2;

	/**
	 * The operation id for the '<em>Undo All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK___UNDO_ALL = 3;

	/**
	 * The operation id for the '<em>Redo All</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK___REDO_ALL = 4;

	/**
	 * The number of operations of the '<em>Stack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STACK_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link commands.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.impl.CompositeCommandImpl
	 * @see commands.impl.CommandPackageImpl#getCompositeCommand()
	 * @generated
	 */
	int COMPOSITE_COMMAND = 6;

	/**
	 * The feature id for the '<em><b>Sub Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND__SUB_COMMANDS = COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___EXECUTE = COMMAND___EXECUTE;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___UNDO = COMMAND___UNDO;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND___REDO = COMMAND___REDO;

	/**
	 * The number of operations of the '<em>Composite Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMMAND_OPERATION_COUNT = COMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link commands.Entity <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see commands.Entity
	 * @see commands.impl.CommandPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 7;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see commands.impl.CommandPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link commands.PrimitiveCommand <em>Primitive Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Command</em>'.
	 * @see commands.PrimitiveCommand
	 * @generated
	 */
	EClass getPrimitiveCommand();

	/**
	 * Returns the meta object for the reference '{@link commands.PrimitiveCommand#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see commands.PrimitiveCommand#getEntity()
	 * @see #getPrimitiveCommand()
	 * @generated
	 */
	EReference getPrimitiveCommand_Entity();

	/**
	 * Returns the meta object for the attribute '{@link commands.PrimitiveCommand#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see commands.PrimitiveCommand#getPropertyName()
	 * @see #getPrimitiveCommand()
	 * @generated
	 */
	EAttribute getPrimitiveCommand_PropertyName();

	/**
	 * Returns the meta object for class '{@link commands.SetPropertyCommand <em>Set Property Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Property Command</em>'.
	 * @see commands.SetPropertyCommand
	 * @generated
	 */
	EClass getSetPropertyCommand();

	/**
	 * Returns the meta object for the attribute '{@link commands.SetPropertyCommand#getOldValue <em>Old Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Value</em>'.
	 * @see commands.SetPropertyCommand#getOldValue()
	 * @see #getSetPropertyCommand()
	 * @generated
	 */
	EAttribute getSetPropertyCommand_OldValue();

	/**
	 * Returns the meta object for the attribute '{@link commands.SetPropertyCommand#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see commands.SetPropertyCommand#getNewValue()
	 * @see #getSetPropertyCommand()
	 * @generated
	 */
	EAttribute getSetPropertyCommand_NewValue();

	/**
	 * Returns the meta object for class '{@link commands.AddEntityCommand <em>Add Entity Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Entity Command</em>'.
	 * @see commands.AddEntityCommand
	 * @generated
	 */
	EClass getAddEntityCommand();

	/**
	 * Returns the meta object for the reference '{@link commands.AddEntityCommand#getEntityToAdd <em>Entity To Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity To Add</em>'.
	 * @see commands.AddEntityCommand#getEntityToAdd()
	 * @see #getAddEntityCommand()
	 * @generated
	 */
	EReference getAddEntityCommand_EntityToAdd();

	/**
	 * Returns the meta object for class '{@link commands.RemoveEntityCommand <em>Remove Entity Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Entity Command</em>'.
	 * @see commands.RemoveEntityCommand
	 * @generated
	 */
	EClass getRemoveEntityCommand();

	/**
	 * Returns the meta object for the reference '{@link commands.RemoveEntityCommand#getEntityToRemove <em>Entity To Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity To Remove</em>'.
	 * @see commands.RemoveEntityCommand#getEntityToRemove()
	 * @see #getRemoveEntityCommand()
	 * @generated
	 */
	EReference getRemoveEntityCommand_EntityToRemove();

	/**
	 * Returns the meta object for class '{@link commands.CommandStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack</em>'.
	 * @see commands.CommandStack
	 * @generated
	 */
	EClass getCommandStack();

	/**
	 * Returns the meta object for the containment reference list '{@link commands.CommandStack#getStack <em>Stack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stack</em>'.
	 * @see commands.CommandStack#getStack()
	 * @see #getCommandStack()
	 * @generated
	 */
	EReference getCommandStack_Stack();

	/**
	 * Returns the meta object for the '{@link commands.CommandStack#execute(commands.Command) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see commands.CommandStack#execute(commands.Command)
	 * @generated
	 */
	EOperation getCommandStack__Execute__Command();

	/**
	 * Returns the meta object for the '{@link commands.CommandStack#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see commands.CommandStack#undo()
	 * @generated
	 */
	EOperation getCommandStack__Undo();

	/**
	 * Returns the meta object for the '{@link commands.CommandStack#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see commands.CommandStack#redo()
	 * @generated
	 */
	EOperation getCommandStack__Redo();

	/**
	 * Returns the meta object for the '{@link commands.CommandStack#undoAll() <em>Undo All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo All</em>' operation.
	 * @see commands.CommandStack#undoAll()
	 * @generated
	 */
	EOperation getCommandStack__UndoAll();

	/**
	 * Returns the meta object for the '{@link commands.CommandStack#redoAll() <em>Redo All</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo All</em>' operation.
	 * @see commands.CommandStack#redoAll()
	 * @generated
	 */
	EOperation getCommandStack__RedoAll();

	/**
	 * Returns the meta object for class '{@link commands.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see commands.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the '{@link commands.Command#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see commands.Command#execute()
	 * @generated
	 */
	EOperation getCommand__Execute();

	/**
	 * Returns the meta object for the '{@link commands.Command#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see commands.Command#undo()
	 * @generated
	 */
	EOperation getCommand__Undo();

	/**
	 * Returns the meta object for the '{@link commands.Command#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see commands.Command#redo()
	 * @generated
	 */
	EOperation getCommand__Redo();

	/**
	 * Returns the meta object for class '{@link commands.CompositeCommand <em>Composite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Command</em>'.
	 * @see commands.CompositeCommand
	 * @generated
	 */
	EClass getCompositeCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link commands.CompositeCommand#getSubCommands <em>Sub Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Commands</em>'.
	 * @see commands.CompositeCommand#getSubCommands()
	 * @see #getCompositeCommand()
	 * @generated
	 */
	EReference getCompositeCommand_SubCommands();

	/**
	 * Returns the meta object for class '{@link commands.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see commands.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Represents a base type of any value. In java this is simply the type `java.lang.Object`. In C++ this may be an union of possible values: it can be a primitive value like integers, booleans or strings. Alternatively it can be a reference/pointer.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandFactory getCommandFactory();

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
		 * The meta object literal for the '{@link commands.impl.PrimitiveCommandImpl <em>Primitive Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.PrimitiveCommandImpl
		 * @see commands.impl.CommandPackageImpl#getPrimitiveCommand()
		 * @generated
		 */
		EClass PRIMITIVE_COMMAND = eINSTANCE.getPrimitiveCommand();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_COMMAND__ENTITY = eINSTANCE.getPrimitiveCommand_Entity();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_COMMAND__PROPERTY_NAME = eINSTANCE.getPrimitiveCommand_PropertyName();

		/**
		 * The meta object literal for the '{@link commands.impl.SetPropertyCommandImpl <em>Set Property Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.SetPropertyCommandImpl
		 * @see commands.impl.CommandPackageImpl#getSetPropertyCommand()
		 * @generated
		 */
		EClass SET_PROPERTY_COMMAND = eINSTANCE.getSetPropertyCommand();

		/**
		 * The meta object literal for the '<em><b>Old Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PROPERTY_COMMAND__OLD_VALUE = eINSTANCE.getSetPropertyCommand_OldValue();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_PROPERTY_COMMAND__NEW_VALUE = eINSTANCE.getSetPropertyCommand_NewValue();

		/**
		 * The meta object literal for the '{@link commands.impl.AddEntityCommandImpl <em>Add Entity Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.AddEntityCommandImpl
		 * @see commands.impl.CommandPackageImpl#getAddEntityCommand()
		 * @generated
		 */
		EClass ADD_ENTITY_COMMAND = eINSTANCE.getAddEntityCommand();

		/**
		 * The meta object literal for the '<em><b>Entity To Add</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_ENTITY_COMMAND__ENTITY_TO_ADD = eINSTANCE.getAddEntityCommand_EntityToAdd();

		/**
		 * The meta object literal for the '{@link commands.impl.RemoveEntityCommandImpl <em>Remove Entity Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.RemoveEntityCommandImpl
		 * @see commands.impl.CommandPackageImpl#getRemoveEntityCommand()
		 * @generated
		 */
		EClass REMOVE_ENTITY_COMMAND = eINSTANCE.getRemoveEntityCommand();

		/**
		 * The meta object literal for the '<em><b>Entity To Remove</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_ENTITY_COMMAND__ENTITY_TO_REMOVE = eINSTANCE.getRemoveEntityCommand_EntityToRemove();

		/**
		 * The meta object literal for the '{@link commands.impl.CommandStackImpl <em>Stack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.CommandStackImpl
		 * @see commands.impl.CommandPackageImpl#getCommandStack()
		 * @generated
		 */
		EClass COMMAND_STACK = eINSTANCE.getCommandStack();

		/**
		 * The meta object literal for the '<em><b>Stack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_STACK__STACK = eINSTANCE.getCommandStack_Stack();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_STACK___EXECUTE__COMMAND = eINSTANCE.getCommandStack__Execute__Command();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_STACK___UNDO = eINSTANCE.getCommandStack__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_STACK___REDO = eINSTANCE.getCommandStack__Redo();

		/**
		 * The meta object literal for the '<em><b>Undo All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_STACK___UNDO_ALL = eINSTANCE.getCommandStack__UndoAll();

		/**
		 * The meta object literal for the '<em><b>Redo All</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND_STACK___REDO_ALL = eINSTANCE.getCommandStack__RedoAll();

		/**
		 * The meta object literal for the '{@link commands.Command <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.Command
		 * @see commands.impl.CommandPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___EXECUTE = eINSTANCE.getCommand__Execute();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___UNDO = eINSTANCE.getCommand__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMAND___REDO = eINSTANCE.getCommand__Redo();

		/**
		 * The meta object literal for the '{@link commands.impl.CompositeCommandImpl <em>Composite Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.impl.CompositeCommandImpl
		 * @see commands.impl.CommandPackageImpl#getCompositeCommand()
		 * @generated
		 */
		EClass COMPOSITE_COMMAND = eINSTANCE.getCompositeCommand();

		/**
		 * The meta object literal for the '<em><b>Sub Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMMAND__SUB_COMMANDS = eINSTANCE.getCompositeCommand_SubCommands();

		/**
		 * The meta object literal for the '{@link commands.Entity <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see commands.Entity
		 * @see commands.impl.CommandPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see commands.impl.CommandPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //CommandPackage
