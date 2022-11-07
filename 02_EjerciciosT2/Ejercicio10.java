package ejercicio10;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c;
        String m;
        m="Hola";
        c = new Caja(m);
        c.abrirCaja();
        System.out.println("Caja antes de cambiar el mensaje: "+c.getMensaje());
        c.cambiarMensaje("Adios");
        System.out.println("Caja después de cambiar el mensaje: "+c.getMensaje());
    }
    
}
