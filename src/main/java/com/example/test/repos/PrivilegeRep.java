package com.example.test.repos;

import com.example.test.entity.Privilege;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PrivilegeRep extends JpaRepository<Privilege,Long> {
    public final static String INSERT_DATA = "INSERT INTO privilege VALUES (0,15,'Gold');\n" +
            "INSERT INTO privilege VALUES (1,10,'premium');\n" +
            "INSERT INTO privilege VALUES (2,5,'standart+');\n" +
            "INSERT INTO privilege VALUES (3,0,'standart');";

    @Query(value = INSERT_DATA, nativeQuery = true)
    void insertData();
}
