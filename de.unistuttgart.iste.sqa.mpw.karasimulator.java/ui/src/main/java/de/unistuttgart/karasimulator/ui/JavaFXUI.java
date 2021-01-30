package de.unistuttgart.karasimulator.ui;

import de.unistuttgart.kara.kara.KaraGame;
import de.unistuttgart.kara.mpw.UserInputInterface;
import de.unistuttgart.kara.viewmodel.GameViewInput;
import de.unistuttgart.kara.viewmodel.GameViewModel;
import de.unistuttgart.kara.viewmodel.impl.GameViewPresenterImpl;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class JavaFXUI extends Application {

    private static final CountDownLatch initLatch = new CountDownLatch(1);
    private static final JavaFXInputInterface inputInterface = new JavaFXInputInterface();
    private static volatile boolean isStarted = false;

    /*@
     @ requires true;
     @*/
    /**
     * Displays the kara game associated with the provided kara game adapter in a new window
     * This automatically starts the UI, adds the necessary input interface and opens the scene
     */
    public static void displayInNewGameWindow(final KaraGame game) {
        var gameViewPresenter = new GameViewPresenterImpl(game);
        gameViewPresenter.bind();
        game.setUserInputInterface(inputInterface);
        openSceneFor(gameViewPresenter, gameViewPresenter.getViewModel());
    }

    /*@
     @ requires true;
     @ ensures isStarted;
     @*/
    /**
     * Starts the javafx ui thread if not already started
     */
    public static void start() {
        if (!isStarted) {
            new Thread(()->Application.launch(JavaFXUI.class)).start();
            waitForJavaFXStart();
            isStarted = true;
            Platform.setImplicitExit(true);
        }
    }
    
    public static void setKeepFXRunningAfterLastWindow() {
        Platform.setImplicitExit(false);        
    }
    
    @Override
    public void stop() throws Exception {
        isStarted = false;
        super.stop();
    }

    private static void waitForJavaFXStart() {
        try {
            initLatch.await();
        } catch (final InterruptedException e) { }
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        initLatch.countDown();
    }

    /*@
     @ requires true;
     @ ensures isStarted;
     @*/
    /**
     * Opens a scene for the kara game associated with karaGameViewModel
     * requires that the JavaFXUI is started
     * @param gameViewModel the adapter for the kara game to display
     */
    public static void openSceneFor(final GameViewInput gameViewInput, final GameViewModel gameViewModel) {
        start();
        JavaFXUtil.blockingExecuteOnFXThread(() -> {
            Stage stage;
            try {
                stage = new GameStage(gameViewInput, gameViewModel);
                stage.show();
            } catch (final IOException e) {
                inputInterface.confirmAlert(e);
            }
        });
    }

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/
    /**
     * Getter for the JavaFXInputInterface singleton
     * @return the JavaFXInputInterface to display
     */
    public static UserInputInterface getJavaFXInputInterface() {
        return inputInterface;
    }

}
