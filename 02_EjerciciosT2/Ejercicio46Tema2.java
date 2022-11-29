package ejercicio46tema2;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author luis
 */
public class Ejercicio46Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio=(int) (Math.random() * 11);
        
        try{
            Instant antes =Instant.now();
            Thread.sleep(aleatorio*1000);
            Instant despues =Instant.now();
            
            System.out.println("Instante antes de la pausa: "+antes);
            System.out.println("Instante después de la pausa: "+despues);
           
            Duration fin = Duration.between(antes,despues);
            System.out.println("Duración de la pausa: "+fin.getSeconds());
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    
}
