/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class Menu {
    Scanner scan = new Scanner(System.in);

    
   public void menu(){
         boolean seguir=true;

            while(seguir){      

             System.out.println("|===================================================================================================================");
            System.out.println("\t\t\t\t\tOperaciones con Pilas y listas de Arrays\t\t\t\t\t\t|\n");
             System.out.println("|===================================================================================================================");
            System.out.printf("|\t Opciones a elegir\n");
            System.out.println("|\t 1.Opcion 1 : Analizar un numero entero positivo y desplegar en una pila sus factores primos");
            System.out.println("|\t 2.Opcion 2 : Analizar una cantidad entera y crear una pila con todos los valores primos encontrados");
            System.out.println("|\t 3.Opcion 3 : Analicar esrado de una cuenta con interes generado y transacciones de ingresos y gastos");
            System.out.println("|\t 3.Opcion 4 : Salida");
             System.out.println("|===================================================================================================================");
            int seleccion = scan.nextInt();
                switch(seleccion){
                   case 1 :{
                      System.out.println("Mete un numero entero positivo");
                      Opcion1 opcion1 = new Opcion1(scan.nextInt());
                      opcion1.BuscadordePrimos();
                      break;
                   }
                   case 2 :{
                       System.out.println("Indicar un valor entero positivo: ");
                       Opcion2 opcion2 = new Opcion2(scan.nextInt());
                       opcion2.totalNumerosPrimos();
                       break;
                   }    
                   case 3:{
                       Opcion3();
                       break;
                   }
                   case 4:{
                       System.exit(0);
                   }
                }
             }
                
    }
   public void Opcion3(){
       
       
       System.out.println("\t\t\t\tDatos Personales");
       System.out.println("-------------------------------------------------------------------");
       System.out.println("-->Ingresar datos personales en este orden | ID(5 digitos),nombre y saldo en cuenta($)");
       Cuenta cuenta = new Cuenta(scan.nextInt());
       cuenta.setNombre(scan.nextLine());
       cuenta.setBalance(scan.nextDouble());
       System.out.println("--> Indicar Tasa de interes anual aplicable en (%): ");
       cuenta.setInteres(scan.nextDouble());
       cuenta.Transacciones();
   }
}   
