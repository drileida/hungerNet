package com.drileida.hungerNet.service;

import java.util.List;

public interface CRUDService<T> {
    T save(T obj);

    T findById(Object id);

    List<T> findAll();

    void deleteById (Object id);
}
