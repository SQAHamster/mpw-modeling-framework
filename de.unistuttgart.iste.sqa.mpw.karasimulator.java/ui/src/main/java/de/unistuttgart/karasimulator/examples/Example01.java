package de.unistuttgart.karasimulator.examples;

class Example01 extends SimpleKaraGame {

    @Override
    protected void run() {
        displayInNewGameWindow();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.removeLeaf();
        kara.turnLeft();
        kara.turnLeft();
        kara.move();
        kara.putLeaf();
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.turnRight();
    }

}
