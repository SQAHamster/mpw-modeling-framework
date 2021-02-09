package converter;

import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.xtext.parser.IParser;

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.QueryDslStandaloneSetup;
import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.ClassContext;
import de.unistuttgart.iste.sqa.mpw.modeling.querydsl.querydsl.Parameter;

/*
 * Implementation for StringToQueryDslConverter.
 * 
 * Note: StringToQueryDslConverter simply delegates to this class to avoid a wrong Eclipse UI compilation
 * error shown in QVTo.
 */
final class InternalStringToQueryDslConverter {
	@Inject
	private IParser parser;

	static Object toQuery(String string, String contextClassName, List<Object> parameterObjects) {
		var parameters = parameterObjects.stream().map(Parameter.class::cast).collect(Collectors.toList());
		return new InternalStringToQueryDslConverter().convertToQuery(string, contextClassName, parameters);
	}

	private ClassContext convertToQuery(String string, String contextClassName, List<Parameter> parameters) {
		Injector injector = new QueryDslStandaloneSetup().createInjector();
		injector.injectMembers(this);
		
		String parseInputString = toParseString(string, contextClassName, parameters);
		StringReader reader = new StringReader(parseInputString);
		var result = parser.parse(reader);
		
		if (result.hasSyntaxErrors()) {
			throw new RuntimeException("String cannot be parsed to a query: " + result.getSyntaxErrors().toString());
        }
		return (ClassContext)result.getRootASTElement();
	}
	
	private static String toParseString(String string, String contextClassName, List<Parameter> parameters) {
		var input = new StringBuilder();
		input.append("context ");
		input.append(contextClassName);
		input.append(" query dummy");
		if (parameters.size() > 0) {
			input.append('(');
			input.append(toParametersSignature(parameters));
			input.append(')');
		}
		input.append(":");
		input.append(string);
		input.append(";");
		return input.toString();
	}

	private static String toParametersSignature(List<Parameter> parameters) {
		return parameters.stream()
				.map(p -> toNameTypeString(p))
				.collect(Collectors.joining(", "));
	}
	
	private static String toNameTypeString(Parameter parameter) {
		return parameter.getVariableName() + ": " + parameter.getTypeName();
	}
}
