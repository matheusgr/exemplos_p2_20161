package exercicios;
public class E4_ImprimeLista {

	/*
	 * Dois exerc�cios aqui. Imprimir:
	 * 1
	 * 2
	 * 3
	 * 4
	 * ...
	 * 
	 * e outro exerc�cio:
	 * 6
	 * 5
	 * 4
	 * 3
	 * ...
	 */
	private static void imprimeLista(int[] lista, int pos) {
		
	}
	
	/*
	 * Use uma fun��o para abstrair alguns par�metros de recurs�o
	 */
	private static void imprimeLista(int[] lista) {
		imprimeLista(lista, lista.length - 1);
	}
	
	public static void main(String[] args) {
		int[] is = {1, 2, 3, 4, 5, 6};
		imprimeLista(is);
	}
}