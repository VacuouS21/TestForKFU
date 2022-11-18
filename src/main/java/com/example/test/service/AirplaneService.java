package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.TicketsInformation;
import com.example.test.exeptions.ResouceNotFoundException;
import com.example.test.models.AirplaneUpdateRM;
import com.example.test.repos.AirplaneRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService implements AirplaneSeviceInterface{
    @Autowired
    AirplaneRep repository;

    @Override
    public AirplaneInfo save(AirplaneInfo airplaneInfo) {
        return repository.save(airplaneInfo);
    }

    @Override
    public List<AirplaneInfo> getAll() {
        return repository.findAll();
    }

    @Override
    public AirplaneInfo getFromId(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
    }

    @Override
    public AirplaneInfo delete(Long id) {
        AirplaneInfo airplane=repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
        repository.delete(airplane);
        return airplane;
    }

    @Override
    public AirplaneInfo update(AirplaneInfo airplaneFromDb, AirplaneInfo airplaneUpdate) {
        //BeanUtils.copyProperties(airplaneUpdate,airplaneFromDb,"id");
        airplaneUpdate.setId(airplaneFromDb.getId());
        airplaneUpdate.setTickets_informationList(airplaneFromDb.getTickets_informationList());
        repository.save(airplaneUpdate);
        return airplaneUpdate;
    }

  }