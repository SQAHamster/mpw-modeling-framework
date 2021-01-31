package de.unistuttgart.iste.sqa.mpw.framework.ui;

import javafx.scene.paint.Color;

public class ViewModelColorConverter {
    public static Color toJavaFxColor(de.unistuttgart.iste.sqa.mpw.framework.viewmodel.Color color) {
        return switch (color) {
            case BLACK -> Color.BLACK;
            case BLUE -> Color.BLUE;
            case GREEN -> Color.GREEN;
            case YELLOW -> Color.YELLOW;
            case PINK -> Color.PINK;
            case MAGENTA -> Color.MAGENTA;
            case RED -> Color.RED;
        };
    }
}
