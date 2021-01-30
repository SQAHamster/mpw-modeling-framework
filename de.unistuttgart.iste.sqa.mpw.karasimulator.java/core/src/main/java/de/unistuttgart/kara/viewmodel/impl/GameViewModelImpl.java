package de.unistuttgart.kara.viewmodel.impl;

import de.unistuttgart.kara.mpw.Location;
import de.unistuttgart.kara.viewmodel.ViewModelCell;
import de.unistuttgart.kara.viewmodel.GameViewModel;
import de.unistuttgart.kara.viewmodel.ViewModelRow;
import de.unistuttgart.kara.mpw.Size;

public class GameViewModelImpl extends GameViewModel {

	@Override
	public ViewModelCell getCellAt(int row, int column) {
		if (row >= 0 && row < getSize().getRowCount()
				&& column >= 0 && column < getSize().getColumnCount()) {
			return getRows().get(row).getCells().get(column);
		}
		return null;
	}

	@Override
	public void init(Size size) {
		setSize(size);
		for (int rowIndex = 0; rowIndex < size.getRowCount(); rowIndex++) {
			var row = new ViewModelRow();
			addToRows(row);
			for (int columnIndex = 0; columnIndex < size.getColumnCount(); columnIndex++) {
				var cell = new ViewModelCell();
				cell.setLocation(Location.from(columnIndex, rowIndex));
				row.addToCells(cell);
			}
		}
	}

}
