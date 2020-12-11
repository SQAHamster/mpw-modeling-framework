/**
 */
package generationAnnotations.util;

import generationAnnotations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see generationAnnotations.GenerationAnnotationsPackage
 * @generated
 */
public class GenerationAnnotationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenerationAnnotationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationAnnotationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenerationAnnotationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationAnnotationsSwitch<Adapter> modelSwitch =
		new GenerationAnnotationsSwitch<Adapter>() {
			@Override
			public Adapter caseGenerationAnnotation(GenerationAnnotation object) {
				return createGenerationAnnotationAdapter();
			}
			@Override
			public Adapter caseConstructorAnnotation(ConstructorAnnotation object) {
				return createConstructorAnnotationAdapter();
			}
			@Override
			public Adapter caseFieldAssignmentAnnotation(FieldAssignmentAnnotation object) {
				return createFieldAssignmentAnnotationAdapter();
			}
			@Override
			public Adapter caseParameterToFieldAssignmentAnnotation(ParameterToFieldAssignmentAnnotation object) {
				return createParameterToFieldAssignmentAnnotationAdapter();
			}
			@Override
			public Adapter casePropertyPathFieldAssignmentAnnotation(PropertyPathFieldAssignmentAnnotation object) {
				return createPropertyPathFieldAssignmentAnnotationAdapter();
			}
			@Override
			public Adapter caseFieldInitializationAnnotation(FieldInitializationAnnotation object) {
				return createFieldInitializationAnnotationAdapter();
			}
			@Override
			public Adapter caseInlineSimpleFieldInitializationAnnotation(InlineSimpleFieldInitializationAnnotation object) {
				return createInlineSimpleFieldInitializationAnnotationAdapter();
			}
			@Override
			public Adapter caseConstructorSimpleFieldInitializationAnnotation(ConstructorSimpleFieldInitializationAnnotation object) {
				return createConstructorSimpleFieldInitializationAnnotationAdapter();
			}
			@Override
			public Adapter caseVisibilityAnnotation(VisibilityAnnotation object) {
				return createVisibilityAnnotationAdapter();
			}
			@Override
			public Adapter caseCommandParameterCreationAnnotation(CommandParameterCreationAnnotation object) {
				return createCommandParameterCreationAnnotationAdapter();
			}
			@Override
			public Adapter caseCommandCreationAnnotation(CommandCreationAnnotation object) {
				return createCommandCreationAnnotationAdapter();
			}
			@Override
			public Adapter caseCommandCallAnnotation(CommandCallAnnotation object) {
				return createCommandCallAnnotationAdapter();
			}
			@Override
			public Adapter caseQueryCallAnnotation(QueryCallAnnotation object) {
				return createQueryCallAnnotationAdapter();
			}
			@Override
			public Adapter caseGetPropertyAnnotation(GetPropertyAnnotation object) {
				return createGetPropertyAnnotationAdapter();
			}
			@Override
			public Adapter caseGetPropertyDeclarationAnnotation(GetPropertyDeclarationAnnotation object) {
				return createGetPropertyDeclarationAnnotationAdapter();
			}
			@Override
			public Adapter caseMethodCallAnnotation(MethodCallAnnotation object) {
				return createMethodCallAnnotationAdapter();
			}
			@Override
			public Adapter casePropertyPathAnnotation(PropertyPathAnnotation object) {
				return createPropertyPathAnnotationAdapter();
			}
			@Override
			public Adapter casePropertyPathReturnAnnotation(PropertyPathReturnAnnotation object) {
				return createPropertyPathReturnAnnotationAdapter();
			}
			@Override
			public Adapter caseImportTypeAnnotation(ImportTypeAnnotation object) {
				return createImportTypeAnnotationAdapter();
			}
			@Override
			public Adapter caseAddVariableToCollectionAnnotation(AddVariableToCollectionAnnotation object) {
				return createAddVariableToCollectionAnnotationAdapter();
			}
			@Override
			public Adapter caseVariableObjectConstructionAnnotation(VariableObjectConstructionAnnotation object) {
				return createVariableObjectConstructionAnnotationAdapter();
			}
			@Override
			public Adapter caseVariableDefinitionAnnotation(VariableDefinitionAnnotation object) {
				return createVariableDefinitionAnnotationAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseEAnnotation(EAnnotation object) {
				return createEAnnotationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.GenerationAnnotation <em>Generation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.GenerationAnnotation
	 * @generated
	 */
	public Adapter createGenerationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.ConstructorAnnotation <em>Constructor Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.ConstructorAnnotation
	 * @generated
	 */
	public Adapter createConstructorAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.FieldAssignmentAnnotation <em>Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.FieldAssignmentAnnotation
	 * @generated
	 */
	public Adapter createFieldAssignmentAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.ParameterToFieldAssignmentAnnotation <em>Parameter To Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.ParameterToFieldAssignmentAnnotation
	 * @generated
	 */
	public Adapter createParameterToFieldAssignmentAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.PropertyPathFieldAssignmentAnnotation <em>Property Path Field Assignment Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.PropertyPathFieldAssignmentAnnotation
	 * @generated
	 */
	public Adapter createPropertyPathFieldAssignmentAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.FieldInitializationAnnotation <em>Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.FieldInitializationAnnotation
	 * @generated
	 */
	public Adapter createFieldInitializationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.InlineSimpleFieldInitializationAnnotation <em>Inline Simple Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.InlineSimpleFieldInitializationAnnotation
	 * @generated
	 */
	public Adapter createInlineSimpleFieldInitializationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.ConstructorSimpleFieldInitializationAnnotation <em>Constructor Simple Field Initialization Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.ConstructorSimpleFieldInitializationAnnotation
	 * @generated
	 */
	public Adapter createConstructorSimpleFieldInitializationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.VisibilityAnnotation <em>Visibility Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.VisibilityAnnotation
	 * @generated
	 */
	public Adapter createVisibilityAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.CommandParameterCreationAnnotation <em>Command Parameter Creation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.CommandParameterCreationAnnotation
	 * @generated
	 */
	public Adapter createCommandParameterCreationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.CommandCreationAnnotation <em>Command Creation Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.CommandCreationAnnotation
	 * @generated
	 */
	public Adapter createCommandCreationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.CommandCallAnnotation <em>Command Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.CommandCallAnnotation
	 * @generated
	 */
	public Adapter createCommandCallAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.QueryCallAnnotation <em>Query Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.QueryCallAnnotation
	 * @generated
	 */
	public Adapter createQueryCallAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.GetPropertyAnnotation <em>Get Property Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.GetPropertyAnnotation
	 * @generated
	 */
	public Adapter createGetPropertyAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.GetPropertyDeclarationAnnotation <em>Get Property Declaration Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.GetPropertyDeclarationAnnotation
	 * @generated
	 */
	public Adapter createGetPropertyDeclarationAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.MethodCallAnnotation <em>Method Call Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.MethodCallAnnotation
	 * @generated
	 */
	public Adapter createMethodCallAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.PropertyPathAnnotation <em>Property Path Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.PropertyPathAnnotation
	 * @generated
	 */
	public Adapter createPropertyPathAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.PropertyPathReturnAnnotation <em>Property Path Return Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.PropertyPathReturnAnnotation
	 * @generated
	 */
	public Adapter createPropertyPathReturnAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.ImportTypeAnnotation <em>Import Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.ImportTypeAnnotation
	 * @generated
	 */
	public Adapter createImportTypeAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.AddVariableToCollectionAnnotation <em>Add Variable To Collection Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.AddVariableToCollectionAnnotation
	 * @generated
	 */
	public Adapter createAddVariableToCollectionAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.VariableObjectConstructionAnnotation <em>Variable Object Construction Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.VariableObjectConstructionAnnotation
	 * @generated
	 */
	public Adapter createVariableObjectConstructionAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link generationAnnotations.VariableDefinitionAnnotation <em>Variable Definition Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see generationAnnotations.VariableDefinitionAnnotation
	 * @generated
	 */
	public Adapter createVariableDefinitionAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EAnnotation <em>EAnnotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EAnnotation
	 * @generated
	 */
	public Adapter createEAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenerationAnnotationsAdapterFactory
