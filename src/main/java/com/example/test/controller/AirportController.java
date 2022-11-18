package com.example.test.controller;


import com.example.test.models.AirportUpdateRM;
import com.example.test.entity.Airport;
import com.example.test.repos.AirportRep;
import com.example.test.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AirportController {

    @Autowired
    AirportService service;

    @PostMapping("/airport")
    public Airport createAirport(@RequestBody Airport airport){
        return service.save(airport);
    }

    @GetMapping("/airport")
    List getAirports(){
        return service.getAll();
    }

    @GetMapping("/airport/{id}")
    Object getTicketsFromId(@PathVariable Long id){
        return service.getFromId(id);
    }

    @PutMapping("/airport/{id}")
    public Airport updateAirport(@PathVariable("id") Airport airportFromDb, @Valid @RequestBody Airport airportUpdate){
        return service.update(airportFromDb,airportUpdate);

    }

    @DeleteMapping("/airport/{id}")
    public Airport deleteAirport(@PathVariable Long id){
        return service.delete(id);
    }
}
