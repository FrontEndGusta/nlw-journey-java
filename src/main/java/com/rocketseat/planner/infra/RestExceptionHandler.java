package com.rocketseat.planner.infra;

import com.rocketseat.planner.exception.ActivityOutsidePeriodException;
import com.rocketseat.planner.exception.DateValidationException;
import com.rocketseat.planner.exception.TripNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DateValidationException.class)
    public ResponseEntity<RestErrorMessage> dateValidationHandler(DateValidationException e) {
        RestErrorMessage threatResponse = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(threatResponse);
    }

    @ExceptionHandler(ActivityOutsidePeriodException.class)
    public ResponseEntity<RestErrorMessage> activityOutsidePeriodHandler(ActivityOutsidePeriodException e) {
        RestErrorMessage threatResponse = new RestErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(threatResponse);
    }

    @ExceptionHandler(TripNotFoundException.class)
    public ResponseEntity<RestErrorMessage> tripNotFoundHandler(TripNotFoundException e) {
        RestErrorMessage threatResponse = new RestErrorMessage(HttpStatus.NOT_FOUND, e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(threatResponse);
    }
}

