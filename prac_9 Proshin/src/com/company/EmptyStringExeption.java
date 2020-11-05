package com.company;

public class EmptyStringExeption extends RuntimeException {

    public EmptyStringExeption(String errorMessage, Throwable err) {
        super(errorMessage,err);
    }

}
