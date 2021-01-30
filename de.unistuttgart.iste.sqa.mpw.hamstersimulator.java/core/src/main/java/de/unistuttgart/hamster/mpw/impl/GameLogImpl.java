package de.unistuttgart.hamster.mpw.impl;

import de.unistuttgart.hamster.mpw.Actor;
import de.unistuttgart.hamster.mpw.GameLog;
import de.unistuttgart.hamster.mpw.LogEntry;

public class GameLogImpl extends GameLog {

	@Override
	public void write(Actor actor, String message) {
		var logEntry = new LogEntry();
		logEntry.setActor(actor);
		logEntry.setMessage(message);
		addToLogEntries(logEntry);
	}

}
