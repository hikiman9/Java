package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundException;

import java.util.List;

public interface Service<K, V> {
    V add(V v) throws DuplicatedIdException, Exception;
    V modify(V v) throws NotFoundException, Exception;
    Boolean remove(K k) throws NotFoundException, Exception;
    List<V> get() throws Exception;
    V get(K k) throws NotFoundException, Exception;
}
