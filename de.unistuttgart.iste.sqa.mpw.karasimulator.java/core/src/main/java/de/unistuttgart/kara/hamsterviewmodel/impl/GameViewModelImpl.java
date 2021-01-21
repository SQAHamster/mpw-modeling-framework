package de.unistuttgart.kara.hamsterviewmodel.impl;

import de.unistuttgart.kara.hamsterviewmodel.ViewModelCell;
import de.unistuttgart.kara.hamsterviewmodel.GameViewModel;
import de.unistuttgart.kara.hamsterviewmodel.ViewModelRow;
import de.unistuttgart.kara.mpw.Size;

public class GameViewModelImpl extends GameViewModel {

	public GameViewModelImpl() {

	}

	@Override
	public ViewModelCell getCellAt(int row, int column) {
		if (row >= 0 && row < getHeight()
				&& column >= 0 && column < getWidth()) {
			return getRows().get(row).getCells().get(column);
		}
		return null;
	}

	@Override
	public void init(Size size) {
		setWidth(size.getColumnCount());
		setHeight(size.getRowCount());
		for (int rowIndex = 0; rowIndex < size.getRowCount(); rowIndex++) {
			var row = new ViewModelRow();
			addToRows(row);
			for (int columnIndex = 0; columnIndex < size.getColumnCount(); columnIndex++) {
				var cell = new ViewModelCell();
				row.addToCells(cell);
			}
		}
	}

}
