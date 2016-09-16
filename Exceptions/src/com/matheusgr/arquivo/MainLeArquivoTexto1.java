package com.matheusgr.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainLeArquivoTexto1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(new File("big.txt"));
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		// ...
		br.close();
	}
	
}
