package br.ufes.inf.prog3.lista3.exercicio05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Classe principal do exercício 5, da lista 3.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Exercicio05 {
	public static void main(String[] args) throws Exception {
		File arquivo = parte1();
		parte2(arquivo);
	}
	
	/** Na parte um, a estrutura de objetos é montada e salva em arquivo. */
	private static File parte1() throws Exception {
		Empresa empresa = new Empresa("Prog3 S.A.", "00.000.000/0001-00");
		
		Departamento rh = new Departamento("RH");
		empresa.adicionar(rh);
		
		Departamento ti = new Departamento("TI");
		empresa.adicionar(ti);
		
		Funcionario ana = new Funcionario("Ana", 2500, "01/06/2013");
		rh.adicionar(ana);
		Funcionario bruno = new Funcionario("Bruno", 2500, "02/06/2013");
		rh.adicionar(bruno);
		Funcionario carla = new Funcionario("Carla", 4000, "01/05/2013");
		rh.adicionar(carla);
		
		Funcionario daniel = new Funcionario("Daniel", 4000, "01/05/2013");
		ti.adicionar(daniel);
		Funcionario elisa = new Funcionario("Elisa", 3000, "15/05/2013");
		ti.adicionar(elisa);
		
		// Serializa tudo em disco.
		File arquivo = new File("exercicio05.dat");
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo))) {
			out.writeObject(empresa);
			out.writeObject(ana);
			out.writeObject(ti);
		}
		
		return arquivo;
	}
	
	/** Na parte dois, a estrutura é recuperada do arquivo e as operações são feitas. */
	private static void parte2(File arquivo) throws Exception {
		// Desserializa tudo para continuar.
		Empresa empresa = null;
		Funcionario ana = null;
		Departamento ti = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))) {
			empresa = (Empresa)in.readObject();
			ana = (Funcionario)in.readObject();
			ti = (Departamento)in.readObject();
		}
		
		empresa.darAumento(10);
		
		ana.transferir(ti);
	}
}
