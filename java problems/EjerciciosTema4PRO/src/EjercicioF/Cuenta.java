/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class Cuenta {
    private int id;
    private String nombre ;
    private double balance;
    private double tasaInteresAnual;
    private GregorianCalendar fechaSaldo;
    private ArrayList<Transacciones> operacion = new ArrayList<Transacciones>();
    Scanner scan = new Scanner(System.in);
    
    Cuenta(int id){
       this.id = id;
       fechaSaldo =  new GregorianCalendar();
 }
   public void setNombre(String Nombre){
              this.nombre= Nombre;

   }
   public void setBalance(double balance){
       this.balance= balance;
   }
    
    public void setInteres(double tasaInteresAnual){    
        this.tasaInteresAnual = tasaInteresAnual/100;
    }
    
    public double InteresAnual(){
            return tasaInteresAnual*30.0;
        }
    
    public double InteresMensual(){
            return (balance*InteresAnual())/365.0;
        }
    int numeroTransacciones = 0;
    public void Transacciones(){
         System.out.println("-->Indicar numero de transacciones efectuadas en la cuenta:");
          numeroTransacciones= scan.nextInt();
          System.out.println("Mete los datos en el siguiente orden numero de ingreso o gasto,letra G o I y concepto de la operacion");
            for (int i = 0; i < numeroTransacciones; i++) {
               operacion.add(new Transacciones(scan.nextDouble()));
               operacion.get(i).setBalancePrevio(balance);
               operacion.get(i).setBalance(balance);
               operacion.get(i).setTipo(scan.next().charAt(0));
               operacion.get(i).setConcepto(scan.nextLine());
               balance = operacion.get(i).getBalance();
            }
            imprimir();
    }
    public void imprimir(){
        System.out.println("Nombre"+nombre);
        System.out.printf("Balance %.2f$",balance);
        System.out.printf("Interes generado %.2f$\n",InteresMensual());
        System.out.println("Fecha de estado actual\n"+fechaSaldo.getTime());
         System.out.println("\t\tRELACION DE TRANSACCIONES EFECTUADAS Y CONCEPTO");
            for (int i = 0; i < numeroTransacciones; i++) {
                operacion.get(i).imprimir();
            }
    }
}