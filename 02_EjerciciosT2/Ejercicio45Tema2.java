package ejercicio45tema2;

import java.time.*;

/**
 *
 * @author luis
 */
public class Ejercicio45Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate fecha= LocalDate.of(2100,2,28);
        DayOfWeek dia =fecha.getDayOfWeek();
        System.out.println(dia);
    }
    
}
