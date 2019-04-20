/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioA;

/**
 *
 * @author alejandrocruz
 */
public class sumaSeries {
    Series serie = new Series();
    public void calculo(){
        
        for (int i = 1,j=1;i<=20;i++){
            if(i>=13){
            System.out.printf(i+"\t %.4f \t",serie.getserieNormal(j));
            System.out.printf(i+"\t %.4f \t \n",4*serie.getseriePi(i));
            j++;
            }
            else{
            serie.getseriePi(i);
            
                if(i>3){
                serie.getserieNormal(j);
                j++;
                }
            }
        
        } 
    }
}
