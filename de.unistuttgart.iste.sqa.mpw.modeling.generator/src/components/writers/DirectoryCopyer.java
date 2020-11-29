package components.writers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DirectoryCopyer extends AbstractWorkflowComponent {
	private String sourcePath;
	private String targetPath;
	
	public String getSourcePath() {
		return sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
	}

	public String getTargetPath() {
		return targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	@Override
	public void checkConfiguration(Issues issues) {
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		try {
			copyFolder(Path.of(sourcePath), Path.of(targetPath));
		} catch (Exception e) {
			issues.addError("failed to copy directory from: '" + sourcePath + "' to '" + targetPath + "'", e);
		}
	}
	
	private void copyFolder(Path source, Path target) throws IOException {
		target.toFile().mkdirs();
	    try (var stream = Files.walk(source)) {
	        stream.forEach(path -> copy(path, target.resolve(source.relativize(path))));
	    }
	}

	private void copy(Path source, Path target) {
		try {
			var targetFile = target.toFile();
			boolean isExistingDirectory = targetFile.isDirectory() && targetFile.exists();
			if (!isExistingDirectory) {
				Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (IOException e) {
			throw new RuntimeException("error copying file: " + source.toAbsolutePath(), e);
		}
	}

}
