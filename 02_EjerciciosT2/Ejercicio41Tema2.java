package ejercicio41tema2;

/**
 *
 * @author luis
 */
public class Ejercicio41Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double d=(Math.pow((0.38*4.93),-0.36));
        System.out.println("Resultado sin redondear:" +d);
        System.out.println("Resultado redondeado:" +Math.round(d));
    }
    
}
