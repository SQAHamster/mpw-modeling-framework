package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.commands.Command;
import de.unistuttgart.kara.commands.GameCommandStack;
import de.unistuttgart.kara.commands.Mode;
import de.unistuttgart.kara.exceptions.GameAbortedException;
import de.unistuttgart.kara.framework.CommandConstraintException;

import java.util.Stack;
import java.util.concurrent.Semaphore;

import static de.unistuttgart.iste.rss.utils.Preconditions.*;

public class GameCommandStackImpl extends GameCommandStack {

	private final Stack<Command> undoneCommands = new Stack<>();

	private boolean delayEnabled = true;

	public GameCommandStackImpl() {
		super(new Semaphore(1, true));
		setMode(Mode.INITIALIZING);
	}

	@Override
	public synchronized void startGame() {
		startGameInMode(Mode.RUNNING);
	}

	@Override
	public synchronized void startGamePaused() {
		startGameInMode(Mode.RUNNING);
		pauseGame();
	}

	private void startGameInMode(Mode mode) {
		checkState(getMode() == Mode.INITIALIZING,
				"start game is only possible during initialization");

		this.getStack().clear();
		this.undoneCommands.clear();
		this.setMode(mode);
	}

	@Override
	public void execute(Command command) {
		runRegardingPause(() -> {
			doExecute(command);
		});
	}

	private void doExecute(Command command) {
		synchronized (this) {
			if (this.getMode() == Mode.ABORTED) {
				this.setMode(Mode.STOPPED);
				throw new GameAbortedException("Stopped execution of command due to abort");
			} else if (this.getMode() != Mode.RUNNING) {
				throw new IllegalStateException("The game needs to be running to execute hamster commands");
			}
			checkState(getMode() != Mode.STOPPED);
			executeCommand(command);
		}
		this.delay();
	}

	private void executeCommand(Command command) {
		try {
			addToStack(command);
			command.execute();
		} catch (final Exception e) {
			// Stop the game to prevent execution of further commands!
			setMode(Mode.STOPPED);
			throw e;
		}
	}

	private void delay() {
		try {
			if (delayEnabled) {
				Thread.sleep((int) ((11.0d - this.getSpeed()) / 5.0d * 400.0d));
			}
		} catch (final InterruptedException ignored) {
		}
	}

	@Override
	public synchronized void pauseGame() {
		checkState(getMode() == Mode.RUNNING, "Cannot pause: game is not running");
		setMode(Mode.PAUSED);
		acquireSemaphoreAsync();
	}

	private void acquireSemaphoreAsync() {
		new Thread(() -> {
			try {
				getSemaphore().acquire();
			} catch (final InterruptedException ignored) {
			}
		}).start();
	}

	@Override
	public synchronized void resumeGame() {
		checkState(getMode() == Mode.PAUSED, "Cannot resume: game is not paused");
		assert getSemaphore().availablePermits() == 0;

		this.redoAll();
		unblockForMode(Mode.RUNNING);
	}

	@Override
	public synchronized void undo() {
		var stack = getStack();
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
		getStack().add(undoneCommand);
	}

	@Override
	public synchronized void undoAll() {
		var stack = getStack();
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

	@Override
	public synchronized void reset() {
		checkState(getMode() != Mode.INITIALIZING,
				"soft reset is not possible during initialization");

		final Mode currentMode = getMode();
		if (currentMode == Mode.RUNNING) {
			pauseGame();
		}
		this.undoAll();
	}

	@Override
	public synchronized void hardReset() {
		var stack = getStack();
		stack.clear();
		this.undoneCommands.clear();
		this.stopGame();
		setMode(Mode.INITIALIZING);
	}

	@Override
	public synchronized void abortOrStopGame() {
		final Mode mode = getMode();
		if ((mode == Mode.STOPPED) || (mode == Mode.INITIALIZING)) {
			stopGame();
		} else {
			unblockForMode(Mode.ABORTED);
		}
	}

	@Override
	public synchronized void stopGame() {
		unblockForMode(Mode.STOPPED);
	}

	private void unblockForMode(Mode mode) {
		setMode(mode);
		if (getSemaphore().availablePermits() == 0) {
			getSemaphore().release();
		}
	}

	@Override
	public synchronized void enableDelay() {
		delayEnabled = true;
	}

	@Override
	public synchronized void disableDelay() {
		delayEnabled = false;
	}

	private void runRegardingPause(Runnable runnable) {
		try {
			getSemaphore().acquire();
			runnable.run();
		} catch (final CommandConstraintException e) {
			throw e;
		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			getSemaphore().release();
		}
	}
}
