package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.Privilege;
import com.example.test.models.AirplaneUpdateRM;
import com.example.test.models.PrivilegeUpdateRM;

import java.util.List;

public interface PrivilegeServieInterface {
   Privilege save(Privilege privilege);
   List<Privilege> getAll();
   Privilege getFromId(Long id);
   Privilege delete(Long id);
   Privilege update(Privilege privilegeFromDb,Privilege privilegeUpdate);
}
