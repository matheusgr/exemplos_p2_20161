package com.matheusgr.crud;

public class Facade {

	private UsuarioController usuarioController;
	private JogoController jogoController;
	
	private Menu menu;

	public Facade() {
		this.usuarioController = new UsuarioController();
		this.jogoController = new JogoController();
	}

	public void cadastrarUsuario(int codigo, String nome) {
		usuarioController.cadastrarUsuario(codigo, nome);
	}
	
	public void carregar() {
		this.usuarioController.carregar();
	}

	// Pode ser que d� um erro ao recuperar! se prepare!
	public String recuperarUsuario(int codigo) {
		String user = usuarioController.recuperarUsuario(codigo);
		return this.menu.imprimir("recuperando... ", user);
	}
	
	// N�o espero que o usu�rio apague um c�digo que n�o exista
	public void apagarUsuario(int codigo) {
		usuarioController.apagarUsuario(codigo);
	}

	public void cadastrarJogo(String nome, String tipo) {
		jogoController.cadastrarJogo(nome, tipo);
	}

	public String recuperarTipoJogo(String nome) {
		String jogo = jogoController.recuperarJogo(nome);
		return this.menu.imprimir("recuperando... ", jogo);
	}

}