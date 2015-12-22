package org.kaaproject.kaa.server.common.dao.impl;


public interface PluginDao<T> extends SqlDao<T> {

    T findByNameAndVersion(String name, Integer version);

    T findByClassName(String className);
}