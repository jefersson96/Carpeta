/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;

/**
 *
 * @author jefersson
 */
public class Archivo {
    public String nombre;
   public int tamaño;

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getExtension() {
        return Extension;
    }
    String Extension;
    public Archivo(String nombre,int tamaño,String extension){
    
    this.Extension=extension;
    this.nombre=nombre;
    this.tamaño=tamaño;
    }



}
