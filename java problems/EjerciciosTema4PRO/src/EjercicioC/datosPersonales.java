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
public class datosPersonales {
   Scanner scan = new Scanner(System.in);
   private String Nombre ="";
   private String Apellido="";
   private int agno =0;
   private int mes = 0;
   private int dia = 0;
   private int edad =0;
   //getter
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    public int getedad(){
        return edad;
    }
 //almaceno la fecha de nacimiento en una variable  privada tal y como se pide en el enunciado
 
    datosPersonales(String Nombre,String Apellido,int agno,int mes,int dia){
       this.Apellido = Apellido;
       this.Nombre = Nombre;
       this.agno = agno;
       this.dia = dia;
       this.mes = mes;
       edad= edad();
    }
 
 
    private int edad(){
        Calendar FechaNacimiento = new GregorianCalendar(agno, mes, dia);
        Calendar FechaActual = new GregorianCalendar();

        int edad = (FechaActual.get(GregorianCalendar.YEAR)-FechaNacimiento.get(GregorianCalendar.YEAR));
        edad--;
           if(FechaActual.get(GregorianCalendar.MONTH)>=FechaNacimiento.get(GregorianCalendar.MONTH)){            
                edad++;
                //se compara con el mes actual para saber si el usuario ha pasado su mes de cumpleanos o no.
            }
        return edad;
    }

}
