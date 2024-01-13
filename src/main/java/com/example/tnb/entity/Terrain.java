package com.example.tnb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


public class Terrain {

    private long id;
    private double surface;

    @ManyToOne
    @JoinColumn(name = "redevable_id")
    @Transient
    private Redevable redevable;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    @Transient
    private Categorie categorie;

    @OneToMany(mappedBy = "terrain", fetch = FetchType.EAGER)
    @JsonIgnore
    @Transient
    private List<Taxe> taxes;

    public Terrain() {
    }

    public Terrain(double surface, Redevable redevable, Categorie categorie, List<Taxe> taxes) {
        this.surface = surface;
        this.redevable = redevable;
        this.categorie = categorie;
        this.taxes = taxes;
    }

    public long getId() {
        return id;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Taxe> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Taxe> taxes) {
        this.taxes = taxes;
    }

    @Override
    public String toString() {
        return "Terrain{" +
                "id=" + id +
                ", surface=" + surface +
                ", redevable=" + redevable +
                ", categorie=" + categorie +
                ", taxes=" + taxes +
                '}';
    }
}
