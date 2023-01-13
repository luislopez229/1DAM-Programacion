package ejercicio9tema3;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio9Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce un número positivo");
        double n = new Scanner(System.in).nextDouble();

        double s = 1;
        double a = 1;
        boolean fin = false;
        if (n >= 0) {

            while (fin == false) {
                s = 0.5 * (a + n / a);

                if (Math.abs((s - a)) < 0.000001) {
                    System.out.println("La raíz cuadrada aproximada es: " + s);
                    fin = true;
                } else {
                    a = s;
                }
            }

        } else {
            System.out.println("No es un número positivo");
        }
    }

}
