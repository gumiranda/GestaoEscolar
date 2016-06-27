/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a11421BCC021
 */
public class Teste {
   public void Teste() throws OpcaoInvalidaException{
       
                    Menu m = new Menu();
            while(true){
                try{
                    int opcao = m.ler();
                    System.out.println(opcao);
                    break;
                }
                catch (OpcaoInvalidaException e){
                    System.out.println(e.getMessage());
                    throw e;
                }
                
            }
            
        }  
}
