package de.unistuttgart.hamster.properties;

import de.unistuttgart.hamster.commands.impl.GameCommandStackImpl;
import de.unistuttgart.hamster.hamster.ConcreteHamster;
import de.unistuttgart.hamster.hamster.Grain;
import de.unistuttgart.hamster.mpw.Direction;
import de.unistuttgart.hamster.mpw.Tile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the correct generation of property modifications.
 */
public class PropertyTest {
	//<editor-fold desc="Feature: single property">

	@Test
	public void givenHamster_whenSetDirectionToWest_thenDirectionIsWest() {
		var hamster = new ConcreteHamster();
		hamster.setDirection(Direction.WEST);
		assertEquals(Direction.WEST, hamster.getDirection());
	}

	@Test
	public void givenTile_whenSetWest_thenHasReferenceToWest() {
		var east = new Tile();
		var west = new Tile();
		east.setWest(west);
		assertEquals(west, east.getWest());
	}

	@Test
	public void givenTile_whenSetWest_thenWestHasAlsoReferenceToEast() {
		var east = new Tile();
		var west = new Tile();
		east.setWest(west);
		assertEquals(east, west.getEast());
	}

	@Test
	public void givenTile_whenSetWest_andSetWestToNull_thenHasNullReferenceToWest() {
		var east = new Tile();
		var west = new Tile();
		east.setWest(west);
		east.setWest(null);
		assertNull(east.getWest());
	}

	@Test
	public void givenTile_whenSetWest_andSetWestToNull_thenWestHasAlsoNullReferenceToEast() {
		var east = new Tile();
		var west = new Tile();
		east.setWest(west);
		east.setWest(null);
		assertNull(west.getEast());
	}

	@Test
	public void givenGameStack_whenInitialize_thenSpeedIs4() {
		var gameCommandStack = new GameCommandStackImpl();
		assertEquals(4.0, gameCommandStack.getSpeed(), 0.001);
	}

	//</editor-fold>

	//<editor-fold desc="Feature: collection property">

	@Test
	public void givenTile_whenAddGrainAsContent_thenTileHasGrainAsContent() {
		var tile = new Tile();
		var grain = new Grain();
		tile.addToContents(grain);
		assertEquals(1, tile.getContents().size());
		assertEquals(grain, tile.getContents().get(0));
	}

	@Test
	public void givenTile_whenAddGrainAsContent_thenGrainHasTileAsCurrentTile() {
		var tile = new Tile();
		var grain = new Grain();
		tile.addToContents(grain);
		assertEquals(tile, grain.getCurrentTile());
	}

	@Test
	public void givenGrain_whenSetTileAsCurrentTile_thenTileHasGrainAsContent() {
		var grain = new Grain();
		var tile = new Tile();
		grain.setCurrentTile(tile);
		assertEquals(grain, tile.getContents().get(0));
	}

	@Test
	public void givenTwoTiles_andOneGrain_whenSetBothTilesAsCurrentTile_thenFirstTileIsEmpty_andSecondTileHasGrainAsContent() {
		var grain = new Grain();
		var tile1 = new Tile();
		var tile2 = new Tile();
		grain.setCurrentTile(tile1);
		grain.setCurrentTile(tile2);
		assertTrue(tile1.getContents().isEmpty());
		assertEquals(grain, tile2.getContents().get(0));
		assertEquals(tile2, grain.getCurrentTile());
	}

	@Test
	public void givenTwoTiles_andOneGrain_whenAddGrainToFirstTile_andAddToSecondTile_thenFirstTileIsEmpty_andSecondTileHasGrainAsContent() {
		var grain = new Grain();
		var tile1 = new Tile();
		var tile2 = new Tile();
		tile1.addToContents(grain);
		tile2.addToContents(grain);
		assertTrue(tile1.getContents().isEmpty());
		assertEquals(grain, tile2.getContents().get(0));
		assertEquals(tile2, grain.getCurrentTile());
	}

	@Test
	public void givenTile_whenAddGrainAsContent_andRemoveGrain_thenTileHasNoContents() {
		var tile = new Tile();
		var grain = new Grain();
		tile.addToContents(grain);
		tile.removeFromContents(grain);
		assertTrue(tile.getContents().isEmpty());
	}

	@Test
	public void givenTile_whenAddGrainAsContent_andRemoveGrain_thenGrainHasNoCurrentTile() {
		var tile = new Tile();
		var grain = new Grain();
		tile.addToContents(grain);
		tile.removeFromContents(grain);
		assertNull(grain.getCurrentTile());
	}

	//</editor-fold>
}
