package de.unistuttgart.hamster.commands.impl;

import de.unistuttgart.hamster.commands.AddEntityCommand;
import de.unistuttgart.hamster.commands.impl.utils.CommandUtils;

public class AddEntityCommandImpl extends AddEntityCommand {

	@Override
	public void execute() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findAddMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute AddEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void undo() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findRemoveMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute AddEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
