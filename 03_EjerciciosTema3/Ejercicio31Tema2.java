package ejercicio31tema2;
import bpc.daw.musica.*;
/**
 *
 * @author luis
 */
public class Ejercicio31Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotaMusical don= new NotaMusical(0,2);
        NotaMusical soln= new NotaMusical(4,2);
        NotaMusical lan= new NotaMusical(5,2);
        NotaMusical solb= new NotaMusical(4,1);
        NotaMusical fac= new NotaMusical(3,3);
        NotaMusical mic= new NotaMusical(2,3);
        NotaMusical res= new NotaMusical(1,4);
        NotaMusical mis= new NotaMusical(2,4);
        NotaMusical fas= new NotaMusical(3,4);
        String n=null;
        Cancion c = new Cancion(n);
        c.añadir(don);
        c.añadir(don);
        c.añadir(soln);
        c.añadir(soln);
        c.añadir(lan);
        c.añadir(lan);
        c.añadir(solb);
        c.añadir(fac);
        c.añadir(fac);
        c.añadir(mic);
        c.añadir(mic);
        c.añadir(res);
        c.añadir(mis);
        c.añadir(fas);
        c.añadir(res);
        c.añadir(don);
    Piano p = new Piano();
    p.reproducir(c);
    Guitarra g = new Guitarra();
    g.reproducir(c);
    }
    
}
