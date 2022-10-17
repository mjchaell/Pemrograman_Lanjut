/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import atm.services.Service;

/**
 *
 * @author miche
 */
public class ServiceLocator {
   public static Service getService(String Name){

      InitialContext context = new InitialContext();
      Service service1 = (Service)context.lookup(Name);
      return service1;
   }
}
