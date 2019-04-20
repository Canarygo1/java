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
public class EjercicioD2 {
    public static void buscar(double[] nota,String[]nombre){
        
         int mejorNota = notaAlta(nota);   
        
         
        System.out.print("El valor de la nota mas alta es"+mejorNota);
                        
            for (int i=0;i<nombre.length;i++){
                if (i==mejorNota){
                    System.out.println("--El nombre buscado es = "+nombre[i]+" <--");
                
                }
                else {
                    System.out.println(nombre[i]+"no es");
                
                }
        
            }
            
        }
    public static int notaAlta(double[]nota){
        double notaMax = 0 ; 
        int posicion = 0 ;
            for (int i =0;i<nota.length;i++){
             
                if (nota[i]>notaMax){
                 posicion = i;
                 notaMax=nota[i];
         
                 }
         
             }
        return posicion;
    }
    
    
}
