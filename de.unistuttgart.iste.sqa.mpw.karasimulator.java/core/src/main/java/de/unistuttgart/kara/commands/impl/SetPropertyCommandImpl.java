package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.commands.SetPropertyCommand;
import de.unistuttgart.kara.commands.impl.utils.CommandUtils;

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
