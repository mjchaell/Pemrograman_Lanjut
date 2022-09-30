/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author miche
 */
public class SaldoController {
    private SaldoView view;
    
    public void set(int set){
        Saldo saldo = Saldo.getInstance();
        int x = saldo.getBalance();
        x = x+set;
        saldo.setBalance(x);
        System.out.println("Selamat Datang di ATM!");
        System.out.println("Saldo : Rp."+saldo.getBalance()+",-");
    }
    
    public void updateView(){
        Saldo saldo = Saldo.getInstance();
        view.printSaldo(saldo.getBalance());
    }
}
