package com.desafioCrud01.crud.services.exceptions;

public class ResourceNotFoundExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExecption(String msg) {
		super(msg);
	}
}
