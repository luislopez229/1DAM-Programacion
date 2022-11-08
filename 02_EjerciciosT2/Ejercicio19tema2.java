package ejercicio19tema2;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio19tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una ruta");
        String ruta=new Scanner(System.in).nextLine();
        File f;
        f = new File(ruta);
        long fMB = f.length() / (1024 * 1024);
        System.out.println("Espacio ocupado en bytes: "+f.length());
        System.out.println("Espacio ocupado en MegaBytes: "+fMB);
    }
    
}
