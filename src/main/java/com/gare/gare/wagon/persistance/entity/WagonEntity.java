package com.gare.gare.wagon.persistance.entity;

import com.gare.gare.train.persistance.entity.TrainEntity;

import javax.persistence.*;

@Entity
@Table(name = "wagons")
public class WagonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private TrainEntity train;

    private String reference;

}