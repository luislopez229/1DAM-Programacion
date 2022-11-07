package ejercicio11;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1,c2;
        c1 = new Caja("Hola muy buenos dias");
        c2 = new Caja("Tengo un perro blanco");
        
        c1.abrirCaja();
        c2.abrirCaja();
        
        System.out.println("Mensaje CAJA 1: "+c1.getMensaje());
        System.out.println("Mensaje CAJA 2: "+c2.getMensaje());
        
        System.out.println("Cambiamos");
        
        String s1 = c1.getMensaje();
        String s2 = c2.getMensaje();
        c1.cambiarMensaje(s2);
        c2.cambiarMensaje(s1);
        
        System.out.println("Mensaje CAJA 1: "+c1.getMensaje());
        System.out.println("Mensaje CAJA 2: "+c2.getMensaje());
    }
    
}
