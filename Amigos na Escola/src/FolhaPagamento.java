
import java.util.*;
public abstract class FolhaPagamento {
    private static double totalFolha = 0;
    public static void somaFolha(ArrayList<Funcionario> funcionarios){
        for(Funcionario fun : funcionarios){
            totalFolha += fun.calcSalario();
            fun.mostrarDados();
            System.out.println("Categoria" + fun.getClass().getName());
        }
    }
    public static void relatorio(ArrayList<Funcionario> funcionarios){
        for(Funcionario fu: funcionarios){
            fu.lerDados();
            fu.calcSalario();
           double salarioLiquido = fu.calcSalario() - (calcIRRF(fu)+ calcINSS(fu));
            fu.mostrarDados();
            System.out.println("O salario liquido do funcionario eh  "+ salarioLiquido);
            System.out.println("A categoria do funcionario eh  "+ fu.getClass().getName());
        }
    }
      public static double calcIRRF(Funcionario f) {
        if (f.calcSalario() > 3000) {
            return f.calcSalario() * 0.275;
        } else if (f.calcSalario() > 1500) {
            return f.calcSalario() * 0.15;
        } else {
            return 0;
        }
    }
    public static double calcINSS(Funcionario f){
        return  f.calcSalario()*0.11;
    }
    
    public static double getTotalFolha(){
        return totalFolha;
    }
    
    public static double getTotalEncargos(){
        return (totalFolha * 0.3378);
    }
        }
    

