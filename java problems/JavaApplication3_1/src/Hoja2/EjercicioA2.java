/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;

import java.util.Scanner;

/**
 *
 * @author alejandrocruz
 */
public class EjercicioA2 {
    
    @Override
    public String toString(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero de telefono  ");
        String numero = scan.nextLine();
        String ordenados = EjercicioA.Ordenar12(numero);
        StringBuilder anadir = new StringBuilder(ordenados); 
        anadir.insert(2,"00");
        anadir.insert(anadir.length()-2,"/");
        
        
        return ("la cadena es"+anadir);
    }
    
}
