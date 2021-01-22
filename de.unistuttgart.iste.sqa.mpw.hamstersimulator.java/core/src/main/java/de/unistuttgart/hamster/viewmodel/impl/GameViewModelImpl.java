package de.unistuttgart.hamster.viewmodel.impl;

import de.unistuttgart.hamster.viewmodel.ViewModelCell;
import de.unistuttgart.hamster.viewmodel.GameViewModel;
import de.unistuttgart.hamster.mpw.Size;

public class GameViewModelImpl extends GameViewModel {

	public GameViewModelImpl() {

	}

	@Override
	public ViewModelCell getCellAt(int row, int column) {
		throw new RuntimeException("not implemented");
	}

	@Override
	public void init(Size size) {
		throw new RuntimeException("not implemented");
	}

}
