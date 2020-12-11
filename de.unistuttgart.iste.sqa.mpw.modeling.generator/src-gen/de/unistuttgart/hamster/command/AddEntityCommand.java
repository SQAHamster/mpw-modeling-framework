package de.unistuttgart.hamster.command;

public abstract class AddEntityCommand extends PrimitiveCommand {

	private Entity entityToAdd;

	public AddEntityCommand() {

	}

	public Entity getEntityToAdd() {
		return this.entityToAdd;
	}

	public void setEntityToAdd(Entity entityToAdd) {
		this.entityToAdd = entityToAdd;

	}

}
