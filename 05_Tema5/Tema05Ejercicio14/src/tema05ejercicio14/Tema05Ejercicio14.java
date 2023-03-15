package tema05ejercicio14;

/**
 *
 * @author luis
 */
public class Tema05Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorContraseñas g;
        
        g = new GeneradorContraseñas();
        
        System.out.println(g.generarContraseña(6));
    }
    
}
