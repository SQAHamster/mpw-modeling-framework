package de.unistuttgart.kara.view;

import de.unistuttgart.kara.WorldLoader;
import de.unistuttgart.kara.hamsterviewmodel.GameViewModel;
import de.unistuttgart.kara.hamsterviewmodel.impl.GameViewPresenterImpl;
import de.unistuttgart.kara.kara.Kara;
import de.unistuttgart.kara.kara.KaraGame;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KaraViewTestBase {

    private int maxCharsPerCell = 2;
    private static Map<String, String> characterMap = new HashMap<>();
    private KaraGame game;
    protected Kara kara;
    protected GameViewModel viewModel;

    @BeforeAll
    public static void setup() {
        initCharMapping();
    }

    protected void withWorld(String path) throws IOException {
        game = new KaraGame();
        WorldLoader.initializeFor(game).loadFromResourceFile(path);

        // game.startGame(false);
        // game.setSpeed(KaraGame.NO_SPEED);

        var territory = game.getWorld();
        kara = territory.getKara();

        var presenter = new GameViewPresenterImpl(game);
        presenter.bind();
        viewModel = presenter.getViewModel();

        game.setUserInputInterface(new UserInputInterfaceFake());
    }

    protected void assertWorld(String expected) {
        var actual = new ViewModelStringifier(characterMap, maxCharsPerCell)
                .territoryToExpectationString(viewModel);
        assertEquals(expected, actual);
    }

    protected void assertLog(String expected) {
        String actual = ViewModelStringifier.logToString(viewModel);
        assertEquals(expected, actual);
    }

    private static void initCharMapping() {
        characterMap.put("Kara32", ">");
        characterMap.put("Kara32[90]", "v");
        characterMap.put("Kara32[180]", "<");
        characterMap.put("Kara32[270]", "^");
        characterMap.put("Leaf32", "*");
        characterMap.put("Tree32", "##");
        characterMap.put("Mushroom32", "@");
    }

}
