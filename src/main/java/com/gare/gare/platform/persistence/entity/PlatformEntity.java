package com.gare.gare.platform.persistence.entity;

import com.gare.gare.station.persistence.entity.StationEntity;
import com.gare.gare.train.persistance.entity.TrainEntity;
import com.gare.gare.travel_step.persistance.entity.TravelStepEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "platforms")
public class PlatformEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "platform_label")
    private String label;

    @ManyToOne(targetEntity = StationEntity.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "station_id", referencedColumnName = "id", nullable = false)
    private StationEntity station;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public StationEntity getStation() {
        return station;
    }

    public void setStation(StationEntity station) {
        this.station = station;
    }
}
