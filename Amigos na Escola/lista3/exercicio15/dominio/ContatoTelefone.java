package br.ufes.inf.prog3.lista3.exercicio15.dominio;

/**
 * Contato do tipo telefone.
 *  
 * Parte do exercício 15, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class ContatoTelefone implements Contato {
	/** Nome da pessoa. */
	protected String nome;
	
	/** Telefone da pessoa. */
	protected String telefone;
	
	/** Construtor. */
	public ContatoTelefone(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getNome() */
	@Override
	public String getNome() {
		return nome;
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getContato() */
	@Override
	public String getContato() {
		return telefone;
	}
}
