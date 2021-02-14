package de.unistuttgart.iste.sqa.mpw.framework.commands.impl.utils;

import de.unistuttgart.iste.sqa.mpw.framework.basetypes.Entity;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandUtils {
    /** cache found methods to avoid multiple iteration search for methods */
    private static Map<Class<?>, Map<String, Method>> cachedMethods = new HashMap<>();

    private CommandUtils() {}

    public static Method findSetMethod(final Entity entity, final String propertyName) {
        return findModifier("set", entity, propertyName);
    }

    public static Method findAddMethod(final Entity entity, final String propertyName) {
        return findModifier("addTo", entity, propertyName);
    }

    public static Method findRemoveMethod(final Entity entity, final String propertyName) {
        return findModifier("removeFrom", entity, propertyName);
    }

    private static Method findModifier(final String prefix, final Entity entity, final String propertyName) {
        if (entity == null) {
            throw new NullPointerException("entity must not be null");
        }

        final var entityClass = entity.getClass();
        final var targetMethodName = prefix + toFirstUpper(propertyName);

        var method = findCachedMethod(entityClass, targetMethodName);
        if (method == null) {
            final var methodOptional = Arrays.stream(entityClass.getMethods()).filter(m -> m.getName().equals(targetMethodName)).findFirst();

            if (methodOptional.isEmpty()) {
                throw new RuntimeException("Failed to find method '" + targetMethodName + "' in class '" + entityClass + "'");
            }

            method = methodOptional.get();
            putMethodToCache(entityClass, targetMethodName, method);
        }

        return method;
    }

    private static Method findCachedMethod(final Class<?> cls, final String methodName) {
        if (cachedMethods.containsKey(cls)) {
            final var methodMap = cachedMethods.get(cls);
            if (methodMap.containsKey(methodName)) {
                return methodMap.get(methodName);
            }
        }
        return null;
    }

    private static void putMethodToCache(final Class<?> cls, final String methodName, final Method method) {
        final var fieldMap = cachedMethods.computeIfAbsent(cls, k -> new HashMap<>());
        fieldMap.put(methodName, method);
    }

    public static String toFirstUpper(final String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
