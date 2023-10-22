package com.example.tnb.entity;

import jakarta.persistence.*;

@Entity
public class Taxe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean pay;

    @ManyToOne
    @JoinColumn(name = "taux_id")
    private Taux taux;

    @ManyToOne
    @JoinColumn(name = "terrain_id")
    private Terrain terrain;



    private Double cost;
    public Taxe() {
    }

    public Taxe(boolean pay, Taux taux, Terrain terrain, Double cost) {
        this.pay = pay;
        this.taux = taux;
        this.terrain = terrain;
        this.cost= cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPay() {
        return pay;
    }

    public void setPay(boolean pay) {
        this.pay = pay;
    }

    public Taux getTaux() {
        return taux;
    }

    public void setTaux(Taux taux) {
        this.taux = taux;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        cost = cost;
    }
    @Override
    public String toString() {
        return "Taxe{" +
                "id=" + id +
                ", pay=" + pay +
                ", taux=" + taux +
                ", terrain=" + terrain +
                '}';
    }
}
