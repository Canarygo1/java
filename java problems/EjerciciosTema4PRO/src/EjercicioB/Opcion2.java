/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioB;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class Opcion2 {
    rectangulo[] usuarios = new rectangulo[5];
    int user=0;
    int user2=0;
    int user3=0;
    double minX=0.0;
    double minY=0.0;
    double maxX=0.0;
    double maxY=0.0;
    Scanner scan = new Scanner(System.in);
    
    public void correr(){
        
        System.out.println("Introducir las coordenadas de 5 jugadores para la partida inicial");
    
        
            for(int i=0;i<usuarios.length;i++){
                usuarios[i] = new rectangulo(scan.nextDouble(),scan.nextDouble());

            }
            minY=usuarios[0].y;
            minX=usuarios[0].x;
            menores();
            max();
             System.out.println("--- Jugadires por orden de entrada---");
            for (int i = 0; i < usuarios.length; i++) {

                System.out.println("\t\t"+usuarios[i].x+"\t\t"+usuarios[i].y);
        }
            System.out.println("El area de juego tiene de centro las coordenadas ("+centroX()+","+centroY()+") de ancho"+
                    ancho()+"y altura"+alto());
            dlcArmaExterminadora();
}
    
    public void menores(){
        for(int i =0;i<usuarios.length;i++){
            if(usuarios[i].x<minX){
               minX=usuarios[i].x;
            }
            
           if(usuarios[i].y<minY){
               minY=usuarios[i].y;

           }
           
        }
    }
    
    public void max(){
        for(int i =0;i<usuarios.length;i++){
            
            if(usuarios[i].x>maxX){
               maxX=usuarios[i].x;
            }
            if(usuarios[i].y>maxY){
               maxY = usuarios[i].y;
           }
        }
    }
    
    public double ancho(){
    return maxX-minX;
    }
    
    public double alto(){
    return maxY -minY;
    }
    
    public double centroY(){
    return alto()/2+minY;
    
    } 
    public double centroX(){
    return ancho()/2+minX;
    
    }
    public void dlcArmaExterminadora(){
        System.out.println("Indicar tres jugadores U1,U2 y U3 (U3 es el usuario)para ver si estan alineadas con un numero del 1 al 5:");
        user = scan.nextInt()-1;
        user2 = scan.nextInt()-1;
        user3 = scan.nextInt()-1;
        if (metodoLinea(usuarios[user].x,usuarios[user].y,usuarios[user2].x,usuarios[user2].y,usuarios[user3].x,usuarios[user3].y)){
            System.out.println("Alieneadooos!! ("+usuarios[user3].x+" , "+usuarios[user3].y+")esta sobre el mismo segmento que va"
                    + "desde ("+usuarios[user].x+" , "+usuarios[user].y+") a ("+usuarios[user2].x+" , "+usuarios[user2].y);
        }
        
    }
    public static boolean metodoLinea(double x0, double y0, double x1, double y1, double x2, double y2) {
return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0; }
}
