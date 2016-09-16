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

	public String recuperarUsuario(int codigo) throws CodigoInvalidoException, UsuarioNotFound {
		if (codigo < 0) {
			throw new CodigoInvalidoException("Codigo menor que zero");
		}
		try {
			return usuarios.get(codigo).toString();
		} catch (NullPointerException ne) {
			throw new UsuarioNotFound(ne, "Usuario n existe");
		}
	}

	public void apagarUsuario(int codigo) {
		if (!this.usuarios.containsKey(codigo)) {
			throw new ApagarInvalidoException("Codigo inexistente");
		}
		this.usuarios.remove(codigo);
	}

	public void carregar() {
		this.bancoDeDados.carregar("usuarios.txt");
	}

	public void salvar() {
		this.bancoDeDados.salvar("usuarios.txt", usuarios);
	}

}
