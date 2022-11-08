package ejercicio21tema2;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio21tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce una ruta");
        String ruta=new Scanner(System.in).nextLine();
        File f;
        f = new File(ruta);
        
        if (f.isDirectory()){
        
            String[] num=f.list();
            System.out.println("Número total de archivos y carpetas: "+num.length);   
        }else{
            System.out.println("No es un directorio");
        }
    }
    
}
