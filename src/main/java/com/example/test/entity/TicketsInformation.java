package com.example.test.entity;


import com.example.test.entity.User;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
    @Getter
    @Setter
    @ToString(exclude = "users")
    @Table(name="tickets_Information", schema="public")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public class TicketsInformation {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
        private Long id;


        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "airplane")
        private AirplaneInfo airplane;

        @Column(name="data_flight")
        private Date dataFlight;

        @Column(name = "seat_number")
        private Integer seatNumber;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "from_air")
        private Airport airportFrom;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "where_air")
        private Airport airportWhere;

        @Column(name="price")
        private Integer price;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "users_id")
        private User myUser;

    }