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
public class Punto2D {
    private Double x,y;
    
    public Punto2D(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public Punto2D(Double x,Double y){
        this.x = x;
        this.y = y;
    }
    
    public Double getX(){
        return this.x;
    } 
    public void setX(Double x){
        this.x = x;
    }
    public Double getY(){
        return this.y;
    }
    public void setY(Double y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "("+this.x+" , "+this.y+")";
    }
}
