package components.readers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;

import util.ListLambdaVisitor;

/**
 * MultiResourceReader Component used to read ecore files recursively in a given file path.
 */
public class MultiEcoreReader extends MultiResourceReader {
	protected static final Logger log = Logger.getLogger(MultiEcoreReader.class.getName());

	public MultiEcoreReader() {
		super(".ecore", "model");
		
		// Note: for Ecores, the validation has to be turned off.
		// Reason: here explicitly Models can be loaded, which are already registered. Then they are ignored and the 
		// registered ones are used.
		validatePackageRegistrationOfAllContents = false;
	}
	
	@Override
	protected void postProcessModels(List<Object> models) {
		registerLoadedEcores(models);
	}

	private void registerLoadedEcores(List<Object> models) {
		final List<Object> resultingModels = new ArrayList<Object>();
		new ListLambdaVisitor<Object>()
		.on(EPackage.class).then(ePackage -> {
			handlePackage(resultingModels, ePackage);
		})
		.orElse(object -> {
			throw new IllegalStateException("loaded object is not of type EPackage: " + object);
		}).accept(models);
		
		models.clear();
		models.addAll(resultingModels);
	}

	private void handlePackage(final List<Object> resultingModels, EPackage ePackage) {
		var registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI());
		if (registeredPackage != null) {
			log.info("Discard loaded ecore resource " + ePackage.getName() + " since it was already loaded and registered. Use the registered one instead.");
			resultingModels.add(registeredPackage);
		} else {
			EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
			resultingModels.add(ePackage);
		}
	}

}