/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11511BCC038
 */
import java.util.*;

public class BaseDadosProjetos {
      private static ArrayList<ProjetoPesquisa> projetos = new ArrayList<ProjetoPesquisa>();
    
       static {
    projetos = (ArrayList<ProjetoPesquisa>)Persist.recuperar("projetos.dat");
    if(projetos == null){
        projetos = new ArrayList<ProjetoPesquisa>();
    }
}
       public static void recebeArray(ArrayList<ProjetoPesquisa> listaSalva){
        projetos = listaSalva;
        
    }
      public static void cadastrar(ProjetoPesquisa a){
          projetos.add(a);
          boolean r = Persist.gravar(projetos,"projetos.dat");
      }
      
    public static void adicionar(ProjetoPesquisa a){
        projetos.add(a);
    }
    
    public static void listar(){
        for(ProjetoPesquisa a: projetos){
            a.mostrarDadoss();
        }
    }
    
    public static ProjetoPesquisa buscar(int codigo){
        for(ProjetoPesquisa a: projetos){
            if(a.getCodigo() == codigo){
                return a;
            }
        }
        return null;
}
    public static boolean excluir(int codigo){
        for(ProjetoPesquisa a: projetos){
            if(a.getCodigo() == codigo){
                projetos.remove(a);
            return true;
            }
        }
        return false;
    }
    
     public static ArrayList getArray(){
          return projetos;
      }
}
