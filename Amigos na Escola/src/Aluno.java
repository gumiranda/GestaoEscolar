

import java.util.Scanner;
import java.io.*;
public class Aluno extends Pessoa implements Pesquisador,Serializable{

    private String matricula;
    private char c;
    private byte situacao;
    Curso curso;

    public String getTipo(){
    return this.getClass().getName();
} 
    
   public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getCurso(){
        return this.curso;
    }
    public String getMatricula(){
        return this.matricula;
    }
    
    public boolean setC(char c) {
        this.c = c;
        switch (c) {
            case 'M':
                this.situacao = 1;
                return true;
                
            case 'T':
                this.situacao = 2;
                return true;
                
            case 'D':
                this.situacao = 3;
                return true;
                
            default:
                System.out.println("Digite um estado de aluno valido, M para matriculado, T para trancado e D para desligado");
                return false;
                
        }
    }

    public boolean setMatricula(String matricula) {
        if (matricula.length() > 0) {
            this.matricula = matricula;
            return true;
        } else {
            System.out.println("Matricula invalida!");
            return false;
        }
    }

    

    public void lerDados() {
        Scanner s = new Scanner(System.in);
        super.lerDados();

        System.out.println("Digite a matricula do aluno:");
        while (!setMatricula(s.nextLine()));
        System.out.println("Digite a situacao do aluno, M para matriculado,T para trancado e D para desligado");
        while (!setC(s.next().charAt(0)));

    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Matricula:" + this.matricula); 
        System.out.println("Tipo de pesquisador"+this.getTipo());
        switch (situacao) {
            case 1:
                System.out.println("Situacao : Matriculado");
                break;
            case 2:
                System.out.println("A matricula do aluno esta trancada");
                break;
            case 3:
                System.out.println("Situacao : Desligado");
                break;
            default:
                System.out.println("-------------------------------");
                break;
        }
    }
}
