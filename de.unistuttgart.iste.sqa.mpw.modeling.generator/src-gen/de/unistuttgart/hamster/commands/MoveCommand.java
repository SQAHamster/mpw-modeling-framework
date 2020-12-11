package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class MoveCommand {
	private final ConcreteHamster thisInstance;

	public MoveCommand(ConcreteHamster self) {
		this.thisInstance = self;

	}

	public void execute() {

		if (thisInstance.getDirection() == NORTH) {

			moveNorth();

		}

		if (thisInstance.getDirection() == SOUTH) {

			moveSouth();

		}

		if (thisInstance.getDirection() == WEST) {

			moveWest();

		}

		if (thisInstance.getDirection() == EAST) {

			moveEast();

		}

	}

	private void moveNorth() {

		// new variable from reference: thisInstance:Hamster -> currentTile -> current:Tile
		Tile current = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", current);

		// new variable from reference: current:Tile -> north -> front:Tile
		Tile front = current.getNorth();
		assertInstanceNotNull("current.north", front);

		// assert condition: thisInstance.direction == NORTH
		assertAttributeCondition("thisInstance.direction == NORTH", thisInstance.getDirection() == NORTH);

		// remove reference: DELETE thisInstance:Hamster -> currentTile -> current:Tile

		thisInstance.setCurrentTile(null);

		// create reference: CREATE thisInstance:Hamster -> currentTile -> front:Tile

		thisInstance.setCurrentTile(front);

	}

	private void moveSouth() {

		// new variable from reference: thisInstance:Hamster -> currentTile -> current:Tile
		Tile current = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", current);

		// new variable from reference: current:Tile -> south -> front:Tile
		Tile front = current.getSouth();
		assertInstanceNotNull("current.south", front);

		// assert condition: thisInstance.direction == SOUTH
		assertAttributeCondition("thisInstance.direction == SOUTH", thisInstance.getDirection() == SOUTH);

		// remove reference: DELETE thisInstance:Hamster -> currentTile -> current:Tile

		thisInstance.setCurrentTile(null);

		// create reference: CREATE thisInstance:Hamster -> currentTile -> front:Tile

		thisInstance.setCurrentTile(front);

	}

	private void moveWest() {

		// new variable from reference: thisInstance:Hamster -> currentTile -> current:Tile
		Tile current = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", current);

		// new variable from reference: current:Tile -> west -> front:Tile
		Tile front = current.getWest();
		assertInstanceNotNull("current.west", front);

		// assert condition: thisInstance.direction == WEST
		assertAttributeCondition("thisInstance.direction == WEST", thisInstance.getDirection() == WEST);

		// remove reference: DELETE thisInstance:Hamster -> currentTile -> current:Tile

		thisInstance.setCurrentTile(null);

		// create reference: CREATE thisInstance:Hamster -> currentTile -> front:Tile

		thisInstance.setCurrentTile(front);

	}

	private void moveEast() {

		// new variable from reference: thisInstance:Hamster -> currentTile -> current:Tile
		Tile current = thisInstance.getCurrentTile();
		assertInstanceNotNull("thisInstance.currentTile", current);

		// new variable from reference: current:Tile -> east -> front:Tile
		Tile front = current.getEast();
		assertInstanceNotNull("current.east", front);

		// assert condition: thisInstance.direction == EAST
		assertAttributeCondition("thisInstance.direction == EAST", thisInstance.getDirection() == EAST);

		// remove reference: DELETE thisInstance:Hamster -> currentTile -> current:Tile

		thisInstance.setCurrentTile(null);

		// create reference: CREATE thisInstance:Hamster -> currentTile -> front:Tile

		thisInstance.setCurrentTile(front);

	}

}
