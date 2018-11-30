/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8_brauliocalix;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class adminClientes {

    private ArrayList<cliente> listaPersonas = new ArrayList();
    private File archivo = null;

    public adminClientes(String path) {
        archivo = new File(path);

    }

    public ArrayList<cliente> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<cliente> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setpersona(cliente p){
    listaPersonas.add(p);
    }
     public String toString() {
        return "ADMIN_PERSONAS{" + "listaPersonas=" + listaPersonas + ", archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        listaPersonas=new ArrayList();
        cliente temp;
        try {
        if (archivo.exists()) {
            FileInputStream entrada=new FileInputStream(archivo);
            ObjectInputStream objeto=new ObjectInputStream(entrada);
            try {//cuando leo un archivo binario de manera infinita siempre va a tirar una exception
                while ((temp=(cliente)objeto.readObject())!=null) {
                    listaPersonas.add(temp);
                    
                }
            } catch (EOFException e) {
                //encuentra final de archivo
            }
            objeto.close();
            entrada.close();
        }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try {
            fw=new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (cliente t : listaPersonas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }finally{
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
