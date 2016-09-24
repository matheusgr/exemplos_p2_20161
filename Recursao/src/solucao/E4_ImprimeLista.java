package solucao;
public class E4_ImprimeLista {
	
	private static int imprimeLista(int[] lista, int pos) {
		if (pos < 0) {
			return 0;
		}
		System.out.println(lista[pos]);
		imprimeLista(lista, pos - 1);	
		System.out.println(lista[pos]);
		return 0;
	}
	
	private static int imprimeLista(int[] lista) {
		return imprimeLista(lista, lista.length - 1);
	}
	
	public static void main(String[] args) {
		int[] is = {1, 2, 3, 4, 5, 6};
		imprimeLista(is);
	}
}