package br.ufes.inf.prog3.lista3.exercicio03;

/**
 * Classe principal do exercício 1, da lista 2.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio01 {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		// Testa a exceção de valor negativo.
		try {
			conta.depositar(100);
			conta.depositar(-50);
		}
		catch (ValorNegativoException e) {
			System.out.println("Exceção encontrada: " + e);
		}
		
		// Testa a exceção de saldo insuficiente.
		try {
			conta.sacar(70);
			conta.sacar(50);
		}
		catch (ValorNegativoException | SaldoInsuficienteException e) {
			System.out.println("Exceção encontrada: " + e);
		}
		
		System.out.println("Saldo final: R$ " + conta.getSaldo());
	}
}
