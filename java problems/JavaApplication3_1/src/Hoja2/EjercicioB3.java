/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;

import java.util.Arrays;

/**
 *
 * @author alejandrocruz
 */
public class EjercicioB3 {

    
    public static String numeroRepetidos(int[]numeros){
        int L = numeros.length;
        
        for(int i = 0;i<L;i++){
            for(int j = i+1;j<  L;j++){
                if(numeros[i]==numeros[j]){
                    numeros[j]=0;
                    /*numeros[j]=numeros[L-1];
                    L--;*///manera alternavia moviendo el caracter al final de la cadena y reduciendo el valor asignado como tamano pero no funciona del todo bien ya que se modifica el orden.
                }
            }  
        }/*
        int[] buenos = new int[L];

        for(int i = 0;i<L;i++){
            buenos[i]=numeros[i];
        
        } forma parte de la manera alternativa explicada arriba se asignaban los valores del array a un array nuevo con el tamano del mismo*/
        
        String[] caracteres = new String[20];
            for(int i = 0;i<caracteres.length;i++){
                caracteres[i]=String.valueOf(numeros[i]);
                if (caracteres[i].equals("0")){
                    caracteres[i]="";
                }
             }
            
       
        Ordenar(caracteres);
        return(" ");
    }
    
    public static void Ordenar(String[]numerosOrdenar){
    
    String temp=" ";
    int inicio=0;
    int fin=numerosOrdenar.length-1;
    
    while(inicio<fin){
        temp= numerosOrdenar[inicio];
        numerosOrdenar[inicio]=numerosOrdenar[fin];
        numerosOrdenar[fin] = temp;
    
        inicio++;
        fin--;
    
    }
    for(int i = 0;i<numerosOrdenar.length;i++){
        System.out.print(numerosOrdenar[i]+" ");
    }
    }
}
