package ejercicio05;
import bpc.daw.mario.*;
/**
 *
 * @author luis
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ca�on c1,c2 = null;
        c1 = new Ca�on (200,400);
        c2 = new Ca�on (300,400);
        
        c1.disparar(100,400);
        c1.pensar();
        c1.disparar(50,400);
        
        c2.disparar(350,400);
        c2.pensar();
        c2.disparar(400,400);
        c2.pensar();
        c2.disparar(450,400);
        
        int totalc1= c1.getTotalDisparosRealizados();
        int totalc2=c2.getTotalDisparosRealizados();
        System.out.println("Total de disparos del primer cañon: "+totalc1);
        System.out.println("Total de disparos del segundo cañon: "+totalc2);
    }
    
}
