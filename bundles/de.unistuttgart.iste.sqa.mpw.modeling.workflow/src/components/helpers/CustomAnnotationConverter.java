package components.helpers;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EAnnotationImpl;
import org.eclipse.xtext.EcoreUtil2;

import util.LambdaVisitor;

/**
 * Simple helper class which is used to debug purposes.
 * It converts complex, custom annotation parts in a model tree to simple annotations to ensure they are loadable as a simple XMI file. 
 */
public class CustomAnnotationConverter {
	private static final String PARAM_ANNOTATION_ETYPE = "eType";
	private static final String PARAM_ANNOTATION_NAME = "name";

	private CustomAnnotationConverter() {
	}
	
	public static void convert(final EObject eObject) {
		new CustomAnnotationConverter().simplify(eObject);
	}
	
	private void simplify(final EObject eObject) {
		final var modelElements = EcoreUtil2.getAllContentsOfType(eObject, EModelElement.class);
		for (final var modelElement : modelElements) {
			final var eAnnotations = modelElement.getEAnnotations();
			
			final var convertedAnnotations = new ArrayList<EAnnotation>();
			for (final var annotation : eAnnotations) {
				final var replaced = convertAnnotation(annotation);
				convertedAnnotations.add(replaced);
			}
			
			eAnnotations.clear();
			eAnnotations.addAll(convertedAnnotations);
		}
		
	}
	
	private EAnnotation convertAnnotation(final EAnnotation eAnnotation) {
		if (eAnnotation.getClass() == EAnnotationImpl.class) {
			return eAnnotation; // preserve normal annotations
		}

		final var simpleAnnotation = newAnnotationFor(eAnnotation);
		
		convertEObjectToAnnotation(eAnnotation, simpleAnnotation);
		
		return simpleAnnotation;
	}
	
	private void convertEObjectToAnnotation(final EObject sourceObject, final EAnnotation targetAnnotation) {
		final var eClass = convertAttributes(sourceObject, targetAnnotation);
		
		for (final var reference : eClass.getEAllReferences()) {
			convertReference(sourceObject, targetAnnotation, reference);
		}
		
	}

	private void convertReference(final EObject sourceObject, final EAnnotation targetAnnotation, final EReference reference) {
		final var object = sourceObject.eGet(reference);
		new LambdaVisitor<Object>()
		.on(EObject.class).then(eObject -> {
			convertForReference((EObject)object, targetAnnotation, reference);
		})
		.on(EList.class).then(references -> {
			for (final var referenceObject : references) {
				convertForReference((EObject)referenceObject, targetAnnotation, reference);
			}
		});
	}

	private EClass convertAttributes(final EObject sourceObject, final EAnnotation targetAnnotation) {
		final var eClass = sourceObject.eClass();
		eClass.getEAllAttributes().stream()
		      .forEach(attribute -> {
			final Object attributeValue = sourceObject.eGet(attribute);
			if (attributeValue != null) {
				targetAnnotation.getDetails().put(attribute.getName(), attributeValue.toString());
			}
		});
		return eClass;
	}
	
	private void convertForReference(final EObject referencedEObject, final EAnnotation targetAnnotation, final EReference reference) {
		if (reference.getFeatureID() == EcorePackage.EANNOTATION__EMODEL_ELEMENT) {
			return;
		}
		
		final var referenceAnnotation = newAnnotationFor(referencedEObject);
		referenceAnnotation.setSource(reference.getName());
		targetAnnotation.getEAnnotations().add(referenceAnnotation);
		
		if (reference.isContainment()) {
			convertEObjectToAnnotation(referencedEObject, referenceAnnotation);
		}
	}
	
	private static EAnnotation newAnnotationFor(final EObject eObject) {
		final var annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(eObject.getClass().getSimpleName());
		
		putIfFeatureExists(eObject, PARAM_ANNOTATION_NAME, annotation);
		putIfFeatureExists(eObject, PARAM_ANNOTATION_ETYPE, annotation);
		
		return annotation;
	}
	
	private static void putIfFeatureExists(final EObject eObject, final String featureName, final EAnnotation eAnnotation) {
		final var feature = eObject.eClass().getEStructuralFeature(featureName);
		if (feature != null) {
			final Object value = eObject.eGet(feature);
			if (value != null) {
				eAnnotation.getDetails().put(featureName, value.toString());
			}
		}
	}

}
