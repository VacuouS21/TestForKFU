package com.example.test.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException {
    public ResouceNotFoundException(Long message) {
        super("Tickets not found id " + message);
    }
}
