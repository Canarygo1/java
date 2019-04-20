/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioE.EjercicioE2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author alejandrocruz
 */
public class BuscadorDeUnos {
     static ArrayList<Integer> Columnas = new ArrayList<Integer>();
     static ArrayList<Integer> Filas = new ArrayList<Integer>();

    public static void mayorFilaYColumna(int[][]arrayBinario){
        mayorFila(arrayBinario);
        mayorColumna(arrayBinario);
        mostrarColumna();
        mostrarFila();

 }
    
    
    public static void mayorFila(int[][]arrayBinario){
        
            for (int i = 0; i < arrayBinario.length; i++) {
            int contador = 0;
                for (int j = 0; j < arrayBinario.length; j++) {
                    if(contieneUno(arrayBinario[i][j])){
                        contador++;
                    }
                }
              Filas.add(contador);

             }  
}
    
    public static void mayorColumna(int[][]arrayBinario){
        
        for (int i = 0; i < arrayBinario.length; i++) {
            int contador = 0;
                for (int j = 0; j < arrayBinario.length; j++) {
                    if(contieneUno(arrayBinario[j][i])){
                        contador++;
                    }
                }
                Columnas.add(contador);
                
             }
        
    }
    
    public static boolean contieneUno(int numero){
        
        return (numero==1);
    }
    
    
    public static void mostrarFila(){
         int maxFilas = mayor(Filas);
        System.out.print("La fila con unos es  ");
            for (int i = 0; i < Filas.size(); i++) {
                if(Filas.get(i)==maxFilas){
                    System.out.printf(""+i);
                }
            }
            System.out.println("");
        }
    
        public static void mostrarColumna(){
        System.out.print("La columna con unos es  ");
        int maxColumna = mayor(Columnas);
            for (int i = 0; i < Columnas.size(); i++) {
                if(Columnas.get(i)==maxColumna){
                    System.out.printf(""+i);
                }
            }
        }
        
        public static int mayor(ArrayList<Integer>lista1){
                int max = 0;
                    for (int i = 0; i < lista1.size(); i++) {
                        if(lista1.get(i)>max){
                            max = lista1.get(i);
                            
                        }
        }
        return max;
        
        }
    
    }

  
    

