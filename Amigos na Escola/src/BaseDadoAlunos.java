import java.util.*;

public class BaseDadoAlunos  {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
      static {
    alunos = (ArrayList<Aluno>)Persist.recuperar("alunos.dat");
    if(alunos == null){
        alunos = new ArrayList<Aluno>();
    }
}
      public static void recebeArray(ArrayList<Aluno> listaSalva){
        alunos = listaSalva;
        
    }
      public static void cadastrar(Aluno a){
          alunos.add(a);
          boolean r = Persist.gravar(alunos,"alunos.dat");
      }
    
    public static void adicionar(Aluno a){
        alunos.add(a);
    }
    
    public static void listar(){
        for(Aluno a: alunos){
            a.mostrarDados();
        }
    }
    
    public static Aluno buscar(String matricula){
        for(Aluno a: alunos){
            if(a.getMatricula().equals(matricula)){
                return a;
            }
        }
        return null;
}
    public static boolean excluir(String matricula){
        for(Aluno a: alunos){
            if(a.getMatricula().equals(matricula)){
                alunos.remove(a);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return alunos;
      }
}
