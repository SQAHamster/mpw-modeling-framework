package components.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
	private static final String THIS_REFERENCE = "this";

	private static final EClass VALUE_TYPE_ECLASS = StereotypesPackage.eINSTANCE.getValueType();
	
	public static final Pattern PROPERTY_PATH_PATTERN = Pattern.compile("[\\w]+(\\.[\\w]+)*");
	
	private final EClassifier contextClass;
	private EClassifier currentType;
	
	private PropertyPath resultPath;

	/**
	 * Additional parameters which may be used as "starting point" in a property path
	 */
	private final List<Parameter> parameters = new ArrayList<>();
	
	public PropertyPathParser(EClassifier contextClass) {
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

	/**
	 * Checks if the given string is a parsable property path.
	 * Note: it checks if the pattern matches and the starting segment is a valid variable.
	 */
	public boolean checkIsParsable(String string) {
		boolean matches = PROPERTY_PATH_PATTERN.matcher(string).matches();
		if (!matches) {
			return false;
		}
		String[] parts = string.split("\\.");
		String firstPart = parts[0];
		return firstPart.equals("this") || parameters.stream().anyMatch(p -> p.name.equals(firstPart));
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
		if (THIS_REFERENCE.equals(part)) {
			return toThisPart();
		} else if (usesParameter(part)) {
			return toParameterPart(part);
		} else {
			return toFeaturePart(part);
		}

	}

	private PropertyPathSegment toThisPart() {
		validateForThisIsUsedOnlyAsFirst();
		PropertyPathSegment segment = new PropertyPathSegment();
		segment.isObjectReference = true;
		segment.originalSegment = THIS_REFERENCE;
		segment.segmentType = currentType;
		return segment;
	}
	
	private boolean usesParameter(String part) {
		return isStartOfPropertyPath() 
				&& parameters.stream().anyMatch(p -> p.name.equals(part));
	}

	private PropertyPathSegment toParameterPart(String part) {
		Parameter parameter = getParameterForName(part);
		
		PropertyPathSegment segment = new PropertyPathSegment();
		segment.isObjectReference = isObjectReference(parameter);
		segment.originalSegment = part;
		segment.segmentType = parameter.type;
		return segment;
	}

	private Parameter getParameterForName(String name) {
		Optional<Parameter> optionalParameter = parameters.stream()
				.filter(p -> p.name.equals(name))
				.findFirst();
		if (optionalParameter.isEmpty()) {
			throw new IllegalStateException("parameter with name '" + name + "' does not exist");
		}
		return optionalParameter.get();
	}
	
	private void validateForThisIsUsedOnlyAsFirst() {
		if (!isStartOfPropertyPath()) {
			throw new IllegalStateException("'this' is only allowed as first part in a property path");
		}
	}
	
	private boolean isStartOfPropertyPath() {
		return resultPath.segments.isEmpty();
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
	
	/**
	 * A feature is a object reference if it is
	 * a) a EReference
	 * b) no value type
	 */
	private boolean isObjectReference(EStructuralFeature feature) {
		return feature instanceof EReference && !isValueType(feature.getEType());
	}
	
	/**
	 * To determine if a parameter is a object reference, some heuristics have to be applied to determine if its a object reference
	 * a) no value type
	 * b) no primitive
	 */
	private boolean isObjectReference(Parameter parameter) {
		return !isValueType(parameter.type) && !isPrimitive(parameter.type);
	}

	private boolean isPrimitive(EClassifier type) {
		switch (type.getName()) {
		case "EInt":
		case "EFloat":
		case "EBoolean":
		case "EString":
			return true;
		default:
			break;
		}
		return false;
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

	public void addParameter(String parameterName, EClassifier parameterType) {
		Parameter parameter = new Parameter();
		parameter.name = parameterName;
		parameter.type = parameterType;
		this.parameters.add(parameter);
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

	public static class Parameter {
		public String name;
		public EClassifier type;
	}
	
}
