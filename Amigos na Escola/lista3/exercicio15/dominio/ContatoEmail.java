package br.ufes.inf.prog3.lista3.exercicio15.dominio;

/**
 * Contato do tipo telefone.
 *  
 * Parte do exercício 15, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ContatoEmail implements Contato {
	/** Nome da pessoa. */
	protected String nome;
	
	/** Email da pessoa. */
	protected String email;
	
	/** Construtor. */
	public ContatoEmail(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getNome() */
	@Override
	public String getNome() {
		return nome;
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getContato() */
	@Override
	public String getContato() {
		return email;
	}
	
	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getTipo() */
	@Override
	public String getTipo() {
		return "Email";
	}
}
