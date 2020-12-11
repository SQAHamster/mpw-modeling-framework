package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.RemoveEntityCommand;

public class RemoveEntityCommandImpl extends RemoveEntityCommand {

	public RemoveEntityCommandImpl() {

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
