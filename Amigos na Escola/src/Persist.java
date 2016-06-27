/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.io.*;

public class Persist {
public static boolean gravar(Object a, String arquivo){
    try{
        FileOutputStream arquivoGrav = new FileOutputStream(arquivo);
        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
        objGravar.writeObject(a);
        objGravar.flush();
        objGravar.close();
        arquivoGrav.flush();
        arquivoGrav.close();
        return true;
    }
    catch (Exception e){
        return false;
    }
}    
public static Object recuperar(String arquivo){
    Object obj = null;
    FileInputStream arquivoLeitura = null;
    ObjectInputStream objLeitura = null;
    try{
        arquivoLeitura = new FileInputStream(arquivo);
        objLeitura = new ObjectInputStream(arquivoLeitura);
         System.out.println(objLeitura.readObject());
         objLeitura.close();
        arquivoLeitura.close();
        
    }catch (Exception e){
        return null;
    }
    return obj;
}
}
