package de.unistuttgart.hamster.commands.impl;

import de.unistuttgart.hamster.commands.Command;
import de.unistuttgart.hamster.commands.GameCommandStack;

import java.util.concurrent.Semaphore;

public class GameCommandStackImpl extends GameCommandStack {

	public GameCommandStackImpl() {
		super(new Semaphore(1, true));
	}

	@Override
	public void startGame() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void startGamePaused() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void execute(Command command) {
		addToStack(command);
		command.execute();
	}

	@Override
	public void pauseGame() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void resumeGame() {
		throw new RuntimeException("not implemented");
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

	@Override
	public void stopGame() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void reset() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void hardReset() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void abortOrStopGame() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void enableDelay() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void disableDelay() {
		throw new RuntimeException("not implemented");
	}
}
