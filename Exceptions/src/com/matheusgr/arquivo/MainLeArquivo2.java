package com.matheusgr.arquivo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainLeArquivo2 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(new File("big.txt"));
		BufferedInputStream bis = new BufferedInputStream(is);
		int dado = bis.read();
		StringBuffer valor = new StringBuffer();
		while (dado != -1) {
			valor.append((char) dado);
			dado = bis.read();
		}
		bis.close();
		is.close();
		//System.out.println(valor.toString());
	}
	
}
