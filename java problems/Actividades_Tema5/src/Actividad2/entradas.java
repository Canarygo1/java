/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class entradas {
    
    Scanner scan = new Scanner(System.in);
    protected static int[][] Asientos = new int[9][10];
    Pila2 Pila2 = new Pila2();
    boolean comprado =false;
    
    protected void setPila(int[][] pila){
        Asientos= pila;
    }
    
    protected void butacas() {
        System.out.println("Introducir los datos por filas para las 10 butacas");
        for (int i = 0; i < 9; i++) {
        int[] asientos = new int[10];
            for (int j = 0; j < 10; j++) {
                asientos[j] = scan.nextInt();
            }
            Pila2.push(asientos);
        }
    }
    
    @Override
    public String toString(){
        butacas();
        setPila(cargarAsientos());

        mostrarButacas();

        int opcion = 0;
        do {
            System.out.println("==========Gestion de Ventas==========");
            System.out.println("|\t\t\tOpciones a elegir\t\t\t\t|");
            System.out.println("|\t\t1. Reserve de butacas\t\t\t\t\t|");
            System.out.println("|\t\t2. Cierre de ventanilla\t\t\t\t|");
            System.out.println("-->");
            opcion = scan.nextInt();
            if(opcion ==1){
                int numeroEntradas = scan.nextInt();
                int contador=0;
                while(contador<numeroEntradas){
                    System.out.println("Cuantas entradas quieres?");
                   comprado =false;
                   System.out.println("Por favor indicar asiento con una A o precio con una P:");
                   decisionBusqueda(scan.next().charAt(0));
                   if(comprado ==true){
                       contador++;
                   }
                }
            }
        } while (opcion!=2);
        
        return "";
    }
    
    public void mostrarButacas(){
            for (int i = 0; i < 9; i++) {
            System.out.print("Fila"+(i+1));
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+Asientos[i][j]);    
            }
            System.out.println("");
        }
            System.out.println("\t\t Bienvenidos Fols! | Multicines ChockyLandParty | r ");
    }
    public int[][] cargarAsientos (){
        int[][] element2d = new int[9][10];
            for (int i = 0; i < 9; i++) {
                element2d[i] =(int[]) Pila2.pop();
            }
        return element2d;
    }
    public void decisionBusqueda(char letra){

        if (letra=='A') {
            int fila =0;
            int columna = 0;
            System.out.println("Por favor elegir la fila:");
            fila = scan.nextInt();
            System.out.println("Por favor elegir la columna");
            columna = scan.nextInt();
            System.out.println(porAsiento(fila-1,columna-1));
        }
        else if(letra=='P'){
            int precio =0;
            System.out.println("Por favor elige por precio (10,20,30,40,50)");
            precio =scan.nextInt();
            System.out.println(porPrecio(precio));
        }
    
    }
    public String porAsiento(int fila,int asiento ){
        if(Asientos[fila][asiento]!=0){
            Asientos[fila][asiento]=0;
            comprado = true;
            return "Enhorabuena este asiento esta libre para ti";         
        }
        else{
            return "Este asiento no esta vacio y debes elegir otro";
        }
    }
    public String porPrecio(int precio){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (Asientos[i][j]== precio) {
                     Asientos[i][j]=0;
                     comprado = true;
                     return "Esta butaca fila"+(i+1)+" ,columna "+(j+1)+" esta vacia y la puedes coger";

                } 
            }
        }
        return "no me quedan butacas libre por ese precio";
    }

}

