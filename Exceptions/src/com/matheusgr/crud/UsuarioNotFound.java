package com.matheusgr.crud;

public class UsuarioNotFound extends SistemaException {

	public UsuarioNotFound(NullPointerException ne) {
		super(ne);
	}

	public UsuarioNotFound(NullPointerException ne, String string) {
		super(ne, string);
	}

}
