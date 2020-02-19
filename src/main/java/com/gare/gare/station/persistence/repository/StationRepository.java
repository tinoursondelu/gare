package com.gare.gare.station.persistence.repository;

import com.gare.gare.station.persistence.entity.StationEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StationRepository  extends CrudRepository<StationEntity, Integer> {

    List<StationEntity> findAll();

    @Query("SELECT s  FROM StationEntity s")
    Optional<StationEntity> findById(Integer id);

}
