package components.helpers;

import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

/**
 * Simple helper class used to delegate log messages form the QVTo executor out to the log4j logger.
 */
public class QvtoLogger implements Log {
	private final String name;
	private final Logger log;

	public QvtoLogger(final String name, final Logger log) {
		this.name = name;
		this.log = log;
	}

	@Override
	public void log(final String message) {
		log.info(name + ": " + message);
	}

	@Override
	public void log(final int level, final String message) {
		log.info(name + ": " + levelToString(level) + " " + message);
	}

	@Override
	public void log(final String message, final Object arg) {
		log.info(name + ": " + String.format(message, arg));
	}

	@Override
	public void log(final int level, final String message, final Object arg) {
		log.info(name + ": " + levelToString(level) + String.format(message, arg));
		
	}
	
	private static String levelToString(final int level) {
		if (level > 0) {
			return "[" + level + "]";
		}
		return "";
	}
	
	
}
