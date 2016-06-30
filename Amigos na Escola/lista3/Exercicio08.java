package br.ufes.inf.prog3.lista3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Programa que imprime o dia da semana de uma data específica, conforme especificação do exercício 8 da lista 3.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio08 {
	/** Método principal. */
	public static void main(String[] args) throws Exception {
		// Configura localização como Brasil e cria os formatadores.
		Locale.setDefault(new Locale("pt", "BR"));
		DateFormat dfIn = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dfOut = new SimpleDateFormat("EEEE");
		
		// Verifica se foi passado ao menos 1 argumento.
		if (args.length < 1) {
			System.out.println("Este programa deve ser executado com pelo menos 1 argumento (data a ser investigada).");
			System.exit(1);
		}
		
		// Converte a data de String para objeto.
		Date data = dfIn.parse(args[0]);
		
		// Imprime o dia da semana que cai a data.
		System.out.println("A data " + dfIn.format(data) + " cai num(a) " + dfOut.format(data));
	}
}
