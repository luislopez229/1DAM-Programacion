package ejercicio12;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcadorBaloncesto mb1;
        
        mb1 = new MarcadorBaloncesto("Estudiantes","CB Granada");
        mb1.anotarCanasta('L', 2);
        mb1.anotarCanasta('V', 3);
        mb1.anotarCanasta('L', 2);
        mb1.anotarCanasta('V', 2);
        mb1.anotarCanasta('V', 3);
        mb1.anotarCanasta('L', 1);
        mb1.anotarCanasta('L', 1);
        mb1.anotarCanasta('V', 2);
        System.out.println(mb1.getNombreLocal() +" -- "+mb1.getNombreVisitante());
        System.out.println(mb1.getPuntosLocal()+" -- "+mb1.getPuntosVisitante());
        System.out.println("Ganador: "+mb1.getNombreEquipoGanador());
        System.out.println("Pierde: "+mb1.getNombreEquipoPerdedor());
    }
    
}
