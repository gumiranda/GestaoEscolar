package br.ufes.inf.prog3.lista3.exercicio15.aplicacao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufes.inf.prog3.lista3.exercicio15.dominio.Contato;
import br.ufes.inf.prog3.lista3.exercicio15.dominio.ContatoEmail;
import br.ufes.inf.prog3.lista3.exercicio15.dominio.ContatoFax;
import br.ufes.inf.prog3.lista3.exercicio15.dominio.ContatoTelefoneCelular;
import br.ufes.inf.prog3.lista3.exercicio15.dominio.ContatoTelefoneComercial;
import br.ufes.inf.prog3.lista3.exercicio15.dominio.ContatoTelefoneResidencial;

/**
 * Aplicação da Agenda.
 * 
 * Parte do exercício 15, da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class AplAgenda {
	/** Nome do arquivo onde os contatos são serializados. */
	private static final String NOME_ARQUIVO = "exercicio15.dat";

	/** Onde são mantidos os contatos. */
	private static List<Contato> contatos = new ArrayList<>();

	/** Adiciona um contato. */
	private static void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	/** Imprime todos os contatos e seus índices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0)
			System.out.println("\tAgenda vazia.");
		else {
			int i = 1;
			for (Contato contato : contatos)
				System.out.println("\t" + (i++) + ": " + contato.getNome() + " (" + contato.getTipo() + ")");
		}
		System.out.println();
	}

	/** Lê do teclado. */
	private static String lerTeclado(Scanner scanner) {
		return scanner.nextLine();
	}

	/** Método main. */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// Verifica se o arquivo de contatos existe e desserializa os objetos.
		File arquivo = new File(NOME_ARQUIVO);
		if (arquivo.exists())
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
				contatos = (List<Contato>) in.readObject();
			}

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bem-vindo à Agenda.\n");
			System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
			System.out.print("\n> ");

			// Lê o comando.
			String comando = lerTeclado(scanner);

			// Continua pedindo comandos até encontrar o comando S, de sair.
			while (!"S".equalsIgnoreCase(comando)) {
				// Comando ?: ajuda.
				if ("?".equals(comando)) {
					System.out.println("\nCOMANDOS DISPONÍVEIS:\n" + " ?: Mostra esta lista de comandos;\n\n" + " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n" + "+TR: Adiciona um telefone residencial;\n" + "+TT: Adiciona um telefone comercial (trabalho);\n" + "+TC: Adiciona um telefone celular;\n" + "+F: Adiciona um fax;\n" + "+E: Adiciona um email.");
				}

				// Comando A: mostrar agenda.
				else if ("A".equalsIgnoreCase(comando)) {
					System.out.println("\nAGENDA:");
					imprimirContatos();
				}

				// Comando C: mostrar contato.
				else if ("C".equalsIgnoreCase(comando)) {
					executarMostrarContato(scanner);
				}

				// Comando +T?: adicionar telefone.
				else if ("+TR".equalsIgnoreCase(comando)) {
					executarAdicionarTelefone(scanner, 'R');
				}
				else if ("+TT".equalsIgnoreCase(comando)) {
					executarAdicionarTelefone(scanner, 'T');
				}
				else if ("+TC".equalsIgnoreCase(comando)) {
					executarAdicionarTelefone(scanner, 'C');
				}

				// Comando +F: adicionar fax.
				else if ("+F".equalsIgnoreCase(comando)) {
					executarAdicionarFax(scanner);
				}

				// Comando +E: adicionar email.
				else if ("+E".equalsIgnoreCase(comando)) {
					executarAdicionarEmail(scanner);
				}

				// Lê o próximo comando.
				System.out.print("\n> ");
				comando = lerTeclado(scanner);
			}
		}

		// Grava os contatos em um arquivo.
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
			out.writeObject(contatos);
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato(Scanner scanner) {
		// Lê o índice.
		System.out.print("\nNúmero: ");
		String indice = lerTeclado(scanner);

		// Verifica se é um número.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice) - 1;

			// Verifica se o índice existe.
			if (i < contatos.size()) {
				// Imprime o contato.
				Contato contato = (Contato) contatos.get(i);
				System.out.println("\nNome: " + contato.getNome() + "\n" + contato.getTipo() + ": " + contato.getContato());
			}

			// Não existe.
			else System.out.println("Agenda não contém item de número " + (i + 1));
		}

		// Não é número.
		else System.out.println("Não é um número.");
	}

	/** Comando +T?: adicionar telefone. */
	public static void executarAdicionarTelefone(Scanner scanner, char tipo) {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Telefone: ");
		String telefone = scanner.nextLine();

		switch (tipo) {
		case 'R':
			adicionarContato(new ContatoTelefoneResidencial(nome, telefone));
			break;
		case 'T':
			adicionarContato(new ContatoTelefoneComercial(nome, telefone));
			break;
		case 'C':
			adicionarContato(new ContatoTelefoneCelular(nome, telefone));
			break;
		}
	}

	/** Comando +F: adicionar fax. */
	public static void executarAdicionarFax(Scanner scanner) {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Fax: ");
		String fax = scanner.nextLine();
		adicionarContato(new ContatoFax(nome, fax));
	}

	/** Comando +E: adicionar email. */
	public static void executarAdicionarEmail(Scanner scanner) {
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Email: ");
		String email = scanner.nextLine();
		adicionarContato(new ContatoEmail(nome, email));
	}
}
