package de.unistuttgart.hamster.mpw;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import de.unistuttgart.hamster.command.CommandStack;
import de.unistuttgart.hamster.command.Entity;

public abstract class Stage extends Entity {

	private final ReadOnlyListWrapper<Tile> tiles = new ReadOnlyListWrapper<>(this, "tiles",
			FXCollections.observableArrayList());

	private final CommandStack commandStack;

	private final ReadOnlyListWrapper<TileContent> tileContents = new ReadOnlyListWrapper<>(this, "tileContents",
			FXCollections.observableArrayList());

	public Stage(CommandStack commandStack) {

		this.commandStack = commandStack;

	}

	public ReadOnlyListProperty<Tile> tilesProperty() {
		return this.tiles.getReadOnlyProperty();
	}

	public ReadOnlyListProperty<TileContent> tileContentsProperty() {
		return this.tileContents.getReadOnlyProperty();
	}

	public List<Tile> getTiles() {
		return this.tiles.get();
	}

	public CommandStack getCommandStack() {
		return this.commandStack;
	}

	public List<TileContent> getTileContents() {
		return this.tileContents.get();
	}

}
