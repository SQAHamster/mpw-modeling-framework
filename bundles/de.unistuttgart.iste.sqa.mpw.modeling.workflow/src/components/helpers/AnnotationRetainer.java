package components.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import util.LambdaVisitor;

/**
 * Helper class used to retain annotations, which are stored in .ecore files, but not available when
 * using generated Ecore packages.
 *
 * Main usecase: Attach documentation annotations from a loaded, but not registered Ecore model to
 * the registered one.
 */
public class AnnotationRetainer {
	
	private final EPackage eSourcePackage;
	private Map<String, EModelElement> elementPathToSourceElementMap = new HashMap<>();
	
	public AnnotationRetainer(EPackage eSourcePackage) {
		super();
		this.eSourcePackage = eSourcePackage;
	}

	public void copyMissingAnnotationsTo(final EPackage eTargetPackage) {
		buildPathToElementMapForSource();
		traverseTargetAndCopyAnnotations(eTargetPackage);
	}

	private void buildPathToElementMapForSource() {
		elementPathToSourceElementMap = buildPathToElementMap(eSourcePackage);
	}
	
	private void traverseTargetAndCopyAnnotations(final EPackage eTargetPackage) {
		traverseAllModelElements(eTargetPackage, element -> {
			final Optional<String> keyOptional = toKey(element);
			keyOptional.ifPresent(key -> checkSourceAnnotation(element, key));
		});
	}
	
	private void checkSourceAnnotation(final EModelElement targetElement, final String key) {
		final EModelElement sourceElement = elementPathToSourceElementMap.get(key);
		if (sourceElement != null) {
			copyMissingAnnotations(sourceElement, targetElement);
		}
	}

	private void copyMissingAnnotations(final EModelElement sourceElement, final EModelElement targetElement) {
		for (EAnnotation eAnnotation : sourceElement.getEAnnotations()) {
			if (targetElement.getEAnnotation(eAnnotation.getSource()) == null) {
				final EAnnotation copiedAnnotation = EcoreUtil.copy(eAnnotation);
				targetElement.getEAnnotations().add(copiedAnnotation);
			}
		}
	}

	private static Map<String, EModelElement> buildPathToElementMap(EPackage ePackage) {
		final Map<String, EModelElement> result = new HashMap<>();
		traverseAllModelElements(ePackage, element -> putIfSupported(element, result));
		return result;
	}
	
	private static void traverseAllModelElements(final EPackage ePackage, final Consumer<EModelElement> consumer) {
		var contentIterator = EcoreUtil.getAllContents(ePackage, false);
		
		while (contentIterator.hasNext()) {
			final Object content = contentIterator.next();
			new LambdaVisitor<Object>()
			    .on(EModelElement.class).then(element -> consumer.accept(element))
			.accept(content);
		}
	}
	
	private static void putIfSupported(final EModelElement element, final Map<String, EModelElement> result) {
		final Optional<String> keyOptional = toKey(element);
		keyOptional.ifPresent(key -> result.put(key, element));
	}

	private static Optional<String> toKey(final EModelElement content) {
		final StringBuilder key = new StringBuilder();
		new LambdaVisitor<EModelElement>()
		    .on(EClassifier.class).then(eClassifier -> key.append(getClassifier(eClassifier)))
		    .on(EStructuralFeature.class).then(eFeature -> key.append(getFeature(eFeature)))
		    .on(EOperation.class).then(eOperation -> key.append(getOperation(eOperation)))
		.accept(content);
		return toKeyOptional(key);
	}

	private static Optional<String> toKeyOptional(final StringBuilder key) {
		if (key.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(key.toString());
	}
	
	private static String getClassifier(final EClassifier eClassifier) {
		return eClassifier.getName();
	}
	
	private static String getFeature(final EStructuralFeature eStructuralFeature) {
		return String.format("%s/%s", eStructuralFeature.getEContainingClass().getName(), eStructuralFeature.getName());
	}
	
	private static String getOperation(final EOperation eOperation) {
		return String.format("%s/%s", eOperation.getEContainingClass().getName(), eOperation.getName());
	}
}
