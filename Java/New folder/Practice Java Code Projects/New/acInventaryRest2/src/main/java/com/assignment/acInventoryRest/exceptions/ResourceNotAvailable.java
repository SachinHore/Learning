package com.assignment.acInventoryRest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotAvailable extends RuntimeException{
    public ResourceNotAvailable() {
    }

    public ResourceNotAvailable(String message) {
        super(message);
    }
}
