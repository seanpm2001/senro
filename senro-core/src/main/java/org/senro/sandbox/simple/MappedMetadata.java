package org.senro.sandbox.simple;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.senro.metadata.Metadata;
import org.senro.metadata.MetadataProvider;

import java.lang.reflect.Method;
import java.util.*;
import java.beans.Introspector;
import java.beans.BeanInfo;

/**
 * Created by <a href="mailto:claudiu.dumitrescu@gmail.com">Claudiu Dumitrescu</a>
 */
public class MappedMetadata implements Metadata {
    private List<MetadataProvider> providers = new ArrayList<MetadataProvider>();

    private Map<String, String > metadataMap = new HashedMap();

    /**
     * Add informations from supplied object to informations map hold by this metadata holder.
     *
     * @param metadataInformations An Object supplied who contains metadata informations.
     */
    public void addMetadata(Object metadataInformations) {
        try {
            Map<String, String> info = BeanUtils.describe(metadataInformations);
            Iterator iterator = info.keySet().iterator();
            while (iterator.hasNext()){
                String key = (String) iterator.next();
                String value = info.get(key);
                if (value.startsWith("class ")){
                    metadataMap.put(key, value.substring(6));
                }else{
                    metadataMap.put(key, value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String  readInformation(String propertyName) {
        return metadataMap.get(propertyName);
    }

    public List<MetadataProvider> getProviders() {
        return providers;
    }

    public Iterable<? extends Method> getMethods() {
        return Collections.EMPTY_LIST;
    }

    public Iterable<? extends Method> getProperties() {
        return Collections.EMPTY_LIST;
    }
}
