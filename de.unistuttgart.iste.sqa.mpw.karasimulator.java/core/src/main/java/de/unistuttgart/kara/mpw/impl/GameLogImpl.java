package de.unistuttgart.kara.mpw.impl;

import de.unistuttgart.kara.mpw.GameLog;

public class GameLogImpl extends GameLog {

	public GameLogImpl() {

	}

	@Override
	public void write(String message) {
		addToLogEntries(message);
	}

}
