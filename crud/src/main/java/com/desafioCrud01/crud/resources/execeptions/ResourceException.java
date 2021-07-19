package com.desafioCrud01.crud.resources.execeptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.desafioCrud01.crud.services.exceptions.DatabaseExecption;
import com.desafioCrud01.crud.services.exceptions.ResourceNotFoundExecption;

@ControllerAdvice
public class ResourceException {

	@ExceptionHandler(ResourceNotFoundExecption.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundExecption e, HttpServletRequest request) {

		StandardError err = new StandardError();

		err.setTimestap(Instant.now());
		err.setStatus(HttpStatus.NOT_FOUND.value());
		err.setError("Recurso não encontrado");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DatabaseExecption.class)
	public ResponseEntity<StandardError> database(DatabaseExecption e, HttpServletRequest request) {
	
		HttpStatus status = HttpStatus.BAD_REQUEST; 
		StandardError err = new StandardError();
		
		err.setTimestap(Instant.now());
		err.setStatus(status.value());
		err.setError("Database exception");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}

}
