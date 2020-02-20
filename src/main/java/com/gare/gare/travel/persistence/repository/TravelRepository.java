package com.gare.gare.travel.persistence.repository;

import com.gare.gare.travel.persistence.entity.TravelEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TravelRepository  extends CrudRepository<TravelEntity, Integer> {

    List<TravelEntity> findAll();

    @Query("SELECT t  FROM TravelEntity t")
    Optional<TravelEntity> findByTrain(Integer train);

    @Query("SELECT t  FROM TravelEntity t JOIN FETCH t.travelSteps ts WHERE t.id = :id")
    Optional<TravelEntity> findByIdFetchTravelSteps(int id);





}
