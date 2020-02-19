package com.gare.gare.travel.persistence.entity;

import com.gare.gare.travel_step.persistance.entity.TravelStepEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TravelEntity {

    @Column(name = "train_id")
    private int train;

    //TODO Injin add TravelStep
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "train_id")
    private List<TravelStepEntity> travelSteps;

    public int getTrain() {
        return train;
    }

    public void setTrain(int train) {
        this.train = train;
    }

}
