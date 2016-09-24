package com.matheusgr.guardians;

import java.io.Serializable;

public class Guardian implements Serializable {

	private static final long serialVersionUID = 2L;

	private String nome;
	
	private int nivel;

	private int codigo;

	public Guardian(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nivel = 1;
	}	
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Guardian: " + this.nome + " " + this.nivel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nivel;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guardian other = (Guardian) obj;
		if (nivel != other.nivel)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public void upgrade() {
		this.nivel++;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public String getNomeLindo() {
		return "!!@~~~~~ /o/ \\o/ \\o\\ " + this.nome;
	}
	
}