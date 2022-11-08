package ejercicio17tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio17tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("¿Cuál es tu nombre?");
        String t1 = new Scanner(System.in).nextLine();
        System.out.println("¿Cuál es tu dominio?");
        String t2 = new Scanner(System.in).nextLine();
        
        if (t2.endsWith(".com") || t2.endsWith(".es")){
        String correo = t1 + "@" + t2;
        System.out.println("Tu correo es: "+correo);
        }{
        System.out.println("Dominio incorrecto");
        }
    }
    
}
