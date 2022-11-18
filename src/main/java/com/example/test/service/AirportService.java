package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.Airport;
import com.example.test.exeptions.ResouceNotFoundException;
import com.example.test.models.AirportUpdateRM;
import com.example.test.repos.AirplaneRep;
import com.example.test.repos.AirportRep;
import com.example.test.repos.TicketsRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService implements AirportServiceInterface {
    @Autowired
    AirportRep repository;

    @Override
    public Airport save(Airport airport) {
        return repository.save(airport);
    }

    @Override
    public List<Airport> getAll() {
        return repository.findAll();
    }

    @Override
    public Airport getFromId(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
    }

    @Override
    public Airport delete(Long id) {
        Airport airport=repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
        repository.delete(airport);
        return airport;
    }

    @Override
    public Airport update(Airport airportFromBdb, Airport airportUpdate) {
        //BeanUtils.copyProperties(airportFromBdb,airportUpdate,"id");
        airportUpdate.setId(airportFromBdb.getId());
        airportUpdate.setTicketsInformationListFrom(airportFromBdb.getTicketsInformationListFrom());
        airportUpdate.setTicketsInformationListWhere(airportFromBdb.getTicketsInformationListWhere());
        repository.save(airportUpdate);
        return airportUpdate;
    }


}
