package ejercicio15tema2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio15tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave = "123";
        System.out.println("Introduzca la contraseña");
        String pass = new Scanner(System.in).nextLine();
        
        if (pass.equals(clave)){
        System.out.println("Correcto");
        }else{
        System.out.println("Incorrecto");
        }
    }
    
}
