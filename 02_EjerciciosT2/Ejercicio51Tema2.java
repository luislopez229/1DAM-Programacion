package ejercicio51tema2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author luis
 */
public class Ejercicio51Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //a
        set.add("silla");
        set.add("mesa");
        set.add("ni�o");
        set.add("mesa");
        set.add("casa");
        set.add("silla");
        set.add("l�piz");
        //b
        System.out.println("Tama�o del set: "+set.size());
        //c
        System.out.println("ToString del set: "+set.toString());
    }
    
}
