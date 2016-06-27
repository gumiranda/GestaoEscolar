
import java.io.Serializable;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
public class ProjetoPesquisa implements Serializable {
    private int codigo;
    private String nome;
    private String dataInicio;
    private String dataFim;
    Professor professor;
    
   private static ArrayList<Pesquisador> equipe = new ArrayList<Pesquisador>();
   
   public ArrayList<Pesquisador> getArray(){
       return equipe;
   }
   public void setArray(ArrayList<Pesquisador> equipe){
       this.equipe = equipe;
   }
      public void setProfessorResponsavel(Professor professor){
        this.professor = professor;
        
        
    }
    
    public Professor getProfessor(){
        return this.professor;
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

public boolean setDataInicio(String dataInicio)
{
 if (dataInicio.length() > 0) {
 this.dataInicio = dataInicio;
 return true;
 }
 else {
 System.out.println("Data inválida!");
 return false;
 }
}
  public boolean setNome(String nome)
{
 if (nome.length() > 0) {
 this.nome = nome;
 return true;
 }
 else {
 return false;
 }
}
public boolean setDataFim(String dataFim)
{
 if (dataFim.length() > 0) {
 this.dataFim = dataFim;
 return true;
 }
 else {
 System.out.println("Data inválida!");
 return false;
 }
}

 public static void adicionar(Pesquisador a){
        equipe.add(a);
    }
    
    public static void listar(){
        for(Pesquisador a: equipe){
            a.mostrarDados();
        }
    }
    
    public static Pesquisador buscar(String nome){
        for(Pesquisador a: equipe){
            if(a.getNome().equals(nome)){
                return a;
            }
        }
        return null;
}
    public static boolean excluir(String nome){
        for(Pesquisador a: equipe){
            if(a.getNome().equals(nome)){
                equipe.remove(a);
            return true;
            }
        }
        return false;
    }
    
  

    public void lerDados(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o codigo do projeto de Pesquisa:");
       while(!setCodigo(s.nextInt()));
        
        System.out.println("Digite o titulo do projeto:");
       while(!setNome(s.nextLine()));
        
        System.out.println("Digite a data de inicio do projeto:");
        while(!setDataInicio(s.nextLine()));
        System.out.println("Digite a data de fim do projeto:");
        while(!setDataFim(s.nextLine()));
        
        
}
 public void mostrarDadoss(){
        System.out.println("Codigo " +this.codigo);
        System.out.println("Nome: " +this.nome);
        System.out.println("Professor responsavel "+professor.getNome());
        System.out.println("Data Inicio:"+this.dataInicio);
        System.out.println("Data fim:"+this.dataFim);
        System.out.println("Equipe do projeto: " );
          for (Pesquisador p : equipe )
          {
             System.out.println("Nome do "+p.getTipo()+" : " +p.getNome());
              //ou se quiser mostrar todos os dados, basta colocar p.listar();
          }           
        
   
    }
}
