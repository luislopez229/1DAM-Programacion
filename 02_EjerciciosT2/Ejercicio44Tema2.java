package ejercicio44tema2;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author luis
 */
public class Ejercicio44Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaconbarra = fecha.format(dtf);
        System.out.println(fechaconbarra);
        
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaconguion = fecha.format(dtf2);
        System.out.println(fechaconguion);
    }
    
}
