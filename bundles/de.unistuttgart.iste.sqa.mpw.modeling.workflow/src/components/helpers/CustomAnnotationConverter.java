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

/**
 * Simple helper class which is used to debug purposes.
 * It converts complex, custom annotation parts in a model tree to simple annotations to ensure they are loadable as a simple XMI file. 
 */
public class CustomAnnotationConverter {
	private CustomAnnotationConverter() {
	}
	
	public static void convert(EObject eObject) {
		new CustomAnnotationConverter().simplify(eObject);
	}
	
	private void simplify(EObject eObject) {
		var modelElements = EcoreUtil2.getAllContentsOfType(eObject, EModelElement.class);
		for (var modelElement : modelElements) {
			var eAnnotations = modelElement.getEAnnotations();
			
			var convertedAnnotations = new ArrayList<EAnnotation>();
			for (var annotation : eAnnotations) {
				var replaced = convertAnnotation(annotation);
				convertedAnnotations.add(replaced);
			}
			
			eAnnotations.clear();
			eAnnotations.addAll(convertedAnnotations);
		}
		
	}
	
	private EAnnotation convertAnnotation(EAnnotation eAnnotation) {
		if (eAnnotation.getClass() == EAnnotationImpl.class) {
			return eAnnotation; // preserve normal annotations
		}

		var simpleAnnotation = newAnnotationFor(eAnnotation);
		
		convertEObjectToAnnotation(eAnnotation, simpleAnnotation);
		
		return simpleAnnotation;
	}
	
	private void convertEObjectToAnnotation(EObject sourceObject, EAnnotation targetAnnotation) {
		var eClass = convertAttributes(sourceObject, targetAnnotation);
		
		for (var reference : eClass.getEAllReferences()) {
			convertReference(sourceObject, targetAnnotation, reference);
		}
		
	}

	private void convertReference(EObject sourceObject, EAnnotation targetAnnotation, EReference reference) {
		var object = sourceObject.eGet(reference);
		if (object instanceof EObject) {
			convertForReference((EObject)object, targetAnnotation, reference);
		} else if (object instanceof EList<?>) {
			var references = (EList<?>)object;
			for (var referenceObject : references) {
				convertForReference((EObject)referenceObject, targetAnnotation, reference);
			}
		}
	}

	private EClass convertAttributes(EObject sourceObject, EAnnotation targetAnnotation) {
		var eClass = sourceObject.eClass();
		eClass.getEAllAttributes().stream()
		      .forEach(attribute -> {
			Object attributeValue = sourceObject.eGet(attribute);
			if (attributeValue != null) {
				targetAnnotation.getDetails().put(attribute.getName(), attributeValue.toString());
			}
		});
		return eClass;
	}
	
	private void convertForReference(EObject referencedEObject, EAnnotation targetAnnotation, EReference reference) {
		if (reference.getFeatureID() == EcorePackage.EANNOTATION__EMODEL_ELEMENT) {
			return;
		}
		
		var referenceAnnotation = newAnnotationFor(referencedEObject);
		referenceAnnotation.setSource(reference.getName());
		targetAnnotation.getEAnnotations().add(referenceAnnotation);
		
		if (reference.isContainment()) {
			convertEObjectToAnnotation(referencedEObject, referenceAnnotation);
		}
	}
	
	private static EAnnotation newAnnotationFor(EObject eObject) {
		var annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(eObject.getClass().getSimpleName());
		
		putIfFeatureExists(eObject, "name", annotation);
		putIfFeatureExists(eObject, "eType", annotation);
		
		return annotation;
	}
	
	private static void putIfFeatureExists(EObject eObject, String featureName, EAnnotation eAnnotation) {
		var feature = eObject.eClass().getEStructuralFeature(featureName);
		if (feature != null) {
			Object value = eObject.eGet(feature);
			if (value != null) {
				eAnnotation.getDetails().put(featureName, value.toString());
			}
		}
	}

}
