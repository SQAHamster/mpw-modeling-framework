package components;

import java.util.ArrayList;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class QueryReader extends WorkflowComponentWithModelSlot {
	private String directory;
	
	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	@Override
	protected void invokeInternal(WorkflowContext context, ProgressMonitor monitor, Issues issues) {
		var models = new ArrayList<String>();
		
		models.add("Territory|width");
		models.add("Territory|height");
		models.add("Hamster|frontIsClear");
		models.add("Hamster|mouthEmpty");
		models.add("Hamster|grainAvailable");
		// models.add("Hamster|location");
		// models.add("Hamster|direction");

		context.set(getModelSlot(), models);
	}
}