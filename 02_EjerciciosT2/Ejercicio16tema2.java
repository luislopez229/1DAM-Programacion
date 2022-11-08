package ejercicio16tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio16tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el texto 1");
        String t1 = new Scanner(System.in).nextLine();
        System.out.println("Introduzca el texto 2");
        String t2 = new Scanner(System.in).nextLine();
    
        boolean res=t1.contains(t2);
        System.out.println("¿El texto 2 está incluido en el texto 1?: "+res);
    }
    
}
