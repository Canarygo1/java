/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class El_ahorcado {


   


        public static void main (String args[]){
        Scanner entradas = new Scanner(System.in);
        EstudiaIntentos objeto = new EstudiaIntentos();
        String statusJuego = "y";
        while (statusJuego.equals("y")){
            String palabra = objeto.obtenerPalabra();
            String palabraOculta = objeto.obtenerPalabraOculta(palabra);
            while(!palabra.equals(palabraOculta)){
                System.out.println("Intentalo Introduce una letra en la palabra"+palabraOculta+"-->");
                char ch = entradas.next().charAt(0);
                
                if(!EstudiaIntentos.yaEstaEnPalabra(palabraOculta,ch)){
                    palabraOculta = objeto.obtenerIntento(palabra,palabraOculta,ch);
                    if(!objeto.esCorrecta){
                        System.out.println(ch+"lo siento, no esta en la palabra");
                        
                    }
                
                }
                else{
                    System.out.println(ch+" esta ya en la palabra");
                
                }
            }
            System.out.println("La palabra era"+palabra+"y el balance de fallos es de ");
            System.out.println("Desea intentarlo otra vez? Responder si pulsando<y> o No pulsando <n> ->");
            statusJuego = entradas.next();
        }
    
    }
}
