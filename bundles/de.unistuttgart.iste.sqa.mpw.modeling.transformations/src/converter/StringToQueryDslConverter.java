package converter;

import java.util.List;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;

final public class StringToQueryDslConverter {

    /*
     * Due to: https://www.eclipse.org/forums/index.php/t/156231/ Use "Object" for
     * complex parameter types and return type, since e.g. the usage of the
     * Query-class will result in a compile error, since the QueryDsl package is not
     * correctly recognized.
     * 
     * Further, have to delegate to a separate class, to avoid a further compilation
     * error when working in Eclipse. This way, QVTo only "sees" java basic types.
     */
    @Operation(kind = Kind.HELPER)
    public static Object toQuery(String string, String contextClassName, List<Object> parameterObjects) {
        return InternalStringToQueryDslConverter.toQuery(string, contextClassName, parameterObjects);
    }

}
