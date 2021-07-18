package com.desafioCrud01.crud.services.exceptions;

public class DatabaseExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DatabaseExecption(String msg) {
		super(msg);
	}
}
