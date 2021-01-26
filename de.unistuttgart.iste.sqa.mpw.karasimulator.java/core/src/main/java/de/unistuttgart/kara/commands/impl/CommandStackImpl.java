package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.commands.CommandStack;
import de.unistuttgart.kara.commands.Command;

import static de.unistuttgart.iste.rss.utils.Preconditions.checkState;

public class CommandStackImpl extends CommandStack {

	public CommandStackImpl() {
		super();
	}


	@Override
	public void execute(Command command) {
		command.execute();
		addToExecutedCommands(command);
	}

	@Override
	public synchronized void undo() {
		var stack = getExecutedCommands();
		checkState(stack.size() > 0, "Cannot undo");

		final Command undoneCommand = stack.remove(stack.size() - 1);
		undoneCommand.undo();
		getUndoneCommands().add(undoneCommand);
	}

	@Override
	public synchronized void redo() {
		var undoStack = getUndoneCommands();
		checkState(undoStack.size() > 0, "Cannot redo");

		final Command undoneCommand = undoStack.remove(undoStack.size() - 1);
		undoneCommand.redo();
		getExecutedCommands().add(undoneCommand);
	}

	@Override
	public synchronized void undoAll() {
		var stack = getExecutedCommands();
		while (stack.size() > 0) {
			undo();
		}
	}

	@Override
	public synchronized void redoAll() {
		var undoStack = getUndoneCommands();
		while (undoStack.size() > 0) {
			redo();
		}
	}
}
