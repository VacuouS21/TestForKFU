package com.example.test.controller;

import com.example.test.entity.TicketsInformation;
import com.example.test.models.TicketsUpdateRM;
import com.example.test.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketsController {

    @Autowired
    TicketsService service;

    @PostMapping("/tickets")
    public TicketsInformation createTickets(@RequestBody TicketsUpdateRM tickets){
        return service.save(tickets);
    }

    @GetMapping("/tickets")
    List getTickets(@RequestParam(required = false) Object expand){
        return service.getAll();

        //List<TicketsInformation> entitiesS = ticketsService.getTickets();
        /*if (expand != null) {
            return entitiesS;
        }
        return entitiesS.stream() //создали из листа стирим
                .map(mappingUtils::mapToTicketsDto) //оператором из streamAPI map, использовали для каждого элемента метод mapToProductDto из класса MappingUtils
                .collect(Collectors.toList());*/
    }

    @GetMapping("/tickets/{id}")
    Object getTicketsFromId(@PathVariable Long id, @RequestParam(required = false) Object expand){
       return service.getFromId(id);

    }

    @PutMapping("/tickets/{id}")
    public TicketsInformation updateTickets(@PathVariable("id")TicketsInformation ticketsFromDb , @Valid @RequestBody TicketsUpdateRM ticketsUpdate){
        return  service.update(ticketsFromDb,ticketsUpdate);
    }

    @DeleteMapping("/tickets/{id}")
    public Object deleteTickets(@PathVariable Long id){
        return service.delete(id);
    }
}
