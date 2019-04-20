/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad1;

/**
 *
 * @author alejandrocruz
 */
public class Linea2D extends Punto2D {
    
    Punto2D Pfinal ;

    Linea2D(double x,double y,Punto2D Punto2D){
        super(x,y);
        Pfinal =  Punto2D;
    }

    @Override
    public String toString(){
        return "punto inicial:("+super.getX() +"," +super.getY()+") y punto final("+Pfinal.getX()+" , "+Pfinal.getY()+")";
    }

}
