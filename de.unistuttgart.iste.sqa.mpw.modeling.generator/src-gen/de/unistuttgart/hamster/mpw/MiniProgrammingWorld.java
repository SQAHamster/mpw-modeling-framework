package de.unistuttgart.hamster.mpw;

import javafx.beans.property.*;
import de.unistuttgart.hamster.command.CommandStack;

public abstract class MiniProgrammingWorld {

	private final ReadOnlyObjectWrapper<Stage> stage = new ReadOnlyObjectWrapper<>(this, "stage");

	private final ReadOnlyObjectWrapper<CommandStack> commandStack = new ReadOnlyObjectWrapper<>(this, "commandStack");

	public MiniProgrammingWorld() {

	}

	public ReadOnlyObjectProperty<Stage> stageProperty() {
		return this.stage.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<CommandStack> commandStackProperty() {
		return this.commandStack.getReadOnlyProperty();
	}

	public Stage getStage() {
		return this.stage.get();
	}

	public CommandStack getCommandStack() {
		return this.commandStack.get();
	}

	public void setStage(Stage stage) {
		this.stage.set(stage);

	}

	public void setCommandStack(CommandStack commandStack) {
		this.commandStack.set(commandStack);

	}

}
