package com.matheusgr.crud;

public class Facade {

	private UsuarioController usuarioController;
	private JogoController jogoController;
	private Menu menu;

	public Facade() {
		this.usuarioController = new UsuarioController();
		this.jogoController = new JogoController();
		this.menu = new Menu();
	}

	public void cadastrarUsuario(int codigo, String nome) {
		usuarioController.cadastrarUsuario(codigo, nome);
	}
	
	public void carregar() {
		this.usuarioController.carregar();
	}

	// Pode ser que dê um erro ao recuperar! se prepare!
	public String recuperarUsuario(int codigo) throws UsuarioNotFound, CodigoInvalidoException {
		String user;
		user = usuarioController.recuperarUsuario(codigo);
		return this.menu.imprimir("recuperando... ", user);
	}
	
	// Não espero que o usuário apague um código que não exista
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

	public void salvarUsuarios() {
		usuarioController.salvar();
	}

	public void carregarUsuarios() {
		usuarioController.carregar();
	}

}