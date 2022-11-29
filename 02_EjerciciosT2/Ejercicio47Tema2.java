package ejercicio47tema2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio47Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de un archivo");
        String ruta = new Scanner(System.in).nextLine();
        File f = new File(ruta);
        
        Desktop d = Desktop.getDesktop();
        try{
        d.open(f);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
