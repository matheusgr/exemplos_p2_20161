package com.matheusgr.crud;

import java.util.HashMap;
import java.util.Map;

public class JogoController {

	Map<String, Jogo> jogos = new HashMap<>();
	
	public void cadastrarJogo(String nome, String tipo) {
		Jogo jogo = new Jogo(nome, JogoTipo.valueOf(tipo));
		jogos.put(nome, jogo);
	}

	public String recuperarJogo(String nome) {
		return jogos.get(jogos).toString();
	}

}
