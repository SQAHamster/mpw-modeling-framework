package de.unistuttgart.iste.sqa.mpw.framework.commands.impl;

import de.unistuttgart.iste.sqa.mpw.framework.commands.Command;
import de.unistuttgart.iste.sqa.mpw.framework.commands.CommandStack;

import static de.unistuttgart.iste.sqa.mpw.framework.utils.Preconditions.checkState;

public class CommandStackImpl extends CommandStack {

	public CommandStackImpl() {
		super();
	}


	@Override
	public void execute(final Command command) {
		command.execute();
		addToExecutedCommands(command);
	}

	@Override
	public synchronized void undo() {
		final var stack = getExecutedCommands();
		checkState(stack.size() > 0, "Cannot undo");

		final Command undoneCommand = stack.remove(stack.size() - 1);
		undoneCommand.undo();
		getUndoneCommands().add(undoneCommand);
	}

	@Override
	public synchronized void redo() {
		final var undoStack = getUndoneCommands();
		checkState(undoStack.size() > 0, "Cannot redo");

		final Command undoneCommand = undoStack.remove(undoStack.size() - 1);
		undoneCommand.redo();
		getExecutedCommands().add(undoneCommand);
	}

	@Override
	public synchronized void undoAll() {
		final var stack = getExecutedCommands();
		while (stack.size() > 0) {
			undo();
		}
	}

	@Override
	public synchronized void redoAll() {
		final var undoStack = getUndoneCommands();
		while (undoStack.size() > 0) {
			redo();
		}
	}
}
