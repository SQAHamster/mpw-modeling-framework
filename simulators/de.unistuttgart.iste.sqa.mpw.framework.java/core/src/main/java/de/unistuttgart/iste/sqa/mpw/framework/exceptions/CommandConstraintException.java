package de.unistuttgart.iste.sqa.mpw.framework.exceptions;

public class CommandConstraintException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public CommandConstraintException() {
		super();
	}

	public CommandConstraintException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public CommandConstraintException(final String message) {
		super(message);
	}

	public CommandConstraintException(final Throwable cause) {
		super(cause);
	}
	
	
}
