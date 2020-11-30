package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.CommandStack;
import de.unistuttgart.hamster.command.Entity;

public class CommandStackImpl extends CommandStack {

	public CommandStackImpl() {

	}

	@Override
	public void executeSetProperty(Entity entity, String propertyName, Object oldValue, Object newValue) {
		var command = new SetPropertyCommandImpl();
		command.setEntity(entity);
		command.setOldValue(oldValue);
		command.setNewValue(newValue);
		command.setPropertyName(propertyName);

		addToStack(command);
		command.execute();
	}

	@Override
	public void executeAddReference(Entity entity, String propertyName, Entity entityToAdd) {
		var command = new AddEntityCommandImpl();
		command.setEntity(entity);
		command.setEntityToAdd(entityToAdd);
		command.setPropertyName(propertyName);

		addToStack(command);
		command.execute();
	}

	@Override
	public void executeRemoveReference(Entity entity, String propertyName, Entity entityToRemove) {
		var command = new RemoveEntityCommandImpl();
		command.setEntity(entity);
		command.setEntityToRemove(entityToRemove);
		command.setPropertyName(propertyName);

		addToStack(command);
		command.execute();
	}
}
