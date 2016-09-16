package com.matheusgr.crud;

public class Jogo {

	private String nome;
	private JogoTipo tipo;

	public Jogo(String nome, JogoTipo tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public JogoTipo getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "JOGO: " + this.nome + " (" + this.tipo + ")";
	}

}
