package de.unistuttgart.iste.sqa.mpw.framework.mpw.impl;

import de.unistuttgart.iste.sqa.mpw.framework.exceptions.CommandConstraintException;
import de.unistuttgart.iste.sqa.mpw.framework.exceptions.GameAbortedException;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.GamePerformance;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.Mode;

import java.util.concurrent.Semaphore;

import static de.unistuttgart.iste.sqa.mpw.framework.utils.Preconditions.checkState;

public class GamePerformanceImpl extends GamePerformance {

	public GamePerformanceImpl() {
		super(new Semaphore(1, true));

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

	private void startGameInMode(final Mode mode) {
		checkState(getMode() == Mode.INITIALIZING,
				"start game is only possible during initialization");

		clearCommandStack();
		this.setMode(mode);
	}

	@Override
	public void preExecuteGameCommand() {
		stopControlFlowIfPaused();
		synchronized (this) {
			if (this.getMode() == Mode.ABORTED) {
				this.setMode(Mode.STOPPED);
				throw new GameAbortedException("Stopped execution of command due to abort");
			} else if (this.getMode() != Mode.RUNNING) {
				throw new IllegalStateException("The game needs to be running to execute game commands");
			}
			checkState(getMode() != Mode.STOPPED);
		}
	}

	@Override
	public void preExecuteEditorCommand() {
		if (this.getMode() != Mode.INITIALIZING) {
			throw new IllegalStateException("The game needs to be initializing to execute editor commands");
		}
	}

	private void stopControlFlowIfPaused() {
		try {
			getSemaphore().acquire();
		} catch (final CommandConstraintException e) {
			throw e;
		} catch (final Exception e) {
			throw new RuntimeException(e);
		} finally {
			getSemaphore().release();
		}
	}

	@Override
	public void delayControlFlow() {
		try {
			if (getDelayEnabled()) {
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
		waitUntilAquired();
	}

	private void waitUntilAquired() {
		while (getSemaphore().availablePermits() == 1) {
			Thread.yield();
		}
	}

	@Override
	public synchronized void resumeGame() {
		checkState(getMode() == Mode.PAUSED, "Cannot resume: game is not paused");
		assert getSemaphore().availablePermits() == 0;

		getGameCommandStack().redoAll();
		unblockForMode(Mode.RUNNING);
	}

	@Override
	public synchronized void hardReset() {
		clearCommandStack();
		this.stopGame();
		setMode(Mode.INITIALIZING);
	}

	private void clearCommandStack() {
		final var gameCommandStack = getGameCommandStack();
		gameCommandStack.getExecutedCommands().clear();
		gameCommandStack.getUndoneCommands().clear();
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

	private void unblockForMode(final Mode mode) {
		setMode(mode);
		if (getSemaphore().availablePermits() == 0) {
			getSemaphore().release();
		}
	}

	private void runRegardingPause(final Runnable runnable) {
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
