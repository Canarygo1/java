/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Random;
/**
 *
 * @author alejandrocruz
 */
public class ejericioA {
    public static void main(String[]args){
        
        
    System.out.println(suma());//llamada al metodo desde el main.
    
    
    } 
    
    
    
    public static  int suma() { //metodo que retorna la suma de caracteres para ser representados en el main.
        Random rnd = new Random();   
        String tirada  ="";
        int aleatorio =0;
        int numero;
            for (int i =0;i<3;i++){
            numero= rnd.nextInt(6);
            aleatorio = numero+aleatorio;
            System.out.print( "Los puntos de la tirada son "+numero+"\n");
            
        }
         return aleatorio;

        
    }
    
}
