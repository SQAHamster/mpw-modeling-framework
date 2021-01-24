package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.commands.CommandStack;
import de.unistuttgart.kara.commands.Command;

import java.util.Stack;

import static de.unistuttgart.iste.rss.utils.Preconditions.checkState;

public class CommandStackImpl extends CommandStack {

	private final Stack<Command> undoneCommands = new Stack<>();

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
		undoneCommands.push(undoneCommand);
	}

	@Override
	public synchronized void redo() {
		checkState(undoneCommands.size() > 0, "Cannot redo");

		final Command undoneCommand = this.undoneCommands.pop();
		undoneCommand.execute();
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
		while (undoneCommands.size() > 0) {
			redo();
		}
	}
}
