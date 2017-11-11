/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpeta;

import static carpeta.Carpeta.Archivos;
import static carpeta.Carpeta.Carpetas;
import java.util.Scanner;

/**
 *
 * @author jefersson
 */
public class NewMain {

    /**
     * @param args the command line arguments


*/

    public static void main(String[] args) {

Scanner leer=new Scanner(System.in);
int opcion=0;
while(opcion!=4){

System.out.println("************** Menu Principal ***************");
System.out.println("1-Buscar Carpeta\n2-Agregar Carpeta\n4-Salir\n5-Vista previa contenido");
System.out.println("Seleccione una opcion :");
opcion=leer.nextInt();
switch(opcion){
    case 1:
      int op = 0;
        System.out.print("nombre de carpeta :");

    
    String nombre2=leer.next();


    for(int i=0;i<Carpetas.size();i++){
if(Carpetas.get(i).nombre.equals(nombre2)){
while(op!=4){
System.out.println("************** Menu de "+nombre2+" ***************");
System.out.println("1-Crear Carpeta\n2-Agregar Archivos\n3-Buscar Carpeta\n4-Eliminar carpeta\n5-Vista previa carpetas\n6-Ver el total de archivos\n7-salir");
System.out.println("Seleccione una opcion :");
op=leer.nextInt();
switch(op){
    case 1:
        System.out.print("nombre de carpeta :");
String nom=leer.next();
System.out.print("tamaño ");
int tam=leer.nextInt();
Carpetas.add(new Carpeta(nom,tam));
    case 2:
       System.out.print("Ingrese el nombre del archivo :");
       
        String nombre4 =leer.next();
        System.out.print("Ingrese el tamaño del archivo :");
        
       int tamaño4=leer.nextInt();
       
       System.out.print("Ingrese la extencion del archivo ");
       String ext4=leer.next();
 Archivos.add(new Archivo(nombre4,tamaño4,ext4));
        break;
    case 3:
 int op1 = 0;
   System.out.print("nombre de carpeta :");

    
    String nombre3=leer.next();
        for(int z=0;z<Carpetas.size();z++){
if(Carpetas.get(z).nombre.equals(nombre3)){

    while(op1!=4){
System.out.println("************** Menu de "+nombre3+" ***************");
System.out.println("1-Agregar Archivos\n2-Eliminar carpeta\n3-salir");
System.out.println("Seleccione una opcion :");
op1=leer.nextInt();
switch(op1){
    case 1:
        System.out.print("Ingrese el nombre del archivo :");
       
        String nombre5 =leer.next();
        System.out.print("Ingrese el tamaño del archivo :");
        
       int tamaño5=leer.nextInt();
       
       System.out.print("Ingrese la extencion del archivo");
       String ext5=leer.next();
 Archivos.add(new Archivo(nombre5,tamaño5,ext5));
        break;
    case 2:
        break;
    case 3:
        System.exit(0);
        break;
    case 4:
        break;
    case 5:
       
        break;
}


}
}
           }
        break;
        
    case 4:
        break;
    case 5:    System.out.print(Carpetas.size());
        break;
    case 6:
      System.out.println("Total de archivos en esta carpeta : "+Archivos.size());
    
      
      for(int b=0;b<Archivos.size();b++){
      System.out.println("["+b+"] Nombre :"+Archivos.get(b).nombre+"\n["+b+"] Tamaño :"+Archivos.get(b).tamaño+"\n["+b+"] Extension :"+Archivos.get(b).Extension);
      
      
      }
        break;
    case 7:
        System.exit(0);
}

}
break;
}else{
System.out.print("No se encontro");
break;
}


    
    }
        
        break;
    case 2:
System.out.print("nombre de carpeta :");
String nom=leer.next();
System.out.print("tamaño ");
int tam=leer.nextInt();
Carpetas.add(new Carpeta(nom,tam));
        break;
    case 3:
        break;
    case 4:
        break;
        
    case 5:
for(int n=0;n<Carpetas.size();n++){
System.out.println("["+n+"] Nombre :"+Carpetas.get(n).nombre+"\n["+n+"] Tamaño :"+Carpetas.get(n).tamaño);

        

}
    
        break;
        
        
        



}
    
    
    
    

}

    }
    
}
