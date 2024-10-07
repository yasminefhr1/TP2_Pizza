package com.fihriyasmine.tp2_pizzarecipes.service;

import com.fihriyasmine.tp2_pizzarecipes.classes.Produits;
import com.fihriyasmine.tp2_pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao <Produits>{

    private List<Produits> list;

    public ProduitService() {
        this.list = new ArrayList<Produits>();
    }

    @Override
    public boolean create(Produits o) {
        return list.add(o);
    }

    @Override
    public boolean update(Produits o) {
        return false;
    }

    @Override
    public boolean delete(Produits o) {
        return list.remove(o);
    }

    @Override
    public List findAll() {
        return list;
    }

    @Override
    public Produits findById(int id) {
        for(Produits p : list){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }
}
