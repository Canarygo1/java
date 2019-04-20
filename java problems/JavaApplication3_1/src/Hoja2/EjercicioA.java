/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class EjercicioA {
   public static void main(String[]args){
       EjercicioA2 ob = new EjercicioA2();
       System.out.print(ob);
   }
   //461509 52 34
   
   public static String Ordenar12(String numero){
       StringBuilder sb = new StringBuilder(numero); 
       int espacio = 0;
       
       int i =0;
       
       String[] ordenado = new String[3];
       ordenado[2]=sb.substring(sb.length()-2);
       for ( i = 0; i<sb.length()-1;i++){
            if (sb.charAt(i)==' '){
                if (espacio==0){
               ordenado[1] = sb.substring(0, i);
               sb.delete(0, i);
               espacio++;
               i=0;
                }
                else if (espacio==1){
               ordenado[0] = sb.substring(0, i);
               sb.delete(0, i+1);
               i=0;
               espacio++;
               
                }
            }
       
       }
       
      return(" "+ordenado[0]+" "+ordenado[1]+" "+ordenado[2]);
   }

}

