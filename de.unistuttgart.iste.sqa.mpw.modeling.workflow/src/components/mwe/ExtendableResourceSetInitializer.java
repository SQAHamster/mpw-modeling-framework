package components.mwe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.xtext.mwe.RuntimeResourceSetInitializer;

import com.google.inject.Inject;

import components.helpers.EclipsePathHelper;

class ExtendableResourceSetInitializer extends RuntimeResourceSetInitializer {
	protected final static Logger log = Logger.getLogger(ExtendableResourceSetInitializer.class.getName());
	
	@Inject
	private Mwe2ParamsMap paramsMap;
	
	public List<String> getClassPathEntries() {
        List<String> classPathEntries = super.getClassPathEntries();
        
        String additionalArchivesPath = paramsMap.getParams().get("additionalArchivesPath");
        if (additionalArchivesPath == null) {
        	return classPathEntries;
        }

        var path = EclipsePathHelper.toJavaCompatibleAbsoluteFilePath(additionalArchivesPath);
        path = Path.of(path).toAbsolutePath().toString();
		log.info("searching additional jars in: " + path);
		
		try {
			log.info("xx" + Files.list(Path.of(path)).map(p -> p.toAbsolutePath().toString()).collect(Collectors.toList()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			List<String> additionalJars = getAdditionalJars(path);
			log.info("found additional jars: " + additionalJars);
			classPathEntries.addAll(additionalJars);
		} catch (IOException e) {
			log.error("failed to process additional archives", e);
		}
        return classPathEntries;
    }
	
	private List<String> getAdditionalJars(String path) throws IOException {
        return Files.list(Path.of(path))
        		.map(p -> p.toAbsolutePath().toString())
        		.filter(p -> p.endsWith("jar"))
        		.collect(Collectors.toList());
	}
}