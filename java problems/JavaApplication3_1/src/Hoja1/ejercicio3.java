/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class ejercicio3 {
    public static void main (String[]arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una cadena cualquiera o texto");
        String frase = scan.nextLine();
        System.out.println("Introduce la letra a testear");
        char caracter = scan.next().charAt(0);
        
        System.out.println("El numero de caracteres es de "+numeroCaracteres(frase));
        System.out.println("El numero de veces que se ha encontrado la letra "+caracter+" en "+frase+" es de  " +
                                        numeroRepeticion(caracter,frase));
    }
    
   public static int numeroCaracteres (String caracteres){
        int tamano = caracteres.length();
   
        return tamano;
   }
   
   public static int numeroRepeticion(char caracter2,String introducido){
       int favorables = 0 ; 
       for (int i = introducido.length()-1 ; i>=0;i--){
           System.out.print(introducido.charAt(i));
           if(caracter2==(introducido.charAt(i))){
            favorables++;
            
            
            }
       
       }
       return favorables;

   }
}
