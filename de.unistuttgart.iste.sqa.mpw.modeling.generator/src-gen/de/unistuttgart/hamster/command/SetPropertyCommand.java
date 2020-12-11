package de.unistuttgart.hamster.command;

public abstract class SetPropertyCommand extends PrimitiveCommand {

	private Object oldValue;

	private Object newValue;

	public SetPropertyCommand() {

	}

	public Object getOldValue() {
		return this.oldValue;
	}

	public Object getNewValue() {
		return this.newValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;

	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;

	}

}
