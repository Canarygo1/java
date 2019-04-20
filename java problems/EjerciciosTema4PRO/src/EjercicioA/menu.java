/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class menu {
    Scanner scan = new Scanner(System.in);
    boolean seguir = true;
    int eleguido = 0;
    public void menu(){
        while(seguir){
             System.out.println("|===================================================================================================================");
            System.out.println("\t\t\t\t\t"+"Operaciones Matematicas");
             System.out.println("|===================================================================================================================");
            System.out.printf("|\t Opciones a elegir\n");
            System.out.println("|\t 1.Opcion 1 : Tabla con la suma de terminos de los 10 primeros valores de dos series");
            System.out.println("|\t 2.Opcion 2 : Tabla que enfrenta dos series donde la suma de una controla el final de la otra");
            System.out.printf("|\t 3.Opcion 3 : Estudio del disciminate de un objeto que representa una ecuacion cuadratica|\n");
            System.out.println("|\t 4.Salida");
             System.out.println("|===================================================================================================================");
            eleguido = scan.nextInt();
            
                switch(eleguido){
                    
                    case 1 :{
                        Series serie1 = new Series();
                        serie1.pintar();
                        break;
                    }
                    
                    case 2:{
                        sumaSeries suma1 = new sumaSeries();
                        suma1.calculo();//Sacar laas tablas y darle un formato mas bonito.
                        break;
                        
                    }
                    
                    case 3:{
                        System.out.println("--> Introducir los coeficientes de la ecuacion a ,b y c representativamente:");
                        ecuacion hacerEcuacion = new ecuacion(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
                        hacerEcuacion.discriminante();
                        break;
                    }
                    
                    case 4:{
                    System.exit(0);

                    }
                 }
        }
    }
}
