package ejercicio04;
import bpc.daw.mario.*;
/**
 *
 * @author luis
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Luigi l1 = null;
        Mario m1 = null;
        
        l1 = new Luigi(500);
        m1 = new Mario(l1, 20);
        
        int xl1 = l1.getX();
        int yl1 = l1.getY();
        
        int xm1=m1.getX();
        int ym1=m1.getY();
        
        System.out.println("Coordenadas de Luigi: X:" +xl1+" Y: "+yl1);
        System.out.println("Coordenadas de Mario: X:" +xm1+" Y: "+ym1);
    }
    
}
