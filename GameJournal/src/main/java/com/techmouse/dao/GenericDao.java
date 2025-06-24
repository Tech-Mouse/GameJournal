package com.techmouse.dao;

import java.util.Collection;
import java.util.List;

public interface GenericDao<T> {

    T get(Integer id);

    List<T> getAll();

    void persist(T entity);

    void persist(Collection<T> entities);

    T update(T entity);

    void delete(T entity);

    boolean exists(Integer id);
}
