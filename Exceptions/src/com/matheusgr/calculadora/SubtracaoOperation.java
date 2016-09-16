package com.matheusgr.calculadora;

public class SubtracaoOperation implements Operation {

	@Override
	public Double operacao(Double arg1, Double arg2) {
		return arg1 - arg2;
	}

}
