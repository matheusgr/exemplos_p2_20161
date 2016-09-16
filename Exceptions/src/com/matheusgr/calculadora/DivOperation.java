package com.matheusgr.calculadora;

public class DivOperation implements Operation {

	@Override
	public Double operacao(Double arg1, Double arg2) {
		if (arg2 == 0.0) {
			throw new DivException("Divisão por zero");
		}
		return arg1 / arg2;
	}

}
