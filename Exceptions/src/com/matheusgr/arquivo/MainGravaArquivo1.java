package com.matheusgr.arquivo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainGravaArquivo1 {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("saida2.txt"));
		fw.write("teste de saida");
		fw.close();
	}
	
}
