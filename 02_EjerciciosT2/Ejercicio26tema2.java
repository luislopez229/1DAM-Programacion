package ejercicio26tema2;
import java.util.*;
/**
 *
 * @author luis
 */
public class Ejercicio26tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t;

        System.out.println("¿Cuantos segundos quieres esperar?");
        long n = new Scanner(System.in).nextLong();
        
            try{
                t = new Thread();
                t.sleep(n*1000);
                System.out.println("Ya");
            }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    
}
