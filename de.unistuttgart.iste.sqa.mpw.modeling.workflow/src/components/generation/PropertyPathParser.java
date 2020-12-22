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
	private EClass currentType;
	
	public PropertyPathParser(EClass contextClass) {
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
		
		currentType = contextClass;
		
		final PropertyPath path = new PropertyPath();
		if (propertyPathString.length() > 0) {
			path.segments.add(toSegment(propertyPathString));
		}
		return path;
	}

	private void validatePathSyntax(String propertyPathString) {
		Matcher matcher = PROPERTY_PATH_PATTERN.matcher(propertyPathString);
		if (!matcher.matches()) {
			throw new PropertyPathParseException("invalid format: " + propertyPathString);
		}
	}
	
	private PropertyPathSegment toSegment(String part) {
		EStructuralFeature feature = currentType.getEStructuralFeature(part);
		
		PropertyPathSegment segment = new PropertyPathSegment();
		segment.isCollection = feature.getUpperBound() == -1;
		segment.isObjectReference = isObjectReference(feature);
		segment.originalSegment = part;
		segment.segmentType = feature.getEType();
		return segment;
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
