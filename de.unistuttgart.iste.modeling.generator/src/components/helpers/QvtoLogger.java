package components.helpers;

import org.apache.log4j.Logger;
import org.eclipse.m2m.qvt.oml.util.Log;

public class QvtoLogger implements Log {
	private final String name;
	private final Logger log;

	public QvtoLogger(String name, Logger log) {
		this.name = name;
		this.log = log;
	}

	@Override
	public void log(String message) {
		log.info(name + ": " + message);
	}

	@Override
	public void log(int level, String message) {
		log.info(name + ": " + levelToString(level) + " " + message);
	}

	@Override
	public void log(String message, Object arg) {
		log.info(name + ": " + String.format(message, arg));
	}

	@Override
	public void log(int level, String message, Object arg) {
		log.info(name + ": " + levelToString(level) + String.format(message, arg));
		
	}
	
	private static String levelToString(int level) {
		if (level > 0) {
			return "[" + level + "]";
		}
		return "";
	}
	
	
}
