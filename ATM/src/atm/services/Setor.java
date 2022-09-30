/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm.services;

import atm.Saldo;

/**
 *
 * @author miche
 */
public class Setor implements Service{

   public void execute(int set){
      if(set%50000==0){
            Saldo saldo = Saldo.getInstance();
            int x = saldo.getBalance();
            x = x+set;
            saldo.setBalance(x);
            System.out.println("Berhasil disetor!");
            System.out.println("Saldo anda : Rp."+saldo.getBalance()+",-");
        }else {
            System.out.println("Jumlah setoran harus kelipatan Rp.50.000");
        }
   }

   @Override
   public String getName() {
      return "Setor";
   }
    
}
