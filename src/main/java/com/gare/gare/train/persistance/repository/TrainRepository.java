package com.gare.gare.train.persistance.repository;

import com.gare.gare.train.persistance.entity.TrainEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TrainRepository extends CrudRepository<TrainEntity, Integer> {

    Iterable<TrainEntity> findAll();

    Optional<TrainEntity> findById(int id);

    @Query("SELECT t FROM TrainEntity t LEFT JOIN FETCH t.wagons w WHERE t.id = :id")
    TrainEntity findByIdFetchWagons(int id);

}
