package ejercicio18tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio18tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Cuál es tu email?");
        String t1 = new Scanner(System.in).nextLine();
        
        int limite =t1.indexOf("@");
        
        System.out.println("- Tu nombre de usuario es: "+t1.substring(0, limite));
        System.out.println("- Tu dominio es: "+t1.substring(limite+1,t1.length()));
    }
    
}
