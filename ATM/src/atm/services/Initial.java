/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.services;


/**
 *
 * @author miche
 */
public class Initial implements Service{
      public void execute(int set){
        System.out.println("System Initialized");
   }

   @Override
   public String getName() {
      return "Init";
   }
}
