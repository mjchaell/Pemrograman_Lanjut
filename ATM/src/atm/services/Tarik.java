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
public class Tarik implements Service{
      public void execute(int set){
      if(set%50000==0){
            Saldo saldo = Saldo.getInstance();
            int x = saldo.getBalance();
            if(x-set<100000){
                System.out.println("Saldo tidak mencukupi (Min Saldo Rp.100.000,-)");
            }else {
                x = x-set;
                saldo.setBalance(x);
                System.out.println("Berhasil ditarik!");
                System.out.println("Saldo anda : Rp."+saldo.getBalance()+",-");         
            }
        }else {
            System.out.println("Jumlah tarikan harus kelipatan Rp.50.000");
        }
   }

   @Override
   public String getName() {
      return "Tarik";
   }
}
