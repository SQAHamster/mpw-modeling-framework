package de.unistuttgart.kara.mpw.impl;

import de.unistuttgart.kara.mpw.Actor;
import de.unistuttgart.kara.mpw.GameLog;
import de.unistuttgart.kara.mpw.LogEntry;

public class GameLogImpl extends GameLog {

	public GameLogImpl() {
		super();
	}

	@Override
	public void write(Actor actor, String message) {
		var logEntry = new LogEntry();
		logEntry.setActor(actor);
		logEntry.setMessage(message);
		addToLogEntries(logEntry);
	}
}
