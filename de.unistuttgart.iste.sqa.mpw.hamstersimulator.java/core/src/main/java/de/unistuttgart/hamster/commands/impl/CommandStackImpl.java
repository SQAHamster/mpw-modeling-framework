package de.unistuttgart.hamster.commands.impl;

import de.unistuttgart.hamster.commands.CommandStack;
import de.unistuttgart.hamster.commands.Command;

public class CommandStackImpl extends CommandStack {

    public CommandStackImpl() {
    	super();
    }

	@Override
    public void execute(Command command) {
        addToExecutedCommands(command);
        command.execute();
    }

    @Override
    public void undo() {
        var stack = getExecutedCommands();
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
        var stack = getExecutedCommands();
        while (stack.size() > 0) {
            undo();
        }
    }

	@Override
	public void redoAll() {
		throw new RuntimeException("not implemented");
	}

}
