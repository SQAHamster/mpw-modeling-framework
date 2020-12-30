package template.queries;

import com.google.common.base.CaseFormat;

public class CamelCaseStringConverter {
	private CamelCaseStringConverter() {}

	public static String lowerUnderscoreToCamelCase(String string) {
		string = string.replaceAll("([a-z])([A-Z])", "$1_$2"); // ensure existing camel-cases are retained
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, string);
	}
}
