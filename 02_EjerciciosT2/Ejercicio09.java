package ejercicio09;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c;
        String m;
        m="Bienvenidos al instituto";
        c = new Caja(m);
        c.cerrarCaja();
        System.out.println("Con la caja cerrada: "+c.getMensaje());

        c.abrirCaja();
        System.out.println("Con la caja abierta: "+c.getMensaje());
        
    }
    
}
