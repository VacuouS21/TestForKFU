package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.Airport;
import com.example.test.models.AirplaneUpdateRM;
import com.example.test.models.AirportUpdateRM;

import java.util.List;

public interface AirportServiceInterface {
    Airport save(Airport airport);
    List<Airport> getAll();
    Airport getFromId(Long id);
    Airport delete(Long id);
    Airport update(Airport airportFromBdb,Airport airplaneUpdate);
}
