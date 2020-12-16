package components.mwe;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2RuntimeModule;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;
import org.eclipse.xtext.mwe.RuntimeResourceSetInitializer;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Helper extension class to have a Mwe2Launcher which is able to add project dependencies as direct jar archives to the internal "classpath".
 * It is used to allow that a mwe2 workflow is able to call another mwe2 workflow, which is not possible directly by Maven.
 * 
 * Note: with Tycho / maven-exec the classpath is not correctly set, so the normal Mwe2Launcher is "confused" and does not find other mwe2 files.
 * 
 * See: https://www.eclipse.org/forums/index.php/t/1084909/
 */
public class Mwe2LauncherExtended  {
	private static final String PARAM = "p";
	
	private static final Logger logger = Logger.getLogger(Mwe2Launcher.class);

	public static void main(String[] args) {
		try {
			new Mwe2LauncherExtended().run(args);
		} catch(Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
			System.exit(1);
		}
	}

	public void run(String[] args) {
		Options options = getOptions();
		final CommandLineParser parser = new PosixParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
			if (line.getArgs().length == 0)
				throw new ParseException("No module name specified.");
			if (line.getArgs().length > 1)
				throw new ParseException("Only one module name expected. But " + line.getArgs().length
						+ " were passed (" + line.getArgList() + ")");

			String moduleName = line.getArgs()[0];
			Map<String, String> params = new HashMap<String, String>();
			String[] optionValues = line.getOptionValues(PARAM);
			if (optionValues != null) {
				for (String string : optionValues) {
					int index = string.indexOf('=');
					if (index == -1) {
						throw new ParseException("Incorrect parameter syntax '" + string
								+ "'. It should be 'name=value'");
					}
					String name = string.substring(0, index);
					String value = string.substring(index + 1);
					if (params.put(name, value) != null) {
						throw new ParseException("Duplicate parameter '" + name + "'.");
					}
				}
			}
			// check  OperationCanceledException is accessible
			OperationCanceledException.class.getName();
			
			Injector injector = createStandaloneSetup().createInjectorAndDoEMFRegistration();
			
			var paramsMap = injector.getInstance(Mwe2ParamsMap.class);
			paramsMap.setParams(params);
			
			Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
			if (moduleName.contains("/")) {
				mweRunner.run(URI.createURI(moduleName), params);
			} else {
				mweRunner.run(moduleName, params);
			}
		} catch(NoClassDefFoundError e) {
			if ("org/eclipse/core/runtime/OperationCanceledException".equals(e.getMessage())){
				System.err.println("Could not load class: org.eclipse.core.runtime.OperationCanceledException");
				System.err.println("Add org.eclipse.equinox.common to the class path.");
			} else {
				throw e;
			}
		} catch (final ParseException exp) {
			final HelpFormatter formatter = new HelpFormatter();
			System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
			formatter.printHelp("java " + Mwe2Launcher.class.getName() + " some.mwe2.Module [options]\n", options);
			return;
		}
	}

	private Mwe2StandaloneSetup createStandaloneSetup() {
		return new Mwe2StandaloneSetup()  {

            @Override
            public Injector createInjector() {
                return Guice.createInjector(new Mwe2RuntimeModule() {
                    @SuppressWarnings("unused")
					public Class<? extends RuntimeResourceSetInitializer> bindRuntimeResourceSetInitializer() {
                        return ExtendableResourceSetInitializer.class;
                    }
                });
            }
		};
	}

	@SuppressWarnings("static-access")
	public Options getOptions() {
		final Options options = new Options();
		final Option paramOption = OptionBuilder.withArgName("key=value").withDescription(
				"external property that is handled as workflow property").hasArgs().create(PARAM);
		paramOption.setLongOpt("param");
		options.addOption(paramOption);
		return options;
	}
}
