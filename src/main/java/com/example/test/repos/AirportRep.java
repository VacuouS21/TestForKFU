package com.example.test.repos;

import com.example.test.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AirportRep extends JpaRepository<Airport,Long> {
    public final static String INSERT_DATA = "INSERT INTO airport VALUES (0,'Чебоксары');\n" +
            "INSERT INTO airport VALUES (1,'Москва');\n" +
            "INSERT INTO airport VALUES (2,'Казань');\n" +
            "INSERT INTO airport VALUES (3,'Санкт-Питербург');\n" +
            "INSERT INTO airport VALUES (4,'Волгоград');\n" +
            "INSERT INTO airport VALUES (5,'Новосибирск');\n" +
            "INSERT INTO airport VALUES (6,'Якутск');\n" +
            "INSERT INTO airport VALUES (7,'Депутатск');\n" +
            "INSERT INTO airport VALUES (8,'Саратов');";

    @Query(value = INSERT_DATA, nativeQuery = true)
    void insertData();
}
