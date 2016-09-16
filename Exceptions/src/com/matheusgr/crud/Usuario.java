package com.matheusgr.crud;

public class Usuario {

	private String nome;
	private int senha;

	public Usuario(String nome) {
		this.nome = nome;
		this.senha = 0;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public int getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "USUARIO: " + this.nome + " / " + this.senha;
	}
	
}
