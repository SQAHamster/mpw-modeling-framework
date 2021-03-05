package components.helpers;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class EclipsePathHelper {
    private EclipsePathHelper() {
    }

    /**
     * Converts the given path into a Java File path by using the eclipse Path
     * class. Background: While Eclipse can handle absolute paths starting with "/",
     * on Windows this leads to paths like "/D:" what is not directly compatible
     * with the Java path syntax. Hence the path will be processed with the Eclipse
     * Path class to get a valid java path.
     */
    public static String toJavaCompatibleAbsoluteFilePath(final String path) {
        final var eclipsePath = new org.eclipse.core.runtime.Path(path);
        return eclipsePath.toFile().getAbsolutePath();
    }

    /**
     * Checks for a project, if it is located in the current workspace. Background:
     * Some resource access is done in the same workspace, which needs intermediary
     * source directories (e.g. "myproject/src/myresource.txt"). But, this might
     * also be the case in external projects, where the project is included by a
     * dependency archive. This needs to remove the source directory part (e.g.
     * "myproject/myresource.txt"), since it is placed inside the JAR archive.
     * 
     * @param projectName An Eclipse project name.
     * @return true, if the mapped URI for the project name is a file URI.
     */
    public static boolean isProjectInSameWorkspace(final String projectName) {
        final URI projectUri = getMappedPlatformUriForProject(projectName);
        return projectUri.isFile();
    }

    /**
     * Returns the mapped URI for a given project name.
     */
    public static URI getMappedPlatformUriForProject(final String projectName) {
        return EcorePlugin.getPlatformResourceMap().get(projectName);
    }
}
