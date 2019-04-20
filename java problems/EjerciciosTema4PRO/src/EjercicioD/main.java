/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioD;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandrocruz
 */
public class main {

//3 -11 34 6 7 8 23 10 -5 34       -5 6 7 8 19 23 155 8 9 -33
//
    public static void main(String[] args){
        List<Integer> lista1 = new ArrayList<Integer>(); 
        List<Integer> lista2 = new ArrayList<Integer>(); 
        List<Integer>listaCombinada = new ArrayList<Integer>();
        lista1=listas.Cargarlista(lista1);
        lista2=listas.Cargarlista(lista2);
        System.out.println("\t-- LISTAS ORDENADAS --\n");
        lista1 = listas.Ordenar(lista1);
        listas.Mostrar(lista1);
        lista2=listas.Ordenar(lista2);
        System.out.println("");
        listas.Mostrar(lista2);
        listaCombinada = listas.Combinar(lista1, lista2);
        System.out.println("\n\t--  LISTAS COMBINADAS --\n");
        listas.Mostrar(listaCombinada);
        listaCombinada=listas.EliminarRepes(listaCombinada);
        System.out.println("'\n\t-- LISTAS UNICA SIN DUPLICADOS --\n" );
        listas.Mostrar(listaCombinada);
        System.out.println("\nLa suma es "+listas.SumaValores(listaCombinada));
        
    }
    
}
