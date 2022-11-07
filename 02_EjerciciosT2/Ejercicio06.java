package ejercicio06;
import bpc.daw.mario.*;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la coordenada X del nuevo Mario");
        int coorx = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada Y del nuevo Mario");
        int coory = new Scanner(System.in).nextInt();
        
        Mario m3;
        
        m3 = new Mario(coorx,coory);
    }
    
}
