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
public class Departamento implements Serializable {
	private static final int MAXIMO_FUNCIONARIOS = 100;
	
	/** Nome do departamento. */
	private String nome;
	
	/** Funcionários do departamento. */
	private Funcionario[] funcionarios = new Funcionario[MAXIMO_FUNCIONARIOS];
	
	/** Próximo índice vazio no vetor de funcionários. */
	private int idxFuncionarios = 0;
	
	/** Construtor. */
	public Departamento(String nome) {
		this.nome = nome;
		System.out.println("Departamento " + nome + " criado.");
	}

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Getter for funcionarios. */
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	/** Adiciona um funcionário ao departamento. */
	public void adicionar(Funcionario funcionario) {
		// Verifica se já está no limite.
		if (idxFuncionarios >= MAXIMO_FUNCIONARIOS) {
			System.out.println("Não é possível adicionar o funcionário " + funcionario.getNome() + " pois o departamento já está lotado!");
			return;
		}
		
		// Do contrário, adiciona o funcionário, atribuindo-lhe seu departamento e número.
		funcionarios[idxFuncionarios] = funcionario;
		funcionario.setDepartamento(this);
		funcionario.setNumero(idxFuncionarios++);
		System.out.println("Funcionário " + funcionario.getNome() + " adicionado ao departamento " + nome);
	}
	
	/** Remove um funcionário do departamento. */
	public void remover(int idx) {
		// Verifica se o índice corresponde a um funcionário.
		if ((idx >= MAXIMO_FUNCIONARIOS) || (funcionarios[idx] == null)) {
			System.out.println("O número " + idx + " não corresponde a nenhum funcionário no departamento " + nome);
			return;
		}
		
		// Do contrário, remove o funcionário e ajusta o vetor.
		System.out.println("Funcionário " + funcionarios[idx].getNome() + " removido do departamento " + nome);
		funcionarios[idx] = null;
		idxFuncionarios--;
		Funcionario proximo = funcionarios[++idx];
		
		// Se foi criado um espaço vazio no meio do vetor, desloca os funcionários para trás para ocupá-lo.
		while ((proximo != null) && (idx < MAXIMO_FUNCIONARIOS)) {
			funcionarios[idx - 1] = proximo;
			proximo = funcionarios[++idx];
		}
		funcionarios[idx - 1] = null;
	}
	
	/** Dá aumento para todos os funcionários do departamento. */
	public void darAumento(double percentual) {
		for (int i = 0; i < idxFuncionarios; i++)
			funcionarios[i].darAumento(percentual);
	}
}
