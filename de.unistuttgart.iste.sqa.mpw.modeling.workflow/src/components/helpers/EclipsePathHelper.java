package components.helpers;

public class EclipsePathHelper {
	private EclipsePathHelper() {}
	
	/**
	 * Converts the given path into a Java File path by using the eclipse Path class.
	 * Background: While Eclipse can handle absolute paths starting with "/", on Windows this leads to paths like "/D:" what
	 *             is not directly compatible with the Java path syntax. Hence the path will be processed with the Eclipse
	 *             Path class to get a valid java path.
	 */
	public static String toJavaCompatibleAbsoluteFilePath(String path) {
		var eclipsePath = new org.eclipse.core.runtime.Path(path);
		return eclipsePath.toFile().getAbsolutePath();
	}
}
