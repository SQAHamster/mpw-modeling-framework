package components.readers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.issues.Issues;

import components.helpers.AnnotationRetainer;
import components.helpers.OclValidationHelper;
import mpw.MpwPackage;
import util.ListLambdaVisitor;

/**
 * MultiResourceReader Component used to read ecore files recursively in a given
 * file path.
 */
public class MultiEcoreReader extends MultiResourceReader {
    protected static final Logger log = Logger.getLogger(MultiEcoreReader.class.getName());

    public MultiEcoreReader() {
        super(".ecore", "model");

        // Note: for Ecores, the validation for consistent packages has to be turned
        // off.
        // Reason: here explicitly Models can be loaded, which are already registered.
        // Then they are ignored and the
        // registered ones are used.
        validatePackageRegistrationOfAllContents = false;
    }

    @Override
    protected void postProcessModels(final List<EObject> models, final Issues issues) {
        final boolean valid = validateEntityModels(models, issues);
        if (valid) {
            registerLoadedEcores(models);
            ensureMpwEcoreDocumentationAnnotationsAreAvailable();
        }
    }

    private boolean validateEntityModels(final List<EObject> models, final Issues issues) {
        final OclValidationHelper oclValidationHelper = new OclValidationHelper("MpwEntityValidation.ocl");
        return oclValidationHelper.areAllContentsValid(models, issues);
    }

    private void registerLoadedEcores(final List<EObject> models) {
        final List<EObject> resultingModels = new ArrayList<EObject>();
        new ListLambdaVisitor<EObject>().on(EPackage.class).then(ePackage -> {
            handlePackage(resultingModels, ePackage);
        }).orElse(object -> {
            throw new IllegalStateException("loaded object is not of type EPackage: " + object);
        }).accept(models);

        models.clear();
        models.addAll(resultingModels);
    }

    private void handlePackage(final List<EObject> resultingModels, final EPackage ePackage) {
        var registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ePackage.getNsURI());
        if (registeredPackage != null) {
            log.info("Discard loaded ecore resource " + ePackage.getName()
                    + " since it was already loaded and registered. Use the registered one instead.");
            resultingModels.add(registeredPackage);
            copyMissingAnnotationsToRegisteredPackage(ePackage, registeredPackage);
        } else {
            EPackage.Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
            resultingModels.add(ePackage);
        }
    }

    /**
     * Helper method which loads the MiniProgrammingWorld.ecore explicitly as
     * platform:/resource.
     * 
     * Motivation: In concrete simulator modeling environments, the MpwPackage is
     * loaded by generated code (as a registered package by NS-URI). But this way,
     * no GenModel EAnnotations are retained, which include documentation on Ecore
     * models. By this method, a workaround is achieved which copies these
     * documentation annotations into the registered package, which are e.g.
     * relevant for generated facade methods.
     */
    private void ensureMpwEcoreDocumentationAnnotationsAreAvailable() {
        final ResourceSetImpl resourceSet = new ResourceSetImpl();
        var resource = resourceSet.getResource(URI.createURI(
                "platform:/resource/de.unistuttgart.iste.sqa.mpw.modeling.mpw/model/MiniProgrammingWorld.ecore"), true);
        if (resource != null) {
            final EPackage loadedMpwPackage = (EPackage) resource.getContents().get(0);
            var registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MpwPackage.eNS_URI);
            if (registeredPackage != null) {
                copyMissingAnnotationsToRegisteredPackage(loadedMpwPackage, registeredPackage);
            }
        }
    }

    /**
     * The already registered is probably created using generated Ecore classes
     * (genmodel). In this case, no annotations (especially documentation) is not
     * retained. Since the loaded EPackage contains all annotations, copy them to
     * the registered EPackage.
     */
    private void copyMissingAnnotationsToRegisteredPackage(final EPackage loadedPackage,
            final EPackage registeredPackage) {
        new AnnotationRetainer(loadedPackage).copyMissingAnnotationsTo(registeredPackage);
    }

}