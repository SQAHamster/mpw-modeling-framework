package components.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import stereotypes.StereotypesPackage;

/**
 *  Helper class to parse property paths, e.g. used by commands in attribute conditions.
 *  Note: a property path always starts with 
 */
public class PropertyPathParser {
	private static final EClass VALUE_TYPE_ECLASS = StereotypesPackage.eINSTANCE.getValueType();
	
	private static final Pattern PROPERTY_PATH_PATTERN = Pattern.compile("[\\w]+(\\.[\\w]+)*");
	
	private final EClass contextClass;
	private EClassifier currentType;
	
	private PropertyPath resultPath;
	
	public PropertyPathParser(EClass contextClass) {
		if (contextClass == null) {
			throw new NullPointerException("contextClass must not be null");
		}
		this.contextClass = contextClass;
	}
	
	/**
	 * Takes a property path and determines
	 * for each segment which type (EClass) it has and which kind it is.
	 * Kinds: reference, simple-property, collection.
	 * @param propertyPathString path which has the structure (propertyName)('.' (propertyName))*
	 * @return a parsed data structure for the property path
	 */
	public PropertyPath parse(String propertyPathString) {
		validatePathSyntax(propertyPathString);
		initializeParsing();
		
		String[] parts = propertyPathString.split("\\.");
		for (String part : parts) {
			handleNextPropertyPart(part);
		}
		
		return resultPath;
	}

	private void validatePathSyntax(String propertyPathString) {
		Matcher matcher = PROPERTY_PATH_PATTERN.matcher(propertyPathString);
		if (!matcher.matches()) {
			throw new PropertyPathParseException("invalid format: " + propertyPathString);
		}
	}

	private void initializeParsing() {
		currentType = contextClass;
		resultPath = new PropertyPath();
	}
	
	private void handleNextPropertyPart(String part) {
		var segment = toSegment(part);
		resultPath.segments.add(segment);
		currentType = segment.segmentType;
		validateCurrentType();
	}
	
	private PropertyPathSegment toSegment(String part) {
		if ("this".equals(part)) {
			return toThisPart();
		} else {
			return toFeaturePart(part);
		}

	}
	
	private PropertyPathSegment toThisPart() {
		validateForThisIsUsedOnlyAsFirst();
		PropertyPathSegment segment = new PropertyPathSegment();
		segment.isObjectReference = true;
		segment.originalSegment = "this";
		segment.segmentType = currentType;
		return segment;
	}
	
	private void validateForThisIsUsedOnlyAsFirst() {
		if (resultPath.segments.size() > 0) {
			throw new IllegalStateException("'this' is only allowed as first part in a property path");
		}
	}

	private PropertyPathSegment toFeaturePart(String part) {
		EStructuralFeature feature = getFeature(part);

		PropertyPathSegment segment = new PropertyPathSegment();
		segment.isCollection = feature.getUpperBound() == -1;
		segment.isObjectReference = isObjectReference(feature);
		segment.originalSegment = part;
		segment.segmentType = feature.getEType();
		return segment;
	}

	private EStructuralFeature getFeature(String part) {
		EStructuralFeature feature = getCurrentTypeAsEClass().getEStructuralFeature(part);
		if (feature == null) {
			throw new IllegalStateException(part + " is no feature of " + currentType.getName());
		}
		return feature;
	}
	
	private EClass getCurrentTypeAsEClass() {
		boolean isEClass = currentType instanceof EClass;
		if (!isEClass) {
			throw new IllegalStateException("the current type '" + currentType.getName() + "' is no EClass any more, hence it has no further properties");
		}
		return (EClass)currentType;
	}
	
	private boolean isObjectReference(EStructuralFeature feature) {
		return feature instanceof EReference && !isValueType(feature.getEType());
	}

	private boolean isValueType(EClassifier type) {
		if (type instanceof EClass) {
			EClass eClass = (EClass)type;
			return eClass.getEAllSuperTypes().stream()
					.anyMatch(t -> t.equals(VALUE_TYPE_ECLASS));
		}
		return false;
	}
	
	private void validateCurrentType() {
		if (currentType == null) {
			throw new IllegalStateException("current type must not be null");
		}
	}

	public void addParameter(String parameterName, String parameterName2) {
		// TODO
	}
	
	public static class PropertyPath {
		public final List<PropertyPathSegment> segments = new ArrayList<PropertyPathParser.PropertyPathSegment>();
	}

	public static class PropertyPathSegment {
		public String originalSegment;
		public EClassifier segmentType;
		public boolean isCollection;
		public boolean isObjectReference;
	}
	
}
