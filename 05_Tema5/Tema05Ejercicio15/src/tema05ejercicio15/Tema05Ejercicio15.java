package tema05ejercicio15;

/**
 *
 * @author Luis
 */
public class Tema05Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorContraseñasUnicas gu;
        gu = new GeneradorContraseñasUnicas();
        
        System.out.println(gu.generarContraseña());
        System.out.println(gu.generarContraseña());
        System.out.println(gu.generarContraseña());
        System.out.println(gu.generarContraseña());
        
    }
    
}
