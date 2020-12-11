package de.unistuttgart.hamster.command;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;

public class CommandStack {

	private final ReadOnlyListWrapper<Command> stack = new ReadOnlyListWrapper<>(this, "stack",
			FXCollections.observableArrayList());

	public CommandStack() {

	}

	public ReadOnlyListProperty<Command> stackProperty() {
		return this.stack.getReadOnlyProperty();
	}

	public List<Command> getStack() {
		return this.stack.get();
	}

}
