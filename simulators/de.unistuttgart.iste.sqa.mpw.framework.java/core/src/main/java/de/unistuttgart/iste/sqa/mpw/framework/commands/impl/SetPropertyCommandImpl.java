package de.unistuttgart.iste.sqa.mpw.framework.commands.impl;

import de.unistuttgart.iste.sqa.mpw.framework.commands.SetPropertyCommand;
import de.unistuttgart.iste.sqa.mpw.framework.commands.impl.utils.CommandUtils;

public class SetPropertyCommandImpl extends SetPropertyCommand {

	@Override
	public void execute() {
		try {
			final var entity = getEntity();
			final var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getNewValue());
		} catch (final Exception e) {
			throw new RuntimeException("Error: could not execute SetPropertyCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void undo() {
		try {
			final var entity = getEntity();
			final var method = CommandUtils.findSetMethod(entity, getPropertyName());
			method.invoke(getEntity(), getOldValue());
		} catch (final Exception e) {
			throw new RuntimeException("Error: could not execute SetPropertyCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
