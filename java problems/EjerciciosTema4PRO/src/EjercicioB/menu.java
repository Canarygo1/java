/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioB;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class menu {
    Scanner scan = new Scanner(System.in);
    public void menu(){
        boolean seguir = true;
        int seleccion = 0;
        while(seguir){
             System.out.println("|===================================================================================================================");
            System.out.println("\t\t\t\t\t"+"Operaciones Geometricas");
             System.out.println("|===================================================================================================================");
            System.out.printf("|\t Opciones a elegir\n");
            System.out.println("|\t 1.Opcion 1 : Analizar solape de las dos areas de red y localizacion de un usuario en la primera red");
            System.out.println("|\t 2.Opcion 2 : Calcular las coordenadas y dimensiones de un programa rectangular que contiene varios puntos");
            System.out.println("|\t 3.Salida");
             System.out.println("|===================================================================================================================");
            seleccion = scan.nextInt();
               
                 switch(seleccion){
                    case 1 :{
                    opcion1();
                    break;
                    }
                    case 2 :{
                    opcion2();
                    break;
                    }                    
                    case 3:{
                    System.exit(0);
                    }
                 }
        }
    }
    public void opcion1() {

        System.out.println("Metete unos datitos ahi");
   
        circulo circulo1 = new circulo(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
    
        System.out.println("AreaCirculo \n"+circulo1.areaCirculo()+"Perimetro"+circulo1.perimetro());
        System.out.println("Y ahora ponte un dato del eje x y y para el usuario");
        circulo1.setUsuario(scan.nextDouble(), scan.nextDouble());
        System.out.println(circulo1.estaDentro());
        System.out.println("Pon otro circulo para ver si esta dentro");
        circulo circulo2 = new circulo(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
        circulo1.compararCirculos(circulo2);
        
    }
    public void opcion2(){
        Opcion2 opcion2 = new Opcion2();
        opcion2.correr();
    }
}
