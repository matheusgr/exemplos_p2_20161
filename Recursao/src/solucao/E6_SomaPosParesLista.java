package solucao;

public class E6_SomaPosParesLista {

	private static int somaLista(int[] lista, int pos) {
		if (pos < 0) {
			return 0;
		}
		if (pos % 2 != 0) {
			return somaLista(lista, pos - 1);
		} else {
			return lista[pos] + somaLista(lista, pos - 2);
		}
	}

	private static int somaLista(int[] lista) {
		return somaLista(lista, lista.length - 1);
	}

	public static void main(String[] args) {
		int[] is = { 1, 2, 3, 4, 5, 6 };
		System.out.println(somaLista(is));
	}
}