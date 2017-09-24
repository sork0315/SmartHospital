package com.dongyang.hospitalapp.repository;


import com.dongyang.hospitalapp.domain.Response;

import java.util.List;


public interface Repository<T, E> {

    List<T> findAll();

    T findById(final String id) ;

    Response add(final T obj) ;

    Response update(final List<T> list);

    Response update(final T obj);

    Response updateOrAdd(final T obj);

    Response delete(final E id);
}
