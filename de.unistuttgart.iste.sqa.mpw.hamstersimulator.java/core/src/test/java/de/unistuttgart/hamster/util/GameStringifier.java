package de.unistuttgart.hamster.util;

import de.unistuttgart.hamster.hamster.*;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.mpw.Tile;

import java.util.HashMap;
import java.util.function.Consumer;

public class GameStringifier {
	
	public static HamsterGame createFromString(String map) {
		var game = new HamsterGame();
		var hamster = (ConcreteHamster)game.getTerritory().getDefaultHamster().getInternalHamster();

		String[] parts = map.split(";");
		int height = parts.length;
		var territory = (ConcreteTerritory)game.getTerritory().getInternalTerritory();

		// dummy: replace later by Location, when it implements hashcode/equals correctly
		var coordinateToTileMap = new HashMap<String, Tile>();

		for (int y = 0; y < height; y++) {
			String string = parts[y];

			char[] chars = string.toCharArray();
			int width = chars.length;

			for (int x = 0; x < width; x++) {
				var tile = newTile(x, y);
				territory.addToTiles(tile);

				coordinateToTileMap.put(String.format("%d,%d", x, y), tile);

				if (x > 0) {
					var west = coordinateToTileMap.get(String.format("%d,%d", x - 1, y));
					tile.setWest(west);
				}
				if (y > 0) {
					var north = coordinateToTileMap.get(String.format("%d,%d", x, y - 1));
					tile.setNorth(north);
				}

				switch (chars[x]) {
					case '>':
					case '<':
					case '^':
					case 'v':
						hamster.setCurrentTile(tile);
						hamster.setDirection(DirectionTestHelper.toDirection(chars[x]));
						break;
					case '*':
						tile.addToContents(new Grain());
						break;
					case 'M':
						tile.addToContents(new Wall());
						break;
				}
			}

		}
		
		return game;
	}
	
	
	public static String toString(HamsterGame game) {
		var actual = new StringBuilder();

		var hamster = game.getTerritory().getDefaultHamster().getInternalHamster();
		iterateTiles(game, currentTile -> {
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
			}
		});

		return actual.toString();
	}

	public static String grainsOnTerritoryToString(HamsterGame game) {
		var actual = new StringBuilder();

		iterateTiles(game, currentTile -> {
			var grainsCount = currentTile.getContents().stream().filter(Grain.class::isInstance).count();
			actual.append(grainsCount);

			if (currentTile.getEast() == null) {
				actual.append(';');
			}
		});

		return actual.toString();
	}

	private static void iterateTiles(HamsterGame game, Consumer<Tile> lambda) {
		var tiles = game.getTerritory().getInternalTerritory().getTiles();
		final var upperLeftTile = tiles.get(0);
		var firstOfRowTile = upperLeftTile;

		var currentTile = upperLeftTile;

		while (currentTile != null) {
			lambda.accept(currentTile);

			if (currentTile.getEast() == null) {
				firstOfRowTile = firstOfRowTile.getSouth();
				currentTile = firstOfRowTile;
			} else {
				currentTile = currentTile.getEast();
			}
		}
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
