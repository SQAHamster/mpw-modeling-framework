package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.commands.AddEntityCommand;
import de.unistuttgart.kara.commands.impl.utils.CommandUtils;

public class AddEntityCommandImpl extends AddEntityCommand {

	public AddEntityCommandImpl() {

	}

	@Override
	public void execute() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findAddMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void undo() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findRemoveMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
