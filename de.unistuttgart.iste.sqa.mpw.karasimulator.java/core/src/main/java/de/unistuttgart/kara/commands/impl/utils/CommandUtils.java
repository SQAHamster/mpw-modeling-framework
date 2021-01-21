package de.unistuttgart.kara.commands.impl.utils;

import de.unistuttgart.kara.basetypes.Entity;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandUtils {
    /** cache found methods to avoid multiple iteration search for methods */
    private static Map<Class<?>, Map<String, Method>> cachedMethods = new HashMap<>();

    private CommandUtils() {}

    public static Method findSetMethod(Entity entity, String propertyName) {
        return findModifier("set", entity, propertyName);
    }

    public static Method findAddMethod(Entity entity, String propertyName) {
        return findModifier("addTo", entity, propertyName);
    }

    public static Method findRemoveMethod(Entity entity, String propertyName) {
        return findModifier("removeFrom", entity, propertyName);
    }

    private static Method findModifier(String prefix, Entity entity, String propertyName) {
        if (entity == null) {
            throw new NullPointerException("entity must not be null");
        }

        var cls = entity.getClass();
        var targetMethodName = prefix + toFirstUpper(propertyName);

        var method = findCachedMethod(cls, targetMethodName);
        if (method == null) {
            var methodOptional = Arrays.stream(cls.getMethods()).filter(m -> m.getName().equals(targetMethodName)).findFirst();

            if (methodOptional.isEmpty()) {
                throw new RuntimeException("Failed to find method '" + targetMethodName + "' in class '" + cls + "'");
            }

            method = methodOptional.get();
            putMethodToCache(cls, targetMethodName, method);
        }

        return method;
    }

    private static Method findCachedMethod(Class<?> cls, String methodName) {
        if (cachedMethods.containsKey(cls)) {
            var methodMap = cachedMethods.get(cls);
            if (methodMap.containsKey(methodName)) {
                return methodMap.get(methodName);
            }
        }
        return null;
    }

    private static void putMethodToCache(Class<?> cls, String methodName, Method method) {
        var fieldMap = cachedMethods.computeIfAbsent(cls, k -> new HashMap<>());
        fieldMap.put(methodName, method);
    }

    public static String toFirstUpper(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
