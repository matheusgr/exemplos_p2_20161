package com.matheusgr.guardians;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
//	Exemplo de uso:
//	cadastrar 200 nicolas
//	cadastrar 100 admin
//	grupo 100 veteranos
//	upgrade 100
//	guardians
//	membros veteranos
//	salvar
//
//  ... Depois executar novamente:
//  carregar
//  upgrade 100
//  membros veteranos
//  guardians
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		GuardianController gc = new GuardianController();
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		while (!"sair".equals(linha)) {
			String[] comandoSplit = linha.split(" ");
			String comando = comandoSplit[0];
			switch (comando) {
			case "cadastrar":
				gc.cadastrarGuardian(Integer.parseInt(comandoSplit[1]), comandoSplit[2]);
				break;
			case "upgrade":
				gc.upgradeGuardian(Integer.parseInt(comandoSplit[1]));
				break;
			case "grupo":
				gc.cadastrarNoGrupo(Integer.parseInt(comandoSplit[1]), comandoSplit[2]);
				break;
			case "guardians":
				System.out.println(gc.imprimirGuardians());
				break;
			case "membros":
				System.out.println(gc.imprimirGrupo(comandoSplit[1]));
				break;
			case "salvar":
				gc.salvar();
				break;
			case "carregar":
				gc.carregar();
				break;
			default:
				break;
			}
			linha = sc.nextLine();
		}
		sc.close();
	}
	
}
