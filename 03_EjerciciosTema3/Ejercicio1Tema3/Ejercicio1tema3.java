package ejercicio1tema3;

import java.util.Scanner;
import bpc.daw.reproductor.*;
/**
 *
 * @author luis
 */
public class Ejercicio1tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta = "";
        String [] mp3s={"logical-song.mp3","holy-diver.mp3","deer-dance.mp3","dare.mp3","crumbling-castle.mp3"};
    
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" 1. - Logical Song / Supertramp");
        System.out.println(" 2. - Holy Diver / Dio");
        System.out.println(" 3. - Deer Dance / System of a Down");
        System.out.println(" 4. - DARE / Gorillaz");
        System.out.println(" 5. - Crumbling Castle / King Gizzard");
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println("Introduce el número de la canción");
        int num = new Scanner(System.in).nextInt();
        switch(num){
            case 1:
                respuesta = mp3s[num-1];
                System.out.println("Reproduciendo: "+mp3s[num-1]);
                break;
            case 2:
                respuesta = mp3s[num-1];
                System.out.println("Reproduciendo: "+mp3s[num-1]);
                break;
            case 3:
                respuesta = mp3s[num-1];
                System.out.println("Reproduciendo: "+mp3s[num-1]);
                break;
            case 4:
                respuesta = mp3s[num-1];
                System.out.println("Reproduciendo: "+mp3s[num-1]);
                break;
            case 5:
                respuesta = mp3s[num-1];
                System.out.println("Reproduciendo: "+mp3s[num-1]);
                break;
        }
       ArchivoMP3 amp3 = new ArchivoMP3(respuesta);

       Reproductor repro = new Reproductor(amp3,true,false);
       repro.play();
    }
    
}
