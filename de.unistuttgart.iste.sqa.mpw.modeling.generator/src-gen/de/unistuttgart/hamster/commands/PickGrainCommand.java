package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class PickGrainCommand {
	private final ConcreteHamster thisInstance;

	public PickGrainCommand(ConcreteHamster self) {
		this.thisInstance = self;

	}

	public void execute() {

		// new variable from reference: thisInstance:Hamster -> currentTile -> position:Tile
		Tile position = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", position);

		// find new variable from many-reference: position:Tile -> contents -> grain:Grain

		Grain grain = execute_findGrain(position);

		// remove reference: DELETE position:Tile -> contents -> grain:Grain

		position.getContents().remove(grain);

		// create reference: CREATE thisInstance:Hamster -> grains -> grain:Grain

		thisInstance.getGrains().add(grain);

	}

	private Grain execute_findGrain(Tile source) {
		Grain result = null;

		for (TileContent grainTileContent : source.getContents()) {

			if (!(grainTileContent instanceof Grain)) {
				continue;
			}
			Grain grain = (Grain) grainTileContent;

			result = grain;
			break;
		}
		assertObjectFound("contents", "Grain", result);
		return result;
	}

}
