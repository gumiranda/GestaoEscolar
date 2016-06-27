
import java.io.Serializable;
import java.util.Scanner;
public class Curso implements Serializable{
 private   String codigo;
 private   String nome;
 private   String duracao;
 
 
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
 
 public String getCodigo(){
     return this.codigo;
 }
 
public boolean setCodigo(String codigo)
{
 if (codigo.length() > 0){
 this.codigo = codigo;
 return true;
 }
 else {
 System.out.println("Codigo inválido!");
 return false;
 }
}
public boolean setDuracao(String duracao)
{
 if (duracao.length() > 0) {
 this.duracao = duracao;
 return true;
 }
 else {
 System.out.println("Duracao inválida!");
 return false;
 }
}

    
    public void lerDados(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o codigo do curso:");
       while(!setCodigo(s.nextLine()));
        
        System.out.println("Digite o nome do curso:");
      while(!setNome(s.nextLine()));
        
        System.out.println("Digite a duracao do curso:");
      while(!setDuracao(s.nextLine()));
        
    }
     public void mostrarDados(){
        System.out.println("Nome:" +this.nome);
        System.out.println("codigo: " +this.codigo);
        System.out.println("duracao:"+this.duracao);
    
    }

    int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}