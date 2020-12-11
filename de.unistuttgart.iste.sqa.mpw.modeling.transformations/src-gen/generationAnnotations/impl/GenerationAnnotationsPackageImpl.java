/**
 */
package generationAnnotations.impl;

import commandBehavior.CommandPackage;

import commandBehavior.impl.CommandPackageImpl;

import generationAnnotations.AddVariableToCollectionAnnotation;
import generationAnnotations.CommandCallAnnotation;
import generationAnnotations.CommandCreationAnnotation;
import generationAnnotations.CommandParameterCreationAnnotation;
import generationAnnotations.ConstructorAnnotation;
import generationAnnotations.ConstructorSimpleFieldInitializationAnnotation;
import generationAnnotations.FieldAssignmentAnnotation;
import generationAnnotations.FieldInitializationAnnotation;
import generationAnnotations.GenerationAnnotation;
import generationAnnotations.GenerationAnnotationsFactory;
import generationAnnotations.GenerationAnnotationsPackage;
import generationAnnotations.GetPropertyAnnotation;
import generationAnnotations.GetPropertyDeclarationAnnotation;
import generationAnnotations.ImportTypeAnnotation;
import generationAnnotations.InlineSimpleFieldInitializationAnnotation;
import generationAnnotations.MethodCallAnnotation;
import generationAnnotations.ParameterToFieldAssignmentAnnotation;
import generationAnnotations.PropertyPathAnnotation;
import generationAnnotations.PropertyPathFieldAssignmentAnnotation;
import generationAnnotations.PropertyPathReturnAnnotation;
import generationAnnotations.QueryCallAnnotation;
import generationAnnotations.VariableDefinitionAnnotation;
import generationAnnotations.VariableObjectConstructionAnnotation;
import generationAnnotations.Visibility;
import generationAnnotations.VisibilityAnnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import queryBehavior.QueryPackage;

