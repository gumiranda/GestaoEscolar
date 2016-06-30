package br.ufes.inf.prog3.lista3;

import java.io.File;

/**
 * Programa que lista o conteúdo da raiz do sistema, conforme enunciado do exercício 6 da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio06 {
	public static void main(String[] args) throws Exception {
		// Cria um descritor de arquivo para a raiz.
		File raiz = new File("/");
		
		// Lista os arquivos da raiz.
		System.out.println("Arquivos da raiz: ");
		for (File f : raiz.listFiles()) {
			// Verifica o tipo do arquivo.
			String tipo = f.isDirectory() ? " (diretório)" : (f.isFile() ? " (arquivo)" : " (desconhecido)");
			
			// Imprime.
			System.out.println("- " + f.getName() + tipo);
		}
	}
}
