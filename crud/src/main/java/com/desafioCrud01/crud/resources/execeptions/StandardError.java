package com.desafioCrud01.crud.resources.execeptions;

import java.io.Serializable;
import java.time.Instant;

public class StandardError implements Serializable { //Serializable: Conversao de objetos em bits
	private static final long serialVersionUID = 1L;
	
	private Instant timestap;
	private Integer status;
	private String error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public Instant getTimestap() {
		return timestap;
	}

	public void setTimestap(Instant timestap) {
		this.timestap = timestap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	
}