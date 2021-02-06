package de.unistuttgart.iste.sqa.mpw.framework.properties;

import de.unistuttgart.iste.sqa.mpw.framework.mpw.Direction;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.Tile;
import de.unistuttgart.iste.sqa.mpw.framework.mpw.impl.GamePerformanceImpl;
import org.junit.jupiter.api.Test;
import de.unistuttgart.iste.sqa.mpw.framework.properties.testdoubles.ActorFake;
import de.unistuttgart.iste.sqa.mpw.framework.properties.testdoubles.PropFake;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the correct generation of property modifications.
 */
public class PropertyTest {
	//<editor-fold desc="Feature: single property">

	@Test
	public void givenActor_whenSetDirectionToWest_thenDirectionIsWest() {
		var hamster = new ActorFake();
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
	public void givenGamePerformance_whenInitialize_thenSpeedIs4() {
		var performance = new GamePerformanceImpl();
		assertEquals(4.0, performance.getSpeed(), 0.001);
	}

	//</editor-fold>

	//<editor-fold desc="Feature: collection property">

	@Test
	public void givenTile_whenAddPropAsContent_thenTileHasPropAsContent() {
		var tile = new Tile();
		var prop = new PropFake();
		tile.addToContents(prop);
		assertEquals(1, tile.getContents().size());
		assertEquals(prop, tile.getContents().get(0));
	}

	@Test
	public void givenTile_whenAddPropAsContent_thenPropHasTileAsCurrentTile() {
		var tile = new Tile();
		var prop = new PropFake();
		tile.addToContents(prop);
		assertEquals(tile, prop.getCurrentTile());
	}

	@Test
	public void givenProp_whenSetTileAsCurrentTile_thenTileHasPropAsContent() {
		var prop = new PropFake();
		var tile = new Tile();
		prop.setCurrentTile(tile);
		assertEquals(prop, tile.getContents().get(0));
	}

	@Test
	public void givenTwoTiles_andOneProp_whenSetBothTilesAsCurrentTile_thenFirstTileIsEmpty_andSecondTileHasPropAsContent() {
		var prop = new PropFake();
		var tile1 = new Tile();
		var tile2 = new Tile();
		prop.setCurrentTile(tile1);
		prop.setCurrentTile(tile2);
		assertTrue(tile1.getContents().isEmpty());
		assertEquals(prop, tile2.getContents().get(0));
		assertEquals(tile2, prop.getCurrentTile());
	}

	@Test
	public void givenTwoTiles_andOneProp_whenAddPropToFirstTile_andAddToSecondTile_thenFirstTileIsEmpty_andSecondTileHasPropAsContent() {
		var prop = new PropFake();
		var tile1 = new Tile();
		var tile2 = new Tile();
		tile1.addToContents(prop);
		tile2.addToContents(prop);
		assertTrue(tile1.getContents().isEmpty());
		assertEquals(prop, tile2.getContents().get(0));
		assertEquals(tile2, prop.getCurrentTile());
	}

	@Test
	public void givenTile_whenAddPropAsContent_andRemoveProp_thenTileHasNoContents() {
		var tile = new Tile();
		var prop = new PropFake();
		tile.addToContents(prop);
		tile.removeFromContents(prop);
		assertTrue(tile.getContents().isEmpty());
	}

	@Test
	public void givenTile_whenAddPropAsContent_andRemoveProp_thenPropHasNoCurrentTile() {
		var tile = new Tile();
		var prop = new PropFake();
		tile.addToContents(prop);
		tile.removeFromContents(prop);
		assertNull(prop.getCurrentTile());
	}

	//</editor-fold>
}
