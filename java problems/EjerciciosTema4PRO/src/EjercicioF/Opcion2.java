/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioF;

/**
 *
 * @author alejandrocruz
 */
public class Opcion2 {
    private int numero = 0;
    Opcion1Pila pilaPrimos = new Opcion1Pila();
    Opcion2(int numero){
        this.numero= numero;
    }
    public void totalNumerosPrimos(){
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            for (int j = 1; j < numero; j++) {
                if (i%j==0) {
                    contador++;
                }
            }
            if (contador<=2) {
                pilaPrimos.push(i);
              
            }
              contador=0;
        }
            while(!pilaPrimos.empty()){
            System.out.print(" "+pilaPrimos.pop());
            }
    
    }
}
