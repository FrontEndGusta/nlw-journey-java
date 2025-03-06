package com.rocketseat.planner.exception;

public class TripNotFoundException extends RuntimeException{
    public TripNotFoundException() {
        super("Viagem não encontrada.");
    }

    public TripNotFoundException(String message) {
        super(message);
    }
}
