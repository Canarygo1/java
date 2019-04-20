/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad3;

/**
 *
 * @author alejandrocruz
 */
public class PreguntasArray {
    public Object[] preguntas = new Object[10];
    
    public void setPregunta(int posicion,Object preguntas){
        this.preguntas[posicion]= preguntas;
    }
    public Object getPregunta(int posicion){
        return preguntas[posicion];
    }
}
