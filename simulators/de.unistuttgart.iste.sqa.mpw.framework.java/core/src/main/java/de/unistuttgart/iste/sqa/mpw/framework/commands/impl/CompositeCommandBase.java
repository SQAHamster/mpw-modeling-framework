package de.unistuttgart.iste.sqa.mpw.framework.commands.impl;

import de.unistuttgart.iste.sqa.mpw.framework.basetypes.Entity;
import de.unistuttgart.iste.sqa.mpw.framework.commands.Command;
import de.unistuttgart.iste.sqa.mpw.framework.commands.CompositeCommand;

public abstract class CompositeCommandBase extends CompositeCommand {

    @Override
    public void undo() {
        final var subCommands = getSubCommands();
        for (int i = subCommands.size() - 1; i >= 0; i--) {
            final Command subCommand = subCommands.get(i);
            subCommand.undo();
        }
    }

    @Override
    public void redo() {
        final var subCommands = getSubCommands();
        for (final Command subCommand : subCommands) {
            subCommand.redo();
        }
    }

    protected void executeSetProperty(final Entity entity, final String propertyName, final Object oldValue, final Object newValue) {
        final var command = new SetPropertyCommandImpl();
        command.setEntity(entity);
        command.setOldValue(oldValue);
        command.setNewValue(newValue);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

    protected void executeAddReference(final Entity entity, final String propertyName, final Entity entityToAdd) {
        final var command = new AddEntityCommandImpl();
        command.setEntity(entity);
        command.setEntityToAdd(entityToAdd);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

    protected void executeRemoveReference(final Entity entity, final String propertyName, final Entity entityToRemove) {
        final var command = new RemoveEntityCommandImpl();
        command.setEntity(entity);
        command.setEntityToRemove(entityToRemove);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

}
