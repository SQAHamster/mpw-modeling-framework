package de.unistuttgart.hamster.mpw;

import java.util.List;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import de.unistuttgart.hamster.command.Entity;

public class Tile extends Entity {

	private final ReadOnlyListWrapper<TileContent> contents = new ReadOnlyListWrapper<>(this, "contents",
			FXCollections.observableArrayList());

	private final ReadOnlyObjectWrapper<Location> location = new ReadOnlyObjectWrapper<>(this, "location");

	private final ReadOnlyObjectWrapper<Tile> south = new ReadOnlyObjectWrapper<>(this, "south");

	private final ReadOnlyObjectWrapper<Tile> north = new ReadOnlyObjectWrapper<>(this, "north");

	private final ReadOnlyObjectWrapper<Tile> east = new ReadOnlyObjectWrapper<>(this, "east");

	private final ReadOnlyObjectWrapper<Tile> west = new ReadOnlyObjectWrapper<>(this, "west");

	public Tile() {

	}

	public ReadOnlyListProperty<TileContent> contentsProperty() {
		return this.contents.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<Location> locationProperty() {
		return this.location.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<Tile> southProperty() {
		return this.south.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<Tile> northProperty() {
		return this.north.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<Tile> eastProperty() {
		return this.east.getReadOnlyProperty();
	}

	public ReadOnlyObjectProperty<Tile> westProperty() {
		return this.west.getReadOnlyProperty();
	}

	public List<TileContent> getContents() {
		return this.contents.get();
	}

	public Location getLocation() {
		return this.location.get();
	}

	public Tile getSouth() {
		return this.south.get();
	}

	public Tile getNorth() {
		return this.north.get();
	}

	public Tile getEast() {
		return this.east.get();
	}

	public Tile getWest() {
		return this.west.get();
	}

	public void setLocation(Location location) {
		this.location.set(location);

	}

	public void setSouth(Tile south) {
		this.south.set(south);

	}

	public void setNorth(Tile north) {
		this.north.set(north);

	}

	public void setEast(Tile east) {
		this.east.set(east);

	}

	public void setWest(Tile west) {
		this.west.set(west);

	}

}
