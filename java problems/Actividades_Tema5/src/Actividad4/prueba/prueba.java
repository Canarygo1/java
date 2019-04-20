/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad4.prueba;

/**
 *
 * @author alejandrocruz
 */
public class prueba {
    public static void main(String[] args) {
        try{
            int result =divideInt(10,5);
            System.out.println("10 divided by 5 is "+result);
            NewClass newClass = new NewClass();
               newClass.hole(0);

        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage()+"hola que tal");
        
        }
    }
    public static int divideInt(int i,int j){
        if(j==0){
            throw new IllegalArgumentException("Divisor cannot be zero");
       }
    return i/j;
    }

}
