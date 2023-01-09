package javaapplication138;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class JavaApplication138 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] lista={"","","","",""};
        
        System.out.println("Introduce un nombre");
        
        for (int n = 0 ; n<5 ; n++){
        String nombre = new Scanner(System.in).nextLine();
        lista[n] = nombre;
            if(n != 4){
            System.out.println("Introduce otro nombre");
            }
        }
        
        System.out.println("La lista tiene: ");
        
        for (int num = 0 ; num < lista.length ; num++){
        System.out.println(lista[num]);
        }
    }
    
}
