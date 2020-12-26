package template.properties;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper class to generate code from property paths, e.g. used by commands in attribute conditions. 
 */
public class PropertyPathUtils {
	private static final Pattern pattern = Pattern.compile("[\\w]+(\\.[\\w]+)+(\\(\\))?");
	
	public static String toPropertyGetters(String s) {
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

    /*
	public static String toPropertyGetters(String string, List<ContextVariable> variables) {
		var parameters = variables.stream()
		                          .map(v -> toETypedElement(v))
		                          .collect(Collectors.toList());
		
		return PropertyPathReplacer.replacePropertyPaths(string, parameters, PropertyPathReplacer.JAVA_CONFIG);
	}
	
	private static ETypedElement toETypedElement(ContextVariable variable) {
		EParameter parameter = EcorePackage.eINSTANCE.getEcoreFactory().createEParameter();
		parameter.setName(variable.getName());
		parameter.setEType(variable.getType());
		return parameter;
	}
     */
}
