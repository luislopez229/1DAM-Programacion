package ejerciciotema4cafetera;

import Cafetera.Cafetera;

/**
 *
 * @author luis
 */
public class EjercicioTema4Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c;

        c = new Cafetera();

        System.out.println("Constructor");
        System.out.println(c.getCapacidadMaxima());
        System.out.println(c.getCantidadActual());

        System.out.println("Añadimos 800");
        c.agregarCafe(800);
        System.out.println(c.getCantidadActual());

        System.out.println("Servimos 200");
        c.servirTaza(200);
        System.out.println(c.getCantidadActual());

        System.out.println("Servimos 1000");
        c.servirTaza(1000);
        System.out.println(c.getCantidadActual());

        System.out.println("Agregamos 4000");
        c.agregarCafe(4000);
        System.out.println(c.getCantidadActual());
        
        System.out.println("Vaciamos");
        c.vaciarCafetera();
        System.out.println(c.getCantidadActual());
        
        c.agregarCafe(100);
        System.out.println(c.getCantidadActual());
        
        c.llenarCafetera();
        System.out.println(c.getCantidadActual());
    }

}
