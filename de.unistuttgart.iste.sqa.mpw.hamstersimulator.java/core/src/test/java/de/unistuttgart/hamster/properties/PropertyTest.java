package de.unistuttgart.hamster.properties;

import de.unistuttgart.hamster.hamster.ConcreteHamster;
import de.unistuttgart.hamster.hamster.Grain;
import de.unistuttgart.hamster.mpw.Direction;
import de.unistuttgart.hamster.mpw.Tile;
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
