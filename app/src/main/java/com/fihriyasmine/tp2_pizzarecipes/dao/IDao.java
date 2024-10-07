package com.fihriyasmine.tp2_pizzarecipes.dao;

import com.fihriyasmine.tp2_pizzarecipes.classes.Produits;

import java.util.List;

public interface IDao <T>{
    boolean create(T o);

    boolean create(Produits p);

    boolean update(T o);
    boolean delete(T o);

    boolean delete(Produits o);

    List<T> findAll();
    T findById(int id);
}
