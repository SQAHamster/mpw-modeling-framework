package de.unistuttgart.kara.view;

import de.unistuttgart.kara.viewmodel.GameViewModel;
import de.unistuttgart.kara.viewmodel.ViewModelCell;
import de.unistuttgart.kara.viewmodel.ViewModelLogEntry;

import java.util.Map;

public class ViewModelStringifier {
    private final Map<String, String> imageCharsMapping;
    private final int maxCharsPerCell;

    public ViewModelStringifier(Map<String, String> imageCharsMapping, int maxCharsPerCell) {
        this.imageCharsMapping = imageCharsMapping;
        this.maxCharsPerCell = maxCharsPerCell;
    }

    public String worldToExpectationString(GameViewModel viewModel) {
        StringBuilder actual = new StringBuilder();
        var h = viewModel.getSize().getRowCount();
        for (int y = 0; y < h; y++) {
            var s = rowToString(viewModel, y);
            actual.append(s);
            actual.append("\n");
        }
        return actual.toString();
    }

    private String rowToString(GameViewModel viewModel, int y) {
        StringBuilder s = new StringBuilder("|");
        var w = viewModel.getSize().getColumnCount();
        for (int x = 0; x < w; x++) {
            var cell = viewModel.getCellAt(y, x);
            s.append(cellToString(cell));
            s.append("|");
        }
        return s.toString();
    }

    private String cellToString(ViewModelCell c) {
        StringBuilder s = new StringBuilder();
        for (var layer : c.getLayers()) {
            if (layer.getVisible()) {
                var key = layer.getImageName();
                var r = layer.getRotation();
                if (r != 0) {
                    key += "[" + r + "]";
                }
                s.append(imageCharsMapping.get(key));
            }
        }
        var length = s.length();
        var spaces = maxCharsPerCell - length;
        s.append(" ".repeat(Math.max(0, spaces)));
        return s.toString();
    }

    public static String logToString(GameViewModel viewModel) {
        StringBuilder actual = new StringBuilder();
        for (ViewModelLogEntry entry : viewModel.getLogEntries()) {
            actual.append(entry.getMessage());
            actual.append("\n");
        }
        return actual.toString();
    }

}
