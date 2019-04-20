/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author alejandrocruz
 */
public class Transacciones {
    
    private GregorianCalendar fecha;
    private char tipo;
    private double cantidad;
    private double balance;
    private double balancePrevio;
    private String concepto;
    private String operacion;
    
    Transacciones(double cantidad){
        this.cantidad= cantidad;
        fecha = new GregorianCalendar();
     }
    public void setBalancePrevio(double balancePrevio){
        this.balancePrevio=balancePrevio;
    }
    
    public void setConcepto(String concepto){
        this.concepto=concepto;
    }
    
    public void setTipo(char tipo){
        this.tipo=tipo;
        
        if(tipo=='I'){
            ingreso();
        }
        else if (tipo=='G'){
            gasto();
        }
    } 
    public void ingreso(){
        balance =balance+ cantidad;
        operacion ="Ingreso";
    }
    public void gasto(){
        balance =balance- cantidad;
        operacion ="gasto";
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void imprimir(){
        System.out.println("\n\t\t-Fecha de la operaciones: "+fecha.getTime());
        System.out.println("\t\t-tipo de operacion"+operacion);
        System.out.printf("\n\t\t-Cantidad exacta %.2f$ :",cantidad);
        System.out.printf("\n\t\t-Saldo neto %.2f$ \n",balancePrevio);
        System.out.println("\t\t-nconcepto "+concepto);

    }
}
