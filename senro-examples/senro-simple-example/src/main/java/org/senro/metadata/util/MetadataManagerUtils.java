package org.senro.metadata.util;

import org.apache.commons.lang.ClassUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Author: Claudiu Dumitrescu
 */
public class MetadataManagerUtils {

    public static String getUniqueIdentifier(Class clazz){
        return clazz.getName();
    }
    public static String getUniqueIdentifier(Field field){
        return field.getDeclaringClass().getName()+field.getName();
    }
    public static String getUniqueIdentifier(Method method){
        return method.getDeclaringClass().getName()+method.getName();
    }


}
