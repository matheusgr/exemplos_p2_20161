package solucao;
import java.io.File;

public class E3_ProcessaDiretorio {

	static void process(File arquivo) {
		if (!arquivo.isDirectory()) {
			System.out.println(arquivo.getName());
		} else {
			System.out.println("D: " + arquivo.getName());
			for (File conteudo : arquivo.listFiles()) {
				process(conteudo);
			}
		}
	}
	
	public static void main(String[] args) {
		process(new File("."));
	}
	
}
