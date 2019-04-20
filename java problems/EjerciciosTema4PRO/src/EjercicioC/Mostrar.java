/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioC;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class Mostrar {
        Scanner scan = new Scanner(System.in);
        
        private double balance = 0;
        private int id=0;
        private double tasaInteresAnual = 0;
        
        public void run(){
            System.out.println("\t\t\tDATOS PERSONALES");
            System.out.printf("--> Ingresar datos personales en este orden |\tnombre,apellido,agno,,mes y dia |:\n");
            datosPersonales Personal = new datosPersonales(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());
            
            
            System.out.println("--> Ingresar datos bancarios en este orden || ID(5 digitos,Balance de cuenta ($)|:");
            id = scan.nextInt();
            balance = scan.nextDouble();
            System.out.println("--> Indicar Tasa de interes anual aplicable en (%): ");
            tasaInteresAnual= scan.nextDouble();

            
            DatosCuenta cuentaUsuario = new DatosCuenta( id,balance,tasaInteresAnual);
            System.out.printf("id\t\tNombre y apellido\t\t\t\tEdad \n%5d\t\t %10s%10s  \t\t%2d\n",cuentaUsuario.getID(),Personal.getNombre(),
                                    Personal.getApellido(),Personal.getedad());
                    
                    System.out.println(""+cuentaUsuario.toString());
            

        }

}
