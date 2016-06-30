package br.ufes.inf.prog3.lista3.exercicio05;

import java.io.Serializable;

/**
 * Classe que representa um departamento de uma empresa.
 * 
 * Parte do exercício 5, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Empresa implements Serializable {
	private static final int MAXIMO_DEPARTAMENTOS = 10;
	
	/** Nome da empresa. */
	private String nome;
	
	/** CNPJ da empresa. */
	private String cnpj;
	
	/** Departamentos da empresa. */
	private Departamento[] departamentos = new Departamento[MAXIMO_DEPARTAMENTOS];

	/** Próximo índice vazio no vetor de departamentos. */
	private int idxDepartamentos = 0;

	/** Construtor. */
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		System.out.println("Empresa " + nome + " criada.");
	}

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Getter for cnpj. */
	public String getCnpj() {
		return cnpj;
	}

	/** Getter for departamentos. */
	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	
	/** Adiciona um departamento à empresa. */
	public void adicionar(Departamento departamento) {
		// Verifica se já está no limite.
		if (idxDepartamentos >= MAXIMO_DEPARTAMENTOS) {
			System.out.println("Não é possível adicionar o departamento " + departamento.getNome() + " pois a empresa já tem muitos!");
			return;
		}
		
		// Do contrário, adiciona o departamento.
		departamentos[idxDepartamentos++] = departamento;
		System.out.println("Departamento " + departamento.getNome() + " adicionado à empresa " + nome + ".");
	}
	
	/** Dá aumento para todos os funcionários da empresa. */
	public void darAumento(double percentual) {
		for (int i = 0; i < idxDepartamentos; i++)
			departamentos[i].darAumento(percentual);
	}
}
