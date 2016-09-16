package com.matheusgr.crud;

public class UsuarioFactory {

	public Usuario criaUsuario(String nome) {
		Usuario usuario = new Usuario(nome);
		int senha = Math.abs(nome.hashCode() * 7);
		usuario.setSenha(senha);
		return usuario;
	}
}