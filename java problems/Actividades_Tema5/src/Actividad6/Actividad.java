/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Actividad {
    Scanner scan = new Scanner(System.in);
    String ruta2 ="";
    File fileCorrecto;
    String texto = "";
    String[] cortado;
        public File ComprobarRuta(){
        File filevacio = new File("");
        boolean condicion = false;
        System.out.print("-->Introducir la ruta del fichero: ");
             while(!condicion)
            try{       
                 ruta2 =scan.nextLine();
                File file = new File(ruta2);
                condicion = true;
                return file;
            }

            catch(Exception e){
           System.out.println(ruta2+"-- Informacion no valida --");
           System.out.println("--> Corregir la ruta incorrecta: "+ruta2);
            }
            return filevacio;
    }
        public void run(){
            leerArchivo();
      
        }
        public void leerArchivo(){
            try{
                ArrayList<String> cadenas = new ArrayList<>();

                BufferedReader fichero = new BufferedReader(new FileReader(ComprobarRuta()));

                String linea;
                while((linea = fichero.readLine()) != null){
                    cadenas.add(linea);
                }

                CortaYCambia(cadenas);
            }           
            catch(IOException e){
            }
        
        }
public void CortaYCambia(ArrayList<String> cadenas){

        String[] columnas = cadenas.get(0).split(",");
        for(int i = 1; i < cadenas.size();i++){
            String[] filas = cadenas.get(i).split(",");
            System.out.print("[");
            for(int j = 0; j < filas.length; j++){
                System.out.print(columnas[j].replace("\"", "") + " = " + filas[j].replace("\"", ""));
                if(j != filas.length-1){
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

    }
}
