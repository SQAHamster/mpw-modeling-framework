package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.AddEntityCommand;

public class AddEntityCommandImpl extends AddEntityCommand {

	public AddEntityCommandImpl() {

	}

	@Override
	public void execute() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void undo() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void redo() {
		throw new RuntimeException("not implemented");
	}

}
