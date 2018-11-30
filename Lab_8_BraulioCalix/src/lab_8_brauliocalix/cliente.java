/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8_brauliocalix;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class cliente {
    private String nombre;
    private String apellido;
    private String tarjeta;
    private int pagado;
    private int billete;
    private ArrayList recibos= new ArrayList();

    public cliente() {
    }

    public cliente(String nombre, String apellido, String tarjeta, int pagado, int billete) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
        this.pagado = pagado;
        this.billete = billete;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public int getBillete() {
        return billete;
    }

    public void setBillete(int billete) {
        this.billete = billete;
    }

    public ArrayList getRecibos() {
        return recibos;
    }

    public void setRecibos(ArrayList recibos) {
        this.recibos = recibos;
    }
    
}
