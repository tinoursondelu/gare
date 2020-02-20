package com.gare.gare.travel.persistence.entity;

import com.gare.gare.train.persistance.entity.TrainEntity;
import com.gare.gare.travel_step.persistance.entity.TravelStepEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "travels")
public class TravelEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private TrainEntity train;

    @OneToMany(mappedBy = "travel")
    private List<TravelStepEntity> travelSteps;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TrainEntity getTrain() {
        return train;
    }

    public void setTrain(TrainEntity train) {
        this.train = train;
    }

    public List<TravelStepEntity> getTravelSteps() {
        return travelSteps;
    }

    public void setTravelSteps(List<TravelStepEntity> travelSteps) {
        this.travelSteps = travelSteps;
    }
}
