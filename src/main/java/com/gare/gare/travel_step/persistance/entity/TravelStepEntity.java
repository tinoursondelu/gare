package com.gare.gare.travel_step.persistance.entity;

import com.gare.gare.platform.persistence.entity.PlatformEntity;
import com.gare.gare.travel.persistence.entity.TravelEntity;

import javax.persistence.*;

@Entity
@Table(name = "travelsteps")
public class TravelStepEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "travel_id")
    private TravelEntity travel;

    private String date;

    @ManyToOne
    @JoinColumn(name ="platform_id" )
   private PlatformEntity platform;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TravelEntity getTravel() {
        return travel;
    }

    public void setTravel(TravelEntity travel) {
        this.travel = travel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}