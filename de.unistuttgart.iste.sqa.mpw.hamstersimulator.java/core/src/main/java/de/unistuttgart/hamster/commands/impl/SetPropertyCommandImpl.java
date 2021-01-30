package de.unistuttgart.hamster.commands.impl;

import de.unistuttgart.hamster.commands.SetPropertyCommand;
import de.unistuttgart.hamster.commands.impl.utils.CommandUtils;

public class SetPropertyCommandImpl extends SetPropertyCommand {

	@Override
	public void execute() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getNewValue());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute SetPropertyCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void undo() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getOldValue());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute SetPropertyCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
