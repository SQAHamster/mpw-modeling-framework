package components.readers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

import com.google.common.base.CaseFormat;

import components.helpers.EclipsePathHelper;
import util.LambdaVisitor;

/**
 * Base reader class which loads multiple EMF resources of a project in the
 * workspace.
 * 
 * It recursively traverses a file tree and loads each model found with the
 * given file-extension.
 */
public abstract class MultiResourceReader extends WorkflowComponentWithModelSlot {
    protected static final Logger log = Logger.getLogger(MultiResourceReader.class.getName());

    private static final String REGEX_PATTERN_FILE_EXTENSION = "\\.\\w+";

    private final ResourceSet resourceSet = new ResourceSetImpl();

    private final String fileExtension;

    private String projectName;
    private String projectSubPath;
    private Set<String> excludeModels = new HashSet<>();
    private String rootPath = "..";

    /**
     * Defines, if after loading the models all contents are checked for valid
     * references to registered packages.
     */
    protected boolean validatePackageRegistrationOfAllContents = true;

    protected MultiResourceReader(final String fileExtension, final String defaultSubPath) {
        if (!fileExtension.matches(REGEX_PATTERN_FILE_EXTENSION)) {
            throw new IllegalArgumentException("invalid fileExtension: " + fileExtension);
        }
        this.fileExtension = fileExtension;
        this.projectSubPath = defaultSubPath;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(final String baseUri) {
        this.projectName = baseUri;
    }

    public String getProjectSubPath() {
        return projectSubPath;
    }

    public void setProjectSubPath(final String projectSubPath) {
        this.projectSubPath = projectSubPath;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(final String rootPath) {
        this.rootPath = rootPath;
    }

    public void addExcludeModel(String modelName) {
        if (!modelName.endsWith(fileExtension)) {
            modelName += fileExtension;
        }
        excludeModels.add(modelName);
    }

    @Override
    protected void invokeInternal(final WorkflowContext context, final ProgressMonitor monitor, final Issues issues) {
        log.info("searching " + getModelNameFromExtension() + " models for base URI: " + getBaseUri());

        final String projectDirectory = getProjectPath();
        final String targetDirectory = EclipsePathHelper.toJavaCompatibleAbsoluteFilePath(projectDirectory) + "/"
                + projectSubPath;
        try (final var files = listFiles(targetDirectory)) {
            final var modelNames = toRelevantModelNames(targetDirectory, files);
            logFoundModelNames(modelNames);
            addModelsToSlot(context, modelNames, issues);

            log.info("found " + modelNames.size() + " " + fileExtension + " files");

        } catch (final IOException e) {
            log.error("Failed to locate " + getModelNameFromExtension() + " files under: " + targetDirectory, e);
        }
        stopIfErrors(monitor, issues);
    }

    private void stopIfErrors(final ProgressMonitor monitor, final Issues issues) {
        if (issues.hasErrors()) {
            monitor.done();
        }
    }

    private List<String> toRelevantModelNames(final String targetDirectory, final Stream<Path> files) {
        final var modelNames = files.map(f -> f.toFile().getPath()).map(f -> substringAfter(f, targetDirectory))
                .filter(f -> f.endsWith(fileExtension)).filter(f -> !isExcluded(f)).collect(Collectors.toList());
        return modelNames;
    }

    private void logFoundModelNames(final List<String> modelNames) {
        modelNames.forEach(fileName -> {
            log.debug("found: " + fileName);
        });
    }

    /*
     * Note: the project-name might be different to the sub-directory, where the
     * project is placed. Hence, the project-name will be resolved to the URI (which
     * has to be a file-URI).
     */
    private String getProjectPath() {
        final String projectPath = EcorePlugin.getPlatformResourceMap().get(projectName).toFileString();
        assert projectPath != null;
        return projectPath;
    }

    private static String substringAfter(String string, String match) {
        string = string.replaceAll("\\\\", "/");
        match = match.replaceAll("\\\\", "/");
        final int index = string.indexOf(match);
        return string.substring(index + match.length());
    }

    private void addModelsToSlot(final WorkflowContext context, final List<String> modelNames, final Issues issues) {
        final String baseUri = getBaseUri();
        final var models = obtainTargetListForSlot(context);

        for (final var modelName : modelNames) {
            final EObject eObject = loadModel(baseUri, modelName);
            models.add(eObject);
        }

        context.set(getModelSlot(), models);
        postProcessModels(models, issues);
    }

    protected void postProcessModels(final List<EObject> models, final Issues issues) {
        // intended to be overridden on demand
    }

    private EObject loadModel(final String baseUri, final String modelName) {
        final String uri = baseUri + modelName;
        final EObject eObject = load(uri);
        checkNoErrorsFromLoading(modelName, eObject);
        validateNoUnresolvedProxies(modelName, eObject);
        validateNoUsedPackageIsLoadedMultipleTimes(modelName, eObject);
        return eObject;
    }

    private EObject load(final String uri) {
        final boolean firstElementOnly = true;
        // Note: with firstElementOnly == true, always an EObject is loaded, hence this
        // cast is ok
        return (EObject) Reader.load(resourceSet, uri, firstElementOnly);
    }

    private void checkNoErrorsFromLoading(final String modelName, final Object object) {
        new LambdaVisitor<Object>().on(EObject.class).then(eObject -> {
            throwExceptionIfResourceHasErrors(modelName, eObject.eResource());
        }).accept(object);
    }

    private void throwExceptionIfResourceHasErrors(final String modelName, final Resource resource) {
        if (resource != null && resource.getErrors().size() > 0) {
            throw new RuntimeException("error loading " + modelName + ": " + resource.getErrors().get(0));
        }
    }

    private void validateNoUnresolvedProxies(final String modelName, final Object object) {
        new LambdaVisitor<Object>().on(EObject.class).then(eObject -> {
            throwExceptionIfResourceHasUnresolvedProxies(modelName, eObject.eResource());
        }).accept(object);
    }

    private void throwExceptionIfResourceHasUnresolvedProxies(final String modelName, final Resource resource) {
        final var unresolvedReferences = EcoreUtil.UnresolvedProxyCrossReferencer.find(resource);
        if (!unresolvedReferences.isEmpty()) {
            final String unresolvedMessage = unresolvedReferences.keySet().stream().map(o -> "\n  > " + o)
                    .collect(Collectors.joining());
            throw new RuntimeException(
                    "error loading " + modelName + ": there are unresolved proxies " + unresolvedMessage);
        }
    }

    /**
     * Goes through each object and checks that the referenced package is the
     * registered one. Ensure that no model is loaded multiple times! This leads to
     * inconsistencies.
     */
    private void validateNoUsedPackageIsLoadedMultipleTimes(final String modelName, final Object object) {
        if (validatePackageRegistrationOfAllContents) {
            new LambdaVisitor<Object>().on(EObject.class).then(eObject -> {
                throwExceptionIfResourceInconsistentRegisteredPackageUsages(modelName, eObject);
            }).accept(object);
        }
    }

    private void throwExceptionIfResourceInconsistentRegisteredPackageUsages(final String modelName,
            final EObject resourceRoot) {
        var eObjectIterator = EcoreUtil.<EObject>getAllContents(resourceRoot, false);
        while (eObjectIterator.hasNext()) {
            final EObject eObject = eObjectIterator.next();
            new LambdaVisitor<EObject>().on(EClassifier.class).then(eClassifier -> {
                throwExceptionIfPackageIsNotTheRegisteredOne(eClassifier.getEPackage());
            }).orElse(() -> {
                throwExceptionIfPackageIsNotTheRegisteredOne(eObject.eClass().getEPackage());
            }).accept(eObject);
        }
    }

    private void throwExceptionIfPackageIsNotTheRegisteredOne(final EPackage checkPackage) {
        var registeredPackage = EPackage.Registry.INSTANCE.getEPackage(checkPackage.getNsURI());
        if (registeredPackage != checkPackage) {
            throw new IllegalStateException("package " + checkPackage.getName() + " is loaded multiple times!");
        }
    }

    @SuppressWarnings("unchecked")
    private List<EObject> obtainTargetListForSlot(final WorkflowContext context) {
        final Object slotContent = context.get(getModelSlot());
        if (slotContent != null) {
            return (List<EObject>) slotContent;
        }
        return new ArrayList<EObject>();
    }

    private Stream<Path> listFiles(final String directory) throws IOException {
        final Path path = Path.of(directory);
        if (Files.exists(path)) {
            return findFilesSortedByPath(path);
        }
        final List<Path> emptyList = Collections.emptyList();
        return emptyList.stream();
    }

    private Stream<Path> findFilesSortedByPath(final Path path) throws IOException {
        return Files.find(path, Integer.MAX_VALUE, (filePath, fileAttr) -> fileAttr.isRegularFile())
                .sorted(Comparator.comparing(Path::toAbsolutePath));
    }

    private boolean isExcluded(final String filePath) {
        final String fileName = new File(filePath).getName();
        for (final var pattern : excludeModels) {
            final var resolvedWildcards = pattern.replaceAll("\\*" + fileExtension, fileName); // allow
                                                                                               // "*.<fileextension>"
                                                                                               // pattern
            if (filePath.endsWith(resolvedWildcards)) {
                return true;
            }
        }
        return excludeModels.contains(fileName);
    }

    private String getBaseUri() {
        return MessageFormat.format("platform:/resource/{0}/{1}/", projectName, projectSubPath);
    }

    private String getModelNameFromExtension() {
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, fileExtension.substring(1));
    }

}