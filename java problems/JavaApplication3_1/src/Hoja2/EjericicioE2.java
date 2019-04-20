/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoja2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author alejandrocruz
 */
public class EjericicioE2 {
    String [] Correctas = new String [] {"E", "B","D","C","A","D","B","E","A","D"};
    
    public static void Recoger(){
    Scanner scan = new Scanner(System.in);

    System.out.println("Introduzca el numero de estudiantes :");
    int nEstudiantes=scan.nextInt();
    String [] Introducido = new String[nEstudiantes];
    String[] nombres = new String[nEstudiantes];
    for(int i = 0;i<nEstudiantes;i++){
        System.out.println("Introducir el nombre estudiantes #"+i+" Nombres: ");
        nombres[i]=scan.nextLine();
            System.out.print("Introducir las respuestas: ");
            
            Introducido[i]=scan.nextLine();
            
    System.out.println(Arrays.toString(Introducido));
        }
    
    
    }
    
    
}
