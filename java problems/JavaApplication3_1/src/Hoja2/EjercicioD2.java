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
public class EjercicioD2 {
    public static void Mostrar (int[][] tabla) {
        int[] suma = new int[8];
        int[] numeroEmpleado = new int[8];
        for(int i=0;i<8;i++){
            for(int j = 0;j<7;j++){
                    suma[i]=tabla[i][j]+suma[i];
                    
            
             
            }
        numeroEmpleado[i]=i;
        }
    
      Burbuja(suma,numeroEmpleado);

    
    }

    public static void Burbuja (int[]suma,int[]numeroEmpleado){
        int i;
        int j = 0;
        int aux2;
        
        for(i=0;i<suma.length-1;i++){
            for(j=0;j<suma.length-i-1;j++){
                    if(suma[j+1]>suma[j]){
                    aux2 = suma[j+1];
                    suma[j+1] = suma[j];
                    suma[j]=aux2;
                    
                     aux2 = numeroEmpleado[j+1];
                    numeroEmpleado[j+1] = numeroEmpleado[j];
                    numeroEmpleado[j]=aux2;
                    
                    }
            
            
            }
        

        }
       Pintar(suma,numeroEmpleado);
    }
    public static void Pintar(int[]suma,int[]numeroEmpleado){
    
        for(int i = 0;i<numeroEmpleado.length;i++){
            System.out.println("El empleado/a numero "+numeroEmpleado[i]+"tiene un total de "+suma[i]+"horas");
        
        
        }
    }
}
