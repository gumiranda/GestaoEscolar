package br.ufes.inf.prog3.lista3.exercicio14;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Programa que lê dados de pessoas em um arquivo e ordena de diferentes maneiras.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio14 {
	public static void main(String[] args) throws Exception {
		List<Pessoa> lista = new ArrayList<>();

		// Lê do arquivo.
		try (Scanner scanner = new Scanner(new File("pessoas.txt"))) {
			// Utiliza espaços, tabs e "enters" como separadores.
			scanner.useDelimiter("\\n|\\s");
			
			// Lê as pessoas e coloca-as em uma lista.
			while (scanner.hasNext()) {
				Pessoa p = new Pessoa(scanner.next(), scanner.nextInt(), scanner.nextDouble());
				lista.add(p);
			}
		}
		
		// Imprime a lista ordenada de três formas diferentes: padrão (por nome), por idade e por altura.
		Collections.sort(lista);
		System.out.println("\nOrdem padrão:");
		for (Pessoa p : lista) System.out.println(p);
		Collections.sort(lista, new IdadeComparator());
		System.out.println("\nPor idade:");
		for (Pessoa p : lista) System.out.println(p);
		Collections.sort(lista, new AlturaComparator());
		System.out.println("\nPor altura:");
		for (Pessoa p : lista) System.out.println(p);
	}
}

class IdadeComparator implements Comparator<Pessoa> {
	/** @see java.util.Comparator#compare(java.lang.Object, java.lang.Object) */
	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getIdade().compareTo(o2.getIdade());
	}
}

class AlturaComparator implements Comparator<Pessoa> {
	/** @see java.util.Comparator#compare(java.lang.Object, java.lang.Object) */
	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.getAltura().compareTo(o2.getAltura());
	}
}