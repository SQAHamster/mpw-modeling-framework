package components.readers;

/**
 * MultiResourceReader Component used to read ecore files recursively in a given file path.
 */
public class MultiEcoreReader extends MultiResourceReader {

	public MultiEcoreReader() {
		super(".ecore", "model");
	}

}