package com.matheusgr.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainLeArquivo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		leArquivo();
	}

	private static void leArquivo() throws FileNotFoundException, IOException {
		InputStream is = new FileInputStream(new File("big.txt"));
		int dado = is.read();
		StringBuffer valor = new StringBuffer();
		while (dado != -1) {
			valor.append((char) dado);
			dado = is.read();
		}
		is.close();
		//System.out.println(valor.toString());
	}
	
}
