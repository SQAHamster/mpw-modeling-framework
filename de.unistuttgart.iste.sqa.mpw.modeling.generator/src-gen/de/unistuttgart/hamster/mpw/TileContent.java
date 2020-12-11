package de.unistuttgart.hamster.mpw;

import javafx.beans.property.*;
import de.unistuttgart.hamster.command.Entity;

public abstract class TileContent extends Entity {

	private final ReadOnlyObjectWrapper<Tile> currentTile = new ReadOnlyObjectWrapper<>(this, "currentTile");

	public TileContent() {

	}

	public ReadOnlyObjectProperty<Tile> currentTileProperty() {
		return this.currentTile.getReadOnlyProperty();
	}

	public Tile getCurrentTile() {
		return this.currentTile.get();
	}

	public void setCurrentTile(Tile currentTile) {
		this.currentTile.set(currentTile);

	}

}
