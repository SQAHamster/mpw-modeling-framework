package de.unistuttgart.kara;

import de.unistuttgart.kara.kara.KaraGame;
import de.unistuttgart.kara.kara.WorldBuilder;
import de.unistuttgart.kara.mpw.Direction;
import de.unistuttgart.kara.mpw.Location;
import de.unistuttgart.kara.mpw.Size;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class WorldLoader {
    private final WorldBuilder worldBuilder;
    private Size loadedWorldDimensions;

    private WorldLoader(final WorldBuilder worldBuilder) {
        super();
        this.worldBuilder = worldBuilder;
    }

    public static WorldLoader initializeFor(final KaraGame game) {
        var builder = new WorldBuilder(game);
        return new WorldLoader(builder);
    }

    public void loadFromResourceFile(final String worldFile) throws IOException {
        final List<String> list = readLinesFromWorldResourceFile(worldFile);
        interpretLoadedWorldLines(list);
    }

    public void loadFromInputStream(final InputStream inputStream) throws IOException {
        final List<String> list = readLinesFromWorldInputStream(inputStream);
        interpretLoadedWorldLines(list);
    }

    private void interpretLoadedWorldLines(final List<String> list) {
        final String[] lines = list.toArray(new String[]{});
        setSizeFromStrings(lines);
        final String[] worldDefinition = Arrays.copyOfRange(lines,2,lines.length);
        buildTiles(worldDefinition);
    }

    private void setSizeFromStrings(final String[] lines) {
        this.loadedWorldDimensions = new Size(Integer.parseInt(lines[0]), Integer.parseInt(lines[1]));
        this.worldBuilder.initWorld(this.loadedWorldDimensions.getColumnCount(), this.loadedWorldDimensions.getRowCount()); // todo allow size as parameter
    }

    private void buildTiles(final String[] lines) {
        Optional<Location> defaultKaraLocation = Optional.empty();
        Optional<Direction> defaultKaraDirection = Optional.empty();

        for (int row = 0; row < this.loadedWorldDimensions.getRowCount(); row++) {
            for (int column = 0; column < this.loadedWorldDimensions.getColumnCount(); column++) {
                final Location currentLocation = new Location(column, row);
                final char tileCode = lines[row].charAt(column);
                switch (tileCode) {
                    case ' ':
                        break;
                    case '#':
                        createTreeAt(currentLocation);
                        break;
                    case '*':
                        createLeafAt(currentLocation);
                        break;
                    case '@':
                        createMushroomAt(currentLocation);
                        break;
                    case '^':
                        defaultKaraLocation = Optional.of(currentLocation);
                        defaultKaraDirection = Optional.of(Direction.NORTH);
                        break;
                    case '>':
                        defaultKaraLocation = Optional.of(currentLocation);
                        defaultKaraDirection = Optional.of(Direction.EAST);
                        break;
                    case 'v':
                        defaultKaraLocation = Optional.of(currentLocation);
                        defaultKaraDirection = Optional.of(Direction.SOUTH);
                        break;
                    case '<':
                        defaultKaraLocation = Optional.of(currentLocation);
                        defaultKaraDirection = Optional.of(Direction.WEST);
                        break;
                    default:
                        throw new RuntimeException("World error.");
                }
            }
        }
        worldBuilder.initKara(defaultKaraLocation.get(), defaultKaraDirection.get());
    }

    private List<String> readLinesFromWorldResourceFile(final String worldFileName) throws IOException {
        final InputStream in = getClass().getResourceAsStream(worldFileName);
        if (in == null) {
            throw new IOException("Unable to load the world from the filename: " + worldFileName);
        }
        final List<String> result = readLinesFromWorldInputStream(in);
        in.close();
        return result;
    }

    private List<String> readLinesFromWorldInputStream(final InputStream inputStream) throws IOException {
        checkNotNull(inputStream);
        final BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        final List<String> list = new ArrayList<String>();

        try (Scanner input = new Scanner(reader))
        {
            while (input.hasNextLine()) {
                list.add(input.nextLine());
            }
        }

        return list;
    }

    private void checkNotNull(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }

    private void createTreeAt(final Location currentLocation) {
        this.worldBuilder.addTreeToTile(currentLocation);
    }
    private void createLeafAt(final Location currentLocation) {
        this.worldBuilder.addLeafToTile(currentLocation);
    }
    private void createMushroomAt(final Location currentLocation) {
        this.worldBuilder.addMushroomToTile(currentLocation);
    }
}
