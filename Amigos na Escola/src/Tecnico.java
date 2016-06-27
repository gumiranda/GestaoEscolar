import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tecnico extends Funcionario implements Serializable
{
 private String cargo;
private  String departamento;
private double salarioBase;
private double salario;
private double auxTransporte;
private double auxAlimentacao;
private static double valorHoraExtra;

public double calcSalario(){
    return this.salario = salarioBase + auxTransporte + auxAlimentacao;
    
    
}
public double calcSalario(double quantHoras, double valorHora){
    this.salario = calcSalario() + (quantHoras * valorHora);
    return salario;
}

public static double getValorHoraExtra(){
    return Tecnico.valorHoraExtra;
}
    public static boolean setValorHoraExtra(double valorHoraExtra)
{
 if (valorHoraExtra > 0) {
 Tecnico.valorHoraExtra  = valorHoraExtra ;
 return true;
 }
 else {
 System.out.println("Valor invalido!");
 return false;
 }
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
    public boolean setAuxTransporte(double auxTransporte)
{
 if (auxTransporte > 0) {
 this.auxTransporte = auxTransporte;
 return true;
 }
 else {
 System.out.println("Valor invalido!");
 return false;
 }
}
    public boolean setAuxAlimentacao(double auxAlimentacao)
{
 if (auxAlimentacao > 0) {
 this.auxAlimentacao = auxAlimentacao;
 return true;
 }
 else {
 System.out.println("Dado invalido!");
 return false;
 }
}
public boolean setCargo(String cargo)
{
 if (cargo.length() > 0) {
 this.cargo = cargo;
 return true;
 }
 else {
 System.out.println("Cargo invalido!");
 return false;
 }
}
public boolean setDepartamento(String departamento)
{
 if (departamento.length() > 0){
 this.departamento = departamento;
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
        System.out.println("Digite o cargo do tecnico:");
       while(!setCargo(s.nextLine()));
       System.out.println("Digite o salario base do tecnico:");
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
    //   while(!setSalarioBase(s.nextDouble()));
       System.out.println("Digite o auxilio transporte do tecnico:");
       while (true) {
            try {
                auxTransporte = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
      // while(!setAuxTransporte(s.nextDouble()));
       System.out.println("Digite o auxilio alimentacao do tecnico:");
       //while(!setAuxAlimentacao(s.nextDouble()));
       while (true) {
            try {
                auxAlimentacao = s.nextDouble();
                System.out.println("Ok");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro :" + e.toString());
                System.out.println("Digite novamente");
            }
        }
        
        System.out.println("Digite o departamento do tecnico:");
        while(!setDepartamento(s.nextLine()));
        
    
    }
     public void mostrarDados(){
         super.mostrarDados();
        System.out.println("cargo:" +this.cargo);
        System.out.println("departamento: " +this.departamento);
        System.out.println("salario:" +this.salario);
    }
}
