/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alejandrocruz
 */
public class EjercicioF {
    public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Introduce un identificador de correo ");
    String nombre = scan.nextLine();
    System.out.print("Introduce el dominio de correo (.es o .com): ");
    String dominio = scan.nextLine();    
    System.out.print(Correo(nombre,dominio));
     System.out.print("Introduce un numero de 3 cifras ");
     String numero = scan.nextLine();
     System.out.print(Password(numero,dominio));
    }
    
    public static String Correo (String usuario,String dominio){
        Random rnd = new Random();
    
        String numAleatorio =  "";
             for (int i=0;i<10;i++){
                int aleatorio=rnd.nextInt(10);    
                numAleatorio = numAleatorio + aleatorio;
        
              }
    return(usuario+numAleatorio+"@puchimonti"+dominio);
    }
    
    public static String Password(String numero,String dominio){
        Random rnd = new Random();
        int contador=0;
        String letraAleatorio =  "";
        int aleatorio =0;
         for (int i=0;i<20;i++){
            if(i<10){
                aleatorio= 65+rnd.nextInt(25);
               char letra =(char) aleatorio;
               letraAleatorio = letraAleatorio+letra;
            } 
            else{
                aleatorio=97+rnd.nextInt(25);
                char letra =(char) aleatorio;
                letraAleatorio = letraAleatorio+letra;
            }
         }
    return(numero+dominio+letraAleatorio);
    }
    
}
