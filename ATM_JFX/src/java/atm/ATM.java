/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author miche
 */
import atm.Saldo;
import atm.SaldoController;
import atm.ServiceLocator;
import atm.services.Service;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIInput;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;


@RequestScoped
@Named
@FacesValidator("customValidator")

public class ATM{
    Saldo saldo = Saldo.getInstance();
    SaldoController control = new SaldoController();
    private int bal;

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
    
    public int cekSaldo(){
        return control.updateView();
    }
    
    public void setor(){
        Service service = ServiceLocator.getService("Setor");
        service.execute(bal);
        bal = 0;
    }
    
    public void tarik(){
        Service service = ServiceLocator.getService("Tarik");
        service.execute(bal);
        bal = 0;
    }
    
    public void validate(FacesContext context, UIComponent comp, Object value){
	int x = saldo.getBalance();
        int bal = Integer.parseInt(value.toString());

		if (bal % 50000 != 0) {
			((UIInput) comp).setValid(false);

			FacesMessage message = new FacesMessage("   Transaksi Gagal! Harus Kelipatan Rp. 50.000,-");
			context.addMessage(comp.getClientId(context), message); 
		}
                
                if(x-bal<100000){
                    ((UIInput) comp).setValid(false);

			FacesMessage message = new FacesMessage("   Transaksi Gagal! Saldo Tidak Mencukupi");
			context.addMessage(comp.getClientId(context), message); 
                }
    }
}
