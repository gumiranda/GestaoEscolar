import java.io.Serializable;
import java.util.Scanner;
public abstract class  Funcionario extends Pessoa implements Serializable{
  
    private String nome;
  private  String telefone;
  private  String endereco;
 private   String ctps;
 private   double salario;
 private static double pisoSalarial;

public abstract double calcSalario();

public String getNome(){
    return this.nome;
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
    public boolean setTelefone(String telefone)
{
 if (telefone.length() > 0) {
 this.telefone = telefone;
 return true;
 }
 else {
 System.out.println("Telefone invalido!");
 return false;
 }
}
public boolean setEndereco(String endereco)
{
 if (endereco.length() > 0){
 this.endereco = endereco;
 return true;
 }
 else {
 System.out.println("Endereço inválido!");
 return false;
 }
}

public static boolean setPisoSalarial(double pisoSalarial){
    if(pisoSalarial > 0){
        Funcionario.pisoSalarial = pisoSalarial;
        return true;
    }
    else{
        System.out.println("Valor inválido!");
 return false;
    }
    }

public static double getPisoSalarial(){
    return Funcionario.pisoSalarial;
}

public boolean setCtps(String ctps)
{
 if (ctps.length() > 0) {
 this.ctps = ctps;
 return true;
 }
 else {
 System.out.println("Dado inválido!");
 return false;
 }
}

    public void lerDados(){
        Scanner s = new Scanner (System.in);
        super.lerDados();
        
      System.out.println("Digite o telefone do funcionario:");
       while(!setTelefone(s.nextLine()));
        
        System.out.println("Digite o endereco do funcionario:");
        while(!setEndereco(s.nextLine()));
        
        System.out.println("Digite a ctps do funcionario:");
       while(!setCtps(s.nextLine()));
        
    }
    
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Endereco: " +this.endereco);
        System.out.println("Telefone:"+this.telefone);
        System.out.println("Ctps:" +this.ctps);
    }

   public double getSalario() {
        return this.salario;
    }
}