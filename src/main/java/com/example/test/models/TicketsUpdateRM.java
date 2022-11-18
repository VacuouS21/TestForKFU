package com.example.test.models;

import lombok.Data;

import java.util.Date;

@Data
public class TicketsUpdateRM {
    Long airplane;
    Date dataFlight;
    Integer seatNumber;
    Long airportFrom;
    Long airportWhere;
    Integer price;
    Long user;
}
