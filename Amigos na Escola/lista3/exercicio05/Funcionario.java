package br.ufes.inf.prog3.lista3.exercicio05;

import java.io.Serializable;

/**
 * Classe que representa um funcionário de uma empresa.
 * 
 * Parte do exercício 5, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Funcionario implements Serializable {
	/** Nome do funcionário. */
	private String nome;
	
	/** Salário do funcionário (nota: em um sistema real, deveríamos usar java.math.BigDecimal no lugar de float/double). */
	private double salario;
	
	/** Data de admissão do funcionário (nota: em um sistema real, usaríamos java.util.Date. */
	private String dataAdmissao;
	
	/** Departamento onde trabalha. */
	private Departamento departamento;
	
	/** Número do funcionário no departamento. */
	private int numero;

	/** Construtor. */
	public Funcionario(String nome, double salario, String dataAdmissao) {
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		System.out.println("Criado funcionário " + nome);
	}

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Getter for salario. */
	public double getSalario() {
		return salario;
	}

	/** Getter for dataAdmissao. */
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	
	/** Setter for departamento. */
	void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	/** Setter for numero. */
	void setNumero(int numero) {
		this.numero = numero;
	}
	
	/** Transfere o funcionário de um departamento para outro. */
	public void transferir(Departamento novoDepartamento) {
		departamento.remover(numero);
		novoDepartamento.adicionar(this);
	}
	
	/** Dá aumento para este funcionário. */
	public void darAumento(double percentual) {
		System.out.print("Funcionário " + nome + " ganhou aumento: de R$ " + salario);
		salario += percentual * salario / 100;
		System.out.println(" para: R$ " + salario);
	}
}
