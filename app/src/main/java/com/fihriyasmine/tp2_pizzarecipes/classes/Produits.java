package com.fihriyasmine.tp2_pizzarecipes.classes;

public class Produits {
    private int id;
    private String nom;
    private int nbringredients;
    private int photo;
    private float duree;
    private String detaisIngred;
    private String description;
    private String preparation;
    private static int comp;

    public Produits(String barbecuedChickenPizza, int nbringredients, int pizza1, String s, String detaisIngred, String description, String preparation){
    }

    public Produits(String nom, int nbringredients, int photo, float duree, String detaisIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbringredients = nbringredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public Produits(String nom, int nbringredients, int photo, float duree) {
        this.id=++comp;
        this.nom = nom;
        this.nbringredients = nbringredients;
        this.photo = photo;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbringredients() {
        return nbringredients;
    }

    public void setNbringredients(int nbringredients) {
        this.nbringredients = nbringredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produits{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbringredients=" + nbringredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
