package com.gmessiasc.SpringWebService.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -2713956049149883363L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
