package de.unistuttgart.hamster.hamster;

public interface GameHamster extends ReadOnlyHamster {

	void initHamster();

	void move();

	void pickGrain();

	void putGrain();

	void turnLeft();

}
