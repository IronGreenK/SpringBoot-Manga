package com.escalab.proyectomanga.service;

import java.util.List;

public interface ICRUD <E>{

    List<E> findAll();

    E findById(int id);

    E save(E e);

    E update(E e);

    boolean delete(int id);
}
