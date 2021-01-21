package de.unistuttgart.kara.commands.impl;

import de.unistuttgart.kara.basetypes.Entity;
import de.unistuttgart.kara.commands.Command;
import de.unistuttgart.kara.commands.CompositeCommand;

public abstract class CompositeCommandBase extends CompositeCommand {

    @Override
    public void undo() {
        var subCommands = getSubCommands();
        for (int i = subCommands.size() - 1; i >= 0; i--) {
            Command subCommand = subCommands.get(i);
            subCommand.undo();
        }
    }

    @Override
    public void redo() {
        var subCommands = getSubCommands();
        for (Command subCommand : subCommands) {
            subCommand.redo();
        }
    }

    protected void executeSetProperty(Entity entity, String propertyName, Object oldValue, Object newValue) {
        var command = new de.unistuttgart.kara.commands.impl.SetPropertyCommandImpl();
        command.setEntity(entity);
        command.setOldValue(oldValue);
        command.setNewValue(newValue);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

    protected void executeAddReference(Entity entity, String propertyName, Entity entityToAdd) {
        var command = new de.unistuttgart.kara.commands.impl.AddEntityCommandImpl();
        command.setEntity(entity);
        command.setEntityToAdd(entityToAdd);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

    protected void executeRemoveReference(Entity entity, String propertyName, Entity entityToRemove) {
        var command = new RemoveEntityCommandImpl();
        command.setEntity(entity);
        command.setEntityToRemove(entityToRemove);
        command.setPropertyName(propertyName);

        addToSubCommands(command);
        command.execute();
    }

}
