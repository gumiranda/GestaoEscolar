package br.ufes.inf.prog3.lista3.exercicio15.dominio;

/**
 * Contato do tipo telefone celular.
 *  
 * Parte do exercício 15, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ContatoTelefoneCelular extends ContatoTelefone {
	/** Construtor. */
	public ContatoTelefoneCelular(String nome, String telefone) {
		super(nome, telefone);
	}

	/** @see br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato#getTipo() */
	@Override
	public String getTipo() {
		return "Celular";
	}
}
