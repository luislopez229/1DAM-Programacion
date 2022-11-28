package ejercicio34tema2;
import bpc.daw.reproductor.*;
import java.io.IOException;
/**
 *
 * @author luis
 */
public class Ejercicio34Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        //Las canciones están en el directorio raíz del proyecto
        //La playlist está en la carpeta src del proyecto
        PlayList pl = new PlayList("./src/playlist.txt");
        
        Reproductor r = new Reproductor(pl,true,false);
        r.play();
        
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
