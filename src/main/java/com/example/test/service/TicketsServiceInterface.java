package com.example.test.service;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.TicketsInformation;
import com.example.test.entity.User;
import com.example.test.models.AirplaneUpdateRM;
import com.example.test.models.TicketsUpdateRM;

import java.util.List;

public interface TicketsServiceInterface {
    TicketsInformation save(TicketsUpdateRM ticketsInformation);
    List<TicketsInformation> getAll();
    TicketsInformation getFromId(Long id);
    TicketsInformation delete(Long id);
    TicketsInformation update(TicketsInformation ticketsFromDb, TicketsUpdateRM ticketsUpdate);
}
