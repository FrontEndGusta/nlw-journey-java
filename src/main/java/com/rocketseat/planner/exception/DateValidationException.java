package com.rocketseat.planner.exception;

public class DateValidationException extends IllegalArgumentException{

    public DateValidationException(){super("Data de término não pode ser anterior à data de início.");}

    public DateValidationException(String message) {
        super(message);
    }
}
