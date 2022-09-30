/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

import atm.services.Service;
import java.util.Scanner;

/**
 *
 * @author miche
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SaldoController control = new SaldoController();
        control.set(500000);
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here

        while(true){
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Cek Saldo");
            System.out.print("Pilihan : ");
            int pil = sc.nextInt();
            if(pil==1|pil==2|pil==3){
                switch(pil){
                    case 1 :
                        Service service = ServiceLocator.getService("Setor");
                        System.out.print("Masukkan Jumlah Setor : Rp.");
                        int setor = sc.nextInt();
                        service.execute(setor);
                        break;
                    case 2 :
                        service = ServiceLocator.getService("Tarik");
                        System.out.print("Masukkan Jumlah Tarik : Rp.");
                        int tarik = sc.nextInt();
                        service.execute(tarik);
                        break;
                    case 3 :
                        control.updateView();
                        break;
                    default : break;
                }
            }else {
                System.out.println("Pilihan Tidak Ada!!");
            }
        }
    }
}

