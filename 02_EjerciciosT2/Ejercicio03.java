package ejercicio03;
import bpc.daw.mario.*;
/**
 *
 * @author luis
 */
public class Ejercicio03 {

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
        Cañon c1 = null;
        
       s1 = new Seta(300,300);
       c1 = new Cañon(100,320);
       p1 = new Planta(400,500);
       p2 = new Planta(450,500);
       p3 = new Planta(500,500);
       l1 = new Luigi(300,300);
       m3 = new Mario(l1,50);

       s1.andarHacia(0,0);
       m3.saltar();
       c1.disparar(300, 300);
       p1.comer(true);
       p2.comer(true);
       p3.comer(true);
    }
    
}
