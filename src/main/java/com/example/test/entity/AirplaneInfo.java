package com.example.test.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;


@Entity
    @Data
    @Table(name="airplane_info", schema="public")
   @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public class AirplaneInfo {

      @Id
      @GeneratedValue(generator = "increment")
      @GenericGenerator(name= "increment", strategy= "increment")
        private Long id;

        @Column(name="name_airplane")
        private String nameAirplane;

        @Column(name="seats_count")
        private Integer seatsCount;

        @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "airplane")
    private List<TicketsInformation> tickets_informationList;
}
