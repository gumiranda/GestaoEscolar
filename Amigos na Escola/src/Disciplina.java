import java.io.Serializable;
import java.util.*;
public class Disciplina implements Serializable{
  private  int codigo;
  private  String nome;
  private  int carga_horaria;
    Curso curso;
    Professor professor;
    
    
    public void setCurso(Curso curso){
        this.curso = curso;
    }
    
    public boolean setNome(String nome)
{
 if (nome.length() > 0) {
 this.nome = nome;
 return true;
 }
 else {
 System.out.println("Nome invalido!");
 return false;
 }
}
public boolean setCodigo(int codigo)
{
 if (codigo > 0){
 this.codigo = codigo;
 return true;
 }
 else {
 System.out.println("Codigo inválido!");
 return false;
 }
}

public int getCodigo(){
    return this.codigo;
}

public boolean setCargaHoraria(int carga_horaria)
{
 if (carga_horaria > 0) {
 this.carga_horaria = carga_horaria;
 return true;
 }
 else {
 System.out.println("Carga inválida!");
 return false;
 }
}

    public void lerDados(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o codigo da disciplina:");
        while (true) {
            try {
                codigo = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
       //while(!setCodigo(s.nextInt()));
        
        System.out.println("Digite o nome da disciplina:");
       while(!setNome(s.nextLine()));
        
        System.out.println("Digite a carga horaria da disciplina:");
        while (true) {
            try {
                carga_horaria = s.nextInt();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
        //while(!setCargaHoraria(s.nextInt()));
        
        
}
 public void mostrarDados(){
        System.out.println("Codigo" +this.codigo);
        System.out.println("Nome: " +this.nome);
        System.out.println("Carga horaria:"+this.carga_horaria);
    }
    }