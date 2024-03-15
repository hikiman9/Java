package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundException;

import java.util.List;


public interface Repository<K, V> {
    V insert(V v) throws DuplicatedIdException, Exception;
    V update(V v) throws NotFoundException, Exception;
    Boolean delete(K k) throws NotFoundException, Exception;
    List<V> select() throws Exception;
    V select(K k) throws NotFoundException, Exception;
}
