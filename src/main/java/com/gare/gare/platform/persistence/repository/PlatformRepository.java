package com.gare.gare.platform.persistence.repository;

import com.gare.gare.platform.persistence.entity.PlatformEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlatformRepository  extends CrudRepository<PlatformEntity, Integer> {

    List<PlatformEntity> findAll();

    @Query("SELECT p  FROM PlatformEntity p")
    Optional<PlatformEntity> findById(Integer id);

}
