package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.AddEntityCommand;
import de.unistuttgart.hamster.command.impl.utils.CommandUtils;

import static de.unistuttgart.hamster.command.impl.utils.CommandUtils.toFirstUpper;

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
		throw new RuntimeException("not implemented");
	}

	@Override
	public void redo() {
		throw new RuntimeException("not implemented");
	}

}
