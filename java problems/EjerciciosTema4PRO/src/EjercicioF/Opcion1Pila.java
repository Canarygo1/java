/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author alejandrocruz
 */
public class Opcion1Pila {
    private int[] elementos;
    private int talla;
    public static final int CapacidadStandar = 16;
    
    public Opcion1Pila(){
        this(CapacidadStandar);
    
    }
    
    public Opcion1Pila(int capacidad){
        elementos = new int[capacidad];
    }
    
    public final void push (int valor){
        if(talla>=elementos.length){
            int[] temporal = new int[elementos.length*2];
            System.arraycopy(elementos, 0, temporal, 0, elementos.length);
            elementos = temporal;
        }
        elementos[talla++] = valor;
    }
    
    public int pop(){
        return elementos[--talla];
    }
    
    public boolean empty(){
    return talla==0;
    
    }
    
    
}
