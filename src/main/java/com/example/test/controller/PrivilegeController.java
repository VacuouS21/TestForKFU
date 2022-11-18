package com.example.test.controller;

import com.example.test.entity.Privilege;
import com.example.test.entity.TicketsInformation;
import com.example.test.repos.PrivilegeRep;
import com.example.test.service.PrivilegeService;
import com.example.test.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PrivilegeController {

    @Autowired
    PrivilegeService service;

    @GetMapping("/privilege")
    List getPrivilege(){
        return service.getAll();

    }

    @PostMapping("/privilege")
    public Privilege createPrivilege(@RequestBody Privilege privilege){
        return service.save(privilege);
    }

    @GetMapping("/privilege/{id}")
    Object getPrivilegeFromId(@PathVariable Long id, @RequestParam(required = false) Object expand){
        return service.getFromId(id);

    }

    @PutMapping("/privilege/{id}")
    public Privilege updatePrivilege(@PathVariable("id")Privilege privilegeFromDb , @Valid @RequestBody Privilege privilegeUpdate){
        return  service.update(privilegeFromDb,privilegeUpdate);
    }

    @DeleteMapping("/privilege/{id}")
    public Object deletePrivilege(@PathVariable Long id){
        return service.delete(id);
    }
}
