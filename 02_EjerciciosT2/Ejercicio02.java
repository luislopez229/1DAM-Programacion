package Ejercicio02;
import bpc.daw.mario.*;
/**
 *
 * @author luis
 */
public class Ejercicio02{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mario m1,m2,m3 = null;
        Luigi l1 = null;
        Seta s1 = null;
        Planta p1,p2,p3 = null;
        Disparo d1 = null;
        Ca�on c1 = null;
        
       m1 = new Mario(100);
       m2 = new Mario(640,320);
       s1 = new Seta(0,0);
       c1 = new Ca�on(100,320);
       p1 = new Planta(400,500);
       p2 = new Planta(450,500);
       p3 = new Planta(500,500);
       l1 = new Luigi(200);
       m3 = new Mario(l1,50);
    }
    
}
