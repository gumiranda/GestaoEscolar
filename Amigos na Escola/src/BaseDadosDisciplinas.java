import java.util.*;

public class BaseDadosDisciplinas {
    public static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
     static {
    disciplinas = (ArrayList<Disciplina>)Persist.recuperar("disciplinas.dat");
    if(disciplinas == null){
        disciplinas = new ArrayList<Disciplina>();
    }
}
     public static void recebeArray(ArrayList<Disciplina> listaSalva){
        disciplinas = listaSalva;
        
    }
      public static void cadastrar(Disciplina a){
          disciplinas.add(a);
          boolean r = Persist.gravar(disciplinas,"disciplinas.dat");
      }
    
    public static void adicionar(Disciplina d){
        disciplinas.add(d);
    }
    
    public static void listar(){
        for(Disciplina d: disciplinas){
            d.mostrarDados();
        }
    }
    
    public static Disciplina buscar(int codigo){
        for(Disciplina d: disciplinas){
            if(d.getCodigo() == codigo) {
                return d;
            }
        }
        return null;
    }
    
    public static boolean excluir(int codigo){
        for(Disciplina d: disciplinas){
            if(d.getCodigo() == codigo){
                disciplinas.remove(d);
                return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return disciplinas;
      }
}
