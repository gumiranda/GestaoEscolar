package br.ufes.inf.prog3.lista3;

import java.io.File;
import java.io.PrintWriter;

/**
 * Programa que escreve palavras em um arquivo, conforme especificação do exercício 7 da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio07 {
	/** Método principal. */
	public static void main(String[] args) throws Exception {
		// Verifica se foi passado ao menos 1 argumentos.
		if (args.length < 1) {
			System.out.println("Este programa deve ser executado com pelo menos 1 argumento (nome do arquivo).");
			System.exit(1);
		}
		
		// Verifica se o arquivo não existe. Neste caso, cria-o.
		File arquivo = new File(args[0]);
		if (! (arquivo.exists() && arquivo.isFile()))
			arquivo.createNewFile();
		
		// Escreve no arquivo a sequência de palavras passada no argumento.
		try (PrintWriter out = new PrintWriter(arquivo)) {
			for (int i = 1; i < args.length; i++) out.println(args[i]);
		}
		
		System.out.println("OK!");
	}
}
