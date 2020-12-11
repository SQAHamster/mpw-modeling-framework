package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class TurnLeftCommand {
	private final ConcreteHamster thisInstance;

	public TurnLeftCommand(ConcreteHamster self) {
		this.thisInstance = self;

	}

	public void execute() {

		if (thisInstance.getDirection() == NORTH) {

			turnLeftNorth();

		}

		if (thisInstance.getDirection() == SOUTH) {

			turnLeftSouth();

		}

		if (thisInstance.getDirection() == WEST) {

			turnLeftWest();

		}

		if (thisInstance.getDirection() == EAST) {

			turnLeftEast();

		}

	}

	private void turnLeftNorth() {

		// assert condition: thisInstance.direction == NORTH
		assertAttributeCondition("thisInstance.direction == NORTH", thisInstance.getDirection() == NORTH);

	}

	private void turnLeftSouth() {

		// assert condition: thisInstance.direction == SOUTH
		assertAttributeCondition("thisInstance.direction == SOUTH", thisInstance.getDirection() == SOUTH);

	}

	private void turnLeftWest() {

		// assert condition: thisInstance.direction == WEST
		assertAttributeCondition("thisInstance.direction == WEST", thisInstance.getDirection() == WEST);

	}

	private void turnLeftEast() {

		// assert condition: thisInstance.direction == EAST
		assertAttributeCondition("thisInstance.direction == EAST", thisInstance.getDirection() == EAST);

	}

}
