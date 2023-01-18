package ejercicio8tema3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author luis
 */
public class Ejercicio8Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca una frase");
        String frase = new Scanner(System.in).nextLine();
        System.out.println("------------------------");
        
        StringTokenizer st = new StringTokenizer(frase, " ");

        while (st.hasMoreTokens() == true) {

            System.out.println(st.nextToken());
        }
    }

}
