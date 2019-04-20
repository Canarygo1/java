/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class menu {
    public void menu(){
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("\t  ======== EL Ajorcahdo========");
        System.out.println("\t\tOpciones a elegir\t\t\t|");
        System.out.println("|\t1. Analizar fichero\t\t\t\t|");
        System.out.println("|\t2. Iniciar juego\t\t\t\t|");
        System.out.println("|\t3. Salir\t\t\t\t\t|");
            switch(scan.nextInt()){
                case 1 :
                   
                    run();
                    break;
                case 2 :
                    ahorcado ahorcado = new ahorcado(ComprobarRuta());
                    ahorcado.run();
                    break;
                case 3 :
                    System.exit(0);
                    break;
            }
        }
    }
     Scanner scan = new Scanner(System.in);
    String ruta = "";
    
    public void run(){
        boolean condicion = false;

                try{
                 FileReader fr= new FileReader(ComprobarRuta());
                 int contadorPalabras = 1;
                 int contadorLineas = 1;
                 int valor = fr.read();
                 
                 System.out.println(valor);
                 String texto ="";
                 int contadorCaracteres = 0;
                 char letra = ' ';
                 while(valor!=-1){
                      contadorCaracteres++;
                     letra = ((char)valor);
                     texto=texto+((char)valor);
                     valor = fr.read();
                     
                    if(letra==' '){
                        contadorPalabras++;
                    }
                    if(letra=='\n'){
                        contadorLineas++;
                    }
                 }
                 System.out.println("|Caracteres|: "+contadorCaracteres);
                 System.out.println("|Palabras|: "+contadorPalabras);
                 System.out.println("|Lineas|:  "+contadorLineas);

                }
          catch(IOException e){
          System.out.println(ruta+"-- Informacion no valida --");
          System.out.println("--> Corregir la ruta incorrecta: "+ruta);
          }           
        
        }
    
    public File ComprobarRuta(){
        File filevacio = new File("");
        boolean condicion = false;
        System.out.print("-->Introducir la ruta del fichero: ");
             while(!condicion)
            try{       
                String ruta2 =scan.nextLine();
                File file = new File(ruta2);
                condicion = true;
                return file;
            }

            catch(Exception e){
           System.out.println(ruta+"-- Informacion no valida --");
           System.out.println("--> Corregir la ruta incorrecta: "+ruta);
            }
            return filevacio;
    }
}
