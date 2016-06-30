package br.ufes.inf.prog3.lista3.exercicio03;

/**
 * Exceção que é lançada quando o usuário tenta sacar ou depositar um valor negativo.
 * 
 * Parte do exercício 3, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ValorNegativoException extends Exception {
	/** Valor que o usuário tentou sacar. */
	private double valor;

	/** Constructor. */
	public ValorNegativoException(double valor) {
		this.valor = valor;
	}
	
	/** @see java.lang.Throwable#toString() */
	@Override
	public String toString() {
		return "Não é possível sacar/depositar valor negativo: " + valor;
	}
}
