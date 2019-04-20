/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad5;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class ahorcado {
   File fileCorrecto;
   String[] separado;
   Scanner scan = new Scanner(System.in);
   String texto = "";
   ahorcado(File file){
       this.fileCorrecto=file;
   }
   
   public void run(){
       leerArchivo();
       cortar();
       Juego();
   }
   
   public void leerArchivo(){
       try {
        FileReader fr= new FileReader(fileCorrecto);
        int valor = fr.read();
        System.out.println(valor);
        int contadorCaracteres = 0;
        char letra = ' ';
        while(valor!=-1){
            contadorCaracteres++;
            letra = ((char)valor);
            texto=texto+((char)valor);
            valor = fr.read();

        }             
       }
       catch(IOException e){
           
       }
   }
   public String palabraAleatoria(){
       int maximo = separado.length -1;
       return separado[(int)(Math.random()*maximo)];
       
   }
   public void cortar(){
       separado =  texto.split(" ");
      
   }
   public void Juego(){
               Ahorcado2 objeto = new Ahorcado2();
        String statusJuego = "y";
        while (statusJuego.equals("y")){
            System.out.println(palabraAleatoria());
            String palabra =  palabraAleatoria();
            String palabraOculta = objeto.obtenerPalabraOculta(palabra);
            int contador = 0; //contabiliza los no aciertos
            
            while (!palabra.equals(palabraOculta)){

                System.out.print("(Inténtalo!) Introduce una letra en la palabra " + palabraOculta + " -> ");
                char ch = scan.next().charAt(0);
            //Definimos los estados en los intentos

                if(!Ahorcado2.yaEstaEnPalabra(palabraOculta, ch)) {
                    palabraOculta = Ahorcado2.obtenerIntento(palabra, palabraOculta, ch);
                    if (!Ahorcado2.esCorrecta) {
                        System.out.println(ch + " Lo siento, no está en la palabra.");
                        contador++;
                    }
                } 
                else { System.out.println(ch + " está ya en la palabra.");
                }

            }
            System.out.println("La palabra era " + palabra + " y el balance de fallos es de "+ contador);
            System.out.print("¿Desea intentarlo otra vez? Responder sí pulsando <y> o No pulsando <n> -> ");
            statusJuego = scan.next();
        }
    }
   }
   


