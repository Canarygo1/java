/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class listas {
   
    public static List Cargarlista(List<Integer>lista1){
        Scanner scan =new Scanner (System.in);
       for(int i = 0;i<10;i++){
            lista1.add(scan.nextInt());
        
        }
        return lista1;
        
    }
    
    public static List Ordenar(List<Integer>lista1){
        int temporal = 0;
        for(int x = 0;x<lista1.size()-1;x++){
            for(int i =0;i<lista1.size()-1;i++){
                if(lista1.get(i).compareTo(lista1.get(i+1))>0){
                    temporal = lista1.get(i);
                    lista1.set(i, lista1.get(i+1));
                    lista1.set(i+1,temporal);
                }
            }
        }
        return lista1;
    }
    
    public static List Combinar(List<Integer>lista1,List<Integer>lista2){
        List<Integer>listaCombinada = new ArrayList<Integer>();

       listaCombinada.addAll(lista1);
       listaCombinada.addAll(lista2);

        return listaCombinada;
    }
    
    public static List EliminarRepes(List<Integer>listaCombinada){
        List<Integer>listaSinRepetidos = new ArrayList<Integer>();

        for (int i = 0; i < listaCombinada.size(); i++) {
            if(!listaSinRepetidos.contains(listaCombinada.get(i))){
               listaSinRepetidos.add(listaCombinada.get(i));
            }
        }
        return listaSinRepetidos;
    }
    
    public static int SumaValores(List<Integer>ListaSinRepe){
        int suma = 0;
        
        for (int i = 0; i < ListaSinRepe.size(); i++) {
            suma += ListaSinRepe.get(i);
        }
        
    return suma;
    }
    
    public static void Mostrar(List<Integer>ParaMostrar){
    
        for (int i = 0; i < ParaMostrar.size(); i++) {
            System.out.printf("\t %d",ParaMostrar.get(i));
        }
    
    
    }
}
