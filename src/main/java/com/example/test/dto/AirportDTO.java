package com.example.test.dto;

import com.example.test.entity.TicketsInformation;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class AirportDTO {
    private Long id;

    private String city;

    @JsonIgnore
    private List<TicketsInformation> tickets_informationListFrom;

    @JsonIgnore
    private List<TicketsInformation> tickets_informationListWhere;
}
