/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8_brauliocalix;

/**
 *
 * @author User
 */
public class clienteuni extends cliente{
    private String cuenta;

    public clienteuni() {
    }

    public clienteuni(String cuenta, String nombre, String apellido, String tarjeta, int pagado, int billete) {
        super(nombre, apellido, tarjeta, pagado, billete);
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
    
}
