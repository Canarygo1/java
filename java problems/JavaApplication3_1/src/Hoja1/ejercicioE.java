/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alejandrocruz
 */
public class ejercicioE {
    public static int a;
    static int[] lista;
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
            
            
            System.out.println("Introducir tres numeros cuales quiera");
            double numero1 = scan.nextDouble();
            double numero2 = scan.nextDouble();
            double numero3 = scan.nextDouble();
            numero(numero1);
            numero(numero2);
            numero(numero3);
        

        
    }
    
    
    
    public static void numero(double numero ){
        double falta = numero%10;
        int  cifra;
        int suma = 0;

        int i = contarCifras(numero);
            while(i>=1){
             cifra =(int)numero%10;
             numero = (int)numero/10;
             suma = suma+cifra;
             i--;
               
            }
            CrearArray(suma);

    
    }
    
    public static void CrearArray(int entradaArray){
        
        lista=new int[3];

        lista[a] = entradaArray;
        if(a==2){
        ordenar(lista);
        }
        else {
             a++;   
                
         }
        
    
    
    
    }
    public static int contarCifras(double numero){
        int tamano = 0;
        
            while(numero>0||numero<0){
                numero = numero /10;
                tamano ++;
        
            }
    return tamano;
    
    }
    
 public static void ordenar(int[] numeroOrdenar){
     Arrays.sort(numeroOrdenar);
     System.out.println(Arrays.toString(numeroOrdenar));
 }
 
}
