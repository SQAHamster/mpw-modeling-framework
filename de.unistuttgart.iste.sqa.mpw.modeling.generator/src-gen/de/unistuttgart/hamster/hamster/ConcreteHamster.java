package de.unistuttgart.hamster.hamster;

import java.util.List;
import de.unistuttgart.hamster.commands.*;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import de.unistuttgart.hamster.mpw.Actor;
import de.unistuttgart.hamster.command.CommandStack;

public class ConcreteHamster extends Actor implements GameHamster, EditorHamster {

	private final ReadOnlyListWrapper<Grain> grains = new ReadOnlyListWrapper<>(this, "grains",
			FXCollections.observableArrayList());

	public ConcreteHamster(CommandStack commandStack) {
		super(commandStack);

	}

	@Override
	public boolean isFrontClear() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public boolean grainAvailable() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public boolean location() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public boolean mouthEmpty() {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void initHamster() {
		new InitHamsterCommand(this).execute();
	}

	@Override
	public void move() {
		new MoveCommand(this).execute();
	}

	@Override
	public void pickGrain() {
		new PickGrainCommand(this).execute();
	}

	@Override
	public void putGrain() {
		new PutGrainCommand(this).execute();
	}

	@Override
	public void turnLeft() {
		new TurnLeftCommand(this).execute();
	}

	@Override
	public void initDefaultHamster() {
		new InitDefaultHamsterCommand(this).execute();
	}

	@Override
	public ReadOnlyListProperty<Grain> grainsProperty() {
		return this.grains.getReadOnlyProperty();
	}

	@Override
	public List<Grain> getGrains() {
		return this.grains.get();
	}

}
