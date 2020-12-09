package de.unistuttgart.hamster.commands.impl;

import de.unistuttgart.hamster.commands.SetPropertyCommand;
import de.unistuttgart.hamster.commands.impl.utils.CommandUtils;

public class SetPropertyCommandImpl extends SetPropertyCommand {

	public SetPropertyCommandImpl() {

	}

	@Override
	public void execute() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getNewValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void undo() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getOldValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
