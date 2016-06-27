
import java.util.ArrayList;


public class BaseDadosProfessores {
  public static ArrayList<Professor> professores = new ArrayList<Professor>();

   static {
    professores = (ArrayList<Professor>)Persist.recuperar("professores.dat");
    if(professores == null){
        professores = new ArrayList<Professor>();
    }
}
   public static void recebeArray(ArrayList<Professor> listaSalva){
        professores = listaSalva;
        
    }
      public static void cadastrar(Professor a){
          professores.add(a);
          boolean r = Persist.gravar(professores,"professores.dat");
      }
  
public static void adicionar(Professor p){
    professores.add(p);
}  

public static void listar(){
        for(Professor p: professores)
p.mostrarDados();
}

  
    public static Professor buscar(String nome){
        for(Professor p: professores){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
}
    public static boolean excluir(String nome){
        for(Professor p: professores){
            if(p.getNome().equals(nome)){
                professores.remove(p);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return professores;
      }
}

