package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class ClearTileCommand {
	private final ConcreteTerritory thisInstance;

	public ClearTileCommand(ConcreteTerritory self) {
		this.thisInstance = self;

	}

	public void execute() {

	}

}