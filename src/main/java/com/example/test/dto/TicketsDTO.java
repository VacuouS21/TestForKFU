package com.example.test.dto;

import com.example.test.entity.AirplaneInfo;
import com.example.test.entity.Airport;
import com.example.test.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class TicketsDTO {

    private Long id;

    private Long airplane;

    private Date dataFlight;

    private Integer seat_number;

    private Long airportFrom;

    private Long airportWhere;

    private Integer price;

    @JsonIgnore
    private AirplaneInfo airplaneA;
    @JsonIgnore
    private Airport airportFromA;
    @JsonIgnore
    private Airport airportWhereA;
    @JsonIgnore
    private List<User> users;


}
