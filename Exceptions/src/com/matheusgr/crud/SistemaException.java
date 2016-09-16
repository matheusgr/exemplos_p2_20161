package com.matheusgr.crud;

public class SistemaException extends Exception {

	public SistemaException() {
		super();
	}
	
	public SistemaException(Exception e) {
		super(e);
	}

	public SistemaException(String string) {
		super(string);
	}

	public SistemaException(Exception ne, String string) {
		super(string, ne);
	}
	
	@Override
	public String getMessage() {
		return "BOY DEU ERRO " + super.getMessage();
	}

}
