package br.ufes.inf.prog3.lista3;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Programa que converte um valor monetário em Reais para Dólares e Ienes, conforme especificação do exercício 11 da
 * lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio11 {
	/** Método principal. */
	public static void main(String[] args) throws Exception {
		// Verifica se foi passado ao menos 1 argumento.
		if (args.length < 1) {
			System.out.println("Este programa deve ser executado com pelo menos 1 argumento (valor em R$).");
			System.exit(1);
		}

		// Obtém o valor em Reais.
		double valor = Double.parseDouble(args[0]);

		// Converte para dólares e ienes.
		double valorUSD = .45 * valor;
		double valorJPY = 45.25 * valor;
		
		// Cria os formatadores de valor monetário.
		NumberFormat nfBRL = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		NumberFormat nfUSD = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nfJPY = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		
		// Imprime o resultado da conversão.
		System.out.println(nfBRL.format(valor) + " = " + nfUSD.format(valorUSD) + " = " + nfJPY.format(valorJPY));
	}
}
