package de.unistuttgart.hamster.hamster;

import java.util.List;
import javafx.beans.property.*;
import de.unistuttgart.hamster.mpw.Tile;
import de.unistuttgart.hamster.mpw.Direction;

public interface ReadOnlyHamster {

	Tile getCurrentTile();
	ReadOnlyObjectProperty<Tile> currentTileProperty();

	Direction getDirection();
	ReadOnlyObjectProperty<Direction> directionProperty();

	List<Grain> getGrains();
	ReadOnlyListProperty<Grain> grainsProperty();

	boolean isFrontClear();

	boolean grainAvailable();

	boolean location();

	boolean mouthEmpty();

}
