package exercicios;

public class E6_SomaPosParesLista {

	private static int somaLista(int[] lista, int pos) {
		return 0;
	}

	private static int somaLista(int[] lista) {
		return somaLista(lista, lista.length - 1);
	}

	public static void main(String[] args) {
		int[] is = { 1, 2, 3, 4, 5, 6 };
		System.out.println(somaLista(is));
	}
}