package de.unistuttgart.hamster.command;

public abstract class RemoveEntityCommand extends PrimitiveCommand {

	private Entity entityToRemove;

	public RemoveEntityCommand() {

	}

	public Entity getEntityToRemove() {
		return this.entityToRemove;
	}

	public void setEntityToRemove(Entity entityToRemove) {
		this.entityToRemove = entityToRemove;

	}

}
