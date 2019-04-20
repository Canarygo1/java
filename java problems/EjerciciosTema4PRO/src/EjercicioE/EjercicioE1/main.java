/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioE.EjercicioE1;

import EjercicioE.EjercicioE2.BuscadorDeUnos;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alejandrocruz
 */
public class main {
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
        int tamano = 0;
        System.out.println("--> Introducir el tamano de la matriz n");
        tamano = scan.nextInt();
        BuscadorDeUnos Buscar = new BuscadorDeUnos();
        Buscar.mayorFilaYColumna(aleatorio(tamano));
    }
    
    public static int[][] aleatorio(int tamano){
        int[][] arrayBinario = new int[tamano][tamano];
        Random rnd = new Random();
            for (int i = 0; i < arrayBinario.length; i++) {
                for (int j = 0; j < arrayBinario.length; j++) {
                    arrayBinario[i][j]=rnd.nextInt(2);
                    System.out.print(arrayBinario[i][j]);
                }
                System.out.println("");
            }
       
        return arrayBinario;
    }
}
