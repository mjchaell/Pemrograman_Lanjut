/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import atm.services.Setor;
import atm.services.Tarik;

/**
 *
 * @author miche
 */
public class InitialContext {
       public Object lookup(String Name){
   
      if(Name.equalsIgnoreCase("SETOR")){
         System.out.println("Loading Setor Tunai...");
         return new Setor();
      }
      else if (Name.equalsIgnoreCase("TARIK")){
         System.out.println("Loading Tarik Tunai...");
         return new Tarik();
      }
      return null;		
   }
}