import queryBehavior.impl.QueryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerationAnnotationsPackageImpl extends EPackageImpl implements GenerationAnnotationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAssignmentAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterToFieldAssignmentAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPathFieldAssignmentAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldInitializationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineSimpleFieldInitializationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorSimpleFieldInitializationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibilityAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandParameterCreationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandCreationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandCallAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryCallAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPropertyAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getPropertyDeclarationAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCallAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPathAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPathReturnAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importTypeAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableToCollectionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableObjectConstructionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDefinitionAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

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
	 * @see generationAnnotations.GenerationAnnotationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenerationAnnotationsPackageImpl() {
		super(eNS_URI, GenerationAnnotationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenerationAnnotationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenerationAnnotationsPackage init() {
		if (isInited) return (GenerationAnnotationsPackage)EPackage.Registry.INSTANCE.getEPackage(GenerationAnnotationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenerationAnnotationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenerationAnnotationsPackageImpl theGenerationAnnotationsPackage = registeredGenerationAnnotationsPackage instanceof GenerationAnnotationsPackageImpl ? (GenerationAnnotationsPackageImpl)registeredGenerationAnnotationsPackage : new GenerationAnnotationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		CommandPackageImpl theCommandPackage = (CommandPackageImpl)(registeredPackage instanceof CommandPackageImpl ? registeredPackage : CommandPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);
		QueryPackageImpl theQueryPackage = (QueryPackageImpl)(registeredPackage instanceof QueryPackageImpl ? registeredPackage : QueryPackage.eINSTANCE);

		// Create package meta-data objects
		theGenerationAnnotationsPackage.createPackageContents();
		theCommandPackage.createPackageContents();
		theQueryPackage.createPackageContents();

		// Initialize created meta-data
		theGenerationAnnotationsPackage.initializePackageContents();
		theCommandPackage.initializePackageContents();
		theQueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenerationAnnotationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenerationAnnotationsPackage.eNS_URI, theGenerationAnnotationsPackage);
		return theGenerationAnnotationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationAnnotation() {
		return generationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorAnnotation() {
		return constructorAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldAssignmentAnnotation() {
		return fieldAssignmentAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldAssignmentAnnotation_Field() {
		return (EReference)fieldAssignmentAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterToFieldAssignmentAnnotation() {
		return parameterToFieldAssignmentAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterToFieldAssignmentAnnotation_Parameter() {
		return (EReference)parameterToFieldAssignmentAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPathFieldAssignmentAnnotation() {
		return propertyPathFieldAssignmentAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyPathFieldAssignmentAnnotation_PropertyPath() {
		return (EAttribute)propertyPathFieldAssignmentAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldInitializationAnnotation() {
		return fieldInitializationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineSimpleFieldInitializationAnnotation() {
		return inlineSimpleFieldInitializationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInlineSimpleFieldInitializationAnnotation_Field() {
		return (EReference)inlineSimpleFieldInitializationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths() {
		return (EAttribute)inlineSimpleFieldInitializationAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructorSimpleFieldInitializationAnnotation() {
		return constructorSimpleFieldInitializationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstructorSimpleFieldInitializationAnnotation_Field() {
		return (EReference)constructorSimpleFieldInitializationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths() {
		return (EAttribute)constructorSimpleFieldInitializationAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstructorSimpleFieldInitializationAnnotation_ConstructorTypeName() {
		return (EAttribute)constructorSimpleFieldInitializationAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibilityAnnotation() {
		return visibilityAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibilityAnnotation_Visibility() {
		return (EAttribute)visibilityAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandParameterCreationAnnotation() {
		return commandParameterCreationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandParameterCreationAnnotation_Command() {
		return (EReference)commandParameterCreationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandParameterCreationAnnotation_ParameterMappings() {
		return (EReference)commandParameterCreationAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandParameterCreationAnnotation_ParametersVariableName() {
		return (EAttribute)commandParameterCreationAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandCreationAnnotation() {
		return commandCreationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandCreationAnnotation_Command() {
		return (EReference)commandCreationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandCreationAnnotation_CommandVariableName() {
		return (EAttribute)commandCreationAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandCreationAnnotation_ParametersVariableName() {
		return (EAttribute)commandCreationAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandCallAnnotation() {
		return commandCallAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandCallAnnotation_Command() {
		return (EReference)commandCallAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandCallAnnotation_TargetRoleVariableName() {
		return (EAttribute)commandCallAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandCallAnnotation_ParametersVariableName() {
		return (EAttribute)commandCallAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryCallAnnotation() {
		return queryCallAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryCallAnnotation_Query() {
		return (EReference)queryCallAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryCallAnnotation_InternalRoleField() {
		return (EReference)queryCallAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPropertyAnnotation() {
		return getPropertyAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetPropertyAnnotation_Field() {
		return (EReference)getPropertyAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetPropertyAnnotation_GetterTypeName() {
		return (EAttribute)getPropertyAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetPropertyAnnotation_GetterOperationName() {
		return (EAttribute)getPropertyAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetPropertyDeclarationAnnotation() {
		return getPropertyDeclarationAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetPropertyDeclarationAnnotation_FieldTypeName() {
		return (EAttribute)getPropertyDeclarationAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetPropertyDeclarationAnnotation_GetterName() {
		return (EAttribute)getPropertyDeclarationAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCallAnnotation() {
		return methodCallAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCallAnnotation_VariableName() {
		return (EAttribute)methodCallAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCallAnnotation_MethodName() {
		return (EAttribute)methodCallAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodCallAnnotation_ParameterInputVariablePropertyPaths() {
		return (EAttribute)methodCallAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPathAnnotation() {
		return propertyPathAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyPathAnnotation_PropertyPath() {
		return (EAttribute)propertyPathAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyPathReturnAnnotation() {
		return propertyPathReturnAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyPathReturnAnnotation_PropertyPath() {
		return (EAttribute)propertyPathReturnAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportTypeAnnotation() {
		return importTypeAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportTypeAnnotation_RelativeQualifiedTypeName() {
		return (EAttribute)importTypeAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableToCollectionAnnotation() {
		return addVariableToCollectionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableToCollectionAnnotation_CollectionPropertyPath() {
		return (EAttribute)addVariableToCollectionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableToCollectionAnnotation_ParameterPropertyPath() {
		return (EAttribute)addVariableToCollectionAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableObjectConstructionAnnotation() {
		return variableObjectConstructionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableObjectConstructionAnnotation_VariableName() {
		return (EAttribute)variableObjectConstructionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableObjectConstructionAnnotation_ConstructorTypeName() {
		return (EAttribute)variableObjectConstructionAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableObjectConstructionAnnotation_ParameterInputVariablePropertyPaths() {
		return (EAttribute)variableObjectConstructionAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDefinitionAnnotation() {
		return variableDefinitionAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDefinitionAnnotation_VariableName() {
		return (EAttribute)variableDefinitionAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDefinitionAnnotation_VariableTypeName() {
		return (EAttribute)variableDefinitionAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDefinitionAnnotation_Rhs() {
		return (EReference)variableDefinitionAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotationsFactory getGenerationAnnotationsFactory() {
		return (GenerationAnnotationsFactory)getEFactoryInstance();
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
		generationAnnotationEClass = createEClass(GENERATION_ANNOTATION);

		constructorAnnotationEClass = createEClass(CONSTRUCTOR_ANNOTATION);

		fieldAssignmentAnnotationEClass = createEClass(FIELD_ASSIGNMENT_ANNOTATION);
		createEReference(fieldAssignmentAnnotationEClass, FIELD_ASSIGNMENT_ANNOTATION__FIELD);

		parameterToFieldAssignmentAnnotationEClass = createEClass(PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION);
		createEReference(parameterToFieldAssignmentAnnotationEClass, PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION__PARAMETER);

		propertyPathFieldAssignmentAnnotationEClass = createEClass(PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION);
		createEAttribute(propertyPathFieldAssignmentAnnotationEClass, PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION__PROPERTY_PATH);

		fieldInitializationAnnotationEClass = createEClass(FIELD_INITIALIZATION_ANNOTATION);

		inlineSimpleFieldInitializationAnnotationEClass = createEClass(INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION);
		createEReference(inlineSimpleFieldInitializationAnnotationEClass, INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD);
		createEAttribute(inlineSimpleFieldInitializationAnnotationEClass, INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);

		constructorSimpleFieldInitializationAnnotationEClass = createEClass(CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION);
		createEReference(constructorSimpleFieldInitializationAnnotationEClass, CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__FIELD);
		createEAttribute(constructorSimpleFieldInitializationAnnotationEClass, CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);
		createEAttribute(constructorSimpleFieldInitializationAnnotationEClass, CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION__CONSTRUCTOR_TYPE_NAME);

		visibilityAnnotationEClass = createEClass(VISIBILITY_ANNOTATION);
		createEAttribute(visibilityAnnotationEClass, VISIBILITY_ANNOTATION__VISIBILITY);

		commandParameterCreationAnnotationEClass = createEClass(COMMAND_PARAMETER_CREATION_ANNOTATION);
		createEReference(commandParameterCreationAnnotationEClass, COMMAND_PARAMETER_CREATION_ANNOTATION__COMMAND);
		createEReference(commandParameterCreationAnnotationEClass, COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETER_MAPPINGS);
		createEAttribute(commandParameterCreationAnnotationEClass, COMMAND_PARAMETER_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME);

		commandCreationAnnotationEClass = createEClass(COMMAND_CREATION_ANNOTATION);
		createEReference(commandCreationAnnotationEClass, COMMAND_CREATION_ANNOTATION__COMMAND);
		createEAttribute(commandCreationAnnotationEClass, COMMAND_CREATION_ANNOTATION__COMMAND_VARIABLE_NAME);
		createEAttribute(commandCreationAnnotationEClass, COMMAND_CREATION_ANNOTATION__PARAMETERS_VARIABLE_NAME);

		commandCallAnnotationEClass = createEClass(COMMAND_CALL_ANNOTATION);
		createEReference(commandCallAnnotationEClass, COMMAND_CALL_ANNOTATION__COMMAND);
		createEAttribute(commandCallAnnotationEClass, COMMAND_CALL_ANNOTATION__TARGET_ROLE_VARIABLE_NAME);
		createEAttribute(commandCallAnnotationEClass, COMMAND_CALL_ANNOTATION__PARAMETERS_VARIABLE_NAME);

		queryCallAnnotationEClass = createEClass(QUERY_CALL_ANNOTATION);
		createEReference(queryCallAnnotationEClass, QUERY_CALL_ANNOTATION__QUERY);
		createEReference(queryCallAnnotationEClass, QUERY_CALL_ANNOTATION__INTERNAL_ROLE_FIELD);

		getPropertyAnnotationEClass = createEClass(GET_PROPERTY_ANNOTATION);
		createEReference(getPropertyAnnotationEClass, GET_PROPERTY_ANNOTATION__FIELD);
		createEAttribute(getPropertyAnnotationEClass, GET_PROPERTY_ANNOTATION__GETTER_TYPE_NAME);
		createEAttribute(getPropertyAnnotationEClass, GET_PROPERTY_ANNOTATION__GETTER_OPERATION_NAME);

		getPropertyDeclarationAnnotationEClass = createEClass(GET_PROPERTY_DECLARATION_ANNOTATION);
		createEAttribute(getPropertyDeclarationAnnotationEClass, GET_PROPERTY_DECLARATION_ANNOTATION__FIELD_TYPE_NAME);
		createEAttribute(getPropertyDeclarationAnnotationEClass, GET_PROPERTY_DECLARATION_ANNOTATION__GETTER_NAME);

		methodCallAnnotationEClass = createEClass(METHOD_CALL_ANNOTATION);
		createEAttribute(methodCallAnnotationEClass, METHOD_CALL_ANNOTATION__VARIABLE_NAME);
		createEAttribute(methodCallAnnotationEClass, METHOD_CALL_ANNOTATION__METHOD_NAME);
		createEAttribute(methodCallAnnotationEClass, METHOD_CALL_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);

		propertyPathAnnotationEClass = createEClass(PROPERTY_PATH_ANNOTATION);
		createEAttribute(propertyPathAnnotationEClass, PROPERTY_PATH_ANNOTATION__PROPERTY_PATH);

		propertyPathReturnAnnotationEClass = createEClass(PROPERTY_PATH_RETURN_ANNOTATION);
		createEAttribute(propertyPathReturnAnnotationEClass, PROPERTY_PATH_RETURN_ANNOTATION__PROPERTY_PATH);

		importTypeAnnotationEClass = createEClass(IMPORT_TYPE_ANNOTATION);
		createEAttribute(importTypeAnnotationEClass, IMPORT_TYPE_ANNOTATION__RELATIVE_QUALIFIED_TYPE_NAME);

		addVariableToCollectionAnnotationEClass = createEClass(ADD_VARIABLE_TO_COLLECTION_ANNOTATION);
		createEAttribute(addVariableToCollectionAnnotationEClass, ADD_VARIABLE_TO_COLLECTION_ANNOTATION__COLLECTION_PROPERTY_PATH);
		createEAttribute(addVariableToCollectionAnnotationEClass, ADD_VARIABLE_TO_COLLECTION_ANNOTATION__PARAMETER_PROPERTY_PATH);

		variableObjectConstructionAnnotationEClass = createEClass(VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION);
		createEAttribute(variableObjectConstructionAnnotationEClass, VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__VARIABLE_NAME);
		createEAttribute(variableObjectConstructionAnnotationEClass, VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__CONSTRUCTOR_TYPE_NAME);
		createEAttribute(variableObjectConstructionAnnotationEClass, VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION__PARAMETER_INPUT_VARIABLE_PROPERTY_PATHS);

		variableDefinitionAnnotationEClass = createEClass(VARIABLE_DEFINITION_ANNOTATION);
		createEAttribute(variableDefinitionAnnotationEClass, VARIABLE_DEFINITION_ANNOTATION__VARIABLE_NAME);
		createEAttribute(variableDefinitionAnnotationEClass, VARIABLE_DEFINITION_ANNOTATION__VARIABLE_TYPE_NAME);
		createEReference(variableDefinitionAnnotationEClass, VARIABLE_DEFINITION_ANNOTATION__RHS);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
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

		// Obtain other dependent packages
		CommandPackage theCommandPackage = (CommandPackage)EPackage.Registry.INSTANCE.getEPackage(CommandPackage.eNS_URI);
		QueryPackage theQueryPackage = (QueryPackage)EPackage.Registry.INSTANCE.getEPackage(QueryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		generationAnnotationEClass.getESuperTypes().add(ecorePackage.getEAnnotation());
		constructorAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		fieldAssignmentAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		parameterToFieldAssignmentAnnotationEClass.getESuperTypes().add(this.getFieldAssignmentAnnotation());
		propertyPathFieldAssignmentAnnotationEClass.getESuperTypes().add(this.getFieldAssignmentAnnotation());
		fieldInitializationAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		inlineSimpleFieldInitializationAnnotationEClass.getESuperTypes().add(this.getFieldInitializationAnnotation());
		constructorSimpleFieldInitializationAnnotationEClass.getESuperTypes().add(this.getFieldInitializationAnnotation());
		visibilityAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		commandParameterCreationAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		commandCreationAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		commandCallAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		queryCallAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		getPropertyAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		getPropertyDeclarationAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		methodCallAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		propertyPathAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		propertyPathReturnAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		importTypeAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		addVariableToCollectionAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());
		variableObjectConstructionAnnotationEClass.getESuperTypes().add(this.getFieldInitializationAnnotation());
		variableDefinitionAnnotationEClass.getESuperTypes().add(this.getGenerationAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(generationAnnotationEClass, GenerationAnnotation.class, "GenerationAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constructorAnnotationEClass, ConstructorAnnotation.class, "ConstructorAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldAssignmentAnnotationEClass, FieldAssignmentAnnotation.class, "FieldAssignmentAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldAssignmentAnnotation_Field(), ecorePackage.getEStructuralFeature(), null, "field", null, 1, 1, FieldAssignmentAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterToFieldAssignmentAnnotationEClass, ParameterToFieldAssignmentAnnotation.class, "ParameterToFieldAssignmentAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterToFieldAssignmentAnnotation_Parameter(), ecorePackage.getEParameter(), null, "parameter", null, 1, 1, ParameterToFieldAssignmentAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPathFieldAssignmentAnnotationEClass, PropertyPathFieldAssignmentAnnotation.class, "PropertyPathFieldAssignmentAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyPathFieldAssignmentAnnotation_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 1, 1, PropertyPathFieldAssignmentAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldInitializationAnnotationEClass, FieldInitializationAnnotation.class, "FieldInitializationAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inlineSimpleFieldInitializationAnnotationEClass, InlineSimpleFieldInitializationAnnotation.class, "InlineSimpleFieldInitializationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineSimpleFieldInitializationAnnotation_Field(), ecorePackage.getEStructuralFeature(), null, "field", null, 1, 1, InlineSimpleFieldInitializationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInlineSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths(), ecorePackage.getEString(), "parameterInputVariablePropertyPaths", null, 0, -1, InlineSimpleFieldInitializationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorSimpleFieldInitializationAnnotationEClass, ConstructorSimpleFieldInitializationAnnotation.class, "ConstructorSimpleFieldInitializationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructorSimpleFieldInitializationAnnotation_Field(), ecorePackage.getEStructuralFeature(), null, "field", null, 1, 1, ConstructorSimpleFieldInitializationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorSimpleFieldInitializationAnnotation_ParameterInputVariablePropertyPaths(), ecorePackage.getEString(), "parameterInputVariablePropertyPaths", null, 0, -1, ConstructorSimpleFieldInitializationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstructorSimpleFieldInitializationAnnotation_ConstructorTypeName(), ecorePackage.getEString(), "constructorTypeName", null, 1, 1, ConstructorSimpleFieldInitializationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(visibilityAnnotationEClass, VisibilityAnnotation.class, "VisibilityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibilityAnnotation_Visibility(), this.getVisibility(), "visibility", null, 1, 1, VisibilityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandParameterCreationAnnotationEClass, CommandParameterCreationAnnotation.class, "CommandParameterCreationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandParameterCreationAnnotation_Command(), theCommandPackage.getTransformation(), null, "command", null, 1, 1, CommandParameterCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandParameterCreationAnnotation_ParameterMappings(), ecorePackage.getEStringToStringMapEntry(), null, "parameterMappings", null, 0, -1, CommandParameterCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandParameterCreationAnnotation_ParametersVariableName(), ecorePackage.getEString(), "parametersVariableName", "parameters", 1, 1, CommandParameterCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandCreationAnnotationEClass, CommandCreationAnnotation.class, "CommandCreationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandCreationAnnotation_Command(), theCommandPackage.getTransformation(), null, "command", null, 1, 1, CommandCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandCreationAnnotation_CommandVariableName(), ecorePackage.getEString(), "commandVariableName", "command", 1, 1, CommandCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandCreationAnnotation_ParametersVariableName(), ecorePackage.getEString(), "parametersVariableName", "parameters", 1, 1, CommandCreationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commandCallAnnotationEClass, CommandCallAnnotation.class, "CommandCallAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandCallAnnotation_Command(), theCommandPackage.getTransformation(), null, "command", null, 1, 1, CommandCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandCallAnnotation_TargetRoleVariableName(), ecorePackage.getEString(), "targetRoleVariableName", null, 1, 1, CommandCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandCallAnnotation_ParametersVariableName(), ecorePackage.getEString(), "parametersVariableName", "parameters", 1, 1, CommandCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryCallAnnotationEClass, QueryCallAnnotation.class, "QueryCallAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryCallAnnotation_Query(), theQueryPackage.getQuery(), null, "query", null, 1, 1, QueryCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryCallAnnotation_InternalRoleField(), ecorePackage.getEReference(), null, "internalRoleField", null, 1, 1, QueryCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPropertyAnnotationEClass, GetPropertyAnnotation.class, "GetPropertyAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetPropertyAnnotation_Field(), ecorePackage.getEStructuralFeature(), null, "field", null, 1, 1, GetPropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPropertyAnnotation_GetterTypeName(), ecorePackage.getEString(), "getterTypeName", null, 1, 1, GetPropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPropertyAnnotation_GetterOperationName(), ecorePackage.getEString(), "getterOperationName", null, 1, 1, GetPropertyAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getPropertyDeclarationAnnotationEClass, GetPropertyDeclarationAnnotation.class, "GetPropertyDeclarationAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetPropertyDeclarationAnnotation_FieldTypeName(), ecorePackage.getEString(), "fieldTypeName", null, 1, 1, GetPropertyDeclarationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGetPropertyDeclarationAnnotation_GetterName(), ecorePackage.getEString(), "getterName", null, 1, 1, GetPropertyDeclarationAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodCallAnnotationEClass, MethodCallAnnotation.class, "MethodCallAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodCallAnnotation_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, MethodCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCallAnnotation_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, MethodCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodCallAnnotation_ParameterInputVariablePropertyPaths(), ecorePackage.getEString(), "parameterInputVariablePropertyPaths", null, 0, -1, MethodCallAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPathAnnotationEClass, PropertyPathAnnotation.class, "PropertyPathAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyPathAnnotation_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 1, 1, PropertyPathAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPathReturnAnnotationEClass, PropertyPathReturnAnnotation.class, "PropertyPathReturnAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyPathReturnAnnotation_PropertyPath(), ecorePackage.getEString(), "propertyPath", null, 1, 1, PropertyPathReturnAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importTypeAnnotationEClass, ImportTypeAnnotation.class, "ImportTypeAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportTypeAnnotation_RelativeQualifiedTypeName(), ecorePackage.getEString(), "relativeQualifiedTypeName", null, 1, 1, ImportTypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addVariableToCollectionAnnotationEClass, AddVariableToCollectionAnnotation.class, "AddVariableToCollectionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddVariableToCollectionAnnotation_CollectionPropertyPath(), ecorePackage.getEString(), "collectionPropertyPath", "parameters", 1, 1, AddVariableToCollectionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddVariableToCollectionAnnotation_ParameterPropertyPath(), ecorePackage.getEString(), "parameterPropertyPath", "parameters", 1, 1, AddVariableToCollectionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableObjectConstructionAnnotationEClass, VariableObjectConstructionAnnotation.class, "VariableObjectConstructionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableObjectConstructionAnnotation_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, VariableObjectConstructionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableObjectConstructionAnnotation_ConstructorTypeName(), ecorePackage.getEString(), "constructorTypeName", null, 1, 1, VariableObjectConstructionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableObjectConstructionAnnotation_ParameterInputVariablePropertyPaths(), ecorePackage.getEString(), "parameterInputVariablePropertyPaths", null, 0, -1, VariableObjectConstructionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDefinitionAnnotationEClass, VariableDefinitionAnnotation.class, "VariableDefinitionAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDefinitionAnnotation_VariableName(), ecorePackage.getEString(), "variableName", null, 1, 1, VariableDefinitionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDefinitionAnnotation_VariableTypeName(), ecorePackage.getEString(), "variableTypeName", null, 1, 1, VariableDefinitionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableDefinitionAnnotation_Rhs(), this.getGenerationAnnotation(), null, "rhs", null, 1, 1, VariableDefinitionAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.INTERNAL);

		// Create resource
		createResource(eNS_URI);
	}

} //GenerationAnnotationsPackageImpl
