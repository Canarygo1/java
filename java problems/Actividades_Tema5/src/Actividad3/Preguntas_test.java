/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad3;

/**
 *
 * @author alejandrocruz
 */
public class Preguntas_test extends Preguntas {
    String incorrecta1 = "";
    String incorrecta2 = "";
    boolean unolleno = false;
    String todas = "";
    int contador =0;

    Preguntas_test(){

    } 
    public void setPregunta(String enunciado){
        super.setEnunciado(enunciado);
    
    }
    public void decideRespuesta(String Completo){
        String[] parts = Completo.split(" ");
        String part1 = parts[0]; // 004
        contador++;
        todas = todas+contador+": "+parts[0]+"\n";
        
        String part2 = parts[1]; // 034556
        
        if (part2.equals("true")) {
            super.setRespuesta(part1);
        }
        else if(part2.equals("false")&&unolleno==false){
            incorrecta1 = part1;
            unolleno = true;
            System.out.println(incorrecta1);
        }
        else if(part2.equals("false")&&unolleno==true){
            incorrecta2 = part1;
            unolleno = false;
            System.out.println(incorrecta2);

        }
    }
    
    @Override
    public String toString(){
        return (todas)+" "+incorrecta1+" "+incorrecta2;
    
    }
}
