package solucao;

public class E1_Fatorial {

	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}

	private static int fatorial(int i) {
		// "Caso base" ou "Condição de parada":
		if (i == 1) { 
			return 1;
		}
		int res = i * fatorial(i - 1);
		return res;
	}
	
}
