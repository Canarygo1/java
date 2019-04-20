/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2;

import java.util.ArrayList;

/**
 *
 * @author alejandrocruz
 */
public class pila  {
    private ArrayList<Object> lista = new ArrayList<>();
    
    public boolean estaVacia(){
        return lista.isEmpty();
    }
    public int darTalla(){
        return lista.size();
    }
    public Object recuperaNoBorra(){
        return lista.get(darTalla() - 1);
    }
    public Object recuperaSiBorra(){
        Object o = lista.get(darTalla()-1);
        lista.remove(darTalla()-1);
        return o;
    }
    public void ponerObjectos(Object o){
        lista.add(o);
    }

    @Override
    public String toString(){
        return "Pila de objectos: "+lista.toString();
    }
}
