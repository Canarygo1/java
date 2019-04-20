/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;
import java.lang.Math;
/**
 *
 * @author alejandrocruz
 */
public class Series {
    private double anterior = 0;
    private double anteriorPi =0;
    
    private double serieNormal(int i){
        
        anterior= anterior+(i/(i+1.0));
    return anterior ;
    }
    
   public double getserieNormal(int i){
   return serieNormal(i);
   }

    private double seriePi(int y){
        int contador = 0;
        int exponente = y+1;
        
            if(contador%2!=0){
                anteriorPi = anteriorPi-((Math.pow(-1, exponente))/(2*y-1));
                contador++;
            }
             else if (contador%2==0){
                anteriorPi = anteriorPi+((Math.pow(-1, exponente))/(2*y-1));
                contador++;
            }
            
    return anteriorPi;
    }
   
   public double getseriePi(int y){
   return seriePi(y);
   }
   
    public void pintar(){
        System.out.printf("\t %.4s\t \t \t %.4s \n","m(i)","m(j)");
        
        for(  int i =1;i<=10;i++){
            System.out.printf(i+"\t %.4f \t",serieNormal(i));
            System.out.printf(i+"\t %.4f \t \n",4*seriePi(i));
         }
        
    }

}
