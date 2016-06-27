import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Professor extends Funcionario implements Pesquisador,Serializable{
   private String titulacao;
  private  String areaPesquisa;
    private double salario;
    private double salarioBase;
    private double valorDedicacaoExclusiva;
    private double retribTitulacao;
    
public String getTipo(){
    return this.getClass().getName();
}
public double getSalario(){
    return this.salario;
}


    
    public double calcSalario(){
     return   this.salario = salarioBase +valorDedicacaoExclusiva + retribTitulacao;
     
    }
    
    public boolean setSalarioBase(double salarioBase)
{
 if (salarioBase > 0) {
 this.salarioBase = salarioBase;
 return true;
 }
 else {
 System.out.println("Salario invalido!");
 return false;
 }
}
    public boolean setValorDedicacaoExclusiva(double valorDedicacaoExclusiva)
{
 if (valorDedicacaoExclusiva > 0) {
 this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
 return true;
 }
 else {
 System.out.println("Valor invalido!");
 return false;
 }
}
    public boolean setRetribTitulacao(double retribTitulacao)
{
 if (retribTitulacao > 0) {
 this.retribTitulacao = retribTitulacao;
 return true;
 }
 else {
 System.out.println("Dado invalido!");
 return false;
 }
}
    public boolean setTitulacao(String titulacao)
{
 if (titulacao.length() > 0) {
 this.titulacao = titulacao;
 return true;
 }
 else {
 System.out.println("Titulacao invalido!");
 return false;
 }
}
public boolean setAreaPesquisa(String areaPesquisa)
{
 if (areaPesquisa.length() > 0){
 this.areaPesquisa = areaPesquisa;
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
        System.out.println("Digite a titulacao do professor:");
        while(!setTitulacao(s.nextLine()));
        
        System.out.println("Digite a area de pesquisa do prof:");
       while(!setAreaPesquisa(s.nextLine()));
   System.out.println("Digite o salario base do professor:");
   while (true) {
            try {
                salarioBase = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
      // while(!setSalarioBase(s.nextDouble()));
       System.out.println("Digite o valor de dedicacao exclusiva do professor:");
       while (true) {
            try {
                valorDedicacaoExclusiva = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
       //while(!setValorDedicacaoExclusiva(s.nextDouble()));
       System.out.println("Digite a retribuicao da titulacao do professor:");
       while (true) {
            try {
                retribTitulacao = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
      // while(!setRetribTitulacao(s.nextDouble()));
    }
     public void mostrarDados(){
        System.out.println("Titulacao:" +this.titulacao);
        System.out.println("Area de pesquisa: " +this.areaPesquisa);
     System.out.println("salario:" +this.calcSalario());
     System.out.println("Tipo de pesquisador  "+this.getTipo());
    }

}
