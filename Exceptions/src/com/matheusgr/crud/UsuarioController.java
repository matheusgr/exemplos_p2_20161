package com.matheusgr.crud;

import java.util.HashMap;
import java.util.Map;

public class UsuarioController {

	Map<Integer, Usuario> usuarios = new HashMap<>();
	private UsuarioFactory usuarioFactory;
	private BancoDeDados bancoDeDados;
	
	public UsuarioController() {
		this.usuarioFactory = new UsuarioFactory();
		this.bancoDeDados = new BancoDeDados();
	}
	
	public void cadastrarUsuario(int codigo, String nome) {
		Usuario usuario = this.usuarioFactory.criaUsuario(nome);
		usuarios.put(codigo, usuario);
	}

	public String recuperarUsuario(int codigo) {
		return usuarios.get(codigo).toString();
	}

	public void apagarUsuario(int codigo) {
		this.usuarios.remove(codigo);
	}

	public void carregar() {
		this.bancoDeDados.carregar("usuarios.txt");
	}
	
	public void salvar() {
		this.bancoDeDados.salvar("usuarios.txt");
	}

}
