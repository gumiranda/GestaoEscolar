package br.ufes.inf.prog3.lista3;

import java.io.File;
import java.util.Scanner;

/**
 * Programa que lê valores de vendas em um arquivo e calcula a média de venda por filial, conforme enunciado do
 * exercício 4 da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio04 {
	public static void main(String[] args) throws Exception {
		double valoresVendas[] = new double[4];
		int qtdVendas[] = new int[4];
		
		try (Scanner scanner = new Scanner(new File("exercicio4.csv"))) {
			// Usa ',' ou '\s' (que representa espaços, tabs e quebras de linha) como separadores. 
			scanner.useDelimiter(",|\\s");
			
			// Processa o arquivo até não ter mais linhas.
			while (scanner.hasNextLine()) {
				// Lê o número da filial e o valor da venda.
				int numFilial = scanner.nextInt();
				double valorVenda = scanner.nextDouble();
				
				// Armazena no vetor de vendas e incrementa a quantidade.
				valoresVendas[numFilial - 1] += valorVenda;
				qtdVendas[numFilial - 1]++;
			}
		}
		
		// Imprime a média das vendas de cada filial.
		for (int i = 0; i < valoresVendas.length; i++)
			System.out.printf("Filial %d: %.2f\n", i + 1, calcularMedia(valoresVendas[i], qtdVendas[i]));
	}

	/** Calcula a média de vendas dada a soma dos valores das vendas e a quantidade de vendas. */
	private static double calcularMedia(double valores, int qtd) {
		return qtd == 0 ? 0 : valores / qtd;
	}
}
