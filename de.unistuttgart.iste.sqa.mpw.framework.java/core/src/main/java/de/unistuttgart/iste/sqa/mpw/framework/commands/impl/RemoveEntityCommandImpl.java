package de.unistuttgart.iste.sqa.mpw.framework.commands.impl;

import de.unistuttgart.iste.sqa.mpw.framework.commands.impl.utils.CommandUtils;
import de.unistuttgart.iste.sqa.mpw.framework.commands.RemoveEntityCommand;

/**
 * Note: position may be different after undo.
 */
public class RemoveEntityCommandImpl extends RemoveEntityCommand {

	@Override
	public void execute() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findRemoveMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToRemove());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute RemoveEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void undo() {
		try {
			var entity = getEntity();
			var method = CommandUtils.findAddMethod(entity, getPropertyName());
			method.invoke(entity, getEntityToRemove());
		} catch (Exception e) {
			throw new RuntimeException("Error: could not execute RemoveEntityCommand '" + getPropertyName() + "' on entity " + getEntity(), e);
		}
	}

	@Override
	public void redo() {
		execute();
	}

}
