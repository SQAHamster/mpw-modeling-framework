package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.Command;
import de.unistuttgart.hamster.command.CommandStack;

public class CommandStackImpl extends CommandStack {

	public CommandStackImpl() {

	}

	@Override
	public void execute(Command command) {
		addToStack(command);
		command.execute();
	}

	@Override
	public void undo() {
		var stack = getStack();
		if (stack.isEmpty()) {
			throw new IllegalStateException("cannot undo with empty stack");
		}

		var command = stack.remove(stack.size() - 1);
		command.undo();
	}

	@Override
	public void redo() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void undoAll() {
		var stack = getStack();
		while (stack.size() > 0) {
			undo();
		}
	}

	@Override
	public void redoAll() {
		throw new RuntimeException("not implemented");
	}
}
