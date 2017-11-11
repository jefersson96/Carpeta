/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;

import static carpeta.Carpeta.Carpetas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jefersson
 */
public class Carpeta {
public  String nombre;
int tamaño;
public static ArrayList<Archivo> Archivos=new ArrayList<>();

    public int getTamaño() {
        return tamaño;
    }
public static ArrayList<Carpeta>Carpetas=new ArrayList<>();
Scanner leer=new Scanner(System.in);
public Carpeta(String nombre,int tamaño){
this.tamaño=tamaño;
this.nombre=nombre;
}

    public String getNombre() {
        return nombre;
    }


public void AgregarCarpeta(){
System.out.print("nombre de carpeta :");
String nom=leer.nextLine();
System.out.print("tamaño :");
int tam=leer.nextInt();
Carpetas.add(new Carpeta(nom,tam));

    
    

}
public void buscarCarpetas(){

}

}











