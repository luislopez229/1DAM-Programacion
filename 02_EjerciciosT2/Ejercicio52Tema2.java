package ejercicio52tema2;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio52Tema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,Color> mapa = new HashMap<>();
        mapa.put("12535ABC", Color.RED);
        mapa.put("98525KWX",Color.YELLOW);
        mapa.put("17632MSE", Color.GREEN);
        mapa.put("85321ABC", Color.YELLOW);
        
        System.out.println("Tamaño del map: "+mapa.size());
        System.out.println("ToString del map: "+mapa.toString());
        
        System.out.println("Introduce la matrícula del coche");
        String matricula = new Scanner(System.in).nextLine();
        
        if(mapa.containsKey(matricula)){
        System.out.println("El color es: "+mapa.get(matricula));
        }else{
            System.out.println("No existe esa matrícula");
        }
    }
}
