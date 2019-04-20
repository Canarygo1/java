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
import java.util.Scanner;


public class Principal {

    @Override
    public String toString(){
        Codigo();
        return "";
    }

    public void Codigo(){
        ArrayList<String> cadenas = new ArrayList<>();
        System.out.print("--> Introducir ruta del fichero: ");
        String ruta = ControlFichero();

        try{
            BufferedReader fichero = new BufferedReader(new FileReader(ruta));
            String linea;
            while((linea = fichero.readLine()) != null){
                cadenas.add(linea);
            }

            Proceso(cadenas);

        }catch(IOException e){
            System.out.println("Error IO: "+e);
        }

    }


    public String ControlFichero(){
        String ruta = "";
        try{
            ruta = AperturaFichero();

        }catch(IOException e){
            System.out.println("Error de fichero: "+e);
            System.out.print("--> Corregir la ruta correcta: ");
            ruta = ControlFichero();
        }
        return ruta;
    }

    public String AperturaFichero() throws IOException{
        Scanner input = new Scanner(System.in);

        String ruta = input.nextLine();
        File fichero = new File(ruta);
        if(!fichero.canRead()){
            throw new IOException("-- No existe ese fichero --");
        }
        return ruta;
    }
public void Proceso(ArrayList<String> cadenas){

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
