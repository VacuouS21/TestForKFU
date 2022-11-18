package com.example.test.repos;

import com.example.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRep extends JpaRepository<User,Long> {
    public final static String INSERT_DATA = "INSERT INTO users VALUES (0,'Kulagin KV',0,'vacuous','123');\n" +
            "INSERT INTO users VALUES (1,'Salikhov MA',3, 'mans','123');\n" +
            "INSERT INTO users VALUES (2,'Kalugin VB',2, 'kaluga','123');\n" +
            "INSERT INTO users VALUES (3,'Ivan II',1, 'grozniy','123');";

    @Query(value = INSERT_DATA, nativeQuery = true)
    void insertData();
}
