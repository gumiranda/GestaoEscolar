package br.ufes.inf.prog3.lista3.exercicio13;

import java.util.Map;
import java.util.TreeMap;

/**
 * Classe que implementa um dicionário, ou seja, associação entre termos e significados. Implementada com um mapa da API
 * de Coleções de Java, pois nos permite associar uma chave a um valor, sendo que chaves são únicas.
 * 
 * Parte do exercício 13, da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Dicionario {
	/** O mapa que contém termos e significados. */
	private Map<String, String> termos = new TreeMap<>();
	
	/** Adiciona um termo ao dicionário. */
	public void adicionar(String termo, String significado) {
		termos.put(termo, significado);
	}
	
	/** Procura o significado de um termo. */
	public String consultar(String termo) {
		return termos.get(termo);
	}
	
	/** Lista todos os termos do dicionário em ordem alfabética. */
	public void listar() {
		for (Map.Entry<String, String> entrada : termos.entrySet())
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
	}
}
