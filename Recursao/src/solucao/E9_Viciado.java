package solucao;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class E9_Viciado {

	private List<String> jogos;
	private List<E9_Viciado> viciados;
	
	public E9_Viciado(List<String> jogos) {
		super();
		this.jogos = jogos;
		this.viciados = new LinkedList<>();;
	}

	public void addViciado(E9_Viciado v) {
		this.viciados.add(v);
	}
	
	public String listaJogos() {
		return recListaJogos().toString();
	}
	
	public HashSet<String> recListaJogos() {
		HashSet<String> res = new HashSet<>(jogos);
		System.out.println(res);
		for (E9_Viciado viciado : viciados) {
			res.addAll(viciado.recListaJogos());
		}
		return res;
	}
	
	public static E9_Viciado criaViciado(String...jogos) {
		List<String> res = new LinkedList<>();
		for (String jogo : jogos) {
			res.add(jogo);
		}
		E9_Viciado v = new E9_Viciado(res);
		return v;
	}
	
	public static void main(String[] args) {
		E9_Viciado v1 = criaViciado("Zelda", "Heroes of the Storm", "GTAV", "Civilization V");
		E9_Viciado v2 = criaViciado("Pokemon Go", "Overwatch", "Warcraft", "Civilization V");		
		E9_Viciado v3 = criaViciado("Porrinha", "Domino");
		E9_Viciado v4 = criaViciado("Ludo", "Gamão");
		E9_Viciado v5 = criaViciado("Ludo", "World of Warcraft", "Half-life 3");
		
		v5.addViciado(v4);
		v4.addViciado(v3);
		v4.addViciado(v2);
		v3.addViciado(v2);
		v2.addViciado(v1);
		System.out.println(v5.listaJogos());
	}
	
}