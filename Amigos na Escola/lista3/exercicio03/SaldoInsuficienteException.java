package br.ufes.inf.prog3.lista3.exercicio03;

/**
 * Exceção que é lançada quando o usuário tenta sacar mais do que tem de saldo na conta.
 * 
 * Parte do exercício 3, da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SaldoInsuficienteException extends Exception {
	/** Valor que o usuário tentou sacar. */
	private double valor;
	
	/** Saldo da conta. */
	private double saldo;

	/** Constructor. */
	public SaldoInsuficienteException(double valor, double saldo) {
		this.valor = valor;
		this.saldo = saldo;
	}
	
	/** @see java.lang.Throwable#toString() */
	@Override
	public String toString() {
		return "O seu saldo (R$ " + saldo + ") é insuficiente para a quantia que deseja sacar (+ taxa operação): R$ " + valor;
	}
}
