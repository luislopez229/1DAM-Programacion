package ejercicio13tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio13tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Escribe tu nombre");
    String nombre = new Scanner(System.in).nextLine();
    System.out.println("Tu nombre en mayúsculas: "+nombre.toUpperCase());
    System.out.println("Tu nombre en minúsculas: "+nombre.toLowerCase());
    System.out.println("Total de caracteres de tu nombre: "+nombre.length());
    }
    
}
