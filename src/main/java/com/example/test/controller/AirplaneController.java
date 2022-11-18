package com.example.test.controller;

import com.example.test.entity.AirplaneInfo;
import com.example.test.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


/**
 *Контроллер для AirplaneInfo
 */

@RestController
@RequestMapping("/api")
public class AirplaneController {

    @Autowired
    AirplaneService service;


    @PostMapping("/airplane")
    public Object createAirplane(@RequestBody AirplaneInfo airplaneInfo){
        return service.save(airplaneInfo);
    }

    @GetMapping("/airplane")
    List<AirplaneInfo> getAirplanes(){
        return service.getAll();
    }

    @GetMapping("/airplane/{id}")
    Object getTicketsFromId(@PathVariable Long id){
        return service.getFromId(id);
    }
    //@PathVariable("id") , @Valid @RequestBody
    @PutMapping("/airplane/{id}")
    public AirplaneInfo updateAirplane(@PathVariable("id") AirplaneInfo airplaneFromDb, @Valid @RequestBody AirplaneInfo airplaneUpdate){

        return service.update(airplaneFromDb,airplaneUpdate);
    }

    @DeleteMapping("/airplane/{id}")
    public AirplaneInfo deleteAirplane(@PathVariable Long id){
        return service.delete(id);
    }
}
