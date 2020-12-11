/**
 */
package generationAnnotations.impl;

import generationAnnotations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenerationAnnotationsFactoryImpl extends EFactoryImpl implements GenerationAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenerationAnnotationsFactory init() {
		try {
			GenerationAnnotationsFactory theGenerationAnnotationsFactory = (GenerationAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(GenerationAnnotationsPackage.eNS_URI);
			if (theGenerationAnnotationsFactory != null) {
				return theGenerationAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenerationAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenerationAnnotationsPackage.CONSTRUCTOR_ANNOTATION: return createConstructorAnnotation();
			case GenerationAnnotationsPackage.PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION: return createParameterToFieldAssignmentAnnotation();
			case GenerationAnnotationsPackage.PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION: return createPropertyPathFieldAssignmentAnnotation();
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION: return createInlineSimpleFieldInitializationAnnotation();
			case GenerationAnnotationsPackage.CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION: return createConstructorSimpleFieldInitializationAnnotation();
			case GenerationAnnotationsPackage.VISIBILITY_ANNOTATION: return createVisibilityAnnotation();
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION: return createCommandParameterCreationAnnotation();
			case GenerationAnnotationsPackage.COMMAND_CREATION_ANNOTATION: return createCommandCreationAnnotation();
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION: return createCommandCallAnnotation();
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION: return createQueryCallAnnotation();
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION: return createGetPropertyAnnotation();
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION: return createGetPropertyDeclarationAnnotation();
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION: return createMethodCallAnnotation();
			case GenerationAnnotationsPackage.PROPERTY_PATH_ANNOTATION: return createPropertyPathAnnotation();
			case GenerationAnnotationsPackage.PROPERTY_PATH_RETURN_ANNOTATION: return createPropertyPathReturnAnnotation();
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION: return createImportTypeAnnotation();
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION: return createAddVariableToCollectionAnnotation();
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION: return createVariableObjectConstructionAnnotation();
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION: return createVariableDefinitionAnnotation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenerationAnnotationsPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenerationAnnotationsPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorAnnotation createConstructorAnnotation() {
		ConstructorAnnotationImpl constructorAnnotation = new ConstructorAnnotationImpl();
		return constructorAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterToFieldAssignmentAnnotation createParameterToFieldAssignmentAnnotation() {
		ParameterToFieldAssignmentAnnotationImpl parameterToFieldAssignmentAnnotation = new ParameterToFieldAssignmentAnnotationImpl();
		return parameterToFieldAssignmentAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPathFieldAssignmentAnnotation createPropertyPathFieldAssignmentAnnotation() {
		PropertyPathFieldAssignmentAnnotationImpl propertyPathFieldAssignmentAnnotation = new PropertyPathFieldAssignmentAnnotationImpl();
		return propertyPathFieldAssignmentAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineSimpleFieldInitializationAnnotation createInlineSimpleFieldInitializationAnnotation() {
		InlineSimpleFieldInitializationAnnotationImpl inlineSimpleFieldInitializationAnnotation = new InlineSimpleFieldInitializationAnnotationImpl();
		return inlineSimpleFieldInitializationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructorSimpleFieldInitializationAnnotation createConstructorSimpleFieldInitializationAnnotation() {
		ConstructorSimpleFieldInitializationAnnotationImpl constructorSimpleFieldInitializationAnnotation = new ConstructorSimpleFieldInitializationAnnotationImpl();
		return constructorSimpleFieldInitializationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityAnnotation createVisibilityAnnotation() {
		VisibilityAnnotationImpl visibilityAnnotation = new VisibilityAnnotationImpl();
		return visibilityAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandParameterCreationAnnotation createCommandParameterCreationAnnotation() {
		CommandParameterCreationAnnotationImpl commandParameterCreationAnnotation = new CommandParameterCreationAnnotationImpl();
		return commandParameterCreationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCreationAnnotation createCommandCreationAnnotation() {
		CommandCreationAnnotationImpl commandCreationAnnotation = new CommandCreationAnnotationImpl();
		return commandCreationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCallAnnotation createCommandCallAnnotation() {
		CommandCallAnnotationImpl commandCallAnnotation = new CommandCallAnnotationImpl();
		return commandCallAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCallAnnotation createQueryCallAnnotation() {
		QueryCallAnnotationImpl queryCallAnnotation = new QueryCallAnnotationImpl();
		return queryCallAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetPropertyAnnotation createGetPropertyAnnotation() {
		GetPropertyAnnotationImpl getPropertyAnnotation = new GetPropertyAnnotationImpl();
		return getPropertyAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetPropertyDeclarationAnnotation createGetPropertyDeclarationAnnotation() {
		GetPropertyDeclarationAnnotationImpl getPropertyDeclarationAnnotation = new GetPropertyDeclarationAnnotationImpl();
		return getPropertyDeclarationAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCallAnnotation createMethodCallAnnotation() {
		MethodCallAnnotationImpl methodCallAnnotation = new MethodCallAnnotationImpl();
		return methodCallAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPathAnnotation createPropertyPathAnnotation() {
		PropertyPathAnnotationImpl propertyPathAnnotation = new PropertyPathAnnotationImpl();
		return propertyPathAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyPathReturnAnnotation createPropertyPathReturnAnnotation() {
		PropertyPathReturnAnnotationImpl propertyPathReturnAnnotation = new PropertyPathReturnAnnotationImpl();
		return propertyPathReturnAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportTypeAnnotation createImportTypeAnnotation() {
		ImportTypeAnnotationImpl importTypeAnnotation = new ImportTypeAnnotationImpl();
		return importTypeAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddVariableToCollectionAnnotation createAddVariableToCollectionAnnotation() {
		AddVariableToCollectionAnnotationImpl addVariableToCollectionAnnotation = new AddVariableToCollectionAnnotationImpl();
		return addVariableToCollectionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableObjectConstructionAnnotation createVariableObjectConstructionAnnotation() {
		VariableObjectConstructionAnnotationImpl variableObjectConstructionAnnotation = new VariableObjectConstructionAnnotationImpl();
		return variableObjectConstructionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDefinitionAnnotation createVariableDefinitionAnnotation() {
		VariableDefinitionAnnotationImpl variableDefinitionAnnotation = new VariableDefinitionAnnotationImpl();
		return variableDefinitionAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotationsPackage getGenerationAnnotationsPackage() {
		return (GenerationAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenerationAnnotationsPackage getPackage() {
		return GenerationAnnotationsPackage.eINSTANCE;
	}

} //GenerationAnnotationsFactoryImpl
