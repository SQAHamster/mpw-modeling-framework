module mpw.framework.core {
    requires mpw.framework.utils;
    requires javafx.base;

    exports de.unistuttgart.iste.sqa.mpw.framework;
    exports de.unistuttgart.iste.sqa.mpw.framework.basetypes;
    exports de.unistuttgart.iste.sqa.mpw.framework.commands;
    exports de.unistuttgart.iste.sqa.mpw.framework.commands.impl;
    exports de.unistuttgart.iste.sqa.mpw.framework.exceptions;
    exports de.unistuttgart.iste.sqa.mpw.framework.mpw;
    exports de.unistuttgart.iste.sqa.mpw.framework.mpw.impl;
    exports de.unistuttgart.iste.sqa.mpw.framework.viewmodel;
    exports de.unistuttgart.iste.sqa.mpw.framework.viewmodel.impl;
}