package ejercicio11tema3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio11Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean salir = false;
        int resp;
        String dni;
        String nombre;
        String direccion;
        String numero;

        while (salir == false) {
            System.out.println("1.- Añadir nuevo alumno");
            System.out.println("2.- Ver los datos de un alumno");
            System.out.println("3.- Salir");

            resp = new Scanner(System.in).nextInt();

            if (resp == 1) {
                System.out.println("----------------");
                System.out.println("Introduce el DNI");
                dni = new Scanner(System.in).nextLine();
                System.out.println("Introduce el nombre");
                nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduce la dirección");
                direccion = new Scanner(System.in).nextLine();
                System.out.println("Introduce el número de teléfono");
                numero = new Scanner(System.in).nextLine();

                try {
                    PrintWriter pw = new PrintWriter(dni+".txt");
                    pw.println(nombre);
                    pw.println(direccion);
                    pw.println(numero);
                    pw.close();
                    System.out.println("----------------");

                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (resp == 2) {
                System.out.println("Introduce el DNI a consultar");
                dni = new Scanner(System.in).nextLine();
                System.out.println("----------------");
                try {
                    FileReader fr = new FileReader(dni+".txt");
                    BufferedReader br = new BufferedReader(fr);

                    try {
                        while (br.ready()) {
                            System.out.println(br.readLine());
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("----------------");
            }

            if (resp == 3) {
                System.out.println("Programa finalizado");
                salir = true;
            }

        }

    }

}
