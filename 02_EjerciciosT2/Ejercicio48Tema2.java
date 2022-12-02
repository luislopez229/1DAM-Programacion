package ejercicio48tema2;
import bpc.daw.objetos.*;
/**
 *
 * @author luis
 */
public class Ejercicio48Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MarcadorMejorado mm = new MarcadorMejorado("Estudiantes",
                "CB Granada");
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL,
                MarcadorMejorado.NORMAL);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE,
                MarcadorMejorado.TRIPLE);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL,
                MarcadorMejorado.NORMAL);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE,
                MarcadorMejorado.NORMAL);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE,
                MarcadorMejorado.TRIPLE);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL,
                MarcadorMejorado.TIRO_LIBRE);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL,
                MarcadorMejorado.TIRO_LIBRE);
        mm.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE,
                MarcadorMejorado.NORMAL);
        System.out.println("Puntos del Estudiantes: "+mm.getPuntosLocal());
        System.out.println("Puntos del CB Granada: "+mm.getPuntosVisitante());
        System.out.println("Gana: "+mm.getNombreEquipoGanador());
        System.out.println("Pierde: "+mm.getNombreEquipoPerdedor());
        //De esta forma es mejor que en el ejercicio 12 porque puedes 
        //equivocarte menos que escribiendo solo el número, pero es más lento.
    }
    
}
