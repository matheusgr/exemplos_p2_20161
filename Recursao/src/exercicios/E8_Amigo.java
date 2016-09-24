package exercicios;
import java.util.HashMap;
import java.util.Scanner;

public class E8_Amigo {

	private E8_Amigo bff;

	private String nome;
	
	public E8_Amigo(String nome) {
		super();
		this.nome = nome;
	}

	public E8_Amigo getBff() {
		return bff;
	}

	public void setBff(E8_Amigo bff) {
		this.bff = bff;
	}
	
	/*
	 * Imprimir uma sequencia de BFFs.
	 * 
	 * Bônus: Como fazer para tratar um ciclo? :O
	 */
	public String imprimeBest() {
		return nome;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		HashMap<String, E8_Amigo> amigos = new HashMap<>();
		while (!"sair".equals(linha)) {
			String[] amigoArgs = linha.split(" ");
			String cmd = amigoArgs[0];
			String nome;
			switch (cmd) {
			case "l":
				if (amigoArgs.length == 1) {
					System.out.println(amigos.keySet());
				} else if (amigoArgs.length == 2) {
					nome = amigoArgs[1];
					System.out.println(amigos.get(nome).imprimeBest());					
				}
				break;
			case "c":
				nome = amigoArgs[1];
				E8_Amigo amigo = new E8_Amigo(nome);
				amigos.put(nome, amigo);
				break;
			case "u":
				nome = amigoArgs[1];
				String nomeBff = amigoArgs[2];
				amigos.get(nome).setBff(amigos.get(nomeBff));
				break;
			default:
				break;
			}
			linha = sc.nextLine();
		}
		sc.close();
	}
	
}