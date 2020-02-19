package com.gare.gare.wagon.persistance.repository;

import com.gare.gare.train.persistance.entity.TrainEntity;
import com.gare.gare.wagon.persistance.entity.WagonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WagonRepository extends CrudRepository<WagonEntity, Integer> {

    Iterable<WagonEntity> findAll();

    Optional<WagonEntity> findById(int id);
}
