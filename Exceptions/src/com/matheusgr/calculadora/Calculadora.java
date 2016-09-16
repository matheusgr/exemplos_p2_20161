package com.matheusgr.calculadora;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Map<String, Operation> operations = criarMapaOperacoes();
		Scanner sc = new Scanner(System.in);
		String comando = sc.nextLine();
		while (!"sair".equals(comando)) {
			String[] calcArgs = comando.split(" ");
			Double doubleArg1 = Double.parseDouble(calcArgs[1]);
			Double doubleArg2 = Double.parseDouble(calcArgs[2]);
			Operation operation = operations.get(calcArgs[0]);
			realizaOperação(doubleArg1, doubleArg2, operation);
			comando = sc.nextLine();
		}
		sc.close();
	}

	private static void realizaOperação(Double doubleArg1, Double doubleArg2, Operation operation) {
		Double resultado;
		resultado = operation.operacao(doubleArg1, doubleArg2);
		System.out.println(resultado);
	}

	private static Map<String, Operation> criarMapaOperacoes() {
		Map<String, Operation> operations = new HashMap<>();
		operations.put("+", new SomaOperation());
		operations.put("-", new SubtracaoOperation());
		operations.put("*", new MultiOperation());
		operations.put("/", new DivOperation());
		return operations;
	}

}
