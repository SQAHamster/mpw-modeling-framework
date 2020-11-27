package components.helpers;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

/**
 * This class correctly registers the ecore packages from the workflow's genmodels to ensure correct usage with QVTo.
 * 
 * Note: without the explicit initialization the factories are not correctly typed. They are null or EFactoryImpl and the QVTo execution will fail in this case.
 * Note: registering genmodel and ecore in the workflow does also fail in some situations. 
 */
public class GenmodelEcorePackageInitializer {
	private final static Logger log = Logger.getLogger(GenmodelEcorePackageInitializer.class.getName());
	
	public static void initializeMissingEcorePackagesFromGlobalGenModels() {
		var resourceSet = new ResourceSetImpl();

		var registry = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
		
		for (var genModelUri : registry.values()) {
			var genModelResource = resourceSet.getResource(genModelUri, true);
			var genModel = (GenModel)genModelResource.getContents().get(0);
			checkGenModel(genModel);
		}
	}

	private static void checkGenModel(GenModel genModel) {
		for (var genPackage : genModel.getGenPackages()) {
			var ecorePackage = genPackage.getEcorePackage();

			var registeredFactory = EPackage.Registry.INSTANCE.getEFactory(ecorePackage.getNsURI());
			if (registeredFactory == null) {
				log.info("registering missing ecore " + ecorePackage.getNsURI() + " from genmodel " + genModel.eResource().getURI());
				registerEcorePackageFromGenPackage(genPackage);
			}
			
		}
	}

	private static void registerEcorePackageFromGenPackage(GenPackage genPackage) {
		var packageImplClassName = genPackage.getQualifiedPackageClassName();
		
		try {
			var packageImplClass = Class.forName(packageImplClassName);
			Method initMethod = packageImplClass.getMethod("init");
			initMethod.invoke(null);
			registerPackage(genPackage.getEcorePackage());
		} catch (Exception e) {
			log.error("failed to initialize ecore package " + genPackage.getEcorePackage().getName() + " with class: " + packageImplClassName, e);
		}
	}

	/** registers the EPackage to the global registry similar to {@link StandaloneSetup#addRegisterEcoreFile(String)} */
	private static void registerPackage(EPackage ePackage) {
		var registry = EPackage.Registry.INSTANCE;
		String nsUri = ePackage.getNsURI();
		if (registry.get(nsUri) == null) {
			registry.put(nsUri, ePackage);
			log.info("Adding dynamic EPackage '" + nsUri + "'");
		}
	}
	
}
