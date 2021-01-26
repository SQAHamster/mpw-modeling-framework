package de.unistuttgart.hamster.mpw.impl;

import de.unistuttgart.hamster.mpw.GamePerformance;
import de.unistuttgart.hamster.mpw.Mode;

import java.util.concurrent.Semaphore;

public class GamePerformanceImpl extends GamePerformance {

	public GamePerformanceImpl() {
		super(new Semaphore(1, true));

	}
	@Override
	public synchronized void startGame() {
		setMode(Mode.RUNNING);
	}

	@Override
	public synchronized void startGamePaused() {
		setMode(Mode.RUNNING);
		// todo pause
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
	public void hardReset() {
		clearCommandStack();
		this.stopGame();
		setMode(Mode.INITIALIZING);
	}

	private void clearCommandStack() {
		var gameCommandStack = getGameCommandStack();
		gameCommandStack.getExecutedCommands().clear();
		gameCommandStack.getUndoneCommands().clear();
	}

	@Override
	public void abortOrStopGame() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void preExecuteGameCommand() {
		// todo checks
	}

	@Override
	public void delayControlFlow() {
		// todo delay
	}

}
