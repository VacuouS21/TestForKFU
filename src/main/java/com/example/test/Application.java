package com.example.test;

import com.example.test.entity.Privilege;
import com.example.test.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
тест контроллеров
тест
*/

@SpringBootApplication
public class Application {
  /*  @Autowired
    AirplaneRep airplane;
    @Autowired
    AirportRep airport;
    @Autowired
    PrivilegeRep privilege;
    @Autowired
    TicketsRep tickets;
    @Autowired
    UserRep user;*/
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
  /*  private void insertData(){
       airplane.insertData();
       airport.insertData();
       privilege.insertData();
       user.insertData();
       tickets.insertData();
    }*/
}

