package br.com.guilchaves.ramengo.controller.handler;

import br.com.guilchaves.ramengo.controller.exceptions.InvalidRequestException;
import br.com.guilchaves.ramengo.dto.ErrorResponse;
import br.com.guilchaves.ramengo.security.exceptions.ForbiddenException;
import br.com.guilchaves.ramengo.service.exceptions.InternalServerErrorException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomErrorHandler {

    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ErrorResponse> forbidden(ForbiddenException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.FORBIDDEN;
        ErrorResponse err = new ErrorResponse(e.getMessage());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<ErrorResponse> internalServerError(InternalServerErrorException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ErrorResponse err = new ErrorResponse(e.getMessage());
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<ErrorResponse> invalidRequest(InvalidRequestException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErrorResponse err = new ErrorResponse(e.getMessage());
        return ResponseEntity.status(status).body(err);
    }
}
