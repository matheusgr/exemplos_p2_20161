package com.matheusgr.crud;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Facade f = new Facade();
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine().trim();
		while (!"sair".equals(linha)) {
			String[] cmd = linha.split(" ");
			switch (cmd[0]) {
			case "c_user":
				f.cadastrarUsuario(Integer.parseInt(cmd[1]), cmd[2]);
				break;
			case "r_user":
				try {
					System.out.println(f.recuperarUsuario(Integer.parseInt(cmd[1])));
				} catch (SistemaException nf) {
					System.out.println(nf.getMessage());
				}
				break;
			case "d_user":
				try {
					f.apagarUsuario(Integer.parseInt(cmd[1]));
				} catch (ApagarInvalidoException aie) {
					System.out.println(aie.getMessage());
				}
				break;
			case "s_user":
				f.salvarUsuarios();
				break;
			case "l_user":
				f.carregarUsuarios();
				break;
			case "c_jogo":
				f.cadastrarJogo(cmd[1], cmd[2]);
				break;
			case "r_jogo":
				System.out.println(f.recuperarTipoJogo(cmd[1]));
				break;
			default:
				break;
			}
			linha = sc.nextLine().trim();
		}
		sc.close();
	}

}
