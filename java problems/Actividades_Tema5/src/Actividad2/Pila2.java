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
public class Pila2<Object> extends ArrayList<Object> {

    protected void push(Object o) {
        add(o);
    }

    protected Object pop() {
        return remove(size() - 1);
    }

    protected boolean empty() {
        return size() == 0;
    }

    protected Object peek() {
        return get(size() - 1);
    }
}
    

