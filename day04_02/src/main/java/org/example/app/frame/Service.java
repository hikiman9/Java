package org.example.app.frame;

import java.util.List;

public interface Service<K, V> {
    int add(V v); // public abstract int insert(); ...추상 메소드
    int del(K k);
    int modify(V v);
    V get(K k);
    List<V> get();
}
