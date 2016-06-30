package br.ufes.inf.prog3.lista3;

import java.io.IOException;

/**
 * Versão corrigida do código com erros apresentado no exercício 2 da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio02 {
	public static void metodo01() throws ClassNotFoundException {
		Class.forName("ClasseQueNaoExiste");
	}

	public static void metodo02() throws IOException {
		java.io.File.createTempFile("pre", "suf");
	}

	public static void metodo03() throws InstantiationException, IllegalAccessException {
		Integer.class.newInstance();
	}

	public static void main(String[] args) {
		try {
			metodo01();
			metodo02();
			metodo03();
		}
		catch (Exception e) {
			System.out.println("Exceção encontrada: " + e);
		}
	}
}
