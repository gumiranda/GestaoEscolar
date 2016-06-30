package br.ufes.inf.prog3.lista3;

/**
 * Programa que trata uma exceção de índice de vetor fora dos limites, conforme enunciado do exercício 1 da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio01 {
	public static void main(String[] args) {
		int[] vetor = new int[] { 2, 4, 6, 8, 10, 12 };
		try {
			for (int i = 0; i <= 12; i++) {
				System.out.println(vetor[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("O vetor acabou!");
		}
	}
}
