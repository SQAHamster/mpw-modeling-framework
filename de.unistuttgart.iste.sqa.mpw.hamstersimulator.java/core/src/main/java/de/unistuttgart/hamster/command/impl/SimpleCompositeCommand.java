package de.unistuttgart.hamster.command.impl;

import de.unistuttgart.hamster.command.Command;

public class SimpleCompositeCommand extends CompositeCommandBase {
    @Override
    public void execute() {
        var subCommands = getSubCommands();
        for (Command subCommand : subCommands) {
            subCommand.execute();
        }
    }

}
