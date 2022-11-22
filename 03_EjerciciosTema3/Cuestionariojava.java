package cuestionariojava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Cuestionariojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] lista={"abstract","assert","boolean","break","byte","case","catch","char",
            "class","const","continue","default","do","double","else","enum","extends","final","finally","float",
            "for","goto","if","implements","import","instanceof","int","interface","long","native","new","package","private",
            "protected","public","return","short","static","strictfp","super","switch","synchronized","this","throw","Throws",
            "transient","try","void","volatile","while"};
        ArrayList<String> acertadas = new ArrayList<>(lista.length);
        System.out.println("Introduce una palabra reservada de Java");
        String resp = new Scanner(System.in).nextLine();
        
        int numero = 0;
        int nAcer = 0;
        boolean repetir = true;
        while (repetir == true){
            
            if(lista[numero].equals(resp) == true){
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println(resp+" es una palabra reservada");
                numero++;
                
                    if(acertadas.contains(resp)==false){
                    nAcer++;
                    System.out.println("Número de aciertos: "+nAcer+", te quedan: "+((lista.length)-nAcer));
                    acertadas.add(resp);
                    }else{
                        System.out.println("Repetida");
                    }
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                System.out.println("Introduce otra, escribe X para terminar");
                resp = new Scanner(System.in).nextLine();
                    
                    if(resp.equals("X") || resp.equals("x")){
                        System.out.println("Saliendo...");
                        System.out.println("Aciertos: "+nAcer);
                        repetir = false;
                    }
   
                numero=0;
            }else{
                numero++;
                if (numero == (lista.length-1) && !resp.equals("while")){
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                    System.out.println("No es, introduce otra o escribe X para terminar");
                    resp = new Scanner(System.in).nextLine();
                            if(resp.equals("X") || resp.equals("x")){
                                System.out.println("Saliendo...");
                                System.out.println("Aciertos: "+nAcer);
                                repetir = false;
                            }
                numero=0;
                }
            }
        }
    }
}
