package com.matheusgr.guardians;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GuardianController {

	private Map<Integer, Guardian> guardians;
	private Map<String, Set<Guardian>> gruposGuardians;
	private BancoDeDados bd;

	public GuardianController() {
		super();
		this.guardians = new HashMap<>();
		this.gruposGuardians = new HashMap<>();
		this.bd = new BancoDeDados();
	}

	public void cadastrarGuardian(int codigo, String nome) {
		guardians.put(codigo, new Guardian(codigo, nome));
	}

	public void cadastrarNoGrupo(int codigo, String grupo) {
		Set<Guardian> grupoSet = gruposGuardians.getOrDefault(grupo, new HashSet<>());
		grupoSet.add(guardians.get(codigo));
		gruposGuardians.put(grupo, grupoSet);
	}

	public String imprimirGrupo(String grupo) {
		StringBuilder sb = new StringBuilder();
		for (Guardian guardian : gruposGuardians.get(grupo)) {
			sb.append(guardian.toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	public String imprimirGuardians() {
		StringBuilder sb = new StringBuilder();
		for (Entry<Integer, Guardian> guardianEntry : guardians.entrySet()) {
			Guardian guardian = guardianEntry.getValue();
			int codigo = guardianEntry.getKey();
			sb.append(codigo + " " + guardian.toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

	public void upgradeGuardian(int codigo) {
		guardians.get(codigo).upgrade();
	}

	public void salvar() throws IOException {
		this.bd.salvar(guardians, gruposGuardians);
	}

	public void carregar() throws IOException, ClassNotFoundException {
		guardians = bd.carregarGuardians();
		gruposGuardians = bd.carregarGrupos(guardians);
	}

}