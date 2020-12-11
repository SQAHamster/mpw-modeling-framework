package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class PutGrainCommand {
	private final ConcreteHamster thisInstance;

	public PutGrainCommand(ConcreteHamster self) {
		this.thisInstance = self;

	}

	public void execute() {

		// find new variable from many-reference: thisInstance:Hamster -> grains -> grain:Grain

		Grain grain = execute_findGrain(thisInstance);

		// new variable from reference: thisInstance:Hamster -> currentTile -> position:Tile
		Tile position = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", position);

		// remove reference: DELETE thisInstance:Hamster -> grains -> grain:Grain

		thisInstance.getGrains().remove(grain);

		// create reference: CREATE position:Tile -> contents -> grain:Grain

		position.getContents().add(grain);

	}

	private Grain execute_findGrain(ConcreteHamster source) {
		Grain result = null;

		for (Grain grain : source.getGrains()) {

			result = grain;
			break;
		}
		assertObjectFound("grains", "Grain", result);
		return result;
	}

}
