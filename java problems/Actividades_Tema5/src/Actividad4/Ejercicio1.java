/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Ejercicio1 {
          static final String[] Categorias = {
                             "Tecnico", 
                             "Administrativo", 
                             "Directivo"
                           };
          
          static String rutaUser="";
    public static void main(String[] args) {
       boolean condicion = false;

         while(!condicion){

            try{

                FileWriter fw ;
                FileWriter fw2 ;
                FileReader fr;
                String ruta = "/Users/alejandrocruz/Desktop/holas.txt";
                String rutaCopia = "/Users/alejandrocruz/Desktop/hola2.txt";
                Scanner scan = new Scanner(System.in);
                System.out.println("--> Indicar la ruta del archivo sobre el que se va a escribir o como alternativa,pulsa uno para crear");
                String rutaUser = scan.nextLine();


                    if(rutaUser.equals("1")){
                     fw = new FileWriter(ruta);
                    }
                    else{
                     fw = new FileWriter(rutaUser);
                     }
                    for (int i = 0; i < 1000; i++) {
                        String nombre = "Nombre"+i+" Apellidos"+i;
                        String categoria = Categorias[generadorCategoria()];
                        double salario = salario(categoria);
                         fw.write(nombre+" "+categoria+" "+String.format("%.2f", salario)+" $\n");

                    }
                    fw.close();

                    System.out.println("Indicar la ruta completa para leer o bien pulsar uno para usar "+ruta);
                    String ContenidoArchivo = "";
                    rutaUser = scan.nextLine();

                    if(rutaUser.equals("1")){
                     fr = new FileReader(ruta);  
                    }
                    else{
                    fr = new FileReader(rutaUser);
                    }

                   System.out.println("Indicar la ruta completa para la copia o bien pulsar 1 para utilizar"+rutaCopia);
                   rutaUser = scan.nextLine();
                        if(rutaUser.equals("1")){
                            fw2=new FileWriter(rutaCopia);
                    }
                    else{
                            fw2=new FileWriter(rutaUser);
                    }

                    int valor = fr.read();
                    fw2.write(valor);
                    while(valor!=-1){
                        fw2.write((char)valor);
                        valor = fr.read();
                    }
                    fw2.close();
                   condicion =true;
                    System.out.println("-- Todas las lineas se han escrito en el archivo --");


            }catch(IOException e){
                System.out.println("===Identificacion del error: "+e+"===");
            }
        }
    }
    public static int generadorCategoria(){
        return (int)(Math.random()*3);
    }
    public static double salario(String categoria){
        if(categoria.equals("Tecnico")){
            int range = (45000 - 35000) + 1;     
            return ((Math.random() * range) + 35000);
        }
        else if(categoria.equals("Administrativo")){
            int range = (33000 - 22000) + 1;     
            return ((Math.random() * range) + 22000);
        }
        else if(categoria.equals("Directivo")){
            int range = (65000 - 55000) + 1;     
            return ((Math.random() * range) + 55000);
        }
       return 0;
    }
    
}
