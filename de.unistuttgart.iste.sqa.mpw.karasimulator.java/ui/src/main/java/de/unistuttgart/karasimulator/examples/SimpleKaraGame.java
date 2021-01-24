package de.unistuttgart.karasimulator.examples;

import de.unistuttgart.kara.WorldLoader;
import de.unistuttgart.kara.exceptions.GameAbortedException;
import de.unistuttgart.kara.kara.Kara;
import de.unistuttgart.kara.kara.KaraGame;
import de.unistuttgart.karasimulator.ui.JavaFXUI;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import static de.unistuttgart.iste.rss.utils.Preconditions.checkArgument;
import static de.unistuttgart.iste.rss.utils.Preconditions.checkNotNull;

public abstract class SimpleKaraGame {
    private static final String DEFAULT_KARA_WORLD = "/worlds/example01.ter";

    protected static SimpleKaraGame createInstance() {
        return new Example01();
    }

    /**
     * Main method used to start the simple kara game.
     * @param args Default command line arguments, not used.
     */
    public static void main(final String[] args) {
        final SimpleKaraGame example = createInstance();
        example.doRun();
    }


    /**
     * Name of the environment variable used to determine the output interface
     */
    private static final String OUTPUT_INTERFACE_ENVIRONMENT_VARIABLE_NAME = "OUTPUT_INTERFACE";

    /**
     * Variable inherited to child classes containing the default kara
     * which is named kara here. Intentionally, no getter or setter is used
     * as they are introduced only after lecture 2.
     */
    protected final Kara kara;

    /**
     * The game object of this simple game. Can be used to start, stop, reset,
     * or display the game.
     */
    protected final KaraGame game = new KaraGame();

    /**
     * The current SimpleKaraGame. Can be used to load a world or to
     * display the game in a new game window.
     */
    protected final SimpleKaraGame currentGame = this;

    /**
     * A console object to demonstrate IO besides using the read or write methods
     * of karas.
     */
    protected final Console console = System.console();

    /**
     * Initialized a simple kara game by loading a default world
     * and setting protected references to contain kara and
     * the game.
     */
    public SimpleKaraGame() {
        initializeGame();
        game.startGamePaused();

        this.kara = this.game.getWorld().getKara();
    }

    protected void initializeGame() {
        try {
            WorldLoader.initializeFor(game).loadFromResourceFile(DEFAULT_KARA_WORLD);
            game.hardReset();
        } catch (IOException e) {
            throw new RuntimeException("failed to load the default world", e);
        }
    }

    /**
     * Predefined kara method designed to be overridden in subclass.
     * Put the kara code into this method. This parent class version
     * is empty, so that the kara does not do anything by default.
     */
    protected abstract void run();

    /**
     * Method to start the execution of a kara game and handle any exceptions happening
     * while running.
     */
    public final void doRun() {
        try {
            this.run();
        } catch (final GameAbortedException e) {
            // End this game
        } catch (final RuntimeException e) {
            this.game.confirmAlert(e);
            throw e;
        }
        this.game.stopGame();
    }

    /**
     * Displays the kara game in a new game window
     * The UI type can be specified in the config file or in the environment variable
     * OUTPUT_INTERFACE. Possible values are JAVA_FX, HTTP and NONE
     * The default is JAVA_FX.
     */
    protected void displayInNewGameWindow() {
        final String mode = UIMode.JAVA_FX;
        switch (mode) {
            case UIMode.JAVA_FX:
                JavaFXUI.displayInNewGameWindow(this.game);
                break;
            case UIMode.NONE:
                // ignore
                break;
            default:
                throw new IllegalStateException("Unknown output interface type, possible values are: " +
                        UIMode.JAVA_FX + " or " + UIMode.NONE);
        }
    }

    /*@
     @ requires true;
     @ ensures game.getCurrentGameMode() == Mode.INITIALIZING;
     @*/
    /**
     * Loads the World from a resources file.
     * Only absolute resource paths are allowed. E.g. the fileName "/world.ter" represents the file
     * world.ter in the resources directory
     * This resets the game if it was already started. After the world was loaded, the game is
     * in mode INITIALIZING. To start the game, game.startGame() should be called
     *
     * @param fileName An absolute path to the resource file. Must start with a "/"
     * @throws IllegalArgumentException if fileName is no absolute resource path (does not start with "/")
     *                                  or if the file was not found
     */
    protected final void loadWorldFromResourceFile(final String fileName) {
        checkNotNull(fileName);
        checkArgument(fileName.startsWith("/"), "fileName does not start with \"/\"");
        final InputStream worldFileStream = getClass().getResourceAsStream(fileName);
        checkArgument(worldFileStream != null, "world file not found");
        try {
            WorldLoader.initializeFor(game).loadFromResourceFile(fileName);
        } catch (IOException e) {
            game.confirmAlert(e);
        }
    }

    /**
     * Loads the UI Mode from the environment variable if possible
     *
     * @return The UI mode if the environment variable was set, otherwise an empty optional
     * @throws IllegalStateException if an illegal value is set
     */
    private static Optional<String> getUIModeFromEnvironmentVariable() {
        final String value = System.getenv(SimpleKaraGame.OUTPUT_INTERFACE_ENVIRONMENT_VARIABLE_NAME);
        if (value != null) {
            try {
                return Optional.of(value);
            } catch (final IllegalArgumentException e) {
                throw new IllegalStateException("Illegal environmental variable", e);
            }
        } else {
            return Optional.empty();
        }
    }

    /**
     * Different UI types
     * No enum is used because enums use reflection for valueOf which can cause issues if reflection is forbidden
     */
    private static final class UIMode {
        public static final String JAVA_FX = "JAVA_FX";
        public static final String NONE = "NONE";
    }
}
