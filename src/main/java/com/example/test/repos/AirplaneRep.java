package com.example.test.repos;

import com.example.test.entity.AirplaneInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AirplaneRep extends JpaRepository<AirplaneInfo,Long> {
    public final static String INSERT_DATA = "INSERT INTO airplane_info VALUES (0,'Ту-204',150);\n" +
            "INSERT INTO airplane_info VALUES (1,'МС-21',128);\n" +
            "INSERT INTO airplane_info VALUES (2,'Superjet 100',170);\n" +
            "INSERT INTO airplane_info VALUES (3,'Boeing 777',228);\n" +
            "INSERT INTO airplane_info VALUES (4,'Ан-225',98);";

    @Query(value = INSERT_DATA, nativeQuery = true)
    void insertData();
}
