package de.unistuttgart.hamster.hamsterviewmodel;

public abstract class GameViewPresenter implements GameViewInput {

	private final GameViewModel viewModel = new GameViewModel();

	public GameViewPresenter() {

	}

	public GameViewModel getViewModel() {
		return this.viewModel;
	}

}
