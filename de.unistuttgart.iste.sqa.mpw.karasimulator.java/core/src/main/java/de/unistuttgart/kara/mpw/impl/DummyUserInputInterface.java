package de.unistuttgart.kara.mpw.impl;

import de.unistuttgart.kara.mpw.UserInputInterface;

public class DummyUserInputInterface implements UserInputInterface {

	@Override
	public int readInteger(String message) {
		throw new RuntimeException("Dummy IO interface does not support reading values");
	}

	@Override
	public String readString(String message) {
		throw new RuntimeException("Dummy IO interface does not support reading values");
	}

	@Override
	public void confirmAlert(Throwable t) {
		if (t instanceof RuntimeException) {
			throw (RuntimeException)t;
		}
		throw new RuntimeException(t);
	}

	@Override
	public void abort() {
		throw new RuntimeException("Dummy IO interface does not support aborting");
	}

}
