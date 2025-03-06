package com.rocketseat.planner.exception;

public class ActivityOutsidePeriodException extends IllegalArgumentException{
    public ActivityOutsidePeriodException(){super("A atividade deve estar entre as datas da viagem!");}
    public ActivityOutsidePeriodException(String message) {
        super(message);
    }
}
