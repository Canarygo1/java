/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

/**
 *
 * @author alejandrocruz
 */
public class ejercicioB {
    public static void main (String[]args)   {
        
            
            numero(50);
 
 
 
 
 
 }
    public static void numero (int numero){
        int contador = 0 ;
        int favorables = 0 ;
        for (int i =1;favorables<numero;i++){
                for (int y =1;y<=i;y++){
                    
                  if (i%y==0){
                         contador++;
                  }
                
                 }
                if (contador==2){
                    System.out.printf("%-4d ",i);
                    favorables++;
                    if (favorables%10==0.0){
                          System.out.println();
         
                    }
         }
         contador = 0;

         }
        


    }
}

