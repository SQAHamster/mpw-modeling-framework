/**
 */
package generationAnnotations.util;

import generationAnnotations.*;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see generationAnnotations.GenerationAnnotationsPackage
 * @generated
 */
public class GenerationAnnotationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenerationAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotationsSwitch() {
		if (modelPackage == null) {
			modelPackage = GenerationAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenerationAnnotationsPackage.GENERATION_ANNOTATION: {
				GenerationAnnotation generationAnnotation = (GenerationAnnotation)theEObject;
				T result = caseGenerationAnnotation(generationAnnotation);
				if (result == null) result = caseEAnnotation(generationAnnotation);
				if (result == null) result = caseEModelElement(generationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.CONSTRUCTOR_ANNOTATION: {
				ConstructorAnnotation constructorAnnotation = (ConstructorAnnotation)theEObject;
				T result = caseConstructorAnnotation(constructorAnnotation);
				if (result == null) result = caseGenerationAnnotation(constructorAnnotation);
				if (result == null) result = caseEAnnotation(constructorAnnotation);
				if (result == null) result = caseEModelElement(constructorAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.FIELD_ASSIGNMENT_ANNOTATION: {
				FieldAssignmentAnnotation fieldAssignmentAnnotation = (FieldAssignmentAnnotation)theEObject;
				T result = caseFieldAssignmentAnnotation(fieldAssignmentAnnotation);
				if (result == null) result = caseGenerationAnnotation(fieldAssignmentAnnotation);
				if (result == null) result = caseEAnnotation(fieldAssignmentAnnotation);
				if (result == null) result = caseEModelElement(fieldAssignmentAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.PARAMETER_TO_FIELD_ASSIGNMENT_ANNOTATION: {
				ParameterToFieldAssignmentAnnotation parameterToFieldAssignmentAnnotation = (ParameterToFieldAssignmentAnnotation)theEObject;
				T result = caseParameterToFieldAssignmentAnnotation(parameterToFieldAssignmentAnnotation);
				if (result == null) result = caseFieldAssignmentAnnotation(parameterToFieldAssignmentAnnotation);
				if (result == null) result = caseGenerationAnnotation(parameterToFieldAssignmentAnnotation);
				if (result == null) result = caseEAnnotation(parameterToFieldAssignmentAnnotation);
				if (result == null) result = caseEModelElement(parameterToFieldAssignmentAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.PROPERTY_PATH_FIELD_ASSIGNMENT_ANNOTATION: {
				PropertyPathFieldAssignmentAnnotation propertyPathFieldAssignmentAnnotation = (PropertyPathFieldAssignmentAnnotation)theEObject;
				T result = casePropertyPathFieldAssignmentAnnotation(propertyPathFieldAssignmentAnnotation);
				if (result == null) result = caseFieldAssignmentAnnotation(propertyPathFieldAssignmentAnnotation);
				if (result == null) result = caseGenerationAnnotation(propertyPathFieldAssignmentAnnotation);
				if (result == null) result = caseEAnnotation(propertyPathFieldAssignmentAnnotation);
				if (result == null) result = caseEModelElement(propertyPathFieldAssignmentAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.FIELD_INITIALIZATION_ANNOTATION: {
				FieldInitializationAnnotation fieldInitializationAnnotation = (FieldInitializationAnnotation)theEObject;
				T result = caseFieldInitializationAnnotation(fieldInitializationAnnotation);
				if (result == null) result = caseGenerationAnnotation(fieldInitializationAnnotation);
				if (result == null) result = caseEAnnotation(fieldInitializationAnnotation);
				if (result == null) result = caseEModelElement(fieldInitializationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.INLINE_SIMPLE_FIELD_INITIALIZATION_ANNOTATION: {
				InlineSimpleFieldInitializationAnnotation inlineSimpleFieldInitializationAnnotation = (InlineSimpleFieldInitializationAnnotation)theEObject;
				T result = caseInlineSimpleFieldInitializationAnnotation(inlineSimpleFieldInitializationAnnotation);
				if (result == null) result = caseFieldInitializationAnnotation(inlineSimpleFieldInitializationAnnotation);
				if (result == null) result = caseGenerationAnnotation(inlineSimpleFieldInitializationAnnotation);
				if (result == null) result = caseEAnnotation(inlineSimpleFieldInitializationAnnotation);
				if (result == null) result = caseEModelElement(inlineSimpleFieldInitializationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.CONSTRUCTOR_SIMPLE_FIELD_INITIALIZATION_ANNOTATION: {
				ConstructorSimpleFieldInitializationAnnotation constructorSimpleFieldInitializationAnnotation = (ConstructorSimpleFieldInitializationAnnotation)theEObject;
				T result = caseConstructorSimpleFieldInitializationAnnotation(constructorSimpleFieldInitializationAnnotation);
				if (result == null) result = caseFieldInitializationAnnotation(constructorSimpleFieldInitializationAnnotation);
				if (result == null) result = caseGenerationAnnotation(constructorSimpleFieldInitializationAnnotation);
				if (result == null) result = caseEAnnotation(constructorSimpleFieldInitializationAnnotation);
				if (result == null) result = caseEModelElement(constructorSimpleFieldInitializationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.VISIBILITY_ANNOTATION: {
				VisibilityAnnotation visibilityAnnotation = (VisibilityAnnotation)theEObject;
				T result = caseVisibilityAnnotation(visibilityAnnotation);
				if (result == null) result = caseGenerationAnnotation(visibilityAnnotation);
				if (result == null) result = caseEAnnotation(visibilityAnnotation);
				if (result == null) result = caseEModelElement(visibilityAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.COMMAND_PARAMETER_CREATION_ANNOTATION: {
				CommandParameterCreationAnnotation commandParameterCreationAnnotation = (CommandParameterCreationAnnotation)theEObject;
				T result = caseCommandParameterCreationAnnotation(commandParameterCreationAnnotation);
				if (result == null) result = caseGenerationAnnotation(commandParameterCreationAnnotation);
				if (result == null) result = caseEAnnotation(commandParameterCreationAnnotation);
				if (result == null) result = caseEModelElement(commandParameterCreationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.COMMAND_CREATION_ANNOTATION: {
				CommandCreationAnnotation commandCreationAnnotation = (CommandCreationAnnotation)theEObject;
				T result = caseCommandCreationAnnotation(commandCreationAnnotation);
				if (result == null) result = caseGenerationAnnotation(commandCreationAnnotation);
				if (result == null) result = caseEAnnotation(commandCreationAnnotation);
				if (result == null) result = caseEModelElement(commandCreationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.COMMAND_CALL_ANNOTATION: {
				CommandCallAnnotation commandCallAnnotation = (CommandCallAnnotation)theEObject;
				T result = caseCommandCallAnnotation(commandCallAnnotation);
				if (result == null) result = caseGenerationAnnotation(commandCallAnnotation);
				if (result == null) result = caseEAnnotation(commandCallAnnotation);
				if (result == null) result = caseEModelElement(commandCallAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.QUERY_CALL_ANNOTATION: {
				QueryCallAnnotation queryCallAnnotation = (QueryCallAnnotation)theEObject;
				T result = caseQueryCallAnnotation(queryCallAnnotation);
				if (result == null) result = caseGenerationAnnotation(queryCallAnnotation);
				if (result == null) result = caseEAnnotation(queryCallAnnotation);
				if (result == null) result = caseEModelElement(queryCallAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.GET_PROPERTY_ANNOTATION: {
				GetPropertyAnnotation getPropertyAnnotation = (GetPropertyAnnotation)theEObject;
				T result = caseGetPropertyAnnotation(getPropertyAnnotation);
				if (result == null) result = caseGenerationAnnotation(getPropertyAnnotation);
				if (result == null) result = caseEAnnotation(getPropertyAnnotation);
				if (result == null) result = caseEModelElement(getPropertyAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.GET_PROPERTY_DECLARATION_ANNOTATION: {
				GetPropertyDeclarationAnnotation getPropertyDeclarationAnnotation = (GetPropertyDeclarationAnnotation)theEObject;
				T result = caseGetPropertyDeclarationAnnotation(getPropertyDeclarationAnnotation);
				if (result == null) result = caseGenerationAnnotation(getPropertyDeclarationAnnotation);
				if (result == null) result = caseEAnnotation(getPropertyDeclarationAnnotation);
				if (result == null) result = caseEModelElement(getPropertyDeclarationAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.METHOD_CALL_ANNOTATION: {
				MethodCallAnnotation methodCallAnnotation = (MethodCallAnnotation)theEObject;
				T result = caseMethodCallAnnotation(methodCallAnnotation);
				if (result == null) result = caseGenerationAnnotation(methodCallAnnotation);
				if (result == null) result = caseEAnnotation(methodCallAnnotation);
				if (result == null) result = caseEModelElement(methodCallAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.PROPERTY_PATH_ANNOTATION: {
				PropertyPathAnnotation propertyPathAnnotation = (PropertyPathAnnotation)theEObject;
				T result = casePropertyPathAnnotation(propertyPathAnnotation);
				if (result == null) result = caseGenerationAnnotation(propertyPathAnnotation);
				if (result == null) result = caseEAnnotation(propertyPathAnnotation);
				if (result == null) result = caseEModelElement(propertyPathAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.PROPERTY_PATH_RETURN_ANNOTATION: {
				PropertyPathReturnAnnotation propertyPathReturnAnnotation = (PropertyPathReturnAnnotation)theEObject;
				T result = casePropertyPathReturnAnnotation(propertyPathReturnAnnotation);
				if (result == null) result = caseGenerationAnnotation(propertyPathReturnAnnotation);
				if (result == null) result = caseEAnnotation(propertyPathReturnAnnotation);
				if (result == null) result = caseEModelElement(propertyPathReturnAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.IMPORT_TYPE_ANNOTATION: {
				ImportTypeAnnotation importTypeAnnotation = (ImportTypeAnnotation)theEObject;
				T result = caseImportTypeAnnotation(importTypeAnnotation);
				if (result == null) result = caseGenerationAnnotation(importTypeAnnotation);
				if (result == null) result = caseEAnnotation(importTypeAnnotation);
				if (result == null) result = caseEModelElement(importTypeAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.ADD_VARIABLE_TO_COLLECTION_ANNOTATION: {
				AddVariableToCollectionAnnotation addVariableToCollectionAnnotation = (AddVariableToCollectionAnnotation)theEObject;
				T result = caseAddVariableToCollectionAnnotation(addVariableToCollectionAnnotation);
				if (result == null) result = caseGenerationAnnotation(addVariableToCollectionAnnotation);
				if (result == null) result = caseEAnnotation(addVariableToCollectionAnnotation);
				if (result == null) result = caseEModelElement(addVariableToCollectionAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.VARIABLE_OBJECT_CONSTRUCTION_ANNOTATION: {
				VariableObjectConstructionAnnotation variableObjectConstructionAnnotation = (VariableObjectConstructionAnnotation)theEObject;
				T result = caseVariableObjectConstructionAnnotation(variableObjectConstructionAnnotation);
				if (result == null) result = caseFieldInitializationAnnotation(variableObjectConstructionAnnotation);
				if (result == null) result = caseGenerationAnnotation(variableObjectConstructionAnnotation);
				if (result == null) result = caseEAnnotation(variableObjectConstructionAnnotation);
				if (result == null) result = caseEModelElement(variableObjectConstructionAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenerationAnnotationsPackage.VARIABLE_DEFINITION_ANNOTATION: {
				VariableDefinitionAnnotation variableDefinitionAnnotation = (VariableDefinitionAnnotation)theEObject;
				T result = caseVariableDefinitionAnnotation(variableDefinitionAnnotation);
				if (result == null) result = caseGenerationAnnotation(variableDefinitionAnnotation);
				if (result == null) result = caseEAnnotation(variableDefinitionAnnotation);
				if (result == null) result = caseEModelElement(variableDefinitionAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationAnnotation(GenerationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorAnnotation(ConstructorAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Assignment Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Assignment Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAssignmentAnnotation(FieldAssignmentAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter To Field Assignment Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter To Field Assignment Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterToFieldAssignmentAnnotation(ParameterToFieldAssignmentAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Path Field Assignment Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Path Field Assignment Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPathFieldAssignmentAnnotation(PropertyPathFieldAssignmentAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Initialization Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Initialization Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldInitializationAnnotation(FieldInitializationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Simple Field Initialization Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Simple Field Initialization Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineSimpleFieldInitializationAnnotation(InlineSimpleFieldInitializationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Simple Field Initialization Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Simple Field Initialization Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorSimpleFieldInitializationAnnotation(ConstructorSimpleFieldInitializationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visibility Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visibility Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibilityAnnotation(VisibilityAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Parameter Creation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Parameter Creation Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandParameterCreationAnnotation(CommandParameterCreationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Creation Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Creation Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandCreationAnnotation(CommandCreationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Call Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandCallAnnotation(CommandCallAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Call Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryCallAnnotation(QueryCallAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Property Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Property Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPropertyAnnotation(GetPropertyAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Property Declaration Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Property Declaration Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetPropertyDeclarationAnnotation(GetPropertyDeclarationAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Call Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Call Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCallAnnotation(MethodCallAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Path Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Path Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPathAnnotation(PropertyPathAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Path Return Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Path Return Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPathReturnAnnotation(PropertyPathReturnAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Type Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Type Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportTypeAnnotation(ImportTypeAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Variable To Collection Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Variable To Collection Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddVariableToCollectionAnnotation(AddVariableToCollectionAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Object Construction Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Object Construction Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableObjectConstructionAnnotation(VariableObjectConstructionAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Definition Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Definition Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDefinitionAnnotation(VariableDefinitionAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAnnotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAnnotation(EAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenerationAnnotationsSwitch
