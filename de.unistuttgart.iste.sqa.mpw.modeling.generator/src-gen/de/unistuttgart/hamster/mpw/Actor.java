package de.unistuttgart.hamster.mpw;

import javafx.beans.property.*;
import de.unistuttgart.hamster.command.CommandStack;

public abstract class Actor extends TileContent {

	private final CommandStack commandStack;

	private final ReadOnlyObjectWrapper<Direction> direction = new ReadOnlyObjectWrapper<>(this, "direction");

	public Actor(CommandStack commandStack) {

		this.commandStack = commandStack;

	}

	public ReadOnlyObjectProperty<Direction> directionProperty() {
		return this.direction.getReadOnlyProperty();
	}

	public CommandStack getCommandStack() {
		return this.commandStack;
	}

	public Direction getDirection() {
		return this.direction.get();
	}

	public void setDirection(Direction direction) {
		this.direction.set(direction);

	}

}
