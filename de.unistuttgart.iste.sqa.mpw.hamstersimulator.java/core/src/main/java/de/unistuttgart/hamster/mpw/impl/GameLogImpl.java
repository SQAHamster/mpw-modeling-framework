package de.unistuttgart.hamster.mpw.impl;

import de.unistuttgart.hamster.mpw.GameLog;

public class GameLogImpl extends GameLog {

	public GameLogImpl() {

	}

	@Override
	public void write(String message) {
		addToLogEntries(message);
	}

}
