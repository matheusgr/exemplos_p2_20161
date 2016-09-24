package exercicios;
import java.util.Arrays;
import java.util.List;

public class E5_ImprimePosicoesParesLista {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Integer[] numerosArray = {1,2,3,4,5};
		List<Integer> numeros = Arrays.asList(numerosArray);
		processa(sb, numeros, numeros.size() - 1);
		System.out.println(sb.toString());
	}
	
	public static void processa(StringBuilder sb, List<Integer> numeros, int pos) {
		
	}
	
}
