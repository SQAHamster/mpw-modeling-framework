package de.unistuttgart.hamster.hamster;

import java.util.List;
import javafx.beans.property.*;
import de.unistuttgart.hamster.mpw.Tile;
import de.unistuttgart.hamster.mpw.TileContent;

public interface ReadOnlyTerritory {

	List<Tile> getTiles();
	ReadOnlyListProperty<Tile> tilesProperty();

	List<TileContent> getTileContents();
	ReadOnlyListProperty<TileContent> tileContentsProperty();

}
