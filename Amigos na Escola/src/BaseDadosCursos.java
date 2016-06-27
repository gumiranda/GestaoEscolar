import java.util.*;

public class BaseDadosCursos {
    private static ArrayList<Curso> cursos = new ArrayList<Curso>();
    
     static {
    cursos = (ArrayList<Curso>)Persist.recuperar("cursos.dat");
    if(cursos == null){
        cursos = new ArrayList<Curso>();
    }
}
     public static void recebeArray(ArrayList<Curso> listaSalva){
        cursos = listaSalva;
        
    }
      public static void cadastrar(Curso a){
          cursos.add(a);
          boolean r = Persist.gravar(cursos,"cursos.dat");
      }
    public static void adicionar(Curso a){
        cursos.add(a);
    }
    
    public static void listar(){
        for(Curso a: cursos){
            a.mostrarDados();
        }
    }
    
    public static Curso buscar(String codigo){
        for(Curso a: cursos){
            if(a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return null;
}
    public static boolean excluir(String codigo){
        for(Curso a: cursos){
            if(a.getCodigo().equals(codigo)){
                cursos.remove(a);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return cursos;
      }
}