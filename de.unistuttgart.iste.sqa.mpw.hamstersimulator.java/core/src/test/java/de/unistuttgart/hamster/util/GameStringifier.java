package de.unistuttgart.hamster.util;

import de.unistuttgart.hamster.hamster.ConcreteHamster;
import de.unistuttgart.hamster.hamster.Grain;
import de.unistuttgart.hamster.hamster.HamsterGame;
import de.unistuttgart.hamster.hamster.Wall;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.mpw.Tile;

import java.util.HashMap;
import java.util.List;

public class GameStringifier {
	
	public static HamsterGame createFromString(String map) {
		var game = new HamsterGame();
		var hamster = game.getDefaultHamster();

		String[] parts = map.split(";");
		int height = parts.length;
		var tiles = game.getTerritory().getTiles();

		// dummy: replace later by Location, when it implements hashcode/equals correctly
		var coordinateToTileMap = new HashMap<String, Tile>();

		for (int y = 0; y < height; y++) {
			String string = parts[y];

			char[] chars = string.toCharArray();
			int width = chars.length;

			for (int x = 0; x < width; x++) {
				var tile = newTile(x, y);
				tiles.add(tile);

				coordinateToTileMap.put(String.format("%d,%d", x, y), tile);

				if (x > 0) {
					var west = coordinateToTileMap.get(String.format("%d,%d", x - 1, y));
					tile.setWest(west);
					west.setEast(tile);
				}
				if (y > 0) {
					var north = coordinateToTileMap.get(String.format("%d,%d", x, y - 1));
					tile.setNorth(north);
					north.setSouth(tile);
				}

				switch (chars[x]) {
					case '>':
					case '<':
					case '^':
					case 'v':
						hamster.setCurrentTile(tile);
						hamster.setDirection(DirectionTestHelper.toDirection(chars[x]));
						break;
					case 'M':
						tile.getContents().add(new Wall());
						break;
				}
			}

		}
		
		return game;
	}
	
	
	public static String toString(HamsterGame game) {
		var actual = new StringBuilder();

		var hamster = game.getDefaultHamster();
		var tiles = game.getTerritory().getTiles();
		final var upperLeftTile = tiles.get(0);
		var firstOfRowTile = upperLeftTile;

		var currentTile = upperLeftTile;

		while (currentTile != null) {
			if (hamster.getCurrentTile() == currentTile) {
				actual.append(DirectionTestHelper.toDirection(hamster.getDirection()));
			} else if (currentTile.getContents().stream().anyMatch(Wall.class::isInstance)) {
				actual.append('M');
			} else if (currentTile.getContents().stream().anyMatch(Grain.class::isInstance)) {
				actual.append('*');
			} else {
				actual.append(' ');
			}

			if (currentTile.getEast() == null) {
				actual.append(';');
				firstOfRowTile = firstOfRowTile.getSouth();
				currentTile = firstOfRowTile;
			} else {
				currentTile = currentTile.getEast();
			}
		}

		return actual.toString();

	}

	private static Tile newTile(int x, int y) {
		var tile = new Tile();
		tile.setLocation(locationOf(x, y));
		return tile;
	}

	private static Location locationOf(int x, int y) {
		var location = new Location();
		location.setRow(y);
		location.setColumn(x);
		return location;
	}

}
