/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;
import java.util.Scanner;

import static java.util.Arrays.sort;
/**
 *
 * @author alejandrocruz
 */
public class ejercicioE2 {
    public static void main(String[]args){
    double[] lista;
    lista =new double[3];
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Por favor introduzca los numeros a ingresar");
    lista[0]=scan.nextDouble();
    lista[1]=scan.nextDouble();
    lista[2]=scan.nextDouble();
    
    sumar(lista);
    
    }
        public static void sumar(double[]numero ){
        int  cifra;
        int suma = 0;
        for(int a =0;a<=2;a++){
            
            while( numero[a]>=1||numero[a]<=-1){
             cifra =(int)numero[a]%10;
             numero[a] = (int)numero[a]/10;
             suma = suma+cifra;
               
            
        }
        numero[a]=suma;
        suma =0;
               
            }
        
        System.out.println("La suma de todos los digitos del primero da"+(int)numero[0]);
        System.out.println("La suma de todos los digitos del segundo da"+(int)numero[1]);
        System.out.println("La suma de todos los digitos del tercero da"+(int)numero[2]);
        sort(numero);
        System.out.print("Los valores ordenados de menor a mayor son"+(int)numero[0]+" "+(int)numero[1]+" "+(int)numero[2]);
    }
    
    
    

}
