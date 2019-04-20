/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;

import java.util.ArrayList;

/**
 *
 * @author alejandrocruz
 */
public class Opcion1 {
    int numero = 0;
    Opcion1Pila pila = new Opcion1Pila();
    
    Opcion1(int numero){
    this.numero = numero;
    }
    public void BuscadordePrimos(){
        int provisional = numero;
        for (int i = 2;i<numero;i++){
            while(provisional%i==0){
                pila.push(i);
                provisional = provisional/i;
               
            }
        }
        while(!pila.empty()){
        System.out.print(" "+pila.pop());
    
        }
    }
    
}
