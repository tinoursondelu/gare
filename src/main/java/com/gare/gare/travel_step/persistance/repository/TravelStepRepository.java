package com.gare.gare.travel_step.persistance.repository;

import com.gare.gare.travel_step.persistance.entity.TravelStepEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TravelStepRepository extends CrudRepository<TravelStepEntity, Integer> {

    Iterable<TravelStepEntity> findAll();

    Optional<TravelStepEntity> findById(int id);
}

