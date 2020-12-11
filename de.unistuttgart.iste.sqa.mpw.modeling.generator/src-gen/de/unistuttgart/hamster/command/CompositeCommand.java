package de.unistuttgart.hamster.command;

import java.util.List;

public abstract class CompositeCommand implements Command {

	private List<Command> subCommands;

	public CompositeCommand() {

	}

	public List<Command> getSubCommands() {
		return this.subCommands;
	}

}
