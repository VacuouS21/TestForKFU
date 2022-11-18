package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.Privilege;
import com.example.test.entity.TicketsInformation;
import com.example.test.exeptions.ResouceNotFoundException;
import com.example.test.models.PrivilegeUpdateRM;
import com.example.test.repos.PrivilegeRep;
import com.example.test.repos.TicketsRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivilegeService implements PrivilegeServieInterface{
    @Autowired
    PrivilegeRep repository;

    @Override
    public Privilege save(Privilege privilege) {
        return repository.save(privilege);
    }

    @Override
    public List<Privilege> getAll() {
        return repository.findAll();
    }

    @Override
    public Privilege getFromId(Long id) {
        return repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
    }

    @Override
    public Privilege delete(Long id) {
        Privilege privilege = repository.findById(id).orElseThrow(
                () -> new ResouceNotFoundException(id));
        repository.delete(privilege);
        return privilege;
    }

    @Override
    public Privilege update(Privilege privilegeFromDb, Privilege privilegeUpdate) {
        //BeanUtils.copyProperties(privilegeUpdate,privilegeFromDb,"id");
        privilegeUpdate.setId(privilegeFromDb.getId());
        privilegeUpdate.setUsers(privilegeFromDb.getUsers());
        repository.save(privilegeUpdate);
        return privilegeUpdate;
    }


}
