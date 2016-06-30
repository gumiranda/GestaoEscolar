package br.ufes.inf.prog3.lista3.exercicio13;

import java.util.Scanner;

/**
 * Programa que permite o uso da classe Dicionario, conforme exercício 13 da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio13 {
	public static void main(String[] args) {
		int opcao = 0;
		
		// Cria o dicionário.
		Dicionario dic = new Dicionario();
		
		try (Scanner scanner = new Scanner(System.in)) {
			// Mostra um menu de funções.
			while (opcao != 4) {
				System.out.println("\n1 - Adicionar termo;\n2 - Procurar termo;\n3 - Listar termos;\n4 - Sair\nOpção? ");
				opcao = Integer.parseInt(scanner.nextLine());
				
				// Verifica a opção escolhida e responde.
				String termo, significado;
				switch (opcao) {
				case 1:
					// Adiciona um novo termo.
					System.out.print("Termo: ");
					termo = scanner.nextLine();
					System.out.print("Significado: ");
					significado = scanner.nextLine();
					dic.adicionar(termo, significado);
					break;
					
				case 2:
					// Procura um termo.
					System.out.print("Termo: ");
					termo = scanner.nextLine();
					significado = dic.consultar(termo);
					System.out.println(significado == null ? "Termo não encontrado." : termo + " = " + significado);
					break;
					
				case 3:
					// Lista todos os termos.
					dic.listar();
					break;
				}
			}
		}
	}
}
