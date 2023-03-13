package components.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.henshin.model.HenshinPackage;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;

/**
 * Helper class which validates a resource content with a given OCL validation
 * file.
 */
public class OclValidationHelper {
    private static final Logger log = Logger.getLogger(OclValidationHelper.class.getName());

    private final EValidator validator;
    private BasicDiagnostic currentDiagnostics;


    // Note: ocl instance has to be kept in this variable, since it must not be
    // garbage collected until the last validation through this object ends
    private final OCL ocl = OCL.newInstance();

    public OclValidationHelper(final String oclFileName) {
        validator = createOclValidator(ocl, oclFileName);
    }

    public <T extends EObject> boolean areAllContentsValid(final List<T> contents, final Issues issues) {
        for (final var content : contents) {
            log.info("validating " + getDebugNameForEObject(content));
            if (!isValid(content)) {
                addDiagnosticsError(issues);
                return false;
            }
        }
        return true;
    }

    public <T extends EObject> List<T> validateContents(final List<T> contents, final Issues issues) {
        final ArrayList<T> validObjects = new ArrayList<>();

        for (final var content : contents) {
            log.info("validating " + getDebugNameForEObject(content));
            if (isValid(content)) {
                validObjects.add(content);
            } else {
                addDiagnosticsError(issues);
            }
        }

        return validObjects;
    }

    private static String getDebugNameForEObject(EObject eObject) {
        final var nameFeature = eObject.eClass().getEStructuralFeature("name");
        if (nameFeature != null) {
            eObject.eGet(nameFeature);
        }
        return String.valueOf(eObject);
    }

    private static EValidator createOclValidator(final OCL ocl, final String oclFileName) {
        CompleteOCLStandaloneSetup.doSetup();
        final String uri = String.format("%s/validation/%s", getWorkflowProjectResourcePathPrefix(), oclFileName);
        return new CompleteOCLEObjectValidator(HenshinPackage.eINSTANCE, URI.createURI(uri),
                ocl.getEnvironmentFactory());
    }

    /**
     * Validates the given commandModel and stores the diagnostic result in the
     * {@link #currentDiagnostics} field.
     * 
     * @return true, if the commandModel is valid.
     */
    private boolean isValid(final EObject content) {
        currentDiagnostics = Diagnostician.INSTANCE.createDefaultDiagnostic(content);
        var contentIterator = EcoreUtil.<EObject>getAllContents(content, false);
        while (contentIterator.hasNext()) {
            validator.validate(contentIterator.next(), currentDiagnostics, new HashMap<Object, Object>());
            if (currentDiagnostics.getSeverity() != Diagnostic.OK) {
                return false;
            }
        }
        return true;
    }

    private void addDiagnosticsError(final Issues issues) {
        issues.addError(currentDiagnostics.getMessage());
        for (final var child : currentDiagnostics.getChildren()) {
            issues.addError("> " + child.getMessage());
        }
    }

    private static String getWorkflowProjectResourcePathPrefix() {
        final String workflowProjectName = "de.unistuttgart.iste.sqa.mpw.modeling.workflow";
        boolean projectInSameWorkspace = EclipsePathHelper.isProjectInSameWorkspace(workflowProjectName);
        
        final StringBuilder uri = new StringBuilder();
        uri.append(EclipsePathHelper.getMappedPlatformUriForProject(workflowProjectName));
        if (uri.toString().endsWith("/")) {
        	uri.deleteCharAt(uri.length()-1);
        }
        
        if (projectInSameWorkspace) {
            uri.append("/src");
        }
        return uri.toString();
    }
}
