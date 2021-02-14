package de.unistuttgart.iste.sqa.mpw.framework.commands.impl;

import de.unistuttgart.iste.sqa.mpw.framework.commands.impl.utils.CommandUtils;
import de.unistuttgart.iste.sqa.mpw.framework.commands.AddEntityCommand;

public class AddEntityCommandImpl extends AddEntityCommand {

	@Override
	public void execute() {
		try {
			final var entity = getEntity();
			final var method = CommandUtils.findAddMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (final Exception e) {
			throw new RuntimeException("Error: could not execute AddEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void undo() {
		try {
			final var entity = getEntity();
			final var method = CommandUtils.findRemoveMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToAdd());
		} catch (final Exception e) {
			throw new RuntimeException("Error: could not execute AddEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
