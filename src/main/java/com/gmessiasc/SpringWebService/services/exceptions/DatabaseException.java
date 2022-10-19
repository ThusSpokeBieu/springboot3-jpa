package com.gmessiasc.SpringWebService.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -1914323724707056669L;

    public DatabaseException(String msg){
        super(msg);
    }
}
