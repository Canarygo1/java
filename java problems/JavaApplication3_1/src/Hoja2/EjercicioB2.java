/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class EjercicioB2 {
    public String toString(){
        Scanner scan = new Scanner(System.in);
        String[] lista = new String[20];
        int[] recoger = new int[20];
        System.out.print("Introducir 20 numeros enteros");
            for (int i =0;i<20;i++){
                recoger[i]=scan.nextInt();
             }
            for (int i =0;i<20;i++){
               lista[i]=String.valueOf(recoger[i]);
            }

           
    return(EjercicioB3.numeroRepetidos(recoger));
    }
}
