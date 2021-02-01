package de.unistuttgart.iste.sqa.mpw.framework;

import de.unistuttgart.iste.sqa.mpw.framework.mpw.Location;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {
    @Test
    public void givenLocation0x0_whenCheckEqualsTo0x0_thenIsTrue() {
        var sut = Location.from(0, 0);
        boolean actual = sut.equals(Location.from(0, 0));
        assertTrue(actual);
    }

    @Test
    public void givenLocation1x1_whenCheckEqualsTo2x1_thenIsFalse() {
        var sut = Location.from(1, 1);
        boolean actual = sut.equals(Location.from(2, 1));
        assertFalse(actual);
    }

    @Test
    public void givenLocation3x5_whenPutIntoHashSet_andCheckIfSetContains3x5_thenCheckIsTrue() {
        var hashSet = new HashSet<Location>();
        hashSet.add(Location.from(3, 5));
        boolean actual = hashSet.contains(Location.from(3, 5));
        assertTrue(actual);
    }

    @Test
    public void givenLocation3x5_whenPutIntoHashSet_andCheckIfSetContains3x3_thenCheckIsFalse() {
        var hashSet = new HashSet<Location>();
        hashSet.add(Location.from(3, 5));
        boolean actual = hashSet.contains(Location.from(3, 3));
        assertFalse(actual);
    }
}