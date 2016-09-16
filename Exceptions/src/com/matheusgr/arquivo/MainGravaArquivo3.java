package com.matheusgr.arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class MainGravaArquivo3 {

	public static class Teste implements Serializable {
		private int valor;

		public Teste(int valor) {
			this.valor = valor;
		}

		public int getValor() {
			return this.valor;
		}
	}

	public static void grava() throws IOException {
		OutputStream os = new FileOutputStream(new File("saida.obj"));
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(new Teste(100));		
	}
	
	public static void le() throws IOException, ClassNotFoundException {
		InputStream is = new FileInputStream(new File("saida.obj"));
		ObjectInputStream ois = new ObjectInputStream(is);
		Teste t = (Teste) ois.readObject();
		System.out.println(t.valor);
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		grava();
		//le();
	}

}
