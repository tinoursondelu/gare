package com.gare.gare.train.persistance.entity;

import com.gare.gare.wagon.persistance.entity.WagonEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trains")
public class TrainEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "train")
    private List<WagonEntity> wagons = new ArrayList<>();

    private String reference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<WagonEntity> getWagons() {
        return wagons;
    }

    public void setWagons(List<WagonEntity> wagons) {
        this.wagons = wagons;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
