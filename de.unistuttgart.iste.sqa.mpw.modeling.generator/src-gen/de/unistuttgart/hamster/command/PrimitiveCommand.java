package de.unistuttgart.hamster.command;

public abstract class PrimitiveCommand implements Command {

	private Entity entity;

	private String propertyName;

	public PrimitiveCommand() {

	}

	public Entity getEntity() {
		return this.entity;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;

	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;

	}

}
