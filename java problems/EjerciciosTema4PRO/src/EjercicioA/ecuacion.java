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
public class ecuacion {
    private double a =0;
    private double b =0;
    private double c =0;
    
    public ecuacion(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    
    }
    
    private String operacion(int numeroOp){
        double primera = 0;
        double segunda = 0;
        double b2=Math.pow(b, 2);
        if (numeroOp==2){
            primera = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
            segunda = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
            return " "+primera+"  "+segunda;
        }
        else if (numeroOp==1){
            primera=(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
            return " "+primera+"  ";
        }
        return "No hay soluciones manolo";
    }
    
    public void discriminante (){
        double resultado = Math.pow(b, 2)-4*a*c;
        int numeroOp =0;
        
            if(resultado>0){
                numeroOp=2;
            }
            else if (resultado == 0){
                numeroOp=1;
            }
            else{
                numeroOp=0;
            }
            System.out.println(" "+ operacion(numeroOp));
        }
}
