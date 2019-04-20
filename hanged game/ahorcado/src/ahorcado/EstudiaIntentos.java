/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author alejandrocruz
 */
public class EstudiaIntentos {
     int correctas =0;
     int incorrectas = 0;

    public int getIncorrectas() {
        return incorrectas;
    }


 
    public int getCorrectas() {
        return correctas;
    }
    public static String[] palabras ={"camion","mentirijilla","antano","ballenato","trotamundos","write","monkey",
                                                        "monkey","dog","tiger","rabbit","dragon","caballo","hipica"};
    
    
    public static boolean esCorrecta;
    
        public static String obtenerPalabra(){

            return palabras[(int)(Math.random()*palabras.length)];
            
        
        }
    //this.dispose();
        public static String obtenerPalabraOculta(String palabra){
            String oculta = "";
            for(int i = 0;i<palabra.length();i++){
                oculta+="*";
           
            
            }
            return oculta;
        }
         public String obtenerIntento(String palabra,String palabraEscondida,char ch){
            esCorrecta = false;
            
             System.out.println(correctas);
            StringBuilder s = new StringBuilder(palabraEscondida);
            int entro =0;
            for(int i =0;i<palabra.length();i++){
               
                if(ch==palabra.charAt(i)&&s.charAt(i)=='*'){
                    correctas++;
                    System.out.println("correctas"+correctas);
                    entro++;
                //esCorrecta = false;
                s = s.deleteCharAt(i);
                s = s.insert(i,ch);
                }
                
                    
                
            }
         if(entro==0){
                    incorrectas++;}
                                System.out.println("incorrectas"+incorrectas);

         return s.toString();
        }
        public static boolean yaEstaEnPalabra(String palabraEscondida,char ch){
            for(int i =0;i<palabraEscondida.length();i++){
                if(ch == palabraEscondida.charAt(i)){
                return true;
                }
            
            }
            return false;
        
        }

        }

    

