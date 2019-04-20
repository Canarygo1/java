/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja1;

/**
 *
 * @author alejandrocruz
 */
public class EjercicioD {
    public static void main(String[]args){
        double[] miLista = {2.5,3.5,1.99,1.25,8.75,5.5,4.25,6,7.75,4.25};
        String[] miLista2 = {"Giusseppe","Martina","Donald","Spinette","Mr.Bean","Jordi","Punchi","Pagafantas","Epi","Blas"};
        System.out.print("La nota mas alta se encuentra"+EjercicioD2.notaAlta(miLista));
        EjercicioD2.buscar(miLista,miLista2);
    }
    
}
