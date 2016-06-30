package br.ufes.inf.prog3.lista3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Programa que analisa as diferenças entre listas e conjuntos, conforme especificação do exercício 12 da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio12 {
	/** Método principal. */
	public static void main(String[] args) throws Exception {
		// Números a adicionar.
		Integer[] numeros = {2, 5, 3, 9, 2, 4, 3, 8, 5};
		
		// Adiciona os números a uma lista e um conjunto.
		List<Integer> lista = new ArrayList<>();
		Set<Integer> conjunto = new HashSet<>();
		for (int i = 0; i < numeros.length; i++) {
			lista.add(numeros[i]);
			conjunto.add(numeros[i]);
		}
		
		// Imprime o conteúdo das coleções para analisar os resultados.
		System.out.print("Lista:\t\t");
		for (Integer num : lista) System.out.print(num + "; ");
		System.out.println();
		System.out.print("Conjunto:\t");
		for (Integer num : conjunto) System.out.print(num + "; ");
		System.out.println();
	}
}
