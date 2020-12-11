/**
 */
package generationAnnotations.impl;

import generationAnnotations.GenerationAnnotation;
import generationAnnotations.GenerationAnnotationsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EAnnotationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GenerationAnnotationImpl extends EAnnotationImpl implements GenerationAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenerationAnnotationsPackage.Literals.GENERATION_ANNOTATION;
	}

} //GenerationAnnotationImpl
