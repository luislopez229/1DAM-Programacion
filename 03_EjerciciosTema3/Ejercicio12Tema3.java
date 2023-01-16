package ejercicio12tema3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio12Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> nota = new ArrayList<>();
        int introducido = 0;
        double media = 0;
        while (introducido != -1) {
            System.out.println("Introduce la nota del alumno (0-10, "
                    + "introducir un -1 muestra la mayor nota, "
                    + "la menor y la nota media)");
            introducido = new Scanner(System.in).nextInt();

            if (introducido > 10 || introducido < -1) {
                System.out.println("Valor no válido, introduce otra"
                        + " vez el valor");
                introducido = new Scanner(System.in).nextInt();
            }

            if (introducido == -1) {
                Collections.sort(nota);
                System.out.println("--Mayor nota--");
                System.out.println(nota.get(nota.size() - 1));

                System.out.println("--Menor nota--");
                System.out.println(nota.get(0));

                System.out.println("--Media total--");

                for (int x = 0; x < nota.size(); x++) {
                    media = media + nota.get(x);
                }

                media = media / (nota.size());

                System.out.println(media);

            }

            nota.add(introducido);

        }

    }

}
