package components.readers;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;

import util.ListLambdaVisitor;

/**
 * MultiResourceReader Component used to read ecore files recursively in a given file path.
 */
public class MultiEcoreReader extends MultiResourceReader {

	public MultiEcoreReader() {
		super(".ecore", "model");
	}
	
	@Override
	protected void postProcessModels(List<Object> models) {
		registerLoadedEcores(models);
	}

	private void registerLoadedEcores(List<Object> models) {
		new ListLambdaVisitor<Object>()
		.on(EPackage.class).then(ePackage -> {
			validateNoPackageAlreadyRegistered(ePackage);
			EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
		})
		.orElse(object -> {
			throw new IllegalStateException("loaded object is not of type EPackage: " + object);
		}).accept(models);
	}
	
	private void validateNoPackageAlreadyRegistered(EPackage ePackage) {
		var registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI());
		if (registeredPackage != null) {
			throw new IllegalStateException("package " + ePackage.getNsURI() + " is already registered!");
		}
	}

}