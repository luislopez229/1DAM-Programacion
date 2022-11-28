package ejercicio32tema2;

import bpc.daw.reproductor.*;
/**
 *
 * @author luis
 */
public class Ejercicio32Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //La canción está en el directorio raíz del proyecto
        ArchivoMP3 m = new ArchivoMP3("logical-song.mp3");
        Reproductor r = new Reproductor(m,false,false);
        r.play();
        System.out.println(m.getTitulo()+" / "+m.getAutor()+" - "+m.getDuracion());
    }
    
}
