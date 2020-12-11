package de.unistuttgart.hamster.commands;

import static de.unistuttgart.hamster.framework.FrameworkAssert.*;
import de.unistuttgart.hamster.hamster.*;

import de.unistuttgart.hamster.mpw.*;
import static de.unistuttgart.hamster.mpw.Direction.*;

public class InitHamsterCommand {
	private final ConcreteHamster thisInstance;

	public InitHamsterCommand(ConcreteHamster self) {
		this.thisInstance = self;

	}

	public void execute() {

	}

}
