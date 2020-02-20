package com.gare.gare.station.persistence;


import com.gare.gare.platform.persistence.entity.PlatformEntity;
import com.gare.gare.platform.persistence.repository.PlatformRepository;
import com.gare.gare.train.persistance.entity.TrainEntity;
import com.gare.gare.train.persistance.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/platform")
public class StationController {

    @Autowired
    private TrainRepository repository;

    @GetMapping("/")
    public List<TrainEntity> findAllTrain() {
        List<TrainEntity> trainEntities = new ArrayList<>();
        trainEntities = repository.findAll();
        return trainEntities ;
    }

}
