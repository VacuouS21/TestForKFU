package com.example.test.service;

import com.example.test.entity.*;
import com.example.test.exeptions.ResouceNotFoundException;
import com.example.test.models.TicketsUpdateRM;
import com.example.test.models.UserUpdateRM;
import com.example.test.repos.AirplaneRep;
import com.example.test.repos.AirportRep;
import com.example.test.repos.TicketsRep;
import com.example.test.repos.UserRep;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

    @Service
    public class TicketsService implements TicketsServiceInterface{

        @Autowired
        TicketsRep repository;

        @Autowired
        UserRep userRep;

        @Autowired
        AirplaneRep airplaneRep;

        @Autowired
        AirportRep airportRep;

        @Override
        public TicketsInformation save(TicketsUpdateRM ticketsUpdate) {
            TicketsInformation tickets=mappingTickets(null,ticketsUpdate);
            return repository.save(tickets);
        }

        @Override
        public List<TicketsInformation> getAll() {
            return repository.findAll();
        }

        @Override
        public TicketsInformation getFromId(Long id)
        {
            return repository.findById(id).orElseThrow(
                    () -> new ResouceNotFoundException(id));
        }

        @Override
        public TicketsInformation delete(Long id) {
            TicketsInformation tickets=repository.findById(id).orElseThrow(
                    () -> new ResouceNotFoundException(id));
            repository.delete(tickets);
            return tickets;
        }

        @Override
        public TicketsInformation update(TicketsInformation ticketsFromDb, TicketsUpdateRM ticketsUpdate) {
           // BeanUtils.copyProperties(ticketsUpdate,ticketsFromDb,"id");
            TicketsInformation tickets=mappingTickets(ticketsFromDb.getId(),ticketsUpdate);
            repository.save(tickets);
            return tickets;
        }
        private TicketsInformation mappingTickets(Long id,TicketsUpdateRM ticketsNew){
            AirplaneInfo airplaneInfo=airplaneRep.findById(ticketsNew.getAirplane()).orElseThrow(
                    () -> new ResouceNotFoundException(ticketsNew.getAirplane()));
            Airport airportFrom=airportRep.findById(ticketsNew.getAirportFrom()).orElseThrow(
                    () -> new ResouceNotFoundException(ticketsNew.getAirportFrom()));
            Airport airportWhere=airportRep.findById(ticketsNew.getAirportWhere()).orElseThrow(
                    () -> new ResouceNotFoundException(ticketsNew.getAirportWhere()));
            User user = userRep.findById(ticketsNew.getUser()).orElseThrow(
                    () -> new ResouceNotFoundException(ticketsNew.getUser()));
          TicketsInformation tickets=new TicketsInformation();
          tickets.setId(id);
          tickets.setAirplane(airplaneInfo);
          tickets.setAirportFrom(airportFrom);
          tickets.setAirportWhere(airportWhere);
          tickets.setDataFlight(ticketsNew.getDataFlight());
          tickets.setMyUser(user);
          tickets.setPrice(ticketsNew.getPrice());
          tickets.setSeatNumber(ticketsNew.getSeatNumber());
       /* privilege.addUser(user);
        privilegeRep.save(privilege);*/
            return tickets;
        }
    }