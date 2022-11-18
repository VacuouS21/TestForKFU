package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.models.AirplaneUpdateRM;

import java.util.List;

public interface AirplaneSeviceInterface {
    AirplaneInfo save(AirplaneInfo airplaneInfo);
    List<AirplaneInfo> getAll();
    AirplaneInfo getFromId(Long id);
    AirplaneInfo delete(Long id);
    AirplaneInfo update(AirplaneInfo airplaneFromDb,AirplaneInfo airplaneUpdate);
}
