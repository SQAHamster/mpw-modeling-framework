package de.unistuttgart.kara.view;

import de.unistuttgart.kara.framework.CommandConstraintException;
import de.unistuttgart.kara.mpw.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewModelTest extends KaraViewTestBase {

    @Test
    public void testInit() throws IOException {
        withWorld("/worlds/example01.ter");
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|> |@ |  |##|\n" +
                "|##|##|* |##|##|\n");
        assertEquals(true, kara.mushroomFront());
        assertEquals(true, kara.treeLeft());
        assertEquals(true, kara.treeRight());
        assertEquals(false, kara.treeFront());
        assertEquals(Direction.EAST, kara.getDirection());
        assertEquals(1, kara.getLocation().getRow());
        assertEquals(1, kara.getLocation().getColumn());
    }

    @Test
    public void testMove() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|  |> |@ |##|\n" +
                "|##|##|* |##|##|\n");
        assertEquals(true, kara.mushroomFront());
        assertEquals(false, kara.treeRight());
        assertEquals(Direction.EAST, kara.getDirection());
        assertEquals(1, kara.getLocation().getRow());
        assertEquals(2, kara.getLocation().getColumn());
    }

    @Test
    public void testMoveOnLeaf() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        kara.turnRight();
        kara.move();
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|  |  |@ |##|\n" +
                "|##|##|*v|##|##|\n");
        assertEquals(true, kara.onLeaf());
    }

    @Test
    public void testRemoveLeaf() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        kara.turnRight();
        kara.move();
        kara.removeLeaf();
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|  |  |@ |##|\n" +
                "|##|##|v |##|##|\n");
        assertEquals(false, kara.onLeaf());
    }

    @Test
    public void testPutLeaf() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.putLeaf();
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|*>|@ |  |##|\n" +
                "|##|##|* |##|##|\n");
        assertEquals(true, kara.onLeaf());
    }

    @Test
    public void testMoveAndRotateAndMove() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        kara.turnLeft();
        kara.turnLeft();
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.turnRight();
        kara.move();
        assertWorld(
                "|##|##|##|##|##|\n" +
                "|##|  |^ |@ |##|\n" +
                "|##|##|* |##|##|\n");
    }

    @Test
    public void testMoveAgainstTree() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        kara.turnLeft();

        Assertions.assertThrows(CommandConstraintException.class, () -> {
            kara.move();
        });
    }

    @Test
    public void testMoveMushroomBlocked() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();

        Assertions.assertThrows(CommandConstraintException.class, () -> {
            kara.move();
        });
    }

    @Test
    public void testLog() throws IOException {
        withWorld("/worlds/example01.ter");
        kara.move();
        kara.putLeaf();
        kara.turnLeft();
        kara.turnRight();
        kara.removeLeaf();
        kara.write("Hello");
        assertLog(
                "Move\n" +
                "Put Leaf\n" +
                "Turn Left\n" +
                "Turn Right\n" +
                "Remove Leaf\n" +
                "Hello\n");
    }

}