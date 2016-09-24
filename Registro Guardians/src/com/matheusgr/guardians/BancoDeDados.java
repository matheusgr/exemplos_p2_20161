package com.matheusgr.guardians;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class BancoDeDados {

	public void salvarTexto(Map<Integer, Guardian> guardians, Map<String, Set<Guardian>> gruposGuardians) throws IOException {
		FileWriter fw = new FileWriter("guardians.dat");
		BufferedWriter bw = new BufferedWriter(fw);
		for (Entry<Integer, Guardian> guardianKV : guardians.entrySet()) {
			int codigo = guardianKV.getKey();
			Guardian guardian = guardianKV.getValue();
			bw.write(codigo + " " + guardian.getNivel() + " " + guardian.getNome());
			bw.newLine();
		}
		bw.close();
	}

	public Map<Integer, Guardian> carregarGuardiansTexto() throws IOException {
		FileReader fr = new FileReader("guardians.dat");
		BufferedReader br = new BufferedReader(fr);
		Map<Integer, Guardian> resultado = new HashMap<>();
		while (br.ready()) {
			String linha = br.readLine().trim();
			if (!"".equals(linha)) {
				String[] parametros = linha.split(" ");
				int codigo = Integer.parseInt(parametros[0]);
				int nivel = Integer.parseInt(parametros[1]);
				String nome = parametros[2];
				Guardian g = new Guardian(codigo, nome);
				g.setNivel(nivel);
				resultado.put(codigo, g);
			}
		}
		br.close();
		return resultado;
	}

	public Map<String, Set<Guardian>> carregarGruposTexto() {
		// TODO Auto-generated method stub
		return null;
	}

	public void salvar(Map<Integer, Guardian> guardians, Map<String, Set<Guardian>> gruposGuardians) throws IOException {
		FileOutputStream fos = new FileOutputStream("guardians-oo.dat");
		GZIPOutputStream gzos = new GZIPOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(gzos);
		oos.writeObject(guardians);
		oos.close();
		fos = new FileOutputStream("guardians-grupos.dat");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(gruposGuardians);
		oos.close();
	}

	@SuppressWarnings("unchecked")
	public Map<Integer, Guardian> carregarGuardians() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("guardians-oo.dat");
		GZIPInputStream gzis = new GZIPInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(gzis);
		Object o = ois.readObject();
		ois.close();
		return (Map<Integer, Guardian>) o;
	}

	public Map<String, Set<Guardian>> carregarGrupos(Map<Integer, Guardian> guardians) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("guardians-grupos.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		Map<String, Set<Guardian>> grupos =(Map<String, Set<Guardian>>) ois.readObject();
		for (Entry<String, Set<Guardian>> gKV : grupos.entrySet()) {
			String nomeGrupo = gKV.getKey();
			HashSet<Guardian> res = new HashSet<>();
			for (Guardian guardian : gKV.getValue()) {
				res.add(guardians.get(guardian.getCodigo()));
			}
			grupos.put(nomeGrupo, res);
		}
		ois.close();
		return grupos;
	}

}
