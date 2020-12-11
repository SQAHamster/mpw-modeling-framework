package de.unistuttgart.hamster.hamsterviewmodel;

public interface GameViewInput {

	void playClicked();

	void stopClicked();

	void textTyped(String text);

	GameViewModel getViewModel();

}
