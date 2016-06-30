package br.ufes.inf.prog3.lista3.exercicio14;

/**
 * Classe que representa uma pessoa.
 * 
 * Parte do exercício 14, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Pessoa implements Comparable<Pessoa> {
	/** Nome da pessoa. */
	private String nome;
	
	/** Idade da pessoa. */
	private Integer idade;
	
	/** Altura da pessoa. */
	private Double altura;

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Getter for idade. */
	public Integer getIdade() {
		return idade;
	}

	/** Getter for altura. */
	public Double getAltura() {
		return altura;
	}

	/** Constructor. */
	public Pessoa(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(Pessoa o) {
		// Por padrão, compara por nome.
		return nome.compareTo(o.nome);
	}

	/** @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return nome + "(" + idade + " anos, " + altura + " de altura)";
	}
}
