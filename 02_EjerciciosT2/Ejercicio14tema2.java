package ejercicio14tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio14tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce frase");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println(frase.charAt(frase.length()/2));
    }
    
}
