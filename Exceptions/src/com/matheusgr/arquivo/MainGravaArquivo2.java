package com.matheusgr.arquivo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainGravaArquivo2 {
	
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream(new File("saida.txt"));
		for (Character c : "teste de string".toCharArray()) {
			os.write(c);
		}
		os.close();
	}
	
}
