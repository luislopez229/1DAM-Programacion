package daw.persona;
import DNI.DNI;
import Persona.Persona;
import MarcadorBaloncesto.MarcadorBaloncesto;
import Punto.Punto;
import java.time.LocalDate;
/**
 *
 * @author luis
 */
public class DawPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI n;
        n = new DNI("78023268Q");
        
        Persona p;
        MarcadorBaloncesto mb;
        mb = new MarcadorBaloncesto("pepe","josemi",LocalDate.of(2000,4,4));
        System.out.println(mb.toString());
        
        Punto pt;
        
        pt = new Punto(20,3000);
        Punto pt2;
        pt2 = new Punto(100,100);
        Punto pt3;
        pt3 = new Punto(pt2);
        System.out.println(pt3.toString());
    }
    
}
