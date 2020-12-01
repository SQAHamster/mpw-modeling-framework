package de.unistuttgart.hamster;

import de.unistuttgart.hamster.hamster.*;
import de.unistuttgart.hamster.mpw.Location;
import de.unistuttgart.hamster.mpw.Tile;
import de.unistuttgart.hamster.util.GameStringifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TerritoryCommandsTest {
	private HamsterGame game;
	private EditorTerritory sut;
	
	@Test
	public void givenEmptyTerritory_whenInitializeTo5x3_thenHas5Rows_and3Columns_andAllAreEmpty() {
		withTerritory("");

		initTerritory(5, 3);

		assertTerritory("     ;"
				      + "     ;"
				      + "     ;");
	}

	@Test
	public void givenEmptyTerritory3x2_whenAddOneGrainTo2x0_thenOneGrainIsPlacedOn2x0() {
		withTerritory("   ;" +
					  "   ;");

		addGrainsToTile(locationOf(2, 0), amountOf(1));

		assertGrainsOnTerritory("  1;" +
				                "   ;");
	}

	@Test
	public void givenEmptyTerritory3x2_whenAddTwoGrainsTo1x1_thenTwoGrainsArePlacedOn1x1() {
		withTerritory("   ;" +
				      "   ;");

		addGrainsToTile(locationOf(1, 1), amountOf(2));

		assertGrainsOnTerritory("   ;" +
				                " 2 ;");
	}

	@Test
	public void givenEmptyTerritory3x2_whenAddWallTo2x0_thenWallIsPlacedOn2x0() {
		withTerritory("   ;" +
					  "   ;");

		addWallToTile(locationOf(2, 0));

		assertTerritory("  M;" +
				        "   ;");
	}

	@Test
	public void givenTerritory3x2_andHamsterOn0x0_andWallOn1x1_andGrainOn2x0_whenClearTile2x0_thenTile2x0IsEmpty() {
		withTerritory("v *;" +
					  " M ;");

		clearTile(locationOf(2, 0));

		assertTerritory("v  ;" +
				        " M ;");
	}

	@Test
	public void givenTerritory3x2_andHamsterOn0x0_andWallOn1x1_andGrainOn2x0_whenClearTile1x1_thenTile1x1IsEmpty() {
		withTerritory("v *;" +
				      " M ;");

		clearTile(locationOf(1, 1));

		assertTerritory("v *;" +
				        "   ;");
	}

	@Test
	public void givenTerritory1x1_andFiveGrainsOn0x0_whenClearTile0x0_thenTile0x0IsEmpty() {
		withTerritory(" ;");
		addGrainsToTile(locationOf(0, 0), amountOf(5));

		clearTile(locationOf(0, 0));

		assertTerritory(" ;");
	}

	//<editor-fold desc="helpers">

	private void withTerritory(String map) {
		game = GameStringifier.createFromString(map);
		sut = game.getTerritory();
	}

	private void initTerritory(int columnsCount, int rowsCount) {
		sut.initTerritory(game.getCommandStack(), columnsCount, rowsCount);
	}

	private void addGrainsToTile(Location location, int amount) {
		sut.addGrainsToTile(game.getCommandStack(), location, amount);
	}

	private void addWallToTile(Location location) {
		sut.addWallToTile(game.getCommandStack(), location);
	}

	private void clearTile(Location location) {
		sut.clearTile(game.getCommandStack(), location);
	}

	private void assertGrainsOnTerritory(String expected) {
		var actual = GameStringifier.grainsOnTerritoryToString(game);
		assertEquals(expected, actual.replace('0', ' '));
	}

	private void assertTerritory(String expected) {
		String actual = GameStringifier.toString(game);
		assertEquals(expected, actual);
	}

	private Tile getTileAt(int columnIndex, int rowIndex) {
		var tileOptional = game.getTerritory().getTiles().stream()
				.filter(t -> t.getLocation().getColumn() == columnIndex &&
						t.getLocation().getRow() == rowIndex)
				.findFirst();
		assert(tileOptional.isPresent());
		return tileOptional.get();
	}

	private int amountOf(int amount) {
		return amount;
	}

	private Location locationOf(int column, int row) {
		var location = new Location();
		location.setColumn(column);
		location.setRow(row);
		return location;
	}

	//</editor-fold>

}
