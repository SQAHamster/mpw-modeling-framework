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
	public void preExecuteGameCommand() {
		// todo checks
	}

	@Override
	public void delayControlFlow() {
		// todo delay
	}

}
