package com.example.test.repos;

import com.example.test.entity.TicketsInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TicketsRep extends JpaRepository<TicketsInformation,Long> {
    public final static String INSERT_DATA = "INSERT INTO tickets_information VALUES (0,now(),100000,5,0,0,1,0);\n" +
            "INSERT INTO tickets_information VALUES (1,now(),70000,15,0,0,1,3);\n" +
            "INSERT INTO tickets_information VALUES (2,now(),50000,20,0,5,7,2);\n" +
            "INSERT INTO tickets_information VALUES (3,now(),40000,100,0,6,3,1);";

    @Query(value = INSERT_DATA, nativeQuery = true)
    void insertData();
}
