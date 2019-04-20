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
   */
public class DatosCuenta {
    private int ID = 0;
    private double balance = 0;
    private double tasaInteresAnual = 0;
    private Calendar Fecha; 
    
    DatosCuenta(int ID,double balance,double tasaInteres){
    this.ID = ID;
    this.balance=balance;
    this.tasaInteresAnual = tasaInteres/100;
    Fecha = new GregorianCalendar();
    
    }
        public int getID() {
            return ID;
        }

        public double getBalance() {
            return balance;
        }

         public double InteresAnual(){
            return tasaInteresAnual*30.0;
        }
        public double InteresMensual(){
            return (balance*InteresAnual())/365.0;
        }
                @Override
        public String toString(){

            return String.format("balance cuenta %.2f \n- Interes mensual generado:%.2f  \n"
                    + "Fecha de estado de la cuenta %2s ",balance,InteresMensual(),Fecha.getTime());

        }
}
