package de.unistuttgart.hamster.framework;

public class CommandConstraintException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CommandConstraintException() {
		super();
	}

	public CommandConstraintException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommandConstraintException(String message) {
		super(message);
	}

	public CommandConstraintException(Throwable cause) {
		super(cause);
	}
	
	
}
