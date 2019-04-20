/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioB;

/**
 *
 * @author alejandrocruz
 */
public class circulo {
    private double x = 0;
    private double puntoy = 0;
    private double radio = 0;
    private double usuariox = 0;
    private double usuarioy = 0;   
    
     circulo(double puntox,double puntoy,double radio) {
        //se le puede pasar un array para evitar todas las declaraciones de arriba
        this.x = puntox;
        this.puntoy = puntoy;
        this.radio = radio;

    }
    
     public void setUsuario(double usuariox,double usuarioy){
         this.usuariox=usuariox;
         this.usuarioy=usuarioy;
    }
     
    public double areaCirculo(){
    return Math.PI*Math.pow(radio, 2);
    
    }
    
    public double perimetro(){
    return 2*Math.PI*radio;
    }
    
    public String estaDentro(){
        if (usuariox>(x+radio) || usuariox<(x-radio)){
           return "--> EL usuario no esta dentro del area de influencia"; 
        
        }
        else if(usuarioy>(puntoy+radio) || usuarioy<(puntoy-radio)){
        return "--> EL usuario no esta dentro del area de influencia"; 
    
        }
        else{
        return "--> EL usuario esta dentro del area de influencia!!"; 
        }
        
    }
    public void compararCirculos (circulo circulo2){
    
        double distancia = Math.pow((x-circulo2.x)*(x-circulo2.x)+
                (puntoy-circulo2.puntoy)*(puntoy-circulo2.puntoy),0.5);
        
        if (distancia +circulo2.radio<=radio){
            System.out.println("Si la contiene ");
        
        }
        else if (distancia<=radio+circulo2.radio){
            System.out.println("El area circular tiene un solape parcial con el area circular principal");
        
        }
    }
    
    
}