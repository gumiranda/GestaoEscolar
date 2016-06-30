package br.ufes.inf.prog3.lista3.exercicio15.dominio;

import java.io.Serializable;

/**
 * Interface para contatos (telefone, email, etc.) em uma agenda.
 * 
 * Parte do exercício 15, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Contato extends Serializable {
	/** Obtém o nome do contato. */
	String getNome();
	
	/** Obtém a informação de contato. */
	String getContato();
	
	/** Obtém o tipo de contato. */
	String getTipo();
}
