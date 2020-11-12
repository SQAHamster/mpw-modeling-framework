package components;

import java.util.ArrayList;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class CommandReader extends WorkflowComponentWithModelSlot {
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
		
		models.add("Territory|initTerritory");
		models.add("Territory|initDefaultHamster");
		models.add("Territory|addGrainsToTile");
		models.add("Territory|addWallToTile");
		models.add("Territory|clearTile");
		models.add("Hamster|initHamster");
		models.add("Hamster|move");
		models.add("Hamster|turnLeft");
		models.add("Hamster|pickGrain");
		models.add("Hamster|putGrain");

		context.set(getModelSlot(), models);

	}
}