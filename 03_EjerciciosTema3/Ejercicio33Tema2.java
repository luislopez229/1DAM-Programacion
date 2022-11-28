package ejercicio33tema2;
import bpc.daw.reproductor.*;
import java.io.IOException;
/**
 *
 * @author luis
 */
public class Ejercicio33Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayList pl = new PlayList();
        pl.setTitulo("Lista De Ejemplo");
        //Las canciones están en el directorio raíz del proyecto
        ArchivoMP3 m1 = new ArchivoMP3("crumbling-castle.mp3");
        ArchivoMP3 m2 = new ArchivoMP3("deer-dance.mp3");
        ArchivoMP3 m3 = new ArchivoMP3("holy-diver.mp3");
        ArchivoMP3[] a = {m1,m2,m3};
        pl.añadirVarias(a);
       
        
        try {
        //La playlist está en la carpeta src del proyecto
            pl.guardar("./src/playlist.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        Reproductor r = new Reproductor(pl,true,false);
        r.play();
    }
    
}
