package de.unistuttgart.iste.sqa.mpw.framework.viewmodel.impl;

import de.unistuttgart.iste.sqa.mpw.framework.datatypes.Location;
import de.unistuttgart.iste.sqa.mpw.framework.datatypes.Size;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.GameViewModel;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelCell;
import de.unistuttgart.iste.sqa.mpw.framework.viewmodel.ViewModelRow;

public class GameViewModelImpl extends GameViewModel {

	@Override
	public ViewModelCell getCellAt(final int row, final int column) {
		if (row >= 0 && row < getSize().getRowCount()
				&& column >= 0 && column < getSize().getColumnCount()) {
			return getRows().get(row).getCells().get(column);
		}
		return null;
	}

	@Override
	public void init(final Size size) {
		setSize(size);
		for (int rowIndex = 0; rowIndex < size.getRowCount(); rowIndex++) {
			final var row = new ViewModelRow();
			addToRows(row);
			createCellsForRow(row);
		}
	}

	private void createCellsForRow(final ViewModelRow row) {
		final int rowIndex = getRows().size()-1;
		final Size size = getSize();
		for (int columnIndex = 0; columnIndex < size.getColumnCount(); columnIndex++) {
			final var cell = new ViewModelCell();
			cell.setLocation(Location.from(columnIndex, rowIndex));
			row.addToCells(cell);
		}
	}

}
