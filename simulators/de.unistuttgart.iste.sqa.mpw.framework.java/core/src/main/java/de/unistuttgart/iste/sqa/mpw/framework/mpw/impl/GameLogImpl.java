package de.unistuttgart.iste.sqa.mpw.framework.mpw.impl;

import de.unistuttgart.iste.sqa.mpw.framework.mpw.Actor;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.GameLog;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.LogEntry;

public class GameLogImpl extends GameLog {

	@Override
	public void write(final Actor actor, final String message) {
		final var logEntry = new LogEntry();
		logEntry.setActor(actor);
		logEntry.setMessage(message);
		addToLogEntries(logEntry);
	}
}
