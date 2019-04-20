/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad1;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Imprimir {
        @Override
    public String toString(){
        Scanner scan = new Scanner(System.in);
          System.out.println("-------------Toma de datos para 2D y 3D -------------");
          System.out.println("--> Introducir las tres coordenadas:");
          Object P1 = new Punto3D(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
          System.out.println("Coordenaadas x y z"+((Punto2D)P1).getX()+", "+((Punto2D)P1).getY()+", "+((Punto3D)P1).getZ());
          System.out.println("-------------Toma de datos para Linea2D-------------");
          System.out.println("--> Introducir las cuatro coordenadas (x1,y1)|(x2,y2):");   
          Punto2D P3 = new Punto2D(scan.nextDouble(),scan.nextDouble());
          Linea2D linea2 = new Linea2D(scan.nextDouble(),scan.nextDouble(),P3);
  
           System.out.println("-------------Punto2D -------------");
           System.out.println("Las coordenadas son "+P1.toString());
           System.out.println("La x es:"+((Punto2D)P1).getX());
           System.out.println("La y es:"+((Punto2D)P1).getY());
            
            System.out.println("-------------Punto3D -------------");
            System.out.println("Las coordenadas son: "+((Punto2D)P1).getX()+", "+((Punto2D)P1).getY()+", "+((Punto3D)P1).getZ());
            System.out.println("La x es:"+((Punto2D)P1).getX());
            System.out.println("La y es:"+((Punto2D)P1).getY());
            System.out.println(":a z es: "+((Punto3D)P1).getZ());
            
            System.out.println("-------------Linea2D -------------");
            System.out.println(linea2.toString());
            System.out.println("Coordenadas punto inicial");
            System.out.println("La coordenadas del punto X"+((Punto2D)P3).getX());
            System.out.println("La coordenadas del punto Y"+((Punto2D)P3).getY());
            System.out.println("Coordenadas punto final");
            System.out.println("La coordenadas del punto X"+P3.getX());
            System.out.println("La coordenadas del punto Y"+P3.getY());
            
        return "";
    }
}
