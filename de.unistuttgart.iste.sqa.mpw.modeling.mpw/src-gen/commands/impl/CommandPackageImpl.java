/**
 */
package commands.impl;

import commands.AddEntityCommand;
import commands.Command;
import commands.CommandFactory;
import commands.CommandPackage;
import commands.CommandStack;
import commands.CompositeCommand;
import commands.Entity;
import commands.PrimitiveCommand;
import commands.RemoveEntityCommand;
import commands.SetPropertyCommand;

import hamster.HamsterPackage;

import hamster.impl.HamsterPackageImpl;

import hamsterviewmodel.HamsterviewmodelPackage;

import hamsterviewmodel.impl.HamsterviewmodelPackageImpl;

import mpw.MpwPackage;

import mpw.impl.MpwPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stereotypes.StereotypesPackage;

import stereotypes.impl.StereotypesPackageImpl;

import viewmodel.ViewmodelPackage;

import viewmodel.impl.ViewmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandPackageImpl extends EPackageImpl implements CommandPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setPropertyCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEntityCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEntityCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandStackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see commands.CommandPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandPackageImpl() {
		super(eNS_URI, CommandFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CommandPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandPackage init() {
		if (isInited) return (CommandPackage)EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommandPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommandPackageImpl theCommandPackage = registeredCommandPackage instanceof CommandPackageImpl ? (CommandPackageImpl)registeredCommandPackage : new CommandPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterPackage.eNS_URI);
		HamsterPackageImpl theHamsterPackage = (HamsterPackageImpl)(registeredPackage instanceof HamsterPackageImpl ? registeredPackage : HamsterPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HamsterviewmodelPackage.eNS_URI);
		HamsterviewmodelPackageImpl theHamsterviewmodelPackage = (HamsterviewmodelPackageImpl)(registeredPackage instanceof HamsterviewmodelPackageImpl ? registeredPackage : HamsterviewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);
		MpwPackageImpl theMpwPackage = (MpwPackageImpl)(registeredPackage instanceof MpwPackageImpl ? registeredPackage : MpwPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ViewmodelPackage.eNS_URI);
		ViewmodelPackageImpl theViewmodelPackage = (ViewmodelPackageImpl)(registeredPackage instanceof ViewmodelPackageImpl ? registeredPackage : ViewmodelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StereotypesPackage.eNS_URI);
		StereotypesPackageImpl theStereotypesPackage = (StereotypesPackageImpl)(registeredPackage instanceof StereotypesPackageImpl ? registeredPackage : StereotypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCommandPackage.createPackageContents();
		theHamsterPackage.createPackageContents();
		theHamsterviewmodelPackage.createPackageContents();
		theMpwPackage.createPackageContents();
		theViewmodelPackage.createPackageContents();
		theStereotypesPackage.createPackageContents();

		// Initialize created meta-data
		theCommandPackage.initializePackageContents();
		theHamsterPackage.initializePackageContents();
		theHamsterviewmodelPackage.initializePackageContents();
		theMpwPackage.initializePackageContents();
		theViewmodelPackage.initializePackageContents();
		theStereotypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandPackage.eNS_URI, theCommandPackage);
		return theCommandPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveCommand() {
		return primitiveCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveCommand_Entity() {
		return (EReference)primitiveCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveCommand_PropertyName() {
		return (EAttribute)primitiveCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetPropertyCommand() {
		return setPropertyCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetPropertyCommand_OldValue() {
		return (EAttribute)setPropertyCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetPropertyCommand_NewValue() {
		return (EAttribute)setPropertyCommandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddEntityCommand() {
		return addEntityCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddEntityCommand_EntityToAdd() {
		return (EReference)addEntityCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveEntityCommand() {
		return removeEntityCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveEntityCommand_EntityToRemove() {
		return (EReference)removeEntityCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandStack() {
		return commandStackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandStack_Stack() {
		return (EReference)commandStackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandStack__Execute__Command() {
		return commandStackEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandStack__Undo() {
		return commandStackEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandStack__Redo() {
		return commandStackEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandStack__UndoAll() {
		return commandStackEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommandStack__RedoAll() {
		return commandStackEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__Execute() {
		return commandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__Undo() {
		return commandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommand__Redo() {
		return commandEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCommand() {
		return compositeCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCommand_SubCommands() {
		return (EReference)compositeCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandFactory getCommandFactory() {
		return (CommandFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		primitiveCommandEClass = createEClass(PRIMITIVE_COMMAND);
		createEReference(primitiveCommandEClass, PRIMITIVE_COMMAND__ENTITY);
		createEAttribute(primitiveCommandEClass, PRIMITIVE_COMMAND__PROPERTY_NAME);

		setPropertyCommandEClass = createEClass(SET_PROPERTY_COMMAND);
		createEAttribute(setPropertyCommandEClass, SET_PROPERTY_COMMAND__OLD_VALUE);
		createEAttribute(setPropertyCommandEClass, SET_PROPERTY_COMMAND__NEW_VALUE);

		addEntityCommandEClass = createEClass(ADD_ENTITY_COMMAND);
		createEReference(addEntityCommandEClass, ADD_ENTITY_COMMAND__ENTITY_TO_ADD);

		removeEntityCommandEClass = createEClass(REMOVE_ENTITY_COMMAND);
		createEReference(removeEntityCommandEClass, REMOVE_ENTITY_COMMAND__ENTITY_TO_REMOVE);

		commandStackEClass = createEClass(COMMAND_STACK);
		createEReference(commandStackEClass, COMMAND_STACK__STACK);
		createEOperation(commandStackEClass, COMMAND_STACK___EXECUTE__COMMAND);
		createEOperation(commandStackEClass, COMMAND_STACK___UNDO);
		createEOperation(commandStackEClass, COMMAND_STACK___REDO);
		createEOperation(commandStackEClass, COMMAND_STACK___UNDO_ALL);
		createEOperation(commandStackEClass, COMMAND_STACK___REDO_ALL);

		commandEClass = createEClass(COMMAND);
		createEOperation(commandEClass, COMMAND___EXECUTE);
		createEOperation(commandEClass, COMMAND___UNDO);
		createEOperation(commandEClass, COMMAND___REDO);

		compositeCommandEClass = createEClass(COMPOSITE_COMMAND);
		createEReference(compositeCommandEClass, COMPOSITE_COMMAND__SUB_COMMANDS);

		entityEClass = createEClass(ENTITY);

		// Create data types
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveCommandEClass.getESuperTypes().add(this.getCommand());
		setPropertyCommandEClass.getESuperTypes().add(this.getPrimitiveCommand());
		addEntityCommandEClass.getESuperTypes().add(this.getPrimitiveCommand());
		removeEntityCommandEClass.getESuperTypes().add(this.getPrimitiveCommand());
		compositeCommandEClass.getESuperTypes().add(this.getCommand());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveCommandEClass, PrimitiveCommand.class, "PrimitiveCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveCommand_Entity(), this.getEntity(), null, "entity", null, 1, 1, PrimitiveCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveCommand_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, PrimitiveCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setPropertyCommandEClass, SetPropertyCommand.class, "SetPropertyCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetPropertyCommand_OldValue(), this.getObject(), "oldValue", null, 0, 1, SetPropertyCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetPropertyCommand_NewValue(), this.getObject(), "newValue", null, 0, 1, SetPropertyCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addEntityCommandEClass, AddEntityCommand.class, "AddEntityCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddEntityCommand_EntityToAdd(), this.getEntity(), null, "entityToAdd", null, 1, 1, AddEntityCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeEntityCommandEClass, RemoveEntityCommand.class, "RemoveEntityCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveEntityCommand_EntityToRemove(), this.getEntity(), null, "entityToRemove", null, 1, 1, RemoveEntityCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandStackEClass, CommandStack.class, "CommandStack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandStack_Stack(), this.getCommand(), null, "stack", null, 0, -1, CommandStack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCommandStack__Execute__Command(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCommand(), "command", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommandStack__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommandStack__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommandStack__UndoAll(), null, "undoAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommandStack__RedoAll(), null, "redoAll", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandEClass, Command.class, "Command", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCommand__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommand__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCommand__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeCommandEClass, CompositeCommand.class, "CompositeCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCommand_SubCommands(), this.getCommand(), null, "subCommands", null, 0, -1, CompositeCommand.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommandPackageImpl
