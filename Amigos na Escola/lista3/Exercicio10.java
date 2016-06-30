package br.ufes.inf.prog3.lista3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Programa que imprime a data de um dia no futuro (daqui a X dias), em inglês, conforme especificação do exercício 10
 * da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio10 {
	/** Método principal. */
	public static void main(String[] args) throws Exception {
		// Configura localização como Brasil e cria o formatador.
		Locale.setDefault(Locale.US);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy (EEEE)");

		// Verifica se foi passado ao menos 1 argumento.
		if (args.length < 1) {
			System.out.println("This program must be executed with at least one argument (the number of days).");
			System.exit(1);
		}

		// Obtém o número de dias.
		int dias = Integer.parseInt(args[0]);

		// Joga a data de hoje X dias para frente e obtém a data.
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(System.currentTimeMillis()));
		cal.add(Calendar.DAY_OF_MONTH, dias);
		Date data = cal.getTime();

		// Imprime a data formatada.
		System.out.println(dias + " days from now will be " + df.format(data));
	}
}
