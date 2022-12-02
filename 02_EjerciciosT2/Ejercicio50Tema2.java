package ejercicio50tema2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis
 */
public class Ejercicio50Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        
        //a
        lista.add("Palabra1");
        lista.add("Palabra2");
        lista.add("Palabra3");
        lista.add("Palabra4");
        lista.add("Palabra5");
        //b
        System.out.println("Tamaño de la lista: "+lista.size());
        //c
        System.out.println("Palabra en la posición 3: "+lista.get(3));
        //d
        System.out.println("Método toString: "+lista.toString());
        //e
        lista.remove(0);
        //f
        System.out.println("Tamaño de la lista: "+lista.size());
        //g
        System.out.println("Palabra en la posición 3: "+lista.get(3));
        //h
        System.out.println("Método toString: "+lista.toString());
    }
    
}
