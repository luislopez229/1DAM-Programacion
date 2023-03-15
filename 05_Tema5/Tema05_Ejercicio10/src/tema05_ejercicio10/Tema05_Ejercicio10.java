package tema05_ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Tema05_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adivinanza a;
        a = new Adivinanza("Que","Si");
        
        System.out.println("ENUNCIADO");a.getEnunciado();
        
        try{
            System.out.println("RESPONDE");
            String respuesta = new Scanner(System.in).nextLine();
            a.comprobar(respuesta);
        }catch(AdivinanzaIncorrectaException | TiempoSuperadoException e){
            System.out.println(e.getMessage());
        }
    }
    
}
