package components.generation;

import java.util.List;
import java.util.regex.Matcher;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;

import components.generation.PropertyPathParser.PropertyPathSegment;

/**
 *  Helper class to replace all property paths which are matched in a string, e.g. used by commands in attribute conditions.
 */
public class PropertyPathReplacer {
	public static ReplacerConfig JAVA_CONFIG = new ReplacerConfig();
	public static ReplacerConfig CPP_CONFIG = new ReplacerConfig();
	
	static {
		JAVA_CONFIG.simpleAccessor = ".";
		JAVA_CONFIG.objectReferenceAccessor = ".";
		CPP_CONFIG.simpleAccessor = ".";
		CPP_CONFIG.objectReferenceAccessor = "->";
	}

	public static String replacePropertyPaths(String input, List<ETypedElement> variables, ReplacerConfig replacerConfig) {
		PropertyPathReplacer replacer = new PropertyPathReplacer(input, variables, replacerConfig);
		return replacer.replace();
	}
	
	private final List<ETypedElement> variables;
	private final ReplacerConfig replacerConfig;
	private final String input;
	
	private int lastIndex = 0;
	private final StringBuilder sb = new StringBuilder();
	
	private PropertyPathReplacer(String input, List<ETypedElement> variables, ReplacerConfig replacerConfig) {
		this.input = input;
		this.variables = variables;
		this.replacerConfig = replacerConfig;
	}
	
	private String replace() {
		Matcher matcher = PropertyPathParser.PROPERTY_PATH_PATTERN.matcher(input);
		while (matcher.find()) {
			appendUntilMatch(matcher);
			replaceAndAppendCurrentMatch(matcher);
		}
		appendUntilEnd();
		return sb.toString();
	}

	private void appendUntilMatch(Matcher matcher) {
		int startOfMatch = matcher.start();
		sb.append(input.substring(lastIndex, startOfMatch));
		lastIndex = matcher.end();
	}
	
	private void replaceAndAppendCurrentMatch(Matcher matcher) {
		String propertyPath = matcher.group();
		parseAndAppend(propertyPath);
	}

	private void appendUntilEnd() {
		sb.append(input.substring(lastIndex));
	}
	
	private void parseAndAppend(String propertyPath) {
		EClassifier contextType = getContextType();
		var parser = new PropertyPathParser(contextType);
		for (var variable : variables) {
			parser.addParameter(variable.getName(), variable.getEType());
		}
		
		if (!parser.checkIsParsable(propertyPath)) {
			sb.append(propertyPath);
			return;
		}
		
		var parsedPropertyPath = parser.parse(propertyPath);
		
		String accessor = "";
		for (PropertyPathSegment segment : parsedPropertyPath.segments) {
			if (accessor.isEmpty()) {
				sb.append(segment.originalSegment);
			} else {
				sb.append(accessor);
				String getterName = toGetter(segment.originalSegment);
				sb.append(getterName);
			}
			accessor = accessorFor(segment);
		}
 		
	}

	private EClassifier getContextType() {
		var optionalThisVariable = variables.stream().filter(v -> v.getName().equals("this")).findFirst();
		if (optionalThisVariable.isEmpty()) {
			return EcorePackage.eINSTANCE.getEObject();
		}
		var thisVariable = optionalThisVariable.get();
		EClassifier contextType = thisVariable.getEType();
		return contextType;
	}

	private String accessorFor(PropertyPathSegment segment) {
		if (segment.isObjectReference) {
			return replacerConfig.objectReferenceAccessor;
		}
		return replacerConfig.simpleAccessor;
	}

	private static String toGetter(String s) {
		if (s.endsWith("()")) {
			return s;
		}
		if (s.matches("is[A-Z0-9].*")) {
			return s + "()";
		}
		return "get" + s.substring(0, 1).toUpperCase() + s.substring(1) + "()";
	}
	
	public static class ReplacerConfig {
		public String simpleAccessor;
		public String objectReferenceAccessor;
		
	}

}
