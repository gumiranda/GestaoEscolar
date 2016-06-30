package br.ufes.inf.prog3.lista3.exercicio03;

/**
 * Classe que representa uma conta-corrente especial.
 * 
 * Parte do exercício 3, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ContaCorrenteEspecial extends ContaCorrente {
	/** @see br.ufes.inf.prog3.lista2.exercicio01.ContaCorrente#getTaxaOperacao() */
	protected double getTaxaOperacao() {
		return 0.01;
	}
}
