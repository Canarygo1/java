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
public class Preguntas {
        private String texto;
        private String correcta;
    
    public Preguntas(){
        texto ="";
        correcta ="";
    }
    public void setEnunciado(String textoEnunciado){
        texto = textoEnunciado;
        
    }
    public void setRespuesta(String respuestaCorrecta){
        correcta = respuestaCorrecta;
        
    }
    public boolean miraRespuesta(String respuesta){
        return respuesta.equalsIgnoreCase(correcta);
    }
    public void mostrar(){
        System.out.println(texto);
    }
}
