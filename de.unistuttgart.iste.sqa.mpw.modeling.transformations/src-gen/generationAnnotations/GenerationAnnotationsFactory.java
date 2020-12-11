/**
 */
package generationAnnotations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see generationAnnotations.GenerationAnnotationsPackage
 * @generated
 */
public interface GenerationAnnotationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenerationAnnotationsFactory eINSTANCE = generationAnnotations.impl.GenerationAnnotationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constructor Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Annotation</em>'.
	 * @generated
	 */
	ConstructorAnnotation createConstructorAnnotation();

	/**
	 * Returns a new object of class '<em>Parameter To Field Assignment Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter To Field Assignment Annotation</em>'.
	 * @generated
	 */
	ParameterToFieldAssignmentAnnotation createParameterToFieldAssignmentAnnotation();

	/**
	 * Returns a new object of class '<em>Property Path Field Assignment Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Path Field Assignment Annotation</em>'.
	 * @generated
	 */
	PropertyPathFieldAssignmentAnnotation createPropertyPathFieldAssignmentAnnotation();

	/**
	 * Returns a new object of class '<em>Inline Simple Field Initialization Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Simple Field Initialization Annotation</em>'.
	 * @generated
	 */
	InlineSimpleFieldInitializationAnnotation createInlineSimpleFieldInitializationAnnotation();

	/**
	 * Returns a new object of class '<em>Constructor Simple Field Initialization Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructor Simple Field Initialization Annotation</em>'.
	 * @generated
	 */
	ConstructorSimpleFieldInitializationAnnotation createConstructorSimpleFieldInitializationAnnotation();

	/**
	 * Returns a new object of class '<em>Visibility Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Annotation</em>'.
	 * @generated
	 */
	VisibilityAnnotation createVisibilityAnnotation();

	/**
	 * Returns a new object of class '<em>Command Parameter Creation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Parameter Creation Annotation</em>'.
	 * @generated
	 */
	CommandParameterCreationAnnotation createCommandParameterCreationAnnotation();

	/**
	 * Returns a new object of class '<em>Command Creation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Creation Annotation</em>'.
	 * @generated
	 */
	CommandCreationAnnotation createCommandCreationAnnotation();

	/**
	 * Returns a new object of class '<em>Command Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Call Annotation</em>'.
	 * @generated
	 */
	CommandCallAnnotation createCommandCallAnnotation();

	/**
	 * Returns a new object of class '<em>Query Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Call Annotation</em>'.
	 * @generated
	 */
	QueryCallAnnotation createQueryCallAnnotation();

	/**
	 * Returns a new object of class '<em>Get Property Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Property Annotation</em>'.
	 * @generated
	 */
	GetPropertyAnnotation createGetPropertyAnnotation();

	/**
	 * Returns a new object of class '<em>Get Property Declaration Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Property Declaration Annotation</em>'.
	 * @generated
	 */
	GetPropertyDeclarationAnnotation createGetPropertyDeclarationAnnotation();

	/**
	 * Returns a new object of class '<em>Method Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Call Annotation</em>'.
	 * @generated
	 */
	MethodCallAnnotation createMethodCallAnnotation();

	/**
	 * Returns a new object of class '<em>Property Path Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Path Annotation</em>'.
	 * @generated
	 */
	PropertyPathAnnotation createPropertyPathAnnotation();

	/**
	 * Returns a new object of class '<em>Property Path Return Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Path Return Annotation</em>'.
	 * @generated
	 */
	PropertyPathReturnAnnotation createPropertyPathReturnAnnotation();

	/**
	 * Returns a new object of class '<em>Import Type Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Type Annotation</em>'.
	 * @generated
	 */
	ImportTypeAnnotation createImportTypeAnnotation();

	/**
	 * Returns a new object of class '<em>Add Variable To Collection Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Variable To Collection Annotation</em>'.
	 * @generated
	 */
	AddVariableToCollectionAnnotation createAddVariableToCollectionAnnotation();

	/**
	 * Returns a new object of class '<em>Variable Object Construction Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Object Construction Annotation</em>'.
	 * @generated
	 */
	VariableObjectConstructionAnnotation createVariableObjectConstructionAnnotation();

	/**
	 * Returns a new object of class '<em>Variable Definition Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Definition Annotation</em>'.
	 * @generated
	 */
	VariableDefinitionAnnotation createVariableDefinitionAnnotation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenerationAnnotationsPackage getGenerationAnnotationsPackage();

} //GenerationAnnotationsFactory
