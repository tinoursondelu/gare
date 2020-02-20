package com.gare.gare.station.persistence.entity;


import com.gare.gare.platform.persistence.entity.PlatformEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stations")
public class StationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "station_name")
    private String stationName;

    @OneToMany(mappedBy = "station")
    private List<PlatformEntity> platforms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

}
