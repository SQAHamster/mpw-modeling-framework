package components.generation;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;

/**
 *  Helper class to replace all property paths which are matched in a string, e.g. used by commands in attribute conditions.
 */
public class PropertyPathReplacer {

	public static String replaceWithEParameters(String input, EClassifier context, List<EParameter> parameters) {
		return toPropertyGetters(input);
	}
		
	public static String replaceWithCommandParameters(String input, EClassifier context, List<commandBehavior.Parameter> parameters) {
		return "";
	}
	
	// temporary copy of PropertyPathUtils, will be removed later
	
	private static final Pattern pattern = Pattern.compile("[\\w]+(\\.[\\w]+)+(\\(\\))?");
	
	private static String toPropertyGetters(String s) {
		s = s.replaceAll("(\\(\\w+)\\.(class::\\w+\\))", "$1_$2");
		StringBuilder sb = new StringBuilder();
		
		int lastIndex = 0;
		
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			String part = matcher.group();
			
			int startOfMatch = matcher.start();
			sb.append(s.substring(lastIndex, startOfMatch));
			
			String replacedPart = replacePropertyPathPart(part);
			sb.append(replacedPart);
			
			lastIndex = matcher.end();
		}
		
		sb.append(s.substring(lastIndex));
		
		return sb.toString().replaceAll("(\\(\\w+)\\_(class::\\w+\\))", "$1.$2");
	}
	
	private static String replacePropertyPathPart(String s) {
		String[] parts = s.split("\\.");
		for (int i = 1; i < parts.length; i++) {
			parts[i] = toGetter(parts[i]);
		}
		return String.join(".", parts);
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
}
