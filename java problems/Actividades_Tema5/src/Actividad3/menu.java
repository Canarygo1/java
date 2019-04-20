/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad3;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class menu {
     Scanner scan = new Scanner(System.in);
    public void menu(){
                while(true){
        int decision = 0;
        System.out.println("\t\t==========Simulador de examenes==========");
        System.out.println("|\t\t\tOpciones a elegir\t\t\t\t|");
        System.out.println("|\t\t1. Cuestiones con unica respuesta\t\t\t|");
        System.out.println("|\t\t2. Cuestiones test con unica respuesta\t\t\t|");
        System.out.println("|\t\t3. Simulacion y cierre\t\t\t\t\t|");
        decision = scan.nextInt();

        if(decision==1){
            System.out.println("");
            scan.nextLine();
            crearPreguntasUnaResp();
        
        }
        else if(decision==2){
            System.out.println("");
            scan.nextLine();
            crearPreguntasVariasResp();
        }
        else if(decision==3){
            System.out.println("======Responde a cada una de las Preguntas======");
            scan.nextLine();
            mostrarPreguntasUnaResp();
            mostrarPreguntasVariasResp();
            System.exit(0);
            }
        }
    }
    
    PreguntasArray preguntas = new PreguntasArray();

    public void crearPreguntasUnaResp(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la " +(i+1)+" pregunta");
            
            String[] cortado =cortarUnaResp(scan.nextLine());
            PreguntasUnaRespuesta pregunta = new PreguntasUnaRespuesta(cortado[0],cortado[1]);
            preguntas.setPregunta(i, pregunta);
            //Es posible el acceder a el objeto
        }
    }
    
    public String[] cortarUnaResp(String lineaCompleta){
     String[] cortado = new String[2];
     Scanner input = new Scanner(lineaCompleta);
     input.useDelimiter("_");
     cortado[0]= input.next();
     cortado[1] = input.next();
     return cortado;
    }   
    public void mostrarPreguntasUnaResp(){
        for (int i = 0; i < 5; i++) {
            Preguntas preguntas2 = (Preguntas) preguntas.preguntas[i];
            preguntas2.mostrar();
            System.out.println("Por favor,introduzca una respuesta");
            String respuesta = scan.nextLine();
            if(preguntas2.miraRespuesta(respuesta)){
                System.out.println("Respuesta correcta");
            }
            else{
                System.out.println("Respuesta incorrecta");
            }
        }
    }
    
    public void crearPreguntasVariasResp(){
            for (int i = 5; i < 10; i++) {
                System.out.println("Introduce la " +(i+1)+" pregunta");
                String Pregunta =scan.nextLine();
                String cadenaCompleta="";
                Preguntas_test preguntas1 = new Preguntas_test();
                preguntas1.setEnunciado(Pregunta);
                for (int j = 0; j < 3; j++) {
                   preguntas1.decideRespuesta(scan.nextLine());
                }
                preguntas.setPregunta(i, preguntas1);
            
            //PreguntasUnaRespuesta pregunta = new PreguntasUnaRespuesta(cortado[0],cortado[1]);
            //preguntas.setPregunta(i, pregunta);
            //Es posible el acceder a el objeto
            }
    }
    public void mostrarPreguntasVariasResp(){
        for (int i = 5; i < 10; i++) {
            Preguntas pregunta2 = (Preguntas) preguntas.preguntas[i];
            pregunta2.mostrar();
            System.out.println(((Preguntas_test)pregunta2).todas);
            System.out.print("Respuesta: ");
               String respuesta = scan.nextLine();
                if(pregunta2.miraRespuesta(respuesta)){
                    System.out.println("-->Acertada");
                }
                else{
                    System.out.println("-->Respuesta Incorrecta");
                }
        }
    
    }

}
